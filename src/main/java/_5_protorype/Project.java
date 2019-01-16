package _5_protorype;

public class Project  implements Copyble{

    private int id;
    private String projectName;
    private String curceCode;

    Project(int id, String projectName, String curceCode) {
        this.id = id;
        this.projectName = projectName;
        this.curceCode = curceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCurceCode() {
        return curceCode;
    }

    public void setCurceCode(String curceCode) {
        this.curceCode = curceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id,projectName,curceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", curceCode='" + curceCode + '\'' +
                '}';
    }
}
