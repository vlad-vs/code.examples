package _5_protorype;

class ProjectFactoy {

    private final Project project;

    ProjectFactoy(Project project) {
        this.project = project;
    }

    Project cloneProject(){
        return (Project) project.copy();
    }
}
