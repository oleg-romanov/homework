package classWork_27_04_20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyField {
    String name();
}
