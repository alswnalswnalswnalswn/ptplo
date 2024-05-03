<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat, java.util.Date, java.time.LocalDate, java.time.format.DateTimeFormatter"%>  				   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>숙소이용목록상세조회</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style>

    div{
        box-sizing : border-box;
    }
    #output{
    	width: 1200px;
        height: auto;
        margin: auto;
    }
    #content{
        width: 1200px;
        height: 300px;
        margin-top: 20px;
    }
    #content_title{
        width: 100%;
        height: 100%;
        margin-top : 20px;
    }
    #left_img{
        float: left;

    }
    #left_title{
        margin-left: 60px;
    }
    #reser_info{
        width: 1000px;
        height: 80%;
        margin: auto;
        margin-top: 30px;
    }
    #reser_hotel_img{
        width: 25%;
        float: left;
    }
    #reser_hotel_img > img{
        border-radius: 10px;
    }
    .reser_detail > p{
        font-size: 20px;
    }
    .reser_detail > h3{
        font-weight: bold;
    }
    .reser_detail{
        width: 60%;
        height: 100%;
        float: left;
    }
    #review_in{
        width: 15%;
        height: 100%;
        float: left;
        position: relative;
    }
    #review_in > #reser_btn{
        width: 100px;
        height: 40px;
        border-radius: 10px;
        position: absolute;
        top : 0px;
        bottom: 50px;
        right: 0px;
        left: 0px;
        margin:auto;
    }
    #reser_info:hover{
    	box-shadow: 0px 0px 5px silver;
    }
    #homeBtn {
    	text-align:center;
    }
    #goHome{
    	width : 300px;
    	height: 50px;
    	border-radius : 10px;
    	background-color: rgb(199, 199, 199);
    	border : 0;
    	margin-bottom: 100px;
    	font-size: 22px;
    }
    #goHome:hover{
    	font-size:23px;
    }

    /*********************/
</style>

</head>
<body>

   	<jsp:include page="../common/menubar.jsp"/>
    <c:if test="${ loginUser eq null }">
		<form action="login" method="post"></form>
	<script>
		alert("로그인이 되어있지 않습니다. 로그인페이지로 이동합니다.");
	 </script>
	</c:if>
	<div id="output">
        <div id="content_title">
            <div id="left_img">
                <a href=""><img src="https://www.pngarts.com/files/2/Left-Arrow-PNG-Free-Download.png" alt="왼쪽 화살표" width="40px"></a>
            </div>
            <div id="left_title"><h3>내 예약 내역</h3></div>
		</div>
    <div id="content">
    <c:choose>
		<c:when test="${ empty reserList }">
			<table>
				<tr>
					<th style="font-size:40px;" colspan="5">예약 내역이 존재하지 않습니다.</th>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
		<c:forEach var="r" items="${ sessionScope.reserList }">
		
	        <div id="reser_info">
	            <div id="reser_hotel_img"><img src="${ hotel.hotelPath }" alt="" width="220px" height="220px"></div>
				<input type="hidden" name="hotelNo" value="${ hotel.hotelNo }">
				<input type="hidden" name="roomNo" value="${ room.roomNo }">
				<input type="hidden" name="reserNo" value="${ r.reserNo }">
	            <div class="reser_detail">
	            ${ r.reserNo }
	                <h3>${ hotel.hotelName }</h3>
	                <p>${ room.roomName }</p>
	                <p>${ r.people }인</p>
	                <p>${ r.paymentPrice }원</p>
	                <p>${ r.checkIn }&nbsp;&nbsp;오후 ${ room.checkInTime } : 00 ~ ${ r.checkOut }&nbsp;&nbsp;오전 ${ room.checkOutTime } : 00</p>
	            </div>
	
            <div id="review_in">
	             

	        <c:choose>
		        <c:when test="${ r.reserStatus }">
	            	<a href="review.insert?reserNo=${ r.reserNo }&hotelNo=${ r.hotelNo }&roomNo=${ r.roomNo }">
	                <button id="reser_btn" class="btn btn-outline-secondary">리뷰 작성</button></a>
	            </c:when>
	            <c:otherwise>
	                <a href="#"><button id="reser_btn" class="btn btn-outline-secondary" disabled>리뷰 작성</button></a>
	            </c:otherwise>
            </c:choose>
            
            </div>
        </div>
	
		</c:forEach>
		</c:otherwise>
	</c:choose>
	</div>
</div>


	<div id="homeBtn">
		<a href=""><button id="goHome" class="btn btn-info">메인으로 돌아가기</button></a>
	</div>

	            <script>
	            $(() => {
	            	$('.reser_detail').click(function() {
						const reserNo = $(this).siblings('input[name=reserNo]').val();
						// console.log(reserNo);
						location.href="reserDetail?reserNo=" + reserNo;
					});
	            });
	            <%--
	            const l = ${ r.reserNo };
	            	function myList(e) {
	            		
	            		location.href="reserDetail?reserNo=";
	            	}
	            
			--%>
	            </script>
</body>
</html>