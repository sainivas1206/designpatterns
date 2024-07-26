import com.observable.DispalyWeather;
import com.observable.Observer;
import com.observable.WeatherData;

public class App {
    public static void main(String[] args) throws Exception {

        WeatherData weatherData = new WeatherData();

        // new DispalyWeather(weatherData);
       Observer obj =  new DispalyWeather();
       weatherData.registerObserver(obj);


        weatherData.setMeasurements(25.5f, 65.3f, 1012f);
        weatherData.setMeasurements(26.7f, 70.4f, 1015f);
        weatherData.setMeasurements(28.2f, 68.9f, 1010f);

    }
}
