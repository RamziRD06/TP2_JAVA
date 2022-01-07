public class prof extends personne
{	
	private String matiere ;

	public prof (String n , String p , int a ,String m) {	
		super(n,p,a);
		this.matiere=m;

	}

	public void aff ()
{
	afficher();
	System.out.println("Matiere enseignee:"+this.matiere);


}



}