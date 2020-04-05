<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Top Deadliest Viruses</title>

</head>
<body>

<h2>Top 5 Out of 12 Deadliest Viruses</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Virus Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate</th>
        <th>Image</th>
    </tr>
    <c:forEach var = "listitem" items = "${viruslist}">
        <tr>
            <td>${listitem.getId()}</td>
            <td>${listitem.getVName()}</td>
            <td>${listitem.getDescription()}</td>
            <td>${listitem.getSymptoms()}</td>
            <td>${listitem.getDuration()}</td>
            <td>${listitem.getMortalityrate()}</td>
            <td><img src="${listitem.getImage()}" width="100" height="50"></td>

        </tr>


    </c:forEach>

</table>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
        width: 200px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
</body>
</html>
