import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyTest {}

class LogicTests {
    @MyTest
    public void testOne() { System.out.println("Test 1 Passed!"); }

    public void secretMethod() { System.out.println("I shouldn't run."); }

    @MyTest
    public void testTwo() { System.out.println("Test 2 Passed!"); }
}

public class TestRunner {
    public static void main(String[] args) throws Exception {
        LogicTests tests = new LogicTests();
        for (Method m : tests.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(MyTest.class)) {
                m.invoke(tests);
            }
        }
    }
}