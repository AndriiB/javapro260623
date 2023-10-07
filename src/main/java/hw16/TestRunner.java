package hw16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
public static void start(Class<?> testClass) throws InvocationTargetException, IllegalAccessException {
    testClass instance = new testClass();

    List<Method> beforeSuiteMethods = new ArrayList<>();
    List<Method> testMethods = new ArrayList<>();
    List<Method> afterSuiteMethods = new ArrayList<>();

    Method[] methods = testClass.getDeclaredMethods();

        for (Method method : methods) {
        if (method.isAnnotationPresent(BeforeSuite.class)) {
            beforeSuiteMethods.add(method);
        } else if (method.isAnnotationPresent(AfterSuite.class)) {
            afterSuiteMethods.add(method);
        } else if (method.isAnnotationPresent(Test.class)) {
            testMethods.add(method);
        }
    }

    if (beforeSuiteMethods.size() != 1) {
        throw new RuntimeException("There must be one method with @BeforeSuite annotation.");
    }

    if (afterSuiteMethods.size() != 1) {
        throw new RuntimeException("There must be one method with @AfterSuite annotation.");
    }

    testMethods.sort((m1, m2) -> {
        int p1 = m1.getAnnotation(Test.class).priority();
        int p2 = m2.getAnnotation(Test.class).priority();
        return Integer.compare(p1, p2);
    });

    for (Method method : beforeSuiteMethods) {
        method.invoke(instance);
    }

    for (Method method : testMethods) {
        method.invoke(instance);
    }

    for (Method method : afterSuiteMethods) {
        method.invoke(instance);
    }
}
}

