package lt.techin.praktinis;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        // Write your program here
        double fahrenheit = ((double)temperatureCelsius * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
