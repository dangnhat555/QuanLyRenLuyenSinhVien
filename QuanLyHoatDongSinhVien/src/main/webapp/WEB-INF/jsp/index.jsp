<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
    <meta charset="utf-8">
    <head>
        <title>Java Spring Boot</title>
    </head>
    <body> 
        	<form  style="text-align: center; width:500px; height:250px; background: #66CCFF; margin:0px 250px 0px 250px;"
        	 method="post" th:action="@{/uploadFile}" enctype="multipart/form-data" th:object="${myFile}">
				<br>
				<h1>Upload File</h1>
				<br>
				File: <input type="file" th:field="*{multipartFile}" /> <br /> <br />
				<input type="submit" value="Submit" />
				<a th:text="${message1}"></a>
			</form>
			
    </body>
</html>