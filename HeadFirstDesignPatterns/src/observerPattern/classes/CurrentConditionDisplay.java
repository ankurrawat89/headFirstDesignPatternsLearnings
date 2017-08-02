package observerPattern.classes;


import observerPattern.interfaces.DisplayElement;
import observerPattern.interfaces.Observer;
import observerPattern.interfaces.Subject;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	private float temp;
    private float humidity;
    private float pressure;
    Subject weatherData;
    public CurrentConditionDisplay(Subject weatherData){
    	this.weatherData = weatherData;
    	weatherData.registerObserver(this);
    }
	@Override
	public void display() {
		System.out.println("Temp : "+temp+" , Humidity : "+humidity+" , Pressure : "+pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
    	this.humidity = humidity;
    	this.pressure = pressure;
    	display();
	}

}
