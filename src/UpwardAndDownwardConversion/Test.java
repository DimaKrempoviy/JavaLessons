package UpwardAndDownwardConversion;

public class Test {
    public static void main(String[] args) {

        //Dog dog = new Dog();
        //Upcasting - Восходящее преобразование
        //Animal animal = dog;

        //Downcasting - Нисходящее преобразование
        ///Dog dog2 = (Dog) animal;
        //dog2.bark();

        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark(); //Error
    }
}
