<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nhật Coder</title>

</head>

<style>
.phai {
	position: absolute;
	right: 5px;
	top: 1px
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />
<body>

	<div>
		<ul class="nav nav-tabs">
			<li class="nav-item"><a class="nav-link active" href="#">Tài
					Khoản</a></li>
			<li class="nav-item"><a class="nav-link " href="QuanLyLop">Lớp</a>
			</li>
			<li class="nav-item"><a class="nav-link " href="#">Hoạt Động</a>
			</li>
			<li class="nav-item"><a class="nav-link " href="#">Chi Tiết
					Hoạt Động</a></li>
			<li class="nav-item"><a class="nav-link " href="#">Nhập Danh
					Sách</a></li>
			<li class="phai">
				<button class="btn btn-primary phai">Đăng xuất</button>
			</li>

		</ul>
	</div>
	<div>
		<table class="table text-center">
		
			<caption></caption>
			<thead>
				<tr>
					<th scope="col">Tên đăng nhập</th>
					<th scope="col">Quyền</th>
					<th scope="col">Họ Tên</th>
					<th scope="col">Mã lớp</th>
					<th scope="col">Ngày sinh</th>
					<th scope="col">Số điện thoại</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td scope="row">NhatKoo</td>
					<td>Admin</td>
					<td>Nguyễn Đăng Nhật</td>
					<td>40</td>
					<td>10/12/1997</td>
					<td>0985722125</td>
				</tr>
				<tr>
				<td scope="row">NhatKoo</td>
					<td>Admin</td>
					<td>Võ Lê Trung Chiến</td>
					<td>40</td>
					<td>10/12/1997</td>
					<td>0985722125</td>
				</tr>
				<tr>
					<td scope="row">NhatKoo</td>
					<td>Admin</td>
					<td>Nguyễn Đăng Nhật</td>
					<td>40</td>
					<td>10/12/1997</td>
					<td>0985722125</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>