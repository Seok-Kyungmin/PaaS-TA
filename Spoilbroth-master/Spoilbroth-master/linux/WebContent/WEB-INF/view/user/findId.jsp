<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>SignUp</title>
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
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@700&family=Poppins:wght@400;500;700;800;900&display=swap"
	rel="stylesheet">
	
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

.sendNumber{
	padding: 3px 10px 3px 10px; 
	border-radius: 20px; 
	background-color: #289B14; 
	color: white; 
	font-family: 'Nanum Gothic', sans-serif; 
	font-weight: 400; 
	font-size: 12px; 
	display: inline;
	float: right;
}
</style>

</head>
<body>
	<div class="limiter">
		<div class="container-login100 p-b-20" style="padding-bottom: 20px;">
			<div class="wrap-login100">
			<div class="login100-form"
                 style="font-size: 30px; color: darkcyan; display: block; padding:43px 30px; text-align: center; font-family: 'Nanum Gothic', sans-serif; font-weight: 400;">
                아이디 찾기</div>
				<!-- <div class="login100-form"
					style="font-size: 30px; color: darkcyan; display: block; padding: 43px 30px; text-align: center;">
					아</div> -->
				<%-- 	<%@ include file="userIdSearchModal.jsp" %> --%>
				<!-- <nav class="nav-extended">
					<div class="nav-content">
						<ul class="tabs tabs-transparent">
							<li class="tab"><a href="#id">아이디 찾기</a></li>
							<li class="tab"><a class="active" href="#pw">비밀번호 찾기</a></li>
						</ul>
					</div>
				</nav> -->
				<div class="full">
					<div class="container">
						<div class="area_inputs wow fadeIn">
						<div id="id" class="col s12">
							<form class="login100-form validate-form" method="post" action="/user/findIdAfter.do"
								onsubmit="return doRegUserCheck(this)">
								<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">ID</span>
						<input class="input100" type="text" name="user_id" placeholder="Enter userid">
						<span class="focus-input100"></span>
					</div>
								<div class="wrap-input100 validate-input m-b-20">
									<span class="label-input100">Name</span>
									<div>
										<input class="input100" type="text" name="user_name"
											id="user_name" placeholder="Enter userName">
									</div>
								</div>
								<div class="wrap-input100 validate-input m-b-20" style="margin-bottom: 10px">
									<span class="label-input100">Email</span>
									<input class="input100" type="email" name="user_email"
											id="user_email" placeholder="Enter user ㄷmail" style="display: inline;">
								</div>
									<button class="sendNumber" onclick="">인증번호 받기</button>
								<div class="wrap-input100 validate-input m-b-20" style="margin-bottom: 10px">
									<input class="input100" type="email" name="user_email"
											id="user_email" placeholder="Enter authentication number" style="display: inline;">
								</div>
								<div class="container-login100-form-btn"
									style="display: block; padding-top: 30px; margin-right: 25%;">
									<button class="login100-form-btn" style="margin: auto;"
										onclick="location.href='/user/findIdAfter.do'">확인</button>
								</div>
								<div class="container-login100-form-btn"
									style="padding-top: 20px; margin-right: 25%;">
									<button class="login100-form-btn"
										style="margin: auto; background-color: #565c568c;" onclick="">취소</button>
								</div>
							</form>
						</div>
						
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>