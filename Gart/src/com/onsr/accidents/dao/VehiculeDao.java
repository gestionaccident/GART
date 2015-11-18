package com.onsr.accidents.dao;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.onsr.accidents.business.Vehicule;

public class VehiculeDao implements Serializable  {
	private static final long serialVersionUID = 1L;
	Statement st ;
	Connexion cnx = new Connexion();
	private int code;
	public Vehicule getV() {
		return v;
	}
	public void setV(Vehicule v) {
		this.v = v;
	}
	Vehicule v=new Vehicule();
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
public String insert() throws SQLException, ClassNotFoundException{
		
		st=cnx.connexion() ;
		String req = "insert into vehicule values ("+v.getNb_vehicule()+",'"+v.getGenre_vehicule()+"','"+v.getNationnalite()+
				"','"+v.getProp_vehicule()+"','"+v.getProb_vehicule()+"','"+v.getScan_vehicule()+"')";
		st.executeUpdate(req) ;
		
	
   return null;}
	public String modif(){
		String a=null;
		try {
			st=cnx.connexion() ;
		st.executeUpdate("update vehicule set nb_vehicule="+v.getNb_vehicule()+",genre_vehicule='"+v.getGenre_vehicule()+
				"',nationnalite='"+v.getNationnalite()+"', prop_vehicule='"+v.getProp_vehicule()+"', prob_vehicule='"+
				v.getProb_vehicule()+"', scan_vehicule='"+v.getScan_vehicule()+"' where id="+code);
		a="modifier avec succces";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public String supp(){
		String a=null;
		try {
			st=cnx.connexion() ;
			if (this.recherche()!=0){
			st.executeUpdate("delete from vehicule where id="+code);
			System.out.print("Suppression avec succes");}
			else
				System.out.print("vehicule invalide");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public int recherche(){
		int a=0;
		try {
			ResultSet rs=st.executeQuery("select * from vehicule where id="+code);
			while(rs.next()){
				a++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
}
