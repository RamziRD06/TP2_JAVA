public class promo 
{
	
private etudiant e[];


public promo (int taille)
{
	e=new etudiant [taille] ;
	for (i=0;i<taille ;i++) 
	{
		e[i]=new etudiant ();
	}

}
public void ajout (etudiant z)
{

	if (this.e.length==0) 
	{
		i=0;
	}
	this.e[i]=new etudiant(z);
	i++;

}
//public void ajout ()
//{

//	this.e[i]=

//}
public void affietu ()
{

	for (i=0;i<e.length ;i++) 
	{
		e[i].affiche();
	}

}

public static void main (String args [])
{

	promo a = new promo (5);
	a.ajout()
}





































}