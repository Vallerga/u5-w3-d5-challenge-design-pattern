package gestioneincendi.model;

import org.slf4j.LoggerFactory;
import org.slf4j.*;

public class ComunicazioneHttp extends CanaleComunicazione {

    private static final Logger Logger = LoggerFactory.getLogger(ComunicazioneHttp.class);
    private String baseurlnotifica;

    public ComunicazioneHttp(String baseurlnotifica) {
    this.baseurlnotifica = baseurlnotifica;
    }

    public void sendGet(Long idSonda, double latitude, double longitude, int smokeLevel) {
    Logger.info("Allarme Sonda: {} - lat: {} lon: {} - Livello fumo: {} ", idSonda, latitude, longitude, smokeLevel);
    
    String url = baseurlnotifica + "?=idSonda" + idSonda + "&lat=" + latitude + "&lon=" + longitude + "&smokeLevel=" + smokeLevel;
    Logger.info("Call: {}", url);
    }
}