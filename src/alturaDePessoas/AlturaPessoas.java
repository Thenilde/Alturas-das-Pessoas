package alturaDePessoas;

import java.util.Scanner;

public class AlturaPessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,menorIdade;
		double alturaMedia,porcenPessoas,alturaTotal;
		
		System.out.print("How many people will be typed?");
		n=sc.nextInt();
		
		String[]name=new String[n];
		int []age=new int[n];
		double[]height=new double[n];
		
		for(int i=0; i<n ;i++) {
			System.out.printf("\nInformation of the %da person:\n",i+1);
			System.out.print("Name:");
			
			sc.nextLine();
			name[i]=sc.nextLine();
			
			System.out.print("Age:");
			age[i]=sc.nextInt();
			
			System.out.print("Height:");
			height[i]=sc.nextDouble();
			
		}
		
		menorIdade = 0;
		alturaTotal = 0;
	    for (int i=0; i<n; i++) {
	        if (age[i] < 16) {
	            menorIdade++;
	        }
	        alturaTotal = alturaTotal + height[i];
	    }

	    alturaMedia = alturaTotal / n;
	    porcenPessoas = ((double)menorIdade / n) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", alturaMedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcenPessoas);

	    for(int i=0; i<n; i++) {
	        if (age[i] < 16) {
	        	System.out.printf("%s\n", name[i]);
	        }
	    }
		sc.close();

	}

}
