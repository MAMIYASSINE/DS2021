package EX2;

import java.util.Scanner;

public class Documentaire extends Film {
	private String sujet;
	private final float tarif=2;
	Documentaire(String titre, String r, String pays, int d,String sujet) {
		super(titre, r, pays, d);
		// TODO Auto-generated constructor stub
		this.sujet=sujet;
	}
	@Override
	public String toString()
	{
		return  super.toString()+"  "+sujet ;
	}
	@Override
	float totalVenteBillets ()
	{
		Scanner sc=new Scanner(System.in);
		int nbe=0;
		do
		{
				System.out.println("donner le nombre des etudiants: ");
				nbe=sc.nextInt();
		}
		while((nbe>this.getNbplaces())||(nbe<0));
		float S=0;
		S=(super.getNbplaces())*tarif;
		return S;
	}
	

	
	
}
