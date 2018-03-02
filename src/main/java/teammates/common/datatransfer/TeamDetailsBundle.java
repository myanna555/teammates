package teammates.common.datatransfer;

import java.util.ArrayList;
import java.util.List;

import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.storage.entity.TeamProfile;

/**
 * Represents details of students in a team.
 * <br> Contains:
 * <br> * The team name .
 * <br> * {@link StudentAttributes} objects for all students in the team.
 */
public class TeamDetailsBundle {

    public String name;
    public List<StudentAttributes> students = new ArrayList<>();

   
    
    public String getName() {
        return name;
    }
    
    public List<StudentAttributes> getStudents() {
        return students;
    }
    public int getCount() {
        return students.size();
    }
        

}
