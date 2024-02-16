<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" charset="UTF-8" content="text/jsp">
</head>
<body>
    <form method="get" action="http://localhost:8080/shop/ServletUser">
        <div class="container">
            <label><b>Пользователи</b></label>
            <button type="submit">Все пользователи </button>
        </div>
    </form>
    <%=request.getAttribute("users")%>
</body>
</html>