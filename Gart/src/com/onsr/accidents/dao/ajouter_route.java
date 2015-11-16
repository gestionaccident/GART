package com.onsr.accidents.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.onsr.accidents.business.Description_route;
import com.onsr.accidents.business.Route;
import com.onsr.accidents.business.caractéristiques_route;
import com.onsr.accidents.business.facteurs_naturels;


public class ajouter_route {
	

public int ajouter_routee(Route route,facteurs_naturels fc,Description_route ds,caractéristiques_route cr)
{Statement st;
int  lastidfn;
int  lastidcr;
int  lastiddc;
int y1,y2,y3;
int x = -1;

	Connexion cnx=new Connexion();
	st=cnx.Connection();
	ResultSet rs,rs1,rs3;
try {
	
	rs= st.executeQuery("SELECT MAX(IDf) AS id FROM facteur_naturels");
	rs.next();
	 int lastid = rs.getInt("id");
	if(lastid==0)
	{
		fc.setCodefn(1);
	    lastidfn=cr.getCodec();
}
	else
	{fc.setCodefn(lastid+1);
		lastidfn=cr.getCodec();
		}
	
y1=st.executeUpdate("insert into facteur_naturels values("+fc.getCodefn()+","+fc.isChauxd()+","+fc.isPleuvoir()+","+fc.isBrouillard()+","+fc.isVent()+","+fc.isNeige()+")");
	
rs1= st.executeQuery("SELECT MAX(IDp) AS id FROM caracteristique");
	
	
	rs1.next();
	int lastid1 = rs1.getInt("id");
	if(lastid1==0)
	{
		cr.setCodec(1);
		lastidcr=cr.getCodec();
		
	}
	else
	{
		cr.setCodec(lastid1+1);
		lastidcr=cr.getCodec();
		
		
	}
	y2= st.executeUpdate("insert into caracteristique values("+cr.getCodec()+","+cr.isPavé()+","+cr.isNonpavé()+","+cr.isRoutemal()+","+ cr.isTraveaux()+",'"+cr.getLargeurmetres()+"')");
	
	
	
	
	
	
	rs3= st.executeQuery("SELECT MAX(IDd) AS id FROM description");
	rs3.next();
	int lastid11 = rs3.getInt("id");
	if(lastid11==0)
	{
		ds.setCoded(1);
		
		lastiddc=ds.getCoded();
		
	}
	else
	{
		ds.setCoded(lastid11+1);
		lastiddc=ds.getCoded();
		
}
	
	
	
	y3 = st.executeUpdate("insert into description values("+ds.getCoded()+","+ds.getZig()+","+ds.getDir()+","+ds.getElevé()+","+ds.getPente()+","+ds.getDevinst()+","+ds.getPentedev()+","+ds.getSousbridge()+","+ds.getSurbridge()+","+ds.getInters()+","+ds.getInetrssans()+")");
	
	if((y1!=0)&&(y2!=0)&&(y3!=0))
	{
		
   x = st.executeUpdate("insert into route values('"+route.getNumroute()+"','"+route.getTyperoute()+"',"+route.isNumerotes()+",'"+route.getPointkilo()+"','"+route.getEspaceb()+"','"+route.getRue()+"','"+route.getPointd()+"',"+route.isDansespo()+",'"+route.getSigneroute()+"','"+route.getOrgnroute()+"','"+route.getSurfcroute()+"','"+route.getLuminosité()+"',"+fc.getCodefn()+","+ds.getCoded()+","+cr.getCodec()+",'"+route.getAutretype()+"')");
	
	if(x>0)
	{
		
		x=1;
	}
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return x;
}
return x;
	
}
		
		
}
	
	


