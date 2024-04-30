package com.kh.thenolja.reservation.cotroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.kh.thenolja.reservation.model.Service.ReserService;
import com.kh.thenolja.reservation.model.vo.Coupon;
import com.kh.thenolja.reservation.model.vo.ReserInfo;
import com.kh.thenolja.reservation.model.vo.Reservation;

@Controller
public class ReserController {
	
	@Autowired
	private ReserService reserService;
	
	
	@RequestMapping("insertReservation")
	public String insertReservation(String startDate, String endDate, String location, 
									int maxPeople, HttpSession session) {
		ReserInfo rinfo = new ReserInfo();
		rinfo.setStartDate(startDate);
		rinfo.setEndDate(endDate);
		rinfo.setPeople(maxPeople);
		
		List<Coupon> list = reserService.selectCouponList();
		session.setAttribute("coList", list);
		session.setAttribute("rinfo", rinfo);
		return "reservation/insertReservation";
	}
	@ResponseBody
	@GetMapping(value="cupon.jqAjax", produces="application/json; charset=UTF-8")
	public String selectCoupon(int memberNo) {
		
		List<Coupon> coupon = reserService.selectCoupon(memberNo);
		return new Gson().toJson(coupon);
	}
	
	@GetMapping("insert.reser")
	public ModelAndView insertReser(Reservation reser, ModelAndView mv, HttpSession session) {
		
		if(reserService.insertReser(reser) > 0) {
			int reserNo = reser.getReserNo();
			System.out.println(reser);
			
			if(reserService.selectReservation(reserNo) != null) {
				session.setAttribute("reser", reserService.selectReservation(reserNo));
				mv.setViewName("reservation/detailReservation");
			}
		} else {
			mv.addObject("errorMsg", "게시글 작성 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	

}
