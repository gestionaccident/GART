package com.onsr.accidents.business;

public class Description_route {
	private int coded;
	private Boolean zig;
	
	public Description_route ()
	{
		
		
	}
    public Boolean getZig() {
		return zig;
	}
	public void setZig(Boolean zig) {
		this.zig = zig;
	}
	public Boolean getDir() {
		return dir;
	}
	public void setDir(Boolean dir) {
		this.dir = dir;
	}
	public Boolean getElevé() {
		return elevé;
	}
	public void setElevé(Boolean elevé) {
		this.elevé = elevé;
	}
	public Boolean getPente() {
		return pente;
	}
	public void setPente(Boolean pente) {
		this.pente = pente;
	}
	public Boolean getDevinst() {
		return devinst;
	}
	public void setDevinst(Boolean devinst) {
		this.devinst = devinst;
	}
	public Boolean getPentedev() {
		return pentedev;
	}
	public void setPentedev(Boolean pentedev) {
		this.pentedev = pentedev;
	}
	public Boolean getSousbridge() {
		return sousbridge;
	}
	public void setSousbridge(Boolean sousbridge) {
		this.sousbridge = sousbridge;
	}
	public Boolean getSurbridge() {
		return surbridge;
	}
	public void setSurbridge(Boolean surbridge) {
		this.surbridge = surbridge;
	}
	public Boolean getInters() {
		return inters;
	}
	public void setInters(Boolean inters) {
		this.inters = inters;
	}
	
	public int getCoded() {
		return coded;
	}
	public void setCoded(int coded) {
		this.coded = coded;
	}
	public Boolean getInetrssans() {
		return inetrssans;
	}
	public void setInetrssans(Boolean inetrssans) {
		this.inetrssans = inetrssans;
	}
	private Boolean dir;
	private Boolean elevé;
	private Boolean pente;
    private Boolean devinst;
	private Boolean pentedev;
	private Boolean sousbridge;
    private Boolean surbridge;
	private Boolean inters;
	private Boolean inetrssans;
	

}
