<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Backoffice_SE - 회원가입</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

	<div class="container">

		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
					<div class="col-lg-7">
						<div class="p-5">
							<div class="text-center">
								<h1 class="h4 text-gray-900 mb-4">회원가입</h1>
							</div>
							<form action='<c:url value="memberJoin/register" />'
								method="post" id="se_member">
								<div class="form-group">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input name="se_Id" type="text"
											class="form-control form-control-user" id="se_Id"
											placeholder="아이디">
									</div>
								</div>
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input name="se_Password" type="password"
											class="form-control form-control-user" id="se_Password"
											placeholder="se_Password">
									</div>

								</div>
								<div class="form-group">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input name="se_Name" type="text"
											class="form-control form-control-user" id="se_Name"
											placeholder="이름">
									</div>
								</div>
								<div class="form-group">
									<input name="se_Email" type="email"
										class="form-control form-control-user" id="se_Email"
										placeholder="Email Address">
								</div>
								<div class="form-group">
									<input type="hidden" name="${ _csrf.parameterName }"
										value="${ _csrf.token }">
								</div>
								<input type="submit" class="btn btn-primary btn-lg" value="회원가입">
							</form>
							<hr>
							<div class="text-center">
								<a class="small" href="login">로그인하러가기...</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>

</body>

</html>