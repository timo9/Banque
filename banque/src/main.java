import java.util.Scanner;

public class main {

	public static Scanner clavier;
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		clavier = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		Accueil fen = new Accueil();
		
		
		//test exceptions
		System.out.print("Saisir votre age: ");
		int age;
		
		
		try{
			age = clavier.nextInt();			
		}
		
		catch(Exception e){
			System.out.println("Il faut saisir uniquement un nombre !");
		}

	}
}