package EX2;

import java.util.Scanner;

public class Film {
	protected String titre,realisateur,pays;
	protected int duree ;
	private int nbplaces;
	public int getNbplaces() {
		return nbplaces;
	}
	public void setNbplaces(int nbplaces) {
		this.nbplaces = nbplaces;
	}
	@Override
	public String toString()
	{
		return titre+" de "+realisateur+" ( "+pays+" ) - "+duree+"min";
	}
	Film (String titre, String r, String pays, int d)
	{
		this.titre=titre;
		realisateur=r;
		this.pays=pays;
		duree=d;
	}
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
		int S=0;
		S=(nbe*2)+((nbplaces-nbe)*3);
		return S;
		
		
	}

}
