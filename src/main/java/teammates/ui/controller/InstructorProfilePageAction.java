package teammates.ui.controller;

import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.util.Assumption;
import teammates.common.util.Const;
import teammates.common.util.Logger;
import teammates.common.util.SanitizationHelper;
import teammates.ui.pagedata.InstructorProfilePageData;
import teammates.ui.pagedata.StudentProfilePageData;

public class InstructorProfilePageAction extends Action{
    private static final Logger log = Logger.getLogger();

    @Override
    protected ActionResult execute() {
        String email = getRequestParamValue(Const.ParamsNames.INSTRUCTOR_EMAIL);
        Assumption.assertPostParamNotNull(Const.ParamsNames.INSTRUCTOR_EMAIL, email);
        
        String courseId = getRequestParamValue(Const.ParamsNames.COURSE_ID);
        Assumption.assertPostParamNotNull(Const.ParamsNames.COURSE_ID, courseId);
        
        InstructorAttributes ia = logic.getInstructorForEmail(courseId, email);


        InstructorProfilePageData data = new InstructorProfilePageData(account, sessionToken, ia);
        

        return createShowPageResult(Const.ViewURIs.INSTRUCTOR_PROFILE_PAGE, data);
    }

}
