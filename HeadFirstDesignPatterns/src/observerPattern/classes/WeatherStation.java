package observerPattern.classes;

public class WeatherStation {
public static void main(String args[]){
	WeatherData weatherData = new WeatherData();
	CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
	weatherData.setMeasurements(80,65,30.45f);
	weatherData.setMeasurements(82,67,32.45f);
	weatherData.setMeasurements(84,69,34.45f);
}
}
