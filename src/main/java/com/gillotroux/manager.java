package com.gillotroux;

public class manager extends allEmploye{
	final private int salaire=1500;
	private int startYear;
	private int nombreSousOrdre;
	
	public manager(int startYear,int nombreSousOrdre){
		this.startYear=startYear;
		this.nombreSousOrdre=nombreSousOrdre;
	}
	
	public double salaire(){
		return salaire+(2020-this.startYear)*20+nombreSousOrdre*100;
	}
}