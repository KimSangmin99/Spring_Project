<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<!-- Custom styles for this page -->
<link href="vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/sb-admin-2.css" rel="stylesheet">
<link href="css/sb-admin-2.min.css" rel="stylesheet">

<title>Backoffice_SE</title>
</head>
<body>

	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="wrapper">
		<tiles:insertAttribute name="sidebar" />
		<!-- <div class="content-wrapper"> -->
		<tiles:insertAttribute name="topbar" />
		<tiles:insertAttribute name="content" />
		<!-- </div><!-- content-wrapper -->
	</div>
	<tiles:insertAttribute name="footer" />
	<!-- wrapper -->
	<tiles:insertAttribute name="footer-menu" />
</body>
</html>