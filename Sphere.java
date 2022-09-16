import java.util.Scanner;  // Import the Scanner class

public class Sphere extends Cercle {
    double volume()
    {
        return (3.14 * r *r *r)* 4/3;
    }
    //Methods
    void afficher()
    {
        super.afficher();
        System.out.println("v = " + this.volume());
    }

    //Main program
	public static void main(String[] args){
        Sphere S = new Sphere();
        S.afficher();

	}
}