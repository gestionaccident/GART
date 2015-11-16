package com.onsr.accidents.managedbeans;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import com.onsr.accidents.business.Poste;
import com.onsr.accidents.dao.*;
public class GestionPoste {
	
	AjouterPoste ap = new AjouterPoste() ;
	Poste p = new Poste() ;
	
	
	public Poste getP() {
		return p;
	}



	public void setP(Poste p) {
		this.p = p;
	}



	public void insertPoste()
	{
		if (ap.insert(p) != 0)
		{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"ajout","Ajout Effectué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			 
			
		}else{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_WARN,"ajout","Ajout Echoué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg); }
		
	}



	public AjouterPoste getAp() {
		return ap;
	}



	public void setAp(AjouterPoste ap) {
		this.ap = ap;
	}
	

}
