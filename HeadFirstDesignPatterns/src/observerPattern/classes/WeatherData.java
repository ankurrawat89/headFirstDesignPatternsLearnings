package observerPattern.classes;

import java.util.ArrayList;

import observerPattern.interfaces.Observer;
import observerPattern.interfaces.Subject;

public class WeatherData implements Subject{
    private ArrayList<Observer> Observers;
    private float temp;
    private float humidity;
    private float pressure;
	public WeatherData(){
		Observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		Observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = Observers.indexOf(o);
		if(i>=0){
			Observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o : Observers){
			o.update(temp, humidity, pressure);
		}
	}
    public void measurementChanged(){
    	notifyObservers();
    }
    
    public void setMeasurements(float temp, float humidity , float pressure){
    	this.temp = temp;
    	this.humidity = humidity;
    	this.pressure = pressure;
    	measurementChanged();
    }
}
