package Framework.Annotations.Common;


import org.apiguardian.api.API;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import java.lang.annotation.*;
import static org.apiguardian.api.API.Status.STABLE;

@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(status = STABLE, since = "5.0")
@Inherited
@Test
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public @interface MyTest {

}
