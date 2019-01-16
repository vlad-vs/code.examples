package _test_Lombok;


import com.google.common.collect.ComparisonChain;
import lombok.*;
import org.joda.time.LocalDate;

import java.io.Serializable;

/**
 * Объект для храняния периода действия накопительного времени
 * @author Semenov Vladyslav (dn060688svv1)
 * @since 1.1
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ImutableClass_CumulativePermissionDTO implements Comparable<ImutableClass_CumulativePermissionDTO>, Serializable {

    /**
     *Идентификатор человека
     */
    @NonNull
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.NONE)
    private String ldaplogin;

    /**
     * Дата начала действия разрешения
     */
    @NonNull
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.NONE)
    private LocalDate dateFrom;

    /**
     * Дата окончания действия разрешения
     */
    @Setter(AccessLevel.NONE)
    private LocalDate dateTo;

    /**
     * Метод копирования текущего объекта
     *
     * @return копия объекта CumulativePermissionDTO
     */
    public ImutableClass_CumulativePermissionDTO copy() {
        return new ImutableClass_CumulativePermissionDTO(ldaplogin, dateFrom, dateTo);
    }

    @Override
    public int compareTo(ImutableClass_CumulativePermissionDTO o) {
        return ComparisonChain.start()
                .compare(ldaplogin, o.getLdaplogin())
                .compare(dateFrom, o.getDateFrom())
                .result();
    }

}


