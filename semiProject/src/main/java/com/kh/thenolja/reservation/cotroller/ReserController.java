package com.kh.thenolja.reservation.cotroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.kh.thenolja.reservation.model.Service.ReserService;
import com.kh.thenolja.reservation.model.vo.Coupon;
import com.kh.thenolja.reservation.model.vo.ReserInfo;
import com.kh.thenolja.reservation.model.vo.Reservation;

@RestController
public class ReserController {
	
	@Autowired
	private ReserService reserService;
	
	@RequestMapping("insertReservation")
	public ModelAndView insertReservation(String startDate, String endDate, String location, 
									String people, HttpSession session, ModelAndView mv) {
		ReserInfo rinfo = new ReserInfo();
		rinfo.setStartDate(startDate);
		rinfo.setEndDate(endDate);
		rinfo.setPeople(people);
		
		mv.addObject("rinfo", rinfo);
		mv.setViewName("reservation/insertReservation");
		return mv;
	}
	
	@ResponseBody
	@GetMapping(value="cupon.jqAjax", produces="application/json; charset=UTF-8")
	public String selectCoupon(int memberNo) {
		
		List<Coupon> coupon = reserService.selectCoupon(memberNo);
		return new Gson().toJson(coupon);
	}
	
	@GetMapping("insert.reser")
	public ModelAndView insertReser(Reservation reser, ModelAndView mv, HttpSession session, String reMemNo) {
		
		reser.setCheckIn("2024-05-01");
		reser.setCheckOut("2024-05-02");
		
		int memNo = Integer.parseInt(reMemNo);
		reser.setRoomNo(4);
		reser.setPeople(2);
		reser.setMemNo(memNo);
		reser = reserService.insertReser(reser, memNo);
		
		if(reser != null) {
			session.setAttribute("reser", reser);
			mv.setViewName("reservation/detailReservation");
		} else {
			mv.addObject("errorMsg", "예약 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	@GetMapping("myReser.list")
	public ModelAndView myReser(String reMemNo, ModelAndView mv, HttpSession session) {
		
		int memNo = Integer.parseInt(reMemNo);
		List<Reservation> reserList = reserService.selectList(memNo);
		
		if(reserList != null) {
			for(int i = 0; i < reserList.size(); i++) {
			    Date currentDate = new Date();
			    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			    String currentDateTime = dateFormat.format(currentDate);
			    String checkoutDateTime = reserList.get(i).getCheckOut();
				
			    if(currentDateTime.compareTo(checkoutDateTime) > 0) {
			    	reserList.get(i).setReserStatus(true);
			    	
		 	    } else {
		 	    	reserList.get(i).setReserStatus(false);
			    }
			} 
			session.setAttribute("reserList", reserList);
			mv.setViewName("reservation/myReservationList");
		} else {
			mv.addObject("errorMsg", "예약 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	@GetMapping("reserDetail")
	public ModelAndView reserDetail(int reserNo, ModelAndView mv, HttpSession session) {
		
		Reservation reser = reserService.selectReserNo(reserNo);
		
		if(reser != null) {
			session.setAttribute("reser", reser);
			mv.setViewName("reservation/detailReservation");
		} else {
			mv.addObject("errorMsg", "예약 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
