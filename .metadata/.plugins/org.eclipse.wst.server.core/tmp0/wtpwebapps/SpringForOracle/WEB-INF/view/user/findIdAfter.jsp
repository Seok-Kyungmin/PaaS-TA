<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>find Password After</title>
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
.title{
	font-size: 30px; 
	color: darkcyan; 
	display: block; 
	padding:43px 30px 25px 30px; 
	text-align: center; 
	font-family: 'Nanum Gothic', sans-serif; 
	font-weight: 400;
}

form{
	padding-top: 43px;
	padding-bottom: 93px;
	display: block;
}
</style>

</head>
<body>
	<div class="limiter">
		<div class="container-login100 p-b-20" style="padding-bottom: 20px;">
			<div class="wrap-login100">
			<div class="login100-form title">아이디 찾기</div>
			
				<div class="full">
					<div class="container">
						<div class="area_inputs wow fadeIn">
						<div id="id" class="col s12">
							<form class=" validate-form" method="post" action="/user/login.do"
								onsubmit="return doRegUserCheck(this)">
								<div style="text-align: center; font-family: 'Nanum Gothic', sans-serif; font-weight: 400; font-size: 20px">
								고객님의 아이디는 입니다</div>
								<div class="container-login100-form-btn" style="display: block; padding-top: 45px; margin-right: 25%;">
									<button class="login100-form-btn" style="margin: auto;">로그인 하기</button>
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