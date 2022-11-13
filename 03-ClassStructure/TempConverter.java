public class TempConverter {
    public static double CelsiusToKelvin(double temp){
        return temp + 273.15;
    }
    public static double KelvinToCelsius(double temp){
        return temp - 273.15;
    }
    public static double CelsiusToFahrenheit(double temp){
        return temp * 1.8 + 32;
    }
    public static double FahrenheitToCelsius(double temp){
        return temp * (5/9) - 32;
    }
    public static double FahrenheitToKelvin(double temp){
        return (temp + 459.67) * (5/9);
    }
    public static double KelvinToFahrenheit(double temp){
        return 1.8*(temp-273.5)+32; 
    }

    public static void main(String[] args) {
        System.out.println(CelsiusToKelvin(25));
        System.out.println(CelsiusToFahrenheit(25));
        System.out.println(FahrenheitToKelvin(100));
        System.out.println(FahrenheitToCelsius(100));
        System.out.println(KelvinToCelsius(0));
        System.out.println(KelvinToFahrenheit(0));
    }
}
