package Collectors;

public class City {

	String cityName;
	double temp;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public City(String cityName, double temp) {
		super();
		this.cityName = cityName;
		this.temp = temp;
	}

	public City() {

	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", temp=" + temp + "]";
	}

}
