<%@include file="head.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html><body>

<div class="container-fluid">
    <h2>Search Results: </h2>

    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
            <th>First Name</th>
            <th>Last Name</th>
            <th>ID</th>
            <th>Age</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userid}</td>
                <td>${user.ageCalculator()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
