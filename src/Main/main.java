package Main;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		
		//estou pedindo o numero e armazenando na variavel numero
		System.out.print("digite um numero:");
		double numero = usuario.nextDouble();
		
		//estou perguntando se o cara quer o dobro ou o triplo do numero digitado e armazenando na variavel decisao
		System.out.print("Você quer saber o dobro ou o triplo desse numero ?");
		String decisao = usuario.next();
		
		if (decisao.equals("dobro")) {
			double dobro = numero * 2;
			System.out.print("O numero em dobro é: " + dobro);
		}
		else if (decisao.equals("triplo")) {
			double triplo = numero * 3;
			System.out.print("O numero em triplo é: " + triplo);
		}
		else {
			System.out.print("algo deu errado my friend :> ");
		}
		
		usuario.close();
	}
		
}
