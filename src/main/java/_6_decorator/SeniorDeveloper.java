package _6_decorator;

public class SeniorDeveloper extends DeveloperDecorator {


    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String codeReview() {
        return "MakeCodeRew";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + codeReview();
    }
}
