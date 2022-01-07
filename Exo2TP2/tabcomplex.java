public class tabcomplex
{	
	private complex t [];

	public tabcomplex (int taille) 
	{	
		t=new complex [taille] ;
		for(int i=0; i<taille; i++)
		{
			t[i]=new complex ((int)(Math.random()* 10),(int)( Math.random()* 10));
		}
	}
	public void affiche()
	{
		for(int i=0; i<t.length; i++)
		{	
			t[i].affiche();
		}
	}
//------test si
	public boolean compare (complex a)
	{	
		//boolean resul=false ;
		for(int i=0; i<t.length; i++)
		{	
		//if (t[i].x=a.x && t[i].y==a.y)
			if (t[i].compare(a))
			{
				return true  ;
			}
		}
		return false ; 
	}
//-------- echange de valeur 
	public void echange(int i ,int j)
	{
	complex a=new complex();
		a=t[i];
		t[i]=t[j];
		t[j]=a;
		
	}

public static void main(String args[])
{
		tabcomplex a=new tabcomplex(5);
		//a.affiche();
		//complex c =new complex (6,1);
		//if (a.compare(c))
		//{
		//	System.out.print("vrai");
		//}
		//else
		//{
		//	System.out.print("faux");
		//}
		a.affiche();
		a.echange(1,2);
		a.affiche();

}


}