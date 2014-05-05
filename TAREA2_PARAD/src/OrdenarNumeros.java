public class OrdenarNumeros {
 
    public static void main(String[] args) {
 
        final int TAMAÑO=10;
        int A[]=new int [TAMAÑO];
        llenarArreglo(A);
 
        System.out.println("Estos son los numeros generados aleatoriamente:");
        imprimeArreglo(A);
 
        ordenarnumeros(A);
 
        System.out.println("Estos son los numeros ordenados de menor a mayor:");
        imprimeArreglo(A);
 
     }
    
    private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*1000));
    	}
 
 
    public static void imprimeArreglo (int A[]){
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
 
    public static void imprimeArreglo(String A[]){
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
 
    public static void llenarArreglo (int A[]){
        for(int i=0;i<A.length;i++){
            A[i]=numeroAleatorio();
        }
    }
 
  
    public static void ordenarnumeros(int A[]){
 
         for(int i=0;i<(A.length-1);i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    int aux=A[i];
                    A[i]=A[j];
                    A[j]=aux;
                }
            }
        }
    }
}