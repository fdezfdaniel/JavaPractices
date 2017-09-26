import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{

	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(Observable observable){
		observable.addObserver(this);
	}

	public void update(Observable o, Object arg){
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display(){
		System.out.println("Curren conditions : " + currentPressure + "F degrees and ");
	}

}