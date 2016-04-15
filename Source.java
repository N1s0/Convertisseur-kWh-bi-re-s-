package yourPackage; //write the name of your

import java.util.Scanner;

public class your class {   //write the name of your class
		
	public static void main(String[] args) {
		int i = 0;
		char rep ;
		while( i == 0) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ceci est un convertisseur de KiloWattHeure en bière");
		System.out.println("\nCombien de kWh voulez-vous convertir ?");
		int kwh = sc.nextInt();
		System.out.println("\nCela représente " + kwh*0.15/2.5 + " bière (moinette)!" );
		System.out.println("\nRecommencer ? (o/n)");
		sc.nextLine();
		rep = sc.nextLine().charAt(0);
		if (rep == 'n') {
			i = 1;
		}
		}


	}

}
