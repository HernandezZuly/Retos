import java.util.Scanner;

public class RetoVIII {
    public static void main(String[] args) {
        String nombre1, nombre2;
        int dado1, dado2, n=3;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Digite el nombre del primer jugador");
        nombre1=lectura.next();
        System.out.println("Digite el nombre del segundo jugador");
        nombre2=lectura.next();
        while(n>0){
            System.out.println(nombre1 + " lanza el dado");
            System.out.println("Digite que numero saco");
            dado1=lectura.nextInt();
            System.out.println(nombre2 + " lanza el dado");
            System.out.println("Digite que numero saco");
            dado2=lectura.nextInt();
            if (dado1 > dado2) {
                System.out.println("Felicitaciones, has ganado " + nombre1);
                System.out.println(nombre2 + " has perdido");
            } else if (dado1 < dado2){
                System.out.println("Felicitaciones, has ganado " + nombre2);
                System.out.println(nombre1 + " has perdido");
            } else {
                System.out.println("Quedaron empatados");
            }
        n--;
        System.out.println("Le quedan " + n + " vidas");
        }
        lectura.close();
    }
    
}
