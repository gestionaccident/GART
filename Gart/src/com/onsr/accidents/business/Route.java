package com.onsr.accidents.business;
public class Route {
	private String numroute;
	public Route(String numroute, String typeroute, boolean numerotes,
			String pointkilo, String espaceb, String rue, String pointd,
			boolean dansespo, String signeroute,
			String orgnroute, String surfcroute, String luminosité,
			String autretype, facteurs_naturels facteur_naturels,
			Description_route description_route,
			caractéristiques_route caracteristique_route) {
		
		this.numroute = numroute;
		this.typeroute = typeroute;
		this.numerotes = numerotes;
		this.pointkilo = pointkilo;
		this.espaceb = espaceb;
		this.rue = rue;
		this.pointd = pointd;
		this.dansespo = dansespo;
		
		this.signeroute = signeroute;
		this.orgnroute = orgnroute;
		this.surfcroute = surfcroute;
		this.luminosité = luminosité;
		this.autretype = autretype;
		this.facteur_naturels = facteur_naturels;
		this.description_route = description_route;
		this.caracteristique_route = caracteristique_route;
	}
	
	public Route()
	{
		
		
	}
	public String getNumroute() {
		return numroute;
	}
	public void setNumroute(String numroute) {
		this.numroute = numroute;
	}
	public String getTyperoute() {
		return typeroute;
	}
	public void setTyperoute(String typeroute) {
		this.typeroute = typeroute;
	}
	public boolean isNumerotes() {
		return numerotes;
	}
	public void setNumerotes(boolean numerotes) {
		this.numerotes = numerotes;
	}
	public String getPointkilo() {
		return pointkilo;
	}
	public void setPointkilo(String pointkilo) {
		this.pointkilo = pointkilo;
	}
	public String getEspaceb() {
		return espaceb;
	}
	public void setEspaceb(String espaceb) {
		this.espaceb = espaceb;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getPointd() {
		return pointd;
	}
	public void setPointd(String pointd) {
		this.pointd = pointd;
	}
	public boolean isDansespo() {
		return dansespo;
	}
	public void setDansespo(boolean dansespo) {
		this.dansespo = dansespo;
	}
	
	public String getSigneroute() {
		return signeroute;
	}
	public void setSigneroute(String signeroute) {
		this.signeroute = signeroute;
	}
	public String getOrgnroute() {
		return orgnroute;
	}
	public void setOrgnroute(String orgnroute) {
		this.orgnroute = orgnroute;
	}
	public String getSurfcroute() {
		return surfcroute;
	}
	public void setSurfcroute(String surfcroute) {
		this.surfcroute = surfcroute;
	}
	public String getLuminosité() {
		return luminosité;
	}
	public void setLuminosité(String luminosité) {
		this.luminosité = luminosité;
	}
	public String getAutretype() {
		return autretype;
	}
	public void setAutretype(String autretype) {
		this.autretype = autretype;
	}
	public facteurs_naturels getFacteur_naturels() {
		return facteur_naturels;
	}
	public void setFacteur_naturels(facteurs_naturels facteur_naturels) {
		this.facteur_naturels = facteur_naturels;
	}
	public Description_route getDescription_route() {
		return description_route;
	}
	public void setDescription_route(Description_route description_route) {
		this.description_route = description_route;
	}
	public caractéristiques_route getCaracteristique_route() {
		return caracteristique_route;
	}
	public void setCaracteristique_route(
			caractéristiques_route caracteristique_route) {
		this.caracteristique_route = caracteristique_route;
	}
	private String typeroute;
	private boolean numerotes;
	private String pointkilo;
	private String espaceb;
	private String rue;
	private String pointd;
	private boolean dansespo;
	private String signeroute;
	private String orgnroute;
	private String surfcroute;
	private String luminosité;
	private String autretype;
	private facteurs_naturels facteur_naturels;
	private Description_route description_route;
	private caractéristiques_route caracteristique_route;
	}
