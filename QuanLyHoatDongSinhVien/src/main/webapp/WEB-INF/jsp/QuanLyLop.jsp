<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lớp</title>
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />
<body>
	<body>
	<div class="menu">
		<div class="container">
			<ul class="mainmenu">
				
				<li><a href="">Tài Khoản</a></li>
				<li><a href="">Lớp</a>
					<ul class="submenu">
						<li><a href="#">CNTT</a>
							<ul class="child-submenu">
								<li><a href="#">K40</a></li>
								<li><a href="#">K41</a></li>
								<li><a href="#">K42</a></li>
								<li><a href="#">K43</a></li>
							</ul>
						</li>
						<li><a href="#">CNPM</a>
							<ul class="child-submenu">
								<li><a href="#">K40</a></li>
								<li><a href="#">K41</a></li>
								<li><a href="#">K42</a></li>
								<li><a href="#">K43</a></li>
							</ul>
						</li>
					</ul>
				</li>
				<li><a href="">Hoạt Động</a></li>
				<li><a href="">Chi Tiết Hoạt Động</a></li>
				<li><a href="">Nhập Danh Sách</a></li>
				
			</ul>
		</div>
				<li class="phai">
					<button class="btn btn-primary phai">Đăng xuất</button>
				</li>
	</div>
	<div>
		<table class="table text-center">
			<caption></caption>
			<thead>
				<tr>
					<th scope="col">MSV</th>
					<th scope="col">Họ & Tên</th>
					<th scope="col">Ngày Sinh</th>
					<th scope="col">Địa Chỉ</th>
					
				</tr>
			</thead>
			<tbody>
				<tr>
					<a><td scope="row">4051050034</td></a>
					<td>Nhật Gà</td>	
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
<style>
.phai {
	position: absolute;
	right: 5px;
	top: 5px
}
*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	
}
ul li{
	list-style:none; 
}
a{
	text-decoration: none;
}
div.container{
	width: 80%;
	margin: 0px auto;
}
.menu {
    background-color: white;
}
ul.mainmenu > li{
	display: inline-block;
	margin-left:4px;
	position: relative;
}
ul.mainmenu > li:hover ul.submenu{
 display: block;
}
ul.mainmenu > li > a {
    color: blue;
    display: block;
    padding: 15px 30px;
    font-weight: bold;
    border-right: 1px solid white;
    transition: .5s;
}
ul.mainmenu > li > a:hover{
	background-color: yellow;
}
ul.submenu{
	position: absolute;
	width: 100%;
	background-color: black;
	display: none;
}
ul.submenu > li {
	border-bottom: 1px solid white;
	position: relative;
}
ul.submenu > li:hover ul.child-submenu{
	display: block;
}
ul.submenu > li > a{
	color: white;
	display: block;
	padding: 10px 10px; 
}
ul.child-submenu {
    position: absolute;
    left: 100%;
    background: yellow;
    display: none;
    top: 0;
}
ul.child-submenu >li > a{
	display: block;
	padding: 10px 10px
}
</style>