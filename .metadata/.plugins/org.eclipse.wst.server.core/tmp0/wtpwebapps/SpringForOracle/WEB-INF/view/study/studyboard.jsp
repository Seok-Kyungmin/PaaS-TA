
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="poly.dto.BoardDTO"%>
<%@page import="poly.util.CmmUtil"%>
<%@page import="poly.dto.StudyListDTO"%>
<%@page import="poly.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	UserDTO uDTO = (UserDTO) request.getAttribute("rDTO");
	String user_id = uDTO.getUser_id();
	String user_name = uDTO.getUser_name();

	StudyListDTO sDTO = (StudyListDTO) request.getAttribute("sDTO");
	String study_name = (String) request.getAttribute("study_name");
	String study_notify = CmmUtil.nvl(sDTO.getStudy_notify());
	String study_title = CmmUtil.nvl(sDTO.getStudy_title());
	String study_creator = CmmUtil.nvl(sDTO.getStudy_creator());
	String study_seq = CmmUtil.nvl(sDTO.getStudy_seq());
	System.out.println("study_creator : " + study_creator);
	System.out.println("study_seq : " + study_seq);

	String[] study_group = user_name.split("");
	int study_count = study_group.length;

	// 게시판 조회 결과 보여주기
	List<BoardDTO> rList = (List<BoardDTO>) request.getAttribute("rList");
	if (rList == null) {
		rList = new ArrayList<BoardDTO>();
	}

	// 스터디그룹에 가입한 유저의 MBTI정보
	List<String> mList = (List<String>) request.getAttribute("mList");
	String member_mbti = String.join(",", mList);

	int mbti_score = (int) request.getAttribute("mbti_score");
%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Spoilbroth_StudyGroup</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Abril+Fatface&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="/andrea-master/css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="/andrea-master/css/animate.css">
<link rel="stylesheet" href="/andrea-master/css/owl.carousel.min.css">
<link rel="stylesheet"
	href="/andrea-master/css/owl.theme.default.min.css">
<link rel="stylesheet" href="/andrea-master/css/magnific-popup.css">
<link rel="stylesheet" href="/andrea-master/css/aos.css">
<link rel="stylesheet" href="/andrea-master/css/ionicons.min.css">
<link rel="stylesheet"
	href="/andrea-master/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="/andrea-master/css/jquery.timepicker.css">
<link rel="stylesheet" href="/andrea-master/css/flaticon.css">
<link rel="stylesheet" href="/andrea-master/css/icomoon.css">
<link rel="stylesheet" href="/andrea-master/css/style.css">
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@700&display=swap"
	rel="stylesheet">
<!-- profile -->
<link rel="stylesheet" href="/css/profile.css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<!-- profile -->

<!-- owl -->
<script src="/andrea-master/js/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/owl.carousel.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/assets/owl.carousel.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/assets/owl.theme.default.min.css">
<link rel="stylesheet" href="/css/owlowl.css">
<!-- data table -->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css">

<style>
#time_modal {
	display: none;
	width: 300px;
	padding: 20px 60px;
	background-color: #fefefe;
	border: 1px solid #888;
	border-radius: 3px;
}

#time_modal .modal_close_btn {
	position: absolute;
	top: 10px;
	right: 10px;
}
 #back {
      width: 144px;
      border-left-width: 0px;
      margin-top: 19px;
      margin-left: 22px;
      padding-top: 5px;
      padding-right: 10px;
      padding-left: 10px;
      padding-bottom: 12px;
   }

