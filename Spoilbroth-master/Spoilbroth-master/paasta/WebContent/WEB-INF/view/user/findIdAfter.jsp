<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>findPw</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="/login/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/login/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/login/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/login/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/login/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/login/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/login/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/login/css/util.css">
<link rel="stylesheet" type="text/css" href="/login/css/main.css">
<!--===============================================================================================-->
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@700&display=swap" rel="stylesheet">
<style>
.container-login100:before {
	content: "";
	background: url(/login/images/desk20.jpg);
	padding-bottom: 20px;
	background-size: cover;
	opacity: 0.8;
	position: absolute;
	top: 0px;
	left: 0px;
	right: 0px;
	bottom: 0px;
}
</style>
</head>
<body>
    <div class="limiter">
		<div class="container-login100 p-b-20" style="padding-bottom: 20px;">
			<div class="wrap-login100">
                    <div class="full">
					<div class="container">
						<div class="area_inputs wow fadeIn">
						<div data-role="tabs">
							<div data-role="navbar">
								<ul>
									<li><a href="#tab1">아이디 찾기</a></li>
									<li><a href="#tab2">비밀번호 찾기</a></li>
								</ul>
							</div>
							<div id="#tab1">
							<form class="login100-form validate-form" method="post" action="/user/findIdAfter.do" onsubmit="return doRegUserCheck(this)">
                        		<h2 style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 25px;">아이디 찾기</h2>
                        		<h6 style="font-family: 'Nanum Gothic', sans-serif; font-weight: 500; font-size: 20px; margin-top: 15px">회원가입시 사용한 아이디는 입니다</h6>
                    		
                    		</form>
                    		</div>
                		</div>
                		</div>
            		</div>
        			</div>
    				</div>
    			</div>
    		</div>
    	
</body>
</html>