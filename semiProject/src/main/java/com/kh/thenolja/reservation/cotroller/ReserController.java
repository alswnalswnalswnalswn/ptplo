package com.kh.thenolja.reservation.cotroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
									String maxPeople, HttpSession session, ModelAndView mv) {
		
		// List<Coupon> clist = reserService.selectCouponList();
		
		ReserInfo rinfo = new ReserInfo();
		rinfo.setStartDate(startDate);
		rinfo.setEndDate(endDate);
		rinfo.setPeople(maxPeople);
		/*
		String checkIn = (String)session.getAttribute("startDate");
		String checkOut = (String)session.getAttribute("endDate");
		String people = (String)session.getAttribute("maxPeople");
		Reservation reser = new Reservation();
		reser.setCheckIn(checkIn);
		reser.setCheckOut(checkOut);
		reser.setPeople(people);
		*/
		// session.setAttribute("clist", clist);
		mv.addObject("rinfo", rinfo);
		// session.setAttribute("reser", reser);
		mv.setViewName("reservation/insertReservation");
		return mv;
	}
	@ResponseBody
	@GetMapping(value="cupon.jqAjax", produces="application/json; charset=UTF-8")
	public String selectCoupon(int memberNo) {
		
		List<Coupon> coupon = reserService.selectCoupon(memberNo);
		// System.out.println(coupon);
		return new Gson().toJson(coupon);
	}
	
	@GetMapping("insert.reser")
	public ModelAndView insertReser(Reservation reser, ModelAndView mv, HttpSession session, String reMemNo) {
		
		reser.setCheckIn("2024-05-01");
		reser.setCheckOut("2024-05-03");
		int memNo = Integer.parseInt(reMemNo);
		reser.setRoomNo(4);
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
			/*
			for(int i = 0; i < reserList.size(); i++) {
				try {
					boolean reserStatus = dateformat.parse(reserList.get(i).getCheckOut()).before(currentDate);
					
					reserList.get(i).setReserStatus(reserStatus);
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
			}
			*/	
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
