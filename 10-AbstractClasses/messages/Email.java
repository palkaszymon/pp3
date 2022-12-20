package messages;
public class Email extends Message{
    private String subject;
    private String recAddress;

    Email(String subject, String recAddress, String text){
        super(text);
        this.subject = subject;
        this.recAddress = recAddress;
    }

    @Override
    public void send() {
        System.out.println(this.recAddress);
        System.out.println(this.subject);
        System.out.println(getText());
    }

    public String getRecAddress() {
        return recAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setRecAddress(String recAddress) {
        this.recAddress = recAddress;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
