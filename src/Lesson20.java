public class Lesson20 {
    public static void main(String[] args) {
        Man h1 = new Man("Bob",40);
        Man h2 = new Man("Tom",30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Man h3 = new Man("Rod", 50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();

    }
}
class Man {

    private String name;
    private  int age;
    public static int countPeople;



    public Man(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }


    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void  printNumberOfPeople(){
        System.out.println("Number Of People is " + countPeople);
    }

}
