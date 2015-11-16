package com.onsr.accidents.managedbeans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;

import com.onsr.accidents.business.*;
import com.onsr.accidents.dao.*;
import org.primefaces.context.RequestContext;



public class Managedbean implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Route route=new Route();
private Description_route   descroute=new Description_route ();
private facteurs_naturels fn=new  facteurs_naturels();
private caractéristiques_route cr=new caractéristiques_route();

public Route getRoute() {
	return route;
}
public void setRoute(Route route) {
	this.route = route;
}
public Description_route getDescroute() {
	return descroute;
}
public void setDescroute(Description_route descroute) {
	this.descroute = descroute;
}
public facteurs_naturels getFn() {
	return fn;
}
public void setFn(facteurs_naturels fn) {
	this.fn = fn;
}
public caractéristiques_route getCr() {
	return cr;
}
public void setCr(caractéristiques_route cr) {
	this.cr = cr;
}



public String Inserer()
{String a;
	ajouter_route aj=new ajouter_route();
	route.setFacteur_naturels(fn);
	route.setCaracteristique_route(cr);
	route.setDescription_route(descroute);
	if(aj.ajouter_routee(route,fn,descroute,cr)==1)
	{
		a="ajout effectuée";
		FacesMessage msg= new FacesMessage(FacesMessage.FACES_MESSAGES,a);
		RequestContext.getCurrentInstance().showMessageInDialog(msg);
		
		
	}
	
	else
	{
		
		a="ajout Non effectuée";
		FacesMessage msg= new FacesMessage(FacesMessage.SEVERITY_ERROR,"Probleme!!!!!!",a);
		RequestContext.getCurrentInstance().showMessageInDialog(msg);
		
		
		
		
	}
return a;
	
	
	
	
}
}
