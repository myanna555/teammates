package teammates.ui.pagedata;

import java.util.List;

import teammates.common.datatransfer.TeamDetailsBundle;
import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.attributes.StudentProfileAttributes;
import teammates.ui.template.StudentInfoTable;
import teammates.ui.template.StudentProfile;

public class InstructorCourseTeamDetailsPageData extends PageData{
    
    private StudentProfile studentProfile;
    private StudentInfoTable studentInfoTable;
    private TeamDetailsBundle teamDetails;

    public InstructorCourseTeamDetailsPageData(AccountAttributes account, String sessionToken, TeamDetailsBundle td) {
        super(account, sessionToken);
        if (td!=null) {
            this.teamDetails = td;
        }
        else {
            this.teamDetails = new TeamDetailsBundle();
            this.teamDetails.name = "N/A";
        }
        /*if (studentProfile != null) {
            String pictureUrl = getPictureUrl(studentProfile.pictureKey);
            this.studentProfile = new StudentProfile(student.name, studentProfile, pictureUrl);
        }*/
        //this.studentInfoTable = new StudentInfoTable(student, hasSection);
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public StudentInfoTable getStudentInfoTable() {
        return studentInfoTable;
    }
    
    public TeamDetailsBundle getTeamDetails() {
        return teamDetails;
    }

}
