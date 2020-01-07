package gestioneOrari;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.DisponibilitaModel;
import Model.RichiestaModOrario;
import Model.RichiestaModOrarioModel;

public class OrariDocControl {
	
	public OrariDocControl(
			
			){}
	
	public void aggiungiFirstOrario(String mDocente,ArrayList<String> giorni,ArrayList<String> orariInizio, ArrayList<String> orariFine) throws SQLException{
		
		DisponibilitaModel  disponibilitaModel = new DisponibilitaModel();
		
		int i = 0;
		
		for(i= 0; i<giorni.size();i++){
			
			System.out.println("Il for è eseguito: "+i);
			
			
			disponibilitaModel.aggiungiOrario(mDocente, giorni.get(i), orariInizio.get(i), orariFine.get(i));
			
		}
		
	}
	public void creaRichiestaModificaOrario(RichiestaModOrario richiesta) throws SQLException {
		RichiestaModOrarioModel  model = new RichiestaModOrarioModel();
		
		model.doSave(richiesta);
		
		
	}

}