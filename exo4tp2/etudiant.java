public class etudiant extends personne 
{
	private String section ;
	private int nbrjr ;

public etudiant (String nom , String prenom , int age ,String section,int nbrjr) 
	{
		super (nom,prenom,age);
		this.section=section;
		this.nbrjr=nbrjr;

	}
public void affiche ()
{
	afficher();
	System.out.println("section:"+this.section);
	System.out.println("nombre de jours d'absence :"+this.nbrjr);


}





}