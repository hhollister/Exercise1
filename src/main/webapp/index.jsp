<%@include file="head.jsp"%>
<html>
<body>
<h2>User Display Exercise - Week 1</h2>
<br />
<form action="/searchUser">
    <label for="lastName">Last Name</label>
    <input type="text" id="lastName" name="lastName">
    <br /><br />
    <button type="submit" name="submit" value="submit" >Search</button>
    <button type="submit" name="submit" value="viewAll" >View All Users</button>
</form>
</body>
</html>