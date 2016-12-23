import edu.pk.Configuration;
import edu.pk.Outer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pkumarjena on 12/23/16.
 *
 *      Declaration                 Bean Creation
 * Outer        Inner           Outer       Inner
 * ---------------------------------------------------
 * Singleton    Singleton       Singleton    Singleton
 * Singleton    Prototype       Singleton    Singleton
 * Singleton    Prototype       Singleton    Prototype(by using @Lookup in method level)
 * Prototype    Singleton       Prototype    Singleton
 * Prototype    Prototype       Prototype    Prototype
 */


public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        Outer outer = (Outer)applicationContext.getBean("outer");
        System.out.println(outer);
        System.out.println(outer.getInner());

        outer = (Outer) applicationContext.getBean("outer");
        System.out.println(outer);
        System.out.println(outer.getInner());
    }
}
