public class etudiant
{
	/** Attributs */
String nom;
String prenom;
int numero; // numero de l’etudiant
static int nbretucrees=0; // nombre d’etudiants crees
String [] courssuivis; // tableau contenant les cours suivis
int notes[]; // tableau des notes pour chaque cours suivis.

public etudiant(String n ,String prenom,String a[])
{	
	this.nom=n ;
	this.prenom=prenom;
	courssuivis=new String [a.length];
	for (int i=0;i<a.length ;i++) 
	{
		this.courssuivis[i]=a[i] ;

	}
	nbretucrees+=1;
	numero=nbretucrees ;
	notes=new int [a.length];
	for (int i=0;i<a.length ;i++) 
	{
		this.notes[i]=0;

	}

}
public etudiant(etudiant b)
{
	this.nom=b.nom ;
	this.prenom=b.prenom;
	courssuivis=new String[b.courssuivis.length];
	for (int i=0;i<courssuivis.length ;i++) 
	{
		this.courssuivis[i]=b.courssuivis[i];

	}
	notes=new int [b.notes.length];
	for (int i=0;i<courssuivis.length ;i++) 
	{
	this.notes[i]=b.notes[i];
	}
}
public boolean compare (etudiant b)
{
	if (this.nom==b.nom && this.prenom==b.prenom) 
	{
		return true;
	}
return false ;
}



public void affiche()
{
	System.out.println("l'etudiant de numero"+" ("+numero+")"+"est :" +this.nom+" "+this.prenom);

}

public static void main(String args[])
{	String e[]={"Math", "physique","anglais","Java"};
	etudiant e1 = new etudiant ("Ramzi","Tari",e);
	etudiant e2=new etudiant ("Mohamed","karim",e);
	e1.affiche();
	//e2.affiche();
	//if (e1.compare(e2))
	//{
	//	System.out.print("meme");
	//}
	//else 
	//{
	//	System.out.print("different");
	//}
	etudiant e3=new etudiant (e1);
	e3.affiche();
	if (e1.compare(e3))
	{
		System.out.print("meme");
	}
	else 
	{
		System.out.print("different");
	}
}

}
