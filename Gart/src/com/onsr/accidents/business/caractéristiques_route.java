package com.onsr.accidents.business;

public class caractéristiques_route {
	
	
	private int codec;
	private boolean pavé;
	
	public caractéristiques_route()
	{
		
		
	}
	public boolean isPavé() {
		return pavé;
	}
	public void setPavé(boolean pavé) {
		this.pavé = pavé;
	}
	public boolean isNonpavé() {
		return nonpavé;
	}
	public void setNonpavé(boolean nonpavé) {
		this.nonpavé = nonpavé;
	}
	public boolean isRoutemal() {
		return routemal;
	}
	public void setRoutemal(boolean routemal) {
		this.routemal = routemal;
	}
	public boolean isTraveaux() {
		return traveaux;
	}
	public void setTraveaux(boolean traveaux) {
		this.traveaux = traveaux;
	}
	public String getLargeurmetres() {
		return largeurmetres;
	}
	public void setLargeurmetres(String largeurmetres) {
		this.largeurmetres = largeurmetres;
	}
	public int getCodec() {
		return codec;
	}
	public void setCodec(int codec) {
		this.codec = codec;
	}
	private boolean nonpavé;
	private boolean routemal;
	private boolean traveaux;
	private String largeurmetres;

}
