import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		double initialPlacement = 0.00, yearlyInterest=0.00, intermediateValue=0.00, finalValue=0.00, ajoutYearly = 0.00;
		int numberOfYears = 0;
		
		Scanner clavier = new Scanner(System.in);	        
		System.out.println("Quel est le placement initial ? ");
		initialPlacement = clavier.nextDouble();
		intermediateValue = initialPlacement;			
		System.out.println("Sur combien d'années voulez-vous investir ? ");
		numberOfYears = clavier.nextInt();	
		
		for(int i=0; i<numberOfYears; i++){
			Random randomYearlyInterest = new Random();
			yearlyInterest = 1.15 + (1.15 - 1.15) * randomYearlyInterest.nextDouble();
	        yearlyInterest = Math.round(yearlyInterest * 100.0) / 100.0;		        
			intermediateValue *= yearlyInterest;		
			System.out.println("Quel est l'ajout d'inverstissment ? ");
			ajoutYearly = clavier.nextDouble();
			intermediateValue += ajoutYearly;
			System.out.println(intermediateValue);
		};		
		finalValue = intermediateValue;		
		System.out.println(finalValue);		
		clavier.close();
	}	
}
