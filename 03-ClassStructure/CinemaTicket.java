public class CinemaTicket {
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int rowNo;
    int seatNo;
    double price;
    
    public double calculatePrice(){
        if(rowNo == 1 || rowNo == 2){
            price = 10;
        } else{
            price = 25;
        }
        return price;
    }
    public CinemaTicket(String title, int row, int seat){
        filmTitle = title;
        rowNo = row;
        seatNo = seat;
        price = calculatePrice();
    }

    public void displayTicket(){
        System.out.println(cinemaName);
        System.out.println("Film title: " + filmTitle);
        System.out.println("Row: " + rowNo);
        System.out.println("Seat: " + seatNo);
        System.out.println("Price: " + price + " zł");
    }
public static void main(String[] args) {
    CinemaTicket ticket1 = new CinemaTicket("Gladiator", 1, 10);
    CinemaTicket ticket2 = new CinemaTicket("Gladiator", 7, 10);
    
    ticket1.displayTicket();
    ticket2.displayTicket();
}
}
