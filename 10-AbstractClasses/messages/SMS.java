package messages;
public class SMS extends Message{
    private String phoneNumber;

    SMS(String phoneNumber, String text){
        super(text);
        this.phoneNumber = phoneNumber;
    }

    public void send(){
        System.out.println(this.phoneNumber);
        System.out.println(getText());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        SMS s1 = new SMS("7249330193", "Cześć");
        SMS s2 = new SMS("567890134", "Hej");

        s1.send();
        s2.send();
    }
}
