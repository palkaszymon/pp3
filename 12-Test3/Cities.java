import java.util.ArrayList;

public class Cities {
    private String[] citynames;

    public Cities(String[] citynames) {
        this.citynames = citynames;
    }

    public Cities[] filter(char a){
        
        ArrayList<String> arr = new ArrayList<String>();

        for(String city: citynames){
            if(city.charAt(0)==a){
                arr.add(city);
            }
        }

        return arr.toArray(new Cities[arr.size()]);
    }
}