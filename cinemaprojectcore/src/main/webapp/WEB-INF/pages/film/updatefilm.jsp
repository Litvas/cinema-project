<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1>Add new employee</h1>

<form:form action="/cinema/updatefilm" method="post" modelAttribute="film">
    <table>
        <tr hidden="hidden"><form:input path="idFilm" hidden="hidden"/></tr>
        <tr>
            <td>Title</td>
            <td><form:input path="titleOfFilm"/></td>
        </tr>
        <tr>
            <td>Duration of film</td>
            <td><form:input type="number" path="durationOfFilm"/></td>
        </tr>
        <tr>
            <td>Session</td>
            <td>

                <c:forEach items="${sessionList}" var="session">

                    <input type="checkbox" name="sessions" value="${session.idSession}"/>
                    <fmt:formatDate value="${session.startSession}" pattern="HH:mm"/> -
                    <fmt:formatDate value="${session.endSession}" pattern="HH:mm"/>

                    <br>

                </c:forEach>

                <br>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Add new film"></td>
        </tr>
    </table>
</form:form>

