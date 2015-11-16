package com.onsr.accidents.business;

public class facteurs_naturels {
	private int codefn;
	private boolean chauxd;
	
	
	public facteurs_naturels()
	{
		
		
	}
	public boolean isChauxd() {
		return chauxd;
	}
	public void setChauxd(boolean chauxd) {
		this.chauxd = chauxd;
	}
	public boolean isPleuvoir() {
		return pleuvoir;
	}
	public void setPleuvoir(boolean pleuvoir) {
		this.pleuvoir = pleuvoir;
	}
	public boolean isBrouillard() {
		return brouillard;
	}
	public void setBrouillard(boolean brouillard) {
		this.brouillard = brouillard;
	}
	public boolean isVent() {
		return vent;
	}
	public void setVent(boolean vent) {
		this.vent = vent;
	}
	public boolean isNeige() {
		return neige;
	}
	public void setNeige(boolean neige) {
		this.neige = neige;
	}
	public int getCodefn() {
		return codefn;
	}
	public void setCodefn(int codefn) {
		this.codefn = codefn;
	}
	private boolean  pleuvoir;
	private boolean brouillard;
	private boolean vent;
	private boolean neige;
	

}
