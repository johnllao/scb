package springboot.models;

public class Weather {

	private String location;
	private String temperature;
	private String description;
	private String wind;
	private String humidity;
	private String pressure;
	private String dewPoint;
	private String visibility;
	private String uvIndex;
	
	public Weather(final String location,
			final String temperature,
			final String description,
			final String wind,
			final String humidity,
			final String pressure,
			final String dewPoint,
			final String visibility,
			final String uvIndex) {
		
		this.location = location;
		this.description = description;
		this.wind = wind;
		this.humidity = humidity;
		this.pressure = pressure;
		this.dewPoint = dewPoint;
		this.visibility = visibility;
		this.uvIndex = uvIndex;
		
	}
	
	public String getLocation() {
		return location;
	}
	public String getTemperature() {
		return temperature;
	}
	public String getDescription() {
		return description;
	}
	public String getWind() {
		return wind;
	}
	public String getHumidity() {
		return humidity;
	}
	public String getPressure() {
		return pressure;
	}
	public String getDewPoint() {
		return dewPoint;
	}
	public String getVisibility() {
		return visibility;
	}
	public String getUvIndex() {
		return uvIndex;
	}
}
