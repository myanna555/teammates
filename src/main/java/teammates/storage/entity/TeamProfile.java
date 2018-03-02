package teammates.storage.entity;



import com.google.gson.annotations.SerializedName;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Unindex;

/**
 * Represents profile details for team entities 
 */
@Entity
@Unindex
public class TeamProfile extends BaseEntity{
    
    @Id
    private Long id;
    
    @SerializedName("teamname")
    private String teamName;
    
    @SerializedName("sectionname")
    private String sectionName; // find out how sections are represented
    
    @SerializedName("coursename")
    private String courseId; // which course it belongs to (FK)
    
    @SerializedName("website")
    private String website; // which course it belongs to (FK)
    
    @SerializedName("github")
    private String github; // which course it belongs to (FK)
  
    
    
    @SuppressWarnings("unused") // required by Objectify
    private TeamProfile() {
    }
    
    public TeamProfile(String name, String section, String course) {
      
        this.teamName = name;
        this.sectionName = section;
        this.courseId = course;
    }
    
    //getters and setters
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTeamName() {
        return this.teamName;
    }
    
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }
    
    public String getSectionName() {
        return this.sectionName;
    }
    
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }
    
    public String getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(String courseId) {
        this.courseId = courseId.trim();
    }
    
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website.trim();
    }
    
    public String getGithub() {
        return this.github;
    }
    
    public void setGithub(String github) {
        this.github = github.trim();
    }

    @Override
    public String toString() {
        return "Team [teamId=" + id
                + ", teamName=" + teamName + ", sectionName=" + sectionName
                + ", courseId=" + courseId  + "]";
    }

}