</style>
</head>
<body data-aos-easing="slide" data-aos-duration="800" data-aos-delay="0">

	<!-- 전체 페이지 START-->
	<div id="colorlib-page">
		<!-- START 왼쪽 NANI -->
		<%@ include file="/WEB-INF/view/sidebar.jsp"%>
		<!-- END 왼쪽 NANI -->

		<!-- START 상단 NANI -->
		<!-- <div class="padding" style="padding-bottom: 20px;"></div>
		<div class="sidebar-heading" style="text-align: center; position: fixed; top: 0; width: 100%; height:140px; background-color: #fff; z-index: 5; padding-top: 20px;font-weight: 500; color: black;">
		<img alt="" src="/img/DanimgilLogo.png" style="width:100px; display: block; margin: 15px auto;  margin-top: 0px">
			<hr style="width: 100%; height: 1.5px; border: none; background-color: #666666; margin:4px;">
			<h4 class="title" style="font-family: 'Poppins', sans-serif; text-align: right; padding-right:25px; font-size: 15px; font-weight: 500;">STUDY MATCHING</h4>
		 -->
		<div class="padding" style="padding-bottom: 55px;"></div>
		<div class="sidebar-heading"
			style="text-align: center; position: fixed; top: 0; width: 100%; height: 90px; background-color: #fff; z-index: 5; padding-top: 20px; font-weight: 500; color: black;">
			<div class="hh" style="font-size: 23px; height: 32px;">
				<span>S</span><span>T</span><span>U</span><span>D</span><span>Y</span><span>&nbsp;</span><span>M</span><span>A</span><span>T</span><span>C</span><span>H</span><span>I</span><span>N</span><span>G</span>
			</div>
			<hr
				style="width: 90%; height: 1.5px; border: none; background-color: #666666;">

		</div>
		<!-- END 상단 NANI -->
		
		<!-- 메인 페이지 START-->
		<div id="colorlib-main" style="margin-top: 20px;">
			<section class="ftco-section ftco-no-pt ftco-no-pb">
				<div class="container">

					<!-- 왼쪽 오른쪽 2분할 -->
					<div class="row d-flex">

						<!-- 왼쪽 스크립트 -->
						<div class="col-xl-8 px-md-5" style="background-color: #f7fbff;">
							<!-- 스터디 개설  START -->
							<div class="" style="margin-left: 20px">
								<label
									style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 25px; margin-top: 18px; margin-bottom: -8px;">
									<%=study_name%> 팀의 커뮤니티
								</label>
							</div>
							<div class="emp-profile">
								<!-- 사진 프로필 START -->
								<div class="d-flex card p-3" style="magin: -11px;">



									<form id="uploadForm" enctype="multipart/form-data">
										<div class="d-flex align-items-center">
											<div class="image">
												<img id="preview-image"
													src="/getStudyImage.do?study_name=<%=study_name%>"
													class="rounded" width="100%">
											</div>
										</div>
										<div id="input-image"
											class="button mt-2 d-flex flex-row align-items-center">
											<input type="file" id="file" name="fileUplod2"
												onchange="changeValue(this)" style="display: none" /> <input
												type="hidden" name="study_name" value="<%=study_name%>">
											<button class="btn btn-sm btn-primary w-100" id="btn-upload"
												style="margin-right: 2px;">Select File</button>
											<button id="btnUpload" class="btn btn-sm btn-primary w-100"
												style="margin-left: 2px;">Register</button>
										</div>
									</form>

									<!-- 출첵 버튼 -->
		                           <div class="button mt-2 d-flex flex-row align-items-center">
		                           <button onclick="timeSetting();" class="btn btn-sm btn-primary w-100" id="timeSetting()"
		                                    style="margin-right: 2px;">출석</button>
		                           
		                           <button id="exit" class="btn btn-sm btn-primary w-100"
		                                    style="margin-left: 2px;">나가기</button>
		                           </div>
		                           <script type="text/javascript">
		                              function timeSetting() {
		                                 let time = prompt("공부할 시간을 입력해주세요.", "3:30");
		                              }
		                              
		                           </script>
									
									<!-- 스터디 정보 -->
									<hr>
									<div class="form-group" style="margin-bottom: 5px;">
										<label
											style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 18px; margin-bottom: 5px;">
											Title : <%=study_title%>
										</label><br> <label
											style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 18px; margin-bottom: 5px;">
											스터디 시작일 : <%=sDTO.getStudy_dt()%>
										</label><br> <label
											style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 18px; margin-bottom: 5px;">
											멤버 : <%=sDTO.getStudy_member()%>
										</label><br> <label
											style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 18px; margin-bottom: 5px;">
											멤버의 MBTI : <%=member_mbti%>
										</label><br>
										<div class="profile-card"
											style="padding-right: 3px; padding-left: 3px;">
											<%
												for (int k = 0; k < mbti_score; k++) {
											%>
											<svg version="1.1" id="Capa_1"
												xmlns="http://www.w3.org/2000/svg"
												xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
												width="22" height="22" viewBox="0 0 422.448 422.448"
												style="enable-background: new 0 0 422.448 422.448;"
												xml:space="preserve">
										<path style="fill:#FF4979;"
													d="M387.15,59.153c-47.066-47.065-123.374-47.065-170.44,0l-4,4l-4-4
											C163.342,10.448,87.081,7.742,38.376,53.109s-51.412,121.628-6.044,170.334c1.885,2.023,3.839,3.981,5.858,5.871l170.8,170.8
											c2.018,1.981,5.217,2.085,7.36,0.24l170.8-170.8c47.065-47.066,47.065-123.374,0-170.44L387.15,59.153z" />
										</svg>
											<%
												}
											%>
										</div>
									</div>

									<div class="form-group mt-3">
										<label
											style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 18px; margin-bottom: 0px;">
											알림</label>
										<div class="card fontstyle p-2"
											style="font-family: 'Nanum Gothic', sans-serif; font-weight: 400; font-size: 15px; margin-bottom: 0px;">
											<div id="text_aera"><%=sDTO.getStudy_notify()%></div>
											<!-- 스터디 개설자만 알림을 수정할 수 있음 -->
											<% if(sDTO.getStudy_creator().equals(uDTO.getUser_id())) { %>
											<button class="btn btn-sm btn-primary w-100" id="btn-upload"
												style="margin-right: 2px;" data-toggle="modal"
												data-target="#exampleModalCenter">알림 수정하기</button>
											<% }else{} %>
										</div>
										<!-- modal 알림창  -->
										<!-- Modal -->
										<div class="modal fade" id="exampleModalCenter" tabindex="-1"
											role="dialog" aria-labelledby="exampleModalCenterTitle"
											aria-hidden="true"
											style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 18px; margin-bottom: 0px;">
											<div class="modal-dialog modal-dialog-centered"
												role="document">
												<div class="modal-content">
													<div class="modal-header">
														<h5 class="modal-title" style="font-size: 30px;"
															id="exampleModalLongTitle">알림 수정하기</h5>
														<button type="button" class="close" data-dismiss="modal"
															aria-label="Close">
															<span aria-hidden="true">&times;</span>
														</button>
													</div>
													<div class="modal-body">
														<textarea cols="50" rows="10" style="width: 100%"
															id="text_modify"><%=sDTO.getStudy_notify()%></textarea>
													</div>
													<div class="modal-footer" style="font-size: 25px;">
														<button type="button" class="btn btn-secondary"
															data-dismiss="modal">닫기</button>
														<button type="button" class="btn btn-primary"
															onclick="text_modify();">수정하기</button>
													</div>
												</div>
											</div>
										</div>
										<!-- model 끝 -->

									</div>
									<!-- 멀티 게시판  -->
									<div style="display: flex">
										<div style="margin: 0 auto;">
											<label
												style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 25px; margin-bottom: 0px;">
												게시판</label>
										</div>
										<div>
											<button type="button" class="btn btn-outline-warning"
												onclick="location.href='/chat/chatting.do?study_name=거북목'"
												style="font-weight: 600; color: tomato; border-width: revert; border-color: tomato;">
												Let's 채팅</button>
										</div>
									</div>
									<hr>
									<!-- 게시판 -->
									<table id="example" class="display"
										style="width: 100%; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 15px; margin-bottom: 0px;">
										<thead style="font-size: 15px";>
											<tr>
												<th>no</th>
												<th>title</th>
												<th>name</th>
												<th>v</th>

											</tr>
										</thead>
										<%
											for (int i = 0; i < rList.size(); i++) {
												BoardDTO rDTO = rList.get(i);
												if (rDTO == null) {
													rDTO = new BoardDTO();
												}
										%>
										<tr>
											<td style="font-size: 15px";>
												<%
													// 공지글이라면, [공지]표시
														if (CmmUtil.nvl(rDTO.getNotice_yn()).equals("1")) {
															out.print("<b>[공지]</b>");
														} else {
															out.print(CmmUtil.nvl(rDTO.getNotice_seq()));
														}
												%>
											</td>
											<td><a style="color: brown;"
												href="javascript:doDetail('<%=CmmUtil.nvl(rDTO.getNotice_seq())%>','<%=CmmUtil.nvl(study_seq)%>');">
													<%=CmmUtil.nvl(rDTO.getTitle())%></a></td>
											<th style="font-size: 15px";><%=CmmUtil.nvl(rDTO.getUser_name())%>
											</th>
											<th style="font-size: 15px";><%=CmmUtil.nvl(rDTO.getRead_cnt())%>
											</th>
										</tr>
										<%
											}
										%>
									</table>
									<div
										style="font-family: 'Nanum Gothic', sans-serif; font-weight: 600; font-size: 18px; margin-bottom: 0px;">
										<a href="javascript:newReg('<%=study_seq%>');"> [글쓰기]</a>
									</div>
									<!-- 스터디 개설  END -->
									<%
										if (user_id.equals(study_creator)) {
									%>
									<button id="btnUpload" class="btn btn-sm btn-danger w-100"
										style="margin-top: 20px; margin-left: 2px;" onclick="del();">스터디
										삭제하기</button>

									<%
										} else {
									%>

									<button id="btnUpload" class="btn btn-sm btn-danger w-100"
										style="margin-top: 20px; margin-left: 2px;" onclick="leave();">스터디
										탈퇴하기</button>

									<%
										}
									%>

									<hr style="margin-top: 10px; margin-bottom: 0px;" />

								</div>
							</div>
							<!-- 왼쪽 스크립트 끝 -->

						</div>
					</div>
				</div>
			</section>
		<!-- 메인 페이지 END-->
		<!-- 타이머 START-->
		<div id="back" style="float: left;">
		   <form action="${request.getContextPath}/time/stopWatchRecords.do" id="frmStopWatch" name="frmStopWatch" method="POST">
		      <input type="hidden" id="hiddenHours" name="hour"/>
		      <input type="hidden" id="hiddenMin" name="min"/>
		      <input type="hidden" id="hiddenSeconds" name="sec"/>
		      <input type="hidden" id="hiddenMils" name="mils"/>
		      <input type="hidden" id="hiddenFullTime" name="fullTime"/>
		      <div style="box-sizing: border-box; width: 300px; height: auto; margin: auto; padding-top: 70px; background: #000; text-align: center;">
		         <div style="width: 100%; color: #fff; padding-left: 5px;">
		            <!--[시간]표시 영역-->
		            <span id="postHours" style="font-size: 75px; letter-spacing: -2px;">00</span>
		            <!--//시간데이터 표시 영역-->
		            <span style="display: inline-block; vertical-align: top; font-size: 55px;">:</span>
		            <!--[분] 표시 영역-->
		            <span id="postMin" style="font-size: 75px; letter-spacing: -2px;">00</span>
		            <!--//[분] 표시 영역-->
		            <span
		                  style="display: inline-block; vertical-align: top; font-size: 55px;">:</span>
		            <!--[초] 표시 영역-->
		            <span id="postSec" style="font-size: 75px; letter-spacing: -2px;">00</span>
		            <!--//[초] 표시 영역-->
		            <!--      <span style="display: inline-block; margin-left: -3px;">.</span>-->
		            <!--      <span id="postMils" style="font-size: 20px; letter-spacing: -1px;">00</span>-->
		         </div>
		         <div>
		            <ul id="recordList"
		               style="color: #fff; list-style: none; text-align: center; padding: 0; min-height:100px; max-height: 100px; overflow-y: auto;">
		            </ul>
		         </div>
		         <div style="padding: 10px 0 50px">
		            <button type="button" id="startBtn"
		                  style="width: 90px; height: 35px; color: #91e374; background: none; border: 1px solid #91e374; cursor: pointer;">START
		            </button>
		            <button type="button" id="stopBtn"
		                  style="width: 90px; height: 35px; color: #fff; background: none; border: 1px solid #ccc; cursor: pointer; margin-left: 10px;">STOP
		            </button>
		         </div>
		      </div>
		
		      <button type="button" id="submit">전송</button>
		   </form>
		</div>
	<!-- 타이머 END-->	
	</div>
	</div>
	<!-- 전체 페이지 END-->

	<!-- loader -->
	<div id="ftco-loader" class="fullscreen">
		<svg class="circular" width="48px" height="48px">
			<circle class="path-bg" cx="24" cy="24" r="22" fill="none"
				troke-width="4" stroke="#eeeeee"></circle>
			<circle class="path" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"></circle></svg>
	</div>

	<script src="/andrea-master/js/jquery.min.js"></script>
	<script src="/andrea-master/js/jquery-migrate-3.0.1.min.js"></script>
	<script src="/andrea-master/js/popper.min.js"></script>
	<script src="/andrea-master/js/bootstrap.min.js"></script>
	<script src="/andrea-master/js/jquery.easing.1.3.js"></script>
	<script src="/andrea-master/js/jquery.waypoints.min.js"></script>
	<script src="/andrea-master/js/jquery.stellar.min.js"></script>
	<script src="/andrea-master/js/owl.carousel.min.js"></script>
	<script src="/andrea-master/js/jquery.magnific-popup.min.js"></script>
	<script src="/andrea-master/js/aos.js"></script>
	<script src="/andrea-master/js/jquery.animateNumber.min.js"></script>
	<script src="/andrea-master/js/scrollax.min.js"></script>
	<script src="/andrea-master/js/main.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>


