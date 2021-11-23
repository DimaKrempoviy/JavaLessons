public class Lesson20 {
    public static void main(String[] args) {
        Man.description = "Nise";
    }
}
class Man {

    private String name;
    private  int age;
    public static String description;


    public Man(String name, int age){
        System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
    }


    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

}
