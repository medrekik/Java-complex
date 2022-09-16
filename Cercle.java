import java.util.Scanner;  // Import the Scanner class

public class Cercle {
	//Attributes
    Point centre;
    double r;
    Scanner myObj = new Scanner(System.in);
    
    //Conctructors
    Cercle()
    {
    	System.out.println("Donner coord du centre");
        centre= new Point();

        System.out.println("Donner rayon");
        r= Double.parseDouble( myObj.nextLine());
    }
    Cercle(double x, double y, double r)
    {
        centre =new Point(x,y);
        this.r = r ;
    }
    //Methods
    void afficher()
    {
        centre.afficher();
        System.out.println("r = " + r);
    }
}