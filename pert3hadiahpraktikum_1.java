// Hadiah Praktikum 3 PBO Nomor 1

import java.util.Scanner;
public class pert3hadiahpraktikum_1 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double celcius, faren;
		
		
		System.out.print("Masukkan Nilai Celcius : ");
		celcius = input.nextDouble();
	
		System.out.print("\n");
		faren = ((celcius*9)/5)+32;
		
		System.out.println("Hasil Nilai Fahrenheit : " + faren);
		
		
	}
	
	
	
	
	
}