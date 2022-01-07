public class complex
{
	private double x ;
	private double y ;

	public complex (double a ,double b)
	{
		this.x= a ;
		this.y=b ;
	}
	public complex () 
	{

		this.x=(int)(Math.random()* 10);
		this.y=(int)(Math.random()*10);

	}
	public void affiche ()
	{	
		if(y>0)
		{
		System.out.println(this.x +"+"+" "+this.y +"i");
		}
		else 
		{
		System.out.println(this.x +" "+this.y + "i");	
		}
	}
	public complex conj()
	{
		complex t = new complex (this.x,-this.y);
		return t ;	
	}
	public void ajoute(complex a)
	{
			 
			this.x =(this.x+a.x);
			this.y =(this.y+a.y);
		
	}
	public boolean compare (complex a)
	{
		if (this.x==a.x && this.y==a.y)
		{
			return true ;
		}
		return false ;
	}



	public static void main(String args[])
	{
		complex m = new complex (5,6) ;
		//m.affiche() ;
		//m.conj().affiche();
		complex f=new complex(5,6);
		//m.ajoute(f);
		//m.affiche();
		if (m.compare(f)==true) 
			{
				System.out.print("egale !!!");
			}
		else
		{
			System.out.print("different");

		}
	}

}



