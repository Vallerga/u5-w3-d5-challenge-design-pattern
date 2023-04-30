package gestioneincendi.model;

public class Sonda extends Subject {
	
	public final int SMOKE_THRESHOLD = 5;
	
	private Long id;
	private double latitude;
	private double longitude;
	private int smokeLevel = 0;

	public Sonda(Long id, double latitude, double longitude) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;

		if (smokeLevel > SMOKE_THRESHOLD) {
			super.notifyObservers();
		}
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
