import java.util.Scanner;  // Import the Scanner class

public class Complexe {
	//Attributes
    double Re;
    double Im;
    Scanner myObj = new Scanner(System.in);
    
    //Conctructors
    Complexe()
    {
    	System.out.println("Donner Re ");
        Re = Double.parseDouble( myObj.nextLine());

        System.out.println("Donner Im ");
        Im = Double.parseDouble( myObj.nextLine());
    }
    Complexe(double Re, double Im)
    {
        this.Re = Re ;
        this.Im = Im ; 
    }
    //Methods
    void afficher()
    {
        System.out.println(" z = " + Re + " + " + Im + " i");
    }

    Complexe add (Complexe z)
    {
        Complexe Res = new Complexe(0,0);
        Res.Re = this.Re + z.Re ;
        Res.Im = this.Im + z.Im ;
        return Res ;
    }

    //Main program
	public static void main(String[] args){
        Complexe z1 = new Complexe();
        Complexe z2 = new Complexe(14, 3.2); 
        Complexe z3 = z1.add(z2);
        z3.afficher();

	}
}