</body>
<script type="text/javascript">
//상세보기 이동
function doDetail(seq, seq2){
	location.href="/board/BoardInfo.do?notice_seq="+seq+"&study_seq="+seq2;
}

function newReg(seq){
	location.href="/board/BoardReg.do?study_seq="+seq;
}
</script>
<script type="text/javascript">
		$(function () {
			$('#btn-upload').click(function (e) {
				e.preventDefault();
				$('#file').click();
			});
		});
		
		
		function readImage(input) {
		    // 인풋 태그에 파일이 있는 경우
		    if(input.files && input.files[0]) {
		       
		        // FileReader 인스턴스 생성
		        const reader = new FileReader()
		        // 이미지가 로드가 된 경우
		        reader.onload = e => {
		            const previewImage = document.getElementById("preview-image")
		            console.log("previewImage : " + previewImage)
		            previewImage.src = e.target.result
		        }
		        // reader가 이미지 읽도록 하기
		        reader.readAsDataURL(input.files[0])
		    }
		}
		// input file에 change 이벤트 부여
		const inputImage = document.getElementById("input-image")
		inputImage.addEventListener("change", e => {
		    readImage(e.target)
		})
</script>

<script type="text/javascript">
	$('#btnUpload').on('click', function(event) {
	    event.preventDefault();
	    
	    var form = $('#uploadForm')[0]
	    var data = new FormData(form);
	    $('#btnUpload').prop('disabled', true);
		
	    $.ajax({
	        type: "POST",
	        enctype: 'multipart/form-data',
	        url: "/FileUplod2.do",
	        data: data,
	        processData: false,
	        contentType: false,
	        cache: false,
	        timeout: 600000,
	        success: function (data) {
	        	$('#btnUpload').prop('disabled', false);
	        	alert('등록이 성공하였습니다.')
	        },
	        error: function (e) {
	            $('#btnUpload').prop('disabled', false);
	            alert('등록이 실패하였습니다.');
	        }
	    });
	})
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#example').DataTable({
			"columns" : [
					{"width" : "10%"},
					{ "width" : "80%" },
					{ "width" : "5%" },
					{ "width" : "5%" } 
			]
		});
	});
	
