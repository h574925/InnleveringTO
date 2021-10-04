package no.hvl.dat100;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		 int [][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		for (int[] hverRad : a) {
			for (int j : hverRad)	{
				System.out.print(j + "\t");
			}
			System.out.println("");
			
		}
		
		
		
		
		// TODO
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		final StringBuffer Streng = new StringBuffer();
		
		int a = 0, b = 1; 
		for (a=0; b < matrise[a].length; b++) {
			Streng.append(" " + matrise[a][b]);
			Streng.append("\n");
			Streng.append("\n");
			Streng.append("\n");
			
			
		}
			return Streng.toString();
		
		
	}
		
	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
