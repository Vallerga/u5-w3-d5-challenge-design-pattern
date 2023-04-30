package gestioneincendi.main;

import gestioneincendi.model.CentroControlloProxy;
import gestioneincendi.model.ControlloSonda;
import gestioneincendi.model.Sonda;

public class CentroControllo {
	private static CentroControlloProxy centroDiControlloRoma;
	private static CentroControlloProxy centroDiControlloMilano;
	private static Sonda sondaRoma;
	private static Sonda sondaMilano;
	private static ControlloSonda controlloSondaRoma;
	private static ControlloSonda controlloSondaMilano;

	public static void main(String[] args) {
		
		sondaRoma = new Sonda(12L, 41.9027835, 12.4963655);
		sondaRoma.setSmokeLevel(7);
		sondaMilano = new Sonda(102L, 45.4654219, 9.1859243);
		sondaMilano.setSmokeLevel(3);
		
		centroDiControlloRoma = new CentroControlloProxy();
		centroDiControlloMilano = new CentroControlloProxy();
		controlloSondaRoma = new ControlloSonda(1l, centroDiControlloRoma);
		controlloSondaMilano = new ControlloSonda(2l, centroDiControlloMilano);

		sondaRoma.addObserver(controlloSondaRoma);
		sondaMilano.addObserver(controlloSondaMilano);
		
		if (sondaRoma.getSmokeLevel() > sondaRoma.SMOKE_THRESHOLD) {
			controlloSondaRoma.update(sondaRoma);
		}
		
		if (sondaMilano.getSmokeLevel() > sondaMilano.SMOKE_THRESHOLD) {
			controlloSondaMilano.update(sondaMilano);
		}
	}
}
