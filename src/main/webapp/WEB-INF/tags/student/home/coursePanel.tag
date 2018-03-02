<%@ tag description="studentHome - Course table panel" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ tag import="teammates.common.util.Const" %>
<%@ attribute name="courseTable" type="teammates.ui.template.CourseTable" required="true" %>
<div class="panel panel-primary">
  <div class="panel-heading">
  <div class="info" style="margin-bottom:10px;">
  <p style="margin-bottom:0;">Course:</p>
    <span><strong>
      [${courseTable.courseId}] : ${fn:escapeXml(courseTable.courseName)}
    </strong></span>
	</div>
	 <div class="info" style="margin-bottom:10px;">
	<p style="margin-bottom:0;">Instructors:</p>
	 <c:forEach items="${courseTable.instructors}" var="instructor">
	 
	 <span><strong><a style="text-decorarion:underline; color:#fff;" href="/page/instructorProfilePage?instructoremail=${instructor.email}&courseid=${courseTable.courseId}">${instructor.name}</a></strong></span><br/>
	
	  </c:forEach>
	  </div>
    <p >
      <c:forEach items="${courseTable.buttons}" var="button">
        <span class="pull-right"><a class="btn btn-primary btn-xs" data-toggle="tooltip" data-placement="top" ${button.attributesToString}>
          ${button.content}
        </a></span>
      </c:forEach>
    </p>
  </div>
  <jsp:doBody />
</div>
