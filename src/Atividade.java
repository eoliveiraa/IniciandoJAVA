import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {

        var male = new Person();
        male.name = "João";
        male.age = 12;

        var female = new Person();
        female.name = "Maria";
        female.age = 20;

        System.out.println("Male name: " + male.getName() + ", age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + ", age: " + female.getAge());
    }
}
