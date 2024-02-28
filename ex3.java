package work;

public class Teacher {
    private String designation = "Teacher";
    private String CollegeName = "Beginnersbook";
    public String getDesignation(){
        return designation;
    } 
    protected void SetDesignation(String designation){
        this.designation = designation;
    }
    protected String getCollegeName(){
        return CollegeName;
    }
    protected void SetCollegeName(String CollegeName){
        this.CollegeName = CollegeName;
    }
    void does(){
        System.out.println("Teaching");
    }
}
