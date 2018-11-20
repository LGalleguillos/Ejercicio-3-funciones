import java.util.Scanner;

public class Ejer3Func {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// calcular el area de un circulo dando su radio
		System.out.println("Ingrese el valor del radio, este debe ser escrito de forma 1,0");
		double N=0.0;
		double resp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el radio del circulo");
		N=sc.nextDouble();
		resp=area(N);            //invoco funcion
		System.out.println("El area del circulo es: "+resp);

	}
	static double area(double x){  //funcion que calcula el area
		double res;
		res=(3.1415*(x*x));           //pi = 3.1415 aprox
		return res;
		
	}

}
