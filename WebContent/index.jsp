<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>${title }</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<script type="text/javascript" src="${ctx }/js/jquery.js"></script>
		<style type="text/css">
/* 			div{ */
/* 				display: inline-block; */
/* 			} */
 			div#bodyDiv{ 
				text-align: center;
 			} 
			div#bodyDiv div{
				display:inline-block;
				width:25%;
				height: 50%;
			}
/* 			div#bodyDiv > div{ */
/* 				display:inline-block; */
/* 				width:50%; */
/* 				height: 50%; */
/* 			} */
		</style>
		<script type="text/javascript">
			$(document).ready(function(){
// 				$("#bodyDiv").css("width",$(window).width()/2);
				$("#bodyDiv").css("height",$(window).height()/2);
			});
		</script>
	</head>
	<body>
		<h1 align="center">欢迎来到John的个人网站</h1>
		<div id="bodyDiv">
			<div>
				<div style="background-color:#FFFF00 ">照片</div>
				<div style="background-color:#D1EEEE ">文章</div>
				<div style="background-color:#C0FF3E ">小说</div>
				<div style="background-color:#90EE90 ">心得</div>
			</div>
		</div>
	</body>
</html>