public class InternetDevice {
    String deviceName;
    boolean connected;
    static int connectedDevices = 0;
    
    public InternetDevice(String name){
        deviceName = name;
    }
    public void connect(){
        if(connected==false){
            connected = true;
            connectedDevices++;
        }
    }
    public void disconnect(){
        if(connected==true){
            connected = false;
            connectedDevices--;
        }
    }
    public void isConnected(){
        System.out.println(connected);
    }
    public void displayStatus(){
        System.out.println("Device name: "+ deviceName+ ". Connection status: "+connected);
    }
    public static void displayConnections(){
        System.out.println("Number of connected devices: "+connectedDevices);
    }
    public static void main(String[] args){
        InternetDevice dev1 = new InternetDevice("Computer");
        dev1.connect();
        dev1.displayStatus();
        InternetDevice dev2 = new InternetDevice("Phone");
        dev2.connect();
        dev2.displayStatus();
        InternetDevice dev3 = new InternetDevice("Laptop");
        dev3.connect();
        dev3.displayStatus();
        InternetDevice dev4 = new InternetDevice("Tv");
        dev4.disconnect();
        dev4.displayStatus();
        InternetDevice dev5 = new InternetDevice("Smartwatch");
        dev5.disconnect();
        dev5.displayStatus();
        displayConnections();
    }
}
