import java.lang.Character;
public class Person {
    String name;
    String surname;

    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return ""+Character.toUpperCase(this.name.charAt(0))+Character.toUpperCase(this.surname.charAt(0));
    }
    public static void main(String[] args) {
        Person p1 = new Person("anna", "may");
        System.out.println(p1.toString());
    }
}
