<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<H1>List of all films!</H1>
<br>
<c:if test="${!empty listFilms}">
    <table border="2px">
        <tr>
            <td>Title</td>
            <td>Duration</td>
            <td>Session</td>
            <td>Date of start showing</td>
            <td>Date of end showing</td>
        </tr>
        <c:forEach items="${listFilms}" var="film">
            <tr>
                <td>${film.titleOfFilm}</td>
                <td>${film.durationOfFilm}</td>
                <td>
                    <c:forEach items="${film.sessions}" var="session">
                        <fmt:formatDate value="${session.startSession}" pattern="HH:mm"/> -
                        <fmt:formatDate value="${session.endSession}" pattern="HH:mm"/>
                        <br>
                    </c:forEach>
                </td>
                <td>${film.dateOfStartShowing}</td>
                <td>${film.dateOfEndShowing}</td>

                <td><a href="/cinema/updatefilm/${film.idFilm}">Edit film</a></td>
                <td><a href="/cinema/deletefilm/${film.idFilm}">Delete film</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<c:if test="${empty listFilms}">
    <h4>Films not found!</h4>
</c:if>
