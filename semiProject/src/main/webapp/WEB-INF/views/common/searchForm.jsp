<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searchForm</title>

</head>
<body>

<jsp:include page="../common/menubar.jsp" />

<div id="content-1">
	<form id="select-form" action="searchList.hotels" method="get">
		<c:choose>
		<c:when test="${ searchData ne null }" >
			<div style="display: inline-block;">
				<input type="text" name="daterange" readonly
				required value="${ searchData.daterange }" />	
			</div>
			<span id="date">${ searchData.daterange }</span>
			<input required class="form-control" id="people-input"
			type="number" name="people" min="1" max="99" placeholder="인원수를 입력해주세요."  value="${ searchData.maxPeople }" >
			<select id="locations" name="location">
			</select>
		</c:when>
		<c:otherwise>
			<div style="display: inline-block;">
				<input class="form-control" type="text" name="daterange" required/>
			</div>
			<span id="date"></span>
			<input required class="form-control" id="people-input"
			 type="number" name="people" min="1" max="99" placeholder="인원수를 입력해주세요." >
			<select id="locations" name="location">
			</select>
		</c:otherwise>
		</c:choose>	
		<input type="hidden" name="currentPage" value="1">
		<input class="btn btn btn-info" id="search" type="submit" value="검색">
	</form>
</div>

<script>
const toDay = new Date();
	let startDate;
	let endDate;
	let locations;

	$(function () {
	    $('input[name="daterange"]').daterangepicker({
	    	minDate: new Date(),
	        "drops": "down",
	        "opens": "center",
	        "locale": {
	            "format": "YY/MM/DD",
	            "separator": " ~ ",
	            "applyLabel": "확인",
	            "cancelLabel": "취소",
	            "fromLabel": "From",
	            "toLabel": "To",
	            "customRangeLabel": "Custom",
	            "weekLabel": "W",
	            "daysOfWeek": ["일", "월", "화", "수", "목", "금", "토"],
	            "monthNames": ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
	        },

		    }, function (start, end, label) {
		    	startDate = start.format('YYYY-MM-DD');
		    	endDate = end.format('YYYY-MM-DD');
			    $('#date').text(startDate+'/'+endDate);
		});
	
	    $.ajax({
	    	url: "searchLocation.jqAjax",
	    	type: 'get',
	    	success: function(result){
	    		result = result.replaceAll("[","");
	    		result = result.replaceAll("]","");
	    		result = result.split(",");
	    		for(let i = 0; i < result.length; i++){
	    			$('#locations').append('<option value="'+result[i].trim()+'">'+result[i].trim()+'</option>');
	    		}
	    		
	    		<c:if test="${searchData ne null}">
	    			$('#locations').children().each(function(idx, item){
	    				if($(item).val() == '${ searchData.location }'){
	    					$(item).attr('selected', 'true');
	    	    		}
	    	  	    });
	    		</c:if>
	    	},
	    	error: function(result){
	    		console.log(result);
	    	},
	    });
	});
	
	
    
</script>
</body>
</html>