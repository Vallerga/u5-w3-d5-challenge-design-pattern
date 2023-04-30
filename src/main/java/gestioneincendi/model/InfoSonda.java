package gestioneincendi.model;

public class InfoSonda {
	private final Long idSonda;
	private final double longitude;
	private final double latitude;
	private final int smokeLevel;
	
	public InfoSonda(Long idSonda, double longitude, double latitude, int smokeLevel) {
		super();
		this.idSonda = idSonda;
		this.longitude = longitude;
		this.latitude = latitude;
		this.smokeLevel = smokeLevel;
	}
	
	public Long getIdSonda() {
		return idSonda;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
			
	public int getSmokeLevel() {
		return smokeLevel;
	}

}
