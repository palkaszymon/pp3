public class Time{
    public static void main(String[] args){
        int hour = 14;
        int minute = 9;
        int second = 53;
        float secondsPassed = hour*60*60 + minute*60 + second;
        float timeAtStart = 13*60*60 + 53*60 + 46;
        System.out.println("Number of seconds since midnight: " + Math.round(secondsPassed));
        System.out.println("Number of seconds remaining in the day: " + ((24*60*60) - (hour*60*60 + minute*60 + second)));
        System.out.println("Percentage of the day that has passed: " + secondsPassed/(24*60*60)*100 + "%");
        System.out.println("You have spent " + Math.round(secondsPassed - timeAtStart) + " seconds");
        }
}