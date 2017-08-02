package observerPattern.classes;

import observerPattern.interfaces.DisplayElement;
import observerPattern.interfaces.Observer;
import observerPattern.interfaces.Subject;

public class ForecastDisplay implements Observer,DisplayElement{
	private float temp;
    private float humidity;
    private float pressure;
    Subject weatherData;
    public ForecastDisplay(Subject weatherData){
    	this.weatherData = weatherData;
    	weatherData.registerObserver(this);
    }
	@Override
	public void display() {
		System.out.println("Forecast is : "+"Temp : "+temp+" , Humidity : "+humidity+" , Pressure : "+pressure);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp+10;
    	this.humidity = humidity+10;
    	this.pressure = pressure+10;
    	display();
	}

}
