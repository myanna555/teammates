<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib tagdir="/WEB-INF/tags/instructor" prefix="ti" %>
<%@ taglib tagdir="/WEB-INF/tags/instructor/home" prefix="home" %>

<c:set var="jsIncludes">
  <script type="text/javascript" src=""></script>
</c:set>
<ti:instructorPage title="Instructor Profile" jsIncludes="${jsIncludes}">
  
  <t:statusMessage statusMessagesToUser="${data.statusMessagesToUser}" />
   <c:if test="${not empty data.profile}">
   <p>${data.profile.name}</p>
    <p>${data.profile.email}</p>
      <p>${data.profile.courseId}</p>
</c:if>
</ti:instructorPage>