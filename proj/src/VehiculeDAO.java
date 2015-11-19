

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VehiculeDAO implements Serializable  {
	private static final long serialVersionUID = 1L;
	Statement st ;
	Connection cnx = null ;
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
	public Statement Connexion() 
	{String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/accidents"+unicode,"root","");
			 System.out.println("connected");
			 st = cnx.createStatement();
			 
		} catch (ClassNotFoundException e) {
			e.getMessage();
		} catch (SQLException e) {
			e.getMessage();
		}
		return st ;
		
	}
public String insert(){
	String a="insert failed";
		try {
st=Connexion() ;
st.executeUpdate( "INSERT INTO vehicule VALUES ("+v.getNb_vehicule()+",'"+v.getGenre_vehicule()+"','"+v.getNationnalite()+"','"+v.getProp_vehicule()+"','"+v.getProb_vehicule()+"','"+v.getScan_vehicule()+"');");
return a="insert yess";
		} catch (SQLException e) {
			e.getStackTrace();
			   return a;}
	}
	public String modif(){
		String a=null;
		try {
			st=Connexion();
		st.executeUpdate("update vehicule set nb_vehicule="+v.getNb_vehicule()+",genre_vehicule='"+v.getGenre_vehicule()+
				"',nationnalite='"+v.getNationnalite()+"', prop_vehicule='"+v.getProp_vehicule()+"', prob_vehicule='"+
				v.getProb_vehicule()+"', scan_vehicule='"+v.getScan_vehicule()+"' where id="+code);
		a="modifier avec succces";
		} catch (SQLException e) {
			e.printStackTrace();}
		return a;
	}
	public String supp(){
		String a=null;
		try {
			st=Connexion();
			if (this.recherche()!=0){
			st.executeUpdate("delete from vehicule where id="+code);
			System.out.print("Suppression avec succes");}
			else
				System.out.print("vehicule invalide");
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
