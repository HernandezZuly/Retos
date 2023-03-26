import java.util.Scanner;

public class RetoVI {
    public static void main(String[] args) {
        int reintento=1, numPalabra, i;
        String palabra;
        Scanner lectura = new Scanner (System.in); 
        while(reintento==1){
        i=4;
            do{
                System.out.println("Puedes descubrir 4 palabras entonces digita el numero de la palabra que quieres descubrir");
                numPalabra=lectura.nextInt();
                if(numPalabra==1){
                    System.out.println(" Puede ser grande, largo, pequeñ@ o corto \n Es una prenda de vestir \n Existe en todos los colores y diseños posibles");
                    System.out.println("Escribe que palabra es");
                    palabra=lectura.next(); 
                    if(palabra.equals("chaqueta")){
                        System.out.println("Felicitaciones decubriste una palabra");
                    }else{
                        System.out.println("Respuesta incorrecta");
                    }
                }else if(numPalabra==2){
                    System.out.println(" Sirve para transportarnos \n Tiene 22 ruedas");
                    System.out.println("Escribe que palabra es");
                    palabra=lectura.next(); 
                    if(palabra.equals("avion")){
                        System.out.println("Felicitaciones decubriste una palabra");
                    }else{
                        System.out.println("Respuesta incorrecta");
                    }
                }else if(numPalabra==3){
                    System.out.println(" Es un animal \n Vive en un lugar donde no hay agua");
                    System.out.println("Escribe que palabra es");
                    palabra=lectura.next(); 
                    if(palabra.equals("camello")){
                        System.out.println("Felicitaciones decubriste una palabra");
                    }else{
                        System.out.println("Respuesta incorrecta");
                    }
                }else if(numPalabra==4){
                    System.out.println(" Animal que su nombre empieza por la letra N \n Come peces");
                    System.out.println("Escribe que palabra es");
                    palabra=lectura.next(); 
                    if(palabra.equals("nutria")){
                        System.out.println("Felicitaciones decubriste una palabra");
                    }else{
                        System.out.println("Respuesta incorrecta");
                    }
                }
            i--;
            System.out.println(" Le quedan " + i + " vida/s");
            }while(i>0);
        System.out.println("Desea jugar de nuevo?! 1.Si o 2.No");
        reintento=lectura.nextInt();
        }
    lectura.close();
    }
}
