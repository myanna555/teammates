package teammates.ui.pagedata;

import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.common.util.Const;


public class InstructorProfilePageData extends PageData{
    private InstructorAttributes attrs;

    public InstructorProfilePageData(AccountAttributes account, String sessionToken, InstructorAttributes ia) {
        super(account, sessionToken);
        if(ia !=null) {
            this.attrs = ia;
        }

    }

    public InstructorAttributes getProfile() {
        return attrs;
    }
}
