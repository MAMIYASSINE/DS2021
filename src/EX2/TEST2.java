package EX2;



public class TEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Film F=new Film("RR","AA","tunis",120);
		F.setNbplaces(25);
		
		System.out.println(F);
		System.out.println(F.totalVenteBillets());*/
		/*Documentaire D=new Documentaire("RR","AA","tunis",120,"gg");
		System.out.println(D);
		D.setNbplaces(25);
		System.out.println(D.totalVenteBillets());*/
		Jcc J=new Jcc(2021,4);
		J.ajoutFilm(new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile"));   
		J.ajoutFilm(new Film("Insurrection","Jilani Saadi","Tunisie",105));
		J.listeFilmsJCC();
		System.out.println(J.totalVenteBilletsJCC());
		




	}

}
