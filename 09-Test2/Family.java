public class Family {
    Person[] people;
    
    public Family(Person[] person){
        this.people = person;
    }

    public int adults(){
        int count = 0;
        for(Person person : people){
            if(person.getAge()>=18){
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 7);
        Person p2 = new Person("Anna", 19);
        Person p3 = new Person("Łukasz", 25);
        Person p4 = new Person("Joanna", 39);
        Family f1 = new Family(new Person[] {p1,p2,p3,p4});
        System.out.println(f1.adults());
    }
}

