package com.onsr.accidents.managedbeans;
import java.sql.SQLException;

import com.onsr.accidents.business.Vehicule;
import com.onsr.accidents.dao.VehiculeDao;

public class MbVehicule {
	Vehicule v=new Vehicule();
	VehiculeDao d=new VehiculeDao();
	public Vehicule getV() {
		return v;
	}
	public void setV(Vehicule v) {
		this.v = v;
	}
	
	
	public void insertion(Vehicule v){
		try {
			d.inserer(v);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void modif(Vehicule v){
		d.modifier(v);
	}
	
	public void supp(Vehicule v){
		d.supprimer(v);
	}
}
