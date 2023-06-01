<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="container-fluid">

	<!-- Breadcrumbs-->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="#">testPage</a></li>
		<li class="breadcrumb-item active">Overview</li>
	</ol>

	<!-- DataTables Example -->
	<div class="card mb-3">
		<div class="card-header">
			<i class="fas fa-table"></i> testPage-data -2023-06-01
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<p>
				<div class="insertData">					
					<form action='<c:url value="/testPage/insert_data" />' method="post" id="insert_data">
						User_name : <input name="user_name" type="text" size="10"id="user_name">
						content : <input name="content"type="text" size="10" id="content">
						<input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }" >
						<!-- name은 VO에서 구분자 //id는 html내의 구분자 -->
						<button type="submit">저장</button>
					</form>
				</div>
				<p>
				<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
					<thead>
						<tr>
							<th>id</th>
							<th>user_name</th>
							<th>content</th>
						</tr>
					</thead>

					<tbody>
						<c:forEach items="${testpage}" var="testpage">
							<tr>
								<td>${testpage.id}</td>
								<td>${testpage.user_name}</td>
								<td>${testpage.content}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<!--table-responsive  -->
		</div>
		<!-- card-body -->
	</div><!-- card mb-3 -->
</div><!-- container-fluid -->
