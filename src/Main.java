import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {    
        double initialPlacement = 0.00, yearlyInterest = 0.00, intermediateValue = 0.00, finalValue = 0.00, ajoutYearly = 0.00;
        int numberOfYears = 0;
        String ajout = "non";
        
        Scanner clavier = new Scanner(System.in);            
        System.out.println("Quel est le placement initial ? ");
        initialPlacement = clavier.nextDouble();
        intermediateValue = initialPlacement;            
        System.out.println("Sur combien d'années voulez-vous investir ? ");
        numberOfYears = clavier.nextInt();

        clavier.nextLine();
        
        double tabInterest[] = new double[numberOfYears];
        
        for(int i = 0; i < tabInterest.length; i++) {
            Random randomYearlyInterest = new Random();
            yearlyInterest = 1.05 + (1.15 - 1.05) * randomYearlyInterest.nextDouble();
            yearlyInterest = Math.round(yearlyInterest * 100.0) / 100.0;                
            intermediateValue *= yearlyInterest;
            tabInterest[i] = intermediateValue;
            System.out.printf("%.2f", tabInterest[i]);
            System.out.println(" $");
            System.out.println("Desirez-vous inverstir à nouveau ? oui/non");
            ajout = clavier.nextLine();
            ajout = ajout.toLowerCase();

            if (ajout.equals("oui")) {
                System.out.println("Cool, combien ?");
                ajoutYearly = clavier.nextDouble();
                intermediateValue += ajoutYearly;
                clavier.nextLine();
            } else {
                System.out.println("Pas Cool");
            }
        }
        
        finalValue = intermediateValue;
        System.out.println("Valeur finale de l'investissement: " + finalValue + " $");
        
        clavier.close();
    }    
}
