public class Student{
    //attributes
    String name;
    int age;
    int idCard;
    boolean idValid;
    int semesterNumber;
    double avgGrade;
    
    //methods
    public void sayHello(){
        System.out.println("Hello");
    }
    
    public void displayName(){
        System.out.println("My name is " + name);
    }
    
    public void displayAge(){
        System.out.println("I am " + age + " years old");
    }

    public void displayNameSemesterGrade(){
        System.out.println("My name is " + name + ", im in semester number" + semesterNumber + ", and my average grade is " + avgGrade);
    }

    public void changeIDStatus(){
        idValid = !idValid;
    }

    public void displayNameandID(){
        System.out.println("My name is " + name + " my ID card number is: " + idCard + "and it is " + idValid );
    }
    
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Włodek";
        student1.age = 19;
        student1.idCard = 1337;
        student1.idValid = true;
        student1.semesterNumber = 3;
        student1.avgGrade = 4.10;
        student1.sayHello();
        student1.displayName();
        student1.displayAge();
        student1.displayNameSemesterGrade();
        student1.changeIDStatus();
        student1.displayNameandID();
        
        
    }
}