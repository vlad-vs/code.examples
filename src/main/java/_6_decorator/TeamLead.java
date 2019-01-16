package _6_decorator;

public class TeamLead extends DeveloperDecorator {

    public TeamLead(Developer developer) {
        super(developer);
    }

    String makeReport(){
        return "Make report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeReport();
    }
}
