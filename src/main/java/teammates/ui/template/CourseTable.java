package teammates.ui.template;

import java.util.ArrayList;
import java.util.List;

import teammates.common.datatransfer.attributes.CourseAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.Instructor;

public class CourseTable {
    private String courseId;
    private String courseName;
    private List<ElementTag> buttons;
    private List<HomeFeedbackSessionRow> rows;
    private List<InstructorAttributes> instructors = new ArrayList<>();

    public CourseTable(CourseAttributes course, List<ElementTag> buttons, List<HomeFeedbackSessionRow> rows) {
        this.courseId = course.getId();
        //TODO: [CourseAttribute] remove desanitization after data migration
        this.courseName = SanitizationHelper.desanitizeIfHtmlSanitized(course.getName());
        this.buttons = buttons;
        this.rows = rows;
    }
    
  

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<ElementTag> getButtons() {
        return buttons;
    }

    public List<HomeFeedbackSessionRow> getRows() {
        return rows;
    }
    
    public void setInstructors(List<InstructorAttributes> instructors) {
        this.instructors.addAll(instructors);
    }
    
    public List<InstructorAttributes> getInstructors() {
        return this.instructors;
    }
}
