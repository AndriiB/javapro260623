package hw16;

public class testClass {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite comes first");
    }

    @Test(priority = 5)
    public void testMethod1() {
        System.out.println("This method has priority 5");
    }

    @Test(priority = 1)
    public void testMethod2() {
        System.out.println("This method executes first");
    }

    @Test(priority = 7)
    public void testMethod4() {
        System.out.println("This method has priority 7");
    }

    @Test(priority = 10)
    public void testMethod3() {
        System.out.println("This method executes last");
    }

    @AfterSuite
    public void afterSuite1() {
        System.out.println("AfterSuite comes last");
    }

    public static class Main {
        public static void main(String[] args) throws Exception {
            TestRunner.start(testClass.class);
        }
    }
}

