public class Mat2D
{
	private double T[][];
	public Mat2D(double a[][])
	{
		T=new double [a.length][];
		for(int i=0; i<a.length;i++)
		{
			T[i]=new double [a[i].length];
			for(int j=0; j<a[i].length; j++)
			{
				T[i][j]=a[i][j];
			}
		}
	}
	public void affiche() {
		for(int i = 0; i < T.length; i++){
			for(int j = 0; j < T[i].length; j++){
				System.out.println(T[i][j]);
			}
		}
		
    }
    public double somme(int i) 
    {	
    	double s=0;
			for(int j = 0; j < T[i].length; j++)
			{
				s=s+T[i][j];
			}
		
		return s ;
    }
	public static void main(String args[])
	{
		double [][] tableau ={{7,3,1,5},{1,2},{55}, {4,8,9}};
		Mat2D mat=new Mat2D (tableau);
		//mat.affiche();
		double l = mat.somme(2);
		System.out.println("la somme de la ligne 2 est :" +" " +l);
	}

}
