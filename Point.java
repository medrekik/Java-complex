import java.util.Scanner;  // Import the Scanner class

public class Point {
	//Attributes
    double x;
    double y;
    Scanner myObj = new Scanner(System.in);
    
    //Conctructors
    Point()
    {
    	System.out.println("Donner x");
        x = Double.parseDouble( myObj.nextLine());

        System.out.println("Donner y");
        y= Double.parseDouble( myObj.nextLine());
    }
    Point(double x, double y)
    {
        this.x = x ;
        this.y = y ; 
    }
    //Methods
    void afficher()
    {
        System.out.println("coordonnées du point (" + x + " , " + y + " )");
    }
}