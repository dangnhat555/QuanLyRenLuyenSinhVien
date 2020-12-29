<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
    <meta charset="utf-8">
    <head>
        <title>Java Spring Boot</title>
    </head>
    <body>
        	<form th:action="@{/rs}" >
        		<a th:text="${message1}"></a>
			</form>
    </body>
 
</html>
