
import java.util.Scanner;
public class EliminarNumeros {
	public static void main(String[] args) { 
		int[]A=new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		System.out.println(" asuma que el arreglo es: {1,2,3,4,5,6,7,8,9}"); 
		System.out.println(" Desde la posición 0, ¿En qué posición se encuentra el valor a eliminar?"); 
		int valor=new Scanner(System.in).nextInt(); 

		if (valor==A.length-1) { 
			A[valor]=0; 
			}
		else { 
			for (int i=(valor+ 1);i<A.length;i++){ 
				A[i-1]=A[i]; 
			} 

		A[A.length-1]=0; 

		} 
		System.out.println(" ENTONCES EL ARREGLO QUEDA ASI:");

		for (int i=0;i<A.length-1;i++){ 
		System.out.print(A[i]+" / "); 
		} 

		System.out.println(); 
		} 		
}