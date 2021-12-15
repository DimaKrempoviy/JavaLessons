package NestedClasses;

public class Electrocar {
    private int id;

    // вложеный не статический класс
    private class Motor{
        public void startMotor(){
            System.out.println("Motor is starting...");
        }
    }

    // статитечски вложеный класс
    public static class Battery{
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        final int X = 1;

        class SomeClass {
            public void someMethod(){
                System.out.println(X);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electrocar " + id + " is starting...");
    }

    private void test(Object object){

    }
}
