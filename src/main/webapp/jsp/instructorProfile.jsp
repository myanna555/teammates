<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib tagdir="/WEB-INF/tags/instructor" prefix="ti" %>
<%@ taglib tagdir="/WEB-INF/tags/instructor/home" prefix="home" %>
<h1> hello gato</h1>
<c:set var="jsIncludes">
  <script type="text/javascript" src="/js/instructorHome.js"></script>
</c:set>
<ti:instructorPage title="Instructor Profile" jsIncludes="${jsIncludes}">
  <home:search />
  <br>
  <t:statusMessage statusMessagesToUser="${data.statusMessagesToUser}" />

</ti:instructorPage>