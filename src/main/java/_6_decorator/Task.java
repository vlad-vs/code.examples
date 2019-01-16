package _6_decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer1 = new JavaDeveloper();
        Developer developer2 = new SeniorDeveloper(new JavaDeveloper());
        Developer developer3 = new TeamLead(new SeniorDeveloper(new JavaDeveloper()));

        System.out.println(developer1.makeJob());
        System.out.println(developer2.makeJob());
        System.out.println(developer3.makeJob());
    }
}
