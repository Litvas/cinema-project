<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>


<H1>List of all sessions!</H1>
<br>

<c:if test="${!empty listSessions}">

    <table border="2px">

        <tr>
            <th>Start of session</th>
            <th>Finish of session</th>
            <th>Hall for this session</th>
        </tr

        <c:forEach items="${listSessions}" var="session">

            <tr>
                <td>${session.startSession}
                <img src='<c:url value="/resources/images/blank.png" />'/>
                </td>
                <td>${session.endSession}</td>
                <td>${session.hall}</td>
                <td><a href="/cinema/updatesession/${session.idSession}">Edit session</a></td>
                <td><a href="/cinema/deletesession/${session.idSession}">Delete session</a></td>
            </tr>
        </c:forEach>
    </table>

</c:if>

<c:if test="${empty listSessions}">
    <h4>Films not found!</h4>
</c:if>