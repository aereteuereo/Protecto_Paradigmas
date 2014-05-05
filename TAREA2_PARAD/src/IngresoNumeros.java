import java.io.*; 

public class IngresoNumeros{ 
public static void main(String[] args) throws IOException { 
BufferedReader s=new BufferedReader(new InputStreamReader(System.in)); 
int Arreglo[],i,n; 
System.out.print("¿Cuántos números desea ingresar?: "); 
n = Integer.parseInt(s.readLine()); 
Arreglo = new int [n]; 
for(i=0;i<n;i++) 
{ 
System.out.print("Ingresa numero: "); 
Arreglo[i] = Integer.parseInt(s.readLine()); 
} 
System.out.println("Arreglo"); 
for(i=0;i<n;i++) 
{ 
System.out.println(Arreglo[i]); 
} 
} 
}
