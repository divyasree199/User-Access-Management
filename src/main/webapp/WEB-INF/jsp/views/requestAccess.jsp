<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request Access</title>
</head>
<body>
<h2>Request Access to Software</h2>
<form action="${pageContext.request.contextPath}/access/request" method="post">
    <label for="software">Software Name:</label>
    <select id="software" name="softwareId">
        <!-- Dynamically populate options with software names -->
        <option value="1">Example Software 1</option>
        <option value="2">Example Software 2</option>
    </select><br><br>

    <label for="accessType">Access Type:</label>
    <select id="accessType" name="accessType">
        <option value="Read">Read</option>
        <option value="Write">Write</option>
        <option value="Admin">Admin</option>
    </select><br><br>

    <label for="reason">Reason for Request:</label><br>
    <textarea id="reason" name="reason" rows="4" cols="50"></textarea><br><br>

    <input type="submit" value="Submit Request">
</form>
</body>
</html>
