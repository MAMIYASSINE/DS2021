package EX2;

import java.util.Scanner;

public class Jcc {

	Film competition[];
	private int annee;
	private final int  NBFMAX=30;
	private int nbF;
	Jcc(int aa ,int nbmax)
	{
		this.annee=aa;
		if(nbmax<NBFMAX)
		{
			competition=new Film[nbmax];
		}
		else
		{
			int nbmax1=-1;
			do
			{
				System.out.println(" donner la taille de tableau:");
				Scanner sc=new Scanner(System.in);
				nbmax1= sc.nextInt();
			}
			while((nbmax1>NBFMAX) ||(nbmax1<0));
		}
	}
	void ajoutFilm(Film f)
	{
		if(nbF<competition.length)
		{
			competition[nbF]=f;
			System.out.println("donner le nombre de place:");
			Scanner sc=new Scanner(System.in);
			int nbp=sc.nextInt();
			competition[nbF].setNbplaces(nbp);
			nbF++;
			
		}
		else
		{
			System.out.println("La compétition est au complet");
		}
	}

	void listeFilmsJCC()
	{
		for(int i=0;i<nbF;i++)
		{
			System.out.println(competition[i]);
		}
	}
	double totalVenteBilletsJCC()
	{
		double S=0;
		for(int i=0;i<nbF;i++)
		{
			S=S+competition[i].totalVenteBillets();
		}
		return S;
	}
	
	
}
