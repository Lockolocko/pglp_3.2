package com.gillotroux;

import junit.framework.TestCase;
import java.util.ArrayList;
import org.junit.Test;


public class Apptest extends TestCase {
	@Test
	public void test(){
		employe employe1=new employe(2018);
		employe employe2=new employe(2016);
		vendeur vendeur1=new vendeur(500);
		vendeur vendeur2=new vendeur(200);
		
		manager manager1=new manager(2016,1);
		manager manager2=new manager(2012,3);
		
		
		
		ArrayList<allEmploye> listeEmploye=new ArrayList <allEmploye>();
		
		listeEmploye.add(employe1);
		listeEmploye.add(employe2);
		listeEmploye.add(vendeur1);
		listeEmploye.add(vendeur2);
		listeEmploye.add(manager1);
		listeEmploye.add(manager2);
		
		double salaireTotal =0;
		
		for(int i =0; i<listeEmploye.size();i++){
			salaireTotal+=listeEmploye.get(i).salaire();
		}
		
		System.out.println("Salaire total:  "+salaireTotal);
		
	}
	

}