package com.branch;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//kendi anotasyonumu oluşturdum
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)  //başka classların üstüne eklenebilmesi için.
public @interface YucelenAnotasyonu {

}
