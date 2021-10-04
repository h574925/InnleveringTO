package no.hvl.dat100;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
	
		for (int count=0; count<tabell.length; count++); 
			
		}



	// b)
	public static String tilStreng(int[] tabell) {

		int table [] = {1, 2, 3};
		
		System.out.println("Streng: " + Arrays.toString(table));
		
		
		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c1)
	public static int summer(int[] tabell) {
		
	/*	
	 	//for-løkke
	 	 
	 	int table3[] = {10, 20, 30, 40, 50, 60};
		int sum = 0; 
		
		for (int count=0; count<table3.length; count++) {
			sum+=table3[count]; 
		
		}
		System.out.println("Summen av tallene i tabellen er: " + sum); 
		
		*/
		
		/*
		 //whileløkke
		  
		int table3[] = {10, 20, 30, 40, 50, 60};
		int sum = 0; 
		int count = 0;
		
		while (table3.length>count) {
			sum+= table3[count];
			count++;
		}
		
		System.out.println ("Summen av tallene i tabellen er: " + sum);
	
		*/
		
		
			//utvidet for-løkke
		
	//	int table3[] = {10, 20, 30, 40, 50, 60};
		int sum = 0;
		
		for (int nummer: tabell) {
			sum+=nummer;
		}
		
		//System.out.println("Summen = " + sum);
		
		return sum;
		
		// TODO
		
	}
	
	
	
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		 
		
		
		
		boolean check = false;
		
		for (int element: tabell) {
			if (element == tall) {
				check = true;
				break;
			}
			
		}
		//System.out.println(check);
		return check;
		
		// TODO
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
	
		
		
		/*
	int[] table5 = {1, 3, 37, 42, 0, 150, 210, 213};
	int number = 43;
	int index = 0;
	
	boolean check = false;
	
	for (int element: table5) {
		if (element == number) {
			check = true;
			
			if (check = false) 
				System.out.println("-1");
			
			else if (check = true) {
				for (int i=0; i<table5.length;i++) {
					if (table5[i] == number) {
						index = i;
						System.out.println("Index = " + index);
					}  
					
						
						
						*/
					
				
		int index = 0;
		boolean check = false;
		int minusEin = 0;
		
		for (int i=0; i<tabell.length;i++) {
			if(tabell[i] == tall) {
				index = i;
				check = true;
			
			System.out.println("Index = " + index);	
			}
			else if (check = false) {
			//	System.out.println(minusEin); //fungerer ikkje.. kvifor
			}
		return minusEin;
			}
			
		
		
		
			
	
		
		
		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");
			}
	

	// f)
	public static int[] reverser(int[] tabell) {

		//int [] table6 = {1, 2, 3, 4, 5};
		
		System.out.println("Tabell reversert");
		for (int i=tabell.length-1;i>=0; i--)
		System.out.print(tabell[i] + " ");
		System.out.println("");
		
		
		
		
		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		int i = 0;
		boolean sortert = true; 
		
		while (sortert && i < tabell.length - 1) {
			if (tabell[i] > tabell[i+1]) {
				sortert = false;
			}
			i++;
		}
		return sortert; 
		
	

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
	//	int []tabell10 = {10, 20, 30, 40, 50};
//		int []tabell11 = {5, 15, 25, 35, 45};
		int []sammensatt = new int [tabell1.length+tabell2.length];
		int c=0;
		
		for (int i = 0; i<tabell1.length; i++) {
			sammensatt[i] = tabell1[i];
			c++;
	}
		for (int j = 0; j < tabell2.length; j++) {
			sammensatt[c++] = tabell2[j];
		}
		for (int i = 0; i<sammensatt.length; i++) {
			System.out.print(sammensatt[i] + " ");
			
		}
		System.out.println();
		
		return sammensatt;

		
		
	}
}
