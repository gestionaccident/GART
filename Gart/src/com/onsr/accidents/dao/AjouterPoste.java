package com.onsr.accidents.dao;

import java.io.Serializable;

import com.onsr.accidents.business.*;

import com.onsr.accidents.dao.Connexion;

import java.sql.*;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

public class AjouterPoste implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Connexion c = new Connexion() ;
	Statement stm ;
	
	public int insert(Poste p)
	{  System.out.println("hello") ;
	 int x = 0 ;
		try {
			stm = c.Connection() ;
			String req="insert into poste (ville,cite,province,nbreEmp,presPoste,date) values ('"+p.getVille()+"','"+p.getCite()+"','"+p.getProvince()+"',"+p.getNbremp()+",'"+p.getPrespos()+"','"+p.getDate()+"')" ;
			x=stm.executeUpdate(req) ;
			System.out.println("execution du requete") ;
			
		}catch (Exception e)
		{
			e.getStackTrace() ;
		}
		return x ;
	}


	
}
