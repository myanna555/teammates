package teammates.ui.controller;


import java.util.ArrayList;
import java.util.List;
import static com.googlecode.objectify.ObjectifyService.ofy;
import teammates.common.datatransfer.TeamDetailsBundle;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.attributes.StudentProfileAttributes;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.util.Assumption;
import teammates.common.util.Const;
import teammates.common.util.StatusMessage;
import teammates.common.util.StatusMessageColor;
import teammates.storage.entity.TeamProfile;
import teammates.ui.pagedata.InstructorCourseTeamDetailsPageData;

public class InstructorCourseTeamDetailsPageAction extends Action{
    
    @Override
    public ActionResult execute() throws EntityDoesNotExistException {

        String courseId = getRequestParamValue(Const.ParamsNames.COURSE_ID);
        //Assumption.assertPostParamNotNull(Const.ParamsNames.COURSE_ID, courseId);

        
        
        String teamName = getRequestParamValue(Const.ParamsNames.TEAM_NAME);
        //Assumption.assertPostParamNotNull(Const.ParamsNames.TEAM_NAME, teamName);
        
        InstructorAttributes instructor = logic.getInstructorForGoogleId(courseId, account.googleId);
        /*gateKeeper.verifyAccessible(instructor, logic.getCourse(courseId), student.section,
                                    Const.ParamsNames.INSTRUCTOR_PERMISSION_VIEW_STUDENT_IN_SECTIONS);*/
        
     
        TeamDetailsBundle thisTeam = new TeamDetailsBundle();
       
        
        List<TeamDetailsBundle> allTeams = logic.getTeamsForCourse(courseId);
        
        
        for (TeamDetailsBundle team : allTeams) {
            
            if (team.name.equals(teamName)) {
                
                thisTeam.name = team.name;
                thisTeam.students.addAll(team.students);
                
            }
           
        }
        if(thisTeam.name == null) {
            thisTeam.name = "N/A";
        }
        
      

       /* StudentAttributes student = logic.getStudentForEmail(courseId, studentEmail);
        if (student == null) {
            statusToUser.add(new StatusMessage(Const.StatusMessages.STUDENT_NOT_FOUND_FOR_COURSE_DETAILS,
                                               StatusMessageColor.DANGER));
            isError = true;
            return createRedirectResult(Const.ActionURIs.INSTRUCTOR_HOME_PAGE);
        }
        */
        
        

        boolean hasSection = logic.hasIndicatedSections(courseId);

        //StudentProfileAttributes studentProfile = loadStudentProfile(student, instructor);

        InstructorCourseTeamDetailsPageData data =
                new InstructorCourseTeamDetailsPageData(account, sessionToken, thisTeam);

        statusToAdmin = "instructorCourseTeamDetails Page Load<br>"
                        + "Viewing details for TEAM <span class=\"bold\">" + teamName
                        + "</span> in Course <span class=\"bold\">[" + courseId + "]</span>";

        return createShowPageResult(Const.ViewURIs.INSTRUCTOR_COURSE_TEAM_DETAILS, data);

    }
    

  

}
