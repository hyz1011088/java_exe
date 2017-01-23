<<<<<<< HEAD
import java.lang.annotation.*;

@Target( { ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Field_Method_Parameter_Annotation {

	String describe();

	Class type() default void.class;

}
=======
import java.lang.annotation.*;

@Target( { ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Field_Method_Parameter_Annotation {

	String describe();

	Class type() default void.class;

}
>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
