package _test_Lombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public @Data class Men {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;
}
