<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<!-- CSS -->
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css" />
<!-- JS -->
 <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>

<style>
	div{
		box-sizing: border-box;
	}
	#wrap{
		width: 1200px;
		height: 1000px;
		margin: auto;
	}
	
	.swiper {
      width: 100%;
      height: 350px;
      padding: 20px;
    }
    .swiper-slide {
      text-align: center;
      font-size: 18px;
      background: #fff;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    .swiper-slide img {
      display: block;
      width: 100%;
      height: 100%;
      object-fit: cover;
    }
    .card-imgDiv, .card-info{
		display: inline-block;
		width: 50%;
		height: 100%;
	}
    .card-img{
		width: 275px;
		height: 180px;
		border-radius: 10px;
		cursor: pointer;
	}
	.card-info {
		float:right;
		display:flex;
		align-items: center;
		justify-content: center;
		flex-direction: column;
	}
	.card-info > h4 {
		text-align: center;
	}
	.card-info > p{
		margin: 0px;
		margin-bottom: 10px;
		font-size: 14px;
	}
	.cards{
		width:	100%;
		height: 250px;
		margin: 10px;	
	}
	.mainPage-title-div {
		margin: 25px auto;
		border-bottom: 1px solid gray;
	}
	.mainPage-title-div > h3 {
		margin: 3px;
	}
	.swiper-button-prev{
		display: block;
		left: 1px;
	}
	.swiper-button-next{
		display: block;
		right: 1px;
	}
	#banner{
		background-image : url('resources/img/mainbanner03.png');
		background-size:cover;
		width : 1000px;
		height : 400px;
		margin : 20px auto;
		border-radius: 10px;
		object-fit: cover;
		background-repeat: no-repeat;
	}
</style>
</head>
<body>
	<jsp:include page="WEB-INF/views/common/menubar.jsp" />
	
	<div id="wrap">
		<div id="banner">
		</div>
		<div class="mainPage-title-div">
			<h3>요즘 인기있는 숙소</h3>
			<a href="select.hotel?hotelNo=30">
			<button>호텔</button>
			</a>
		</div>
		 <div class="swiper mySwiper">
		    <div class="swiper-wrapper populars">
		    </div>
		    
	    	<div class="swiper-pagination"></div>
		    <div class="swiper-button-next"></div>
		    <div class="swiper-button-prev"></div>
		    <div class="swiper-pagination"></div>
	  	</div>
  	
		<div class="mainPage-title-div">
			<h3>지역별 추천숙소</h3>
		</div>	
		 <div class="swiper mySwiper-2">
		    <div class="swiper-wrapper recommands">
		    </div>
	  	</div>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>