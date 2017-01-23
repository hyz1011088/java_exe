<<<<<<< HEAD
import java.lang.annotation.*;

@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constructor_Annotation {

	String value() default "默认构造方法";

}
=======
import java.lang.annotation.*;

@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constructor_Annotation {

	String value() default "默认构造方法";

}
>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
