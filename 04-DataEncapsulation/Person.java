public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isAdult(){
        if(this.age>=18){
            return true;
        } else{
            return false;
        }
    }
    
    public String toString(){
        return this.name + "," + this.age;

    }

    public static void main(String[] args) {
        Person p = new Person("aNNA", 21);
        System.out.println(p.getAge());
        System.out.println(p.isAdult());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p);
    }
}