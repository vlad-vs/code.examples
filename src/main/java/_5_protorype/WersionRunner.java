package _5_protorype;

public class WersionRunner {

    public static void main(String[] args) {
        Project master = new Project(1,"Master","MainCode");
        System.out.println(master.hashCode());

        Project clone1 = (Project) master.copy();
        System.out.println(clone1.hashCode());

        ProjectFactoy factoy = new ProjectFactoy(master);
        Project clone2 = factoy.cloneProject();
        System.out.println(clone2.hashCode());

    }

}
