package com.ctp.cdi.query.test.domain;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Simple.class)
public abstract class Simple_ {

    public static volatile SingularAttribute<Simple, Long> id;
    public static volatile SingularAttribute<Simple, String> name;
    public static volatile SingularAttribute<Simple, String> camelCase;
    public static volatile SingularAttribute<Simple, Boolean> enabled;
    public static volatile SingularAttribute<Simple, Integer> counter;
    public static volatile SingularAttribute<Simple, Date> temporal;

}