function del() {
	if (window.confirm('스터디 그룹을 삭제하시겠습니까?')){
		window.location = '/study/del.do?study_name=<%=study_name%>';
	}else{
	    // They clicked no
	}
}

function leave() {
	if (window.confirm('스터디 그룹을 탈퇴하시겠습니까?')){
		window.location = '/study/leave.do?study_name=<%=study_name%>';
	}else{
	    // They clicked no
	}
}

function text_modify() {
    let study_seq = <%=sDTO.getStudy_seq() %>
    const study_notify = document.getElementById("text_modify").value;
    console.log(study_notify);

	let request = {
            method: 'POST',
            body: JSON.stringify({ study_seq : study_seq , study_notify : study_notify }),
            headers: {
                'Content-Type': 'application/json'
            }
        };
    
   fetch("/study/textModify.do", request)
	.then(function(res){
		return res.text()
	})
	.then(function(data){
		console.log(data);
		if(data == 1){
		alert("수정을 완료되었습니다.");
		}else{
		alert("수정을 실패했습니다.");	
		}
		location.reload();
	})
}

function addZero(num) {
    return (num < 10 ? '0' + num : '' + num)
 }

 /**********************************************************
  *                    Default Valirables 선언 영역
  *********************************************************/
 let stTime = 0
 let endTime = 0
 let timerStart, hours, min, sec, milisec;

 // 화면이 전부 로드 되는 경우 실행함.
 $(document).ready(function () {
    /**********************************************************
     *                    Button Element 영역
     *********************************************************/
    let startBtn = $("#startBtn");
    let stopBtn = $("#stopBtn");
    let recordList = $("#recordList");

    /**********************************************************
     *                    INPUT DATA 보관영역
     *********************************************************/
    let hiddenHours = $("#hiddenHours");
    let hiddenMin = $("#hiddenMin");
    let hiddenSec = $("#hiddenSeconds");
    let hiddenMils = $("#hiddenMils");

    /**********************************************************
     *                    Button Event 영역
     *********************************************************/

    //시작 버튼
    window.onload = function () {
       stTime = Date.now()
             timerStart = setInterval(function () {
                let nowTime = new Date(Date.now() - stTime)
                // 시간은 분과 초와 다르게 nowTime.getHorus를 해버리면 현재 시간 - 시작 시간의 차이 만큼 시간이 반환 되기 때문에 실제 동작시간과는 거리가 멀다.
                // nowTime.getTime() == 밀리세컨드로 반환되므로, 1000 * 60 * 60 ==> 차이 시간을 산출 할 수 있다.

                // 시간
                hours = addZero(Number((nowTime.getTime() / (1000 * 60 * 60)).toFixed(1)));
                hiddenHours.val(hours);

                // 분
                min = addZero(nowTime.getMinutes())
                hiddenMin.val(min);

                // 초
                sec = addZero(nowTime.getSeconds())
                hiddenSec.val(sec);

                // 밀리초
                milisec = addZero(Math.floor(nowTime.getMilliseconds() / 10))
                hiddenMils.val(milisec);

                $("#hiddenFullTime").val(hours + ":" + min + ":" + sec + ":" + milisec);

                $("#postHours").text(hours);
                $("#postMin").text(min);
                $("#postSec").text(sec);
                $("#post").text(sec);
                // document.getElementById('postTestMilisec').innerText = milisec;
             }, 1);
          };

    //스탑 버튼
    stopBtn
          .off("click.stopwatch")
          .on("click.stopwatch", function () {
             if (timerStart) {
                clearInterval(timerStart) // STOP
                if (stopBtn.text() == 'STOP') {
                   endTime = Date.now()
                   stopBtn.text("RESET");
                   startBtn.text("RESTART");
                } else { // RESET
                   stTime = 0
                   hours = 0;
                   min = 0
                   sec = 0
                   milisec = 0
                   //시간
                   hiddenHours.val("0");
                   $("#postHours").text("00");
                   //분
                   hiddenMin.val("0");
                   $("#postMin").text("00");
                   //초
                   hiddenSec.val("0");
                   $("#postSec").text("00");
                   //밀리세컨드
                   hiddenMils.val("0");
                   $("#postMils").text("00");

                   startBtn.text("START");
                   stopBtn.text("STOP");
                   timerStart = null
                   $("#recordList").empty();

                   $("#hiddenFullTime").val("");
                }
             }
          });

    //서버 전송
    $("#submit")
          .off("click.submit")
          .on("click.submit", function () {
             // Form - Submit POST 방식
             //$("#frmStopWatch").submit();//
             $.ajax({
                type: "POST"
                , url: "${request.contextPath}/time/stopWatchRecords.do"
                , contentType: "application/json"
                , data: JSON.stringify({
                   "hours": hiddenHours.val()
                   , "min": hiddenMin.val()
                   , "sec": hiddenSec.val()
                   , "mils": hiddenMils.val()
                }, null, 4)
                , success: function (result) {

                }
                ,
             })
          });
 });

</script>
</html>