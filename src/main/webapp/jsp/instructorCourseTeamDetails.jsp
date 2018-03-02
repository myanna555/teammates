<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="teammates.common.util.FrontEndLibrary" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib tagdir="/WEB-INF/tags/instructor" prefix="ti" %>
<%@ taglib tagdir="/WEB-INF/tags/instructor/courseStudentDetails" prefix="csd" %>
<c:set var="jsIncludes">
  <script type="text/javascript" src="/js/instructorCourseStudentDetails.js"></script>
</c:set>
<ti:instructorPage title="Team Details" jsIncludes="${jsIncludes}">
  <t:statusMessage statusMessagesToUser="${data.statusMessagesToUser}" />
 <c:if test="${not empty data.teamDetails}">
    <h2>${data.teamDetails.name}:</h2>
  
    <div class="form-horizontal">
   	<div class="form-group">
  <table>
  

  </c:if>
   <c:if test="${not empty data.teamDetails.students}">
      <c:forEach items="${data.teamDetails.students}" var="student">
      <tr>
      <td style="padding-top:20px; padding-bottom:20px;"><img class="profile-pic" src="${student.publicProfilePictureUrl}"/></td>
      <td class="teamMembersDetailsCell" style="padding-top:20px; padding-bottom:20px;">
                <label>Name:</label>
                <a href="/page/instructorCourseStudentDetailsPage?courseid=anna.lambrix.gma-demo&studentemail=${student.email}&user=test%40example.com"> ${student.name}</a><br/>
                <label>Email:</label>
                <a href="mailto:${student.email}">
                  ${student.email}
                </a><br/>
                <label>Comments:</label>
                ${student.comments}
              </td>
             
      </tr>
         </c:forEach>
  </c:if>
    </table>
  </div>
  </div>
  
 
 
</ti:instructorPage>