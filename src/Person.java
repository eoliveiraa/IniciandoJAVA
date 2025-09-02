public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//Records
/// public record Person(String name, int age){}
//Eles são imutáveis por padrão, o que significa que não podemos alterar seus valores
// após a criação do objeto. Além disso, eles são bastante úteis para representar dados,
// como, por exemplo, uma entidade de banco de dados