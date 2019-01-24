package _test_Lombok;

import lombok.NonNull;
import org.joda.time.LocalDate;

public class TestLombok {

    public static void main(String[] args) {
        Men men = new Men();
        men.setAge(5);
        System.out.println(men);


        final ImutableClass_CumulativePermissionDTO name = ImutableClass_CumulativePermissionDTO.builder().ldaplogin("name").dateFrom(LocalDate.now()).build();
        @NonNull final String ldaplogin = name.getLdaplogin();
        System.out.println(name);

    }
}
