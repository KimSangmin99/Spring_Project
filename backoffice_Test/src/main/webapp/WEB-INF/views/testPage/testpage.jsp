<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- html>
<head>
</head>
<body>
	<h1>Hello World</h1>
</body>
</html> -->

<div class="container-fluid">

	<!-- Breadcrumbs-->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="#">testPage</a></li>
		<li class="breadcrumb-item active">Overview</li>
	</ol>

	<!-- DataTables Example -->
	<div class="card mb-3">
		<div class="card-header">
			<i class="fas fa-table"></i> testPage-data
		</div>
		<div class="card-body">
			<div class="table-responsive">

				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
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
		</div>
	</div>


</div>