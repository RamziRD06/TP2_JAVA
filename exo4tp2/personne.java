public class personne 
{
	private String nom ;
	private String prenom;
	private int age ;


public personne (String n, String pr,int ag)
{

	this.nom=n;
	this.prenom=pr;
	this.age=ag ;

}
public personne (personne p)
{

	this.nom=p.nom;
	this.prenom=p.prenom;
	this.age=p.age ;
}

public void afficher ()
{

	System.out.println("Nom:"+this.nom);
	System.out.println("prenom:"+this.prenom);
	System.out.println("Age:"+this.age);


}









//public static void main (String args [])
//{

//	personne p1=new personne ("TARI","Ramzi",25);
//	p1.afficher();

//}






}