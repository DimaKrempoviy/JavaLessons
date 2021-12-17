package EnumLessons;

public class Test {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.name());
        //Animal animal = Animal.DOG;
        //System.out.println(animal);


       /* switch(animal) {
            case CAT:
                System.out.println("It`s a cat!");
                break;
            case DOG:
                System.out.println("It`s a dog!");
                break;
       }*/

        //Season season = Season.WINTER;
        //System.out.println(season.getTemperature());

        //Object -> Enum -> Season

        //System.out.println(season.getClass());

 /*       switch (season) {
            case SUMMER:
                System.out.println("It`s warm outside!");
                break;
            case WINTER:
                System.out.println("It`s cold outside!");
                break;
        }*/
    }
}
