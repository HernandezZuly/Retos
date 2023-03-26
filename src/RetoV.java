import java.util.Scanner;
public class RetoV {
    public static void main(String[] args) {
        String nombre;
        int edad, opcion, opcionClien, oportunidades=1, i;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Digite su nombre");
        nombre=lectura.nextLine();
        System.out.println("Digite su edad");
        edad=lectura.nextInt();
        if (edad<=0) {
            System.out.println("Usted digito una edad no adecuada");
        } else if (edad<=17) {
            System.out.println("Usted es menor de edad, no puede jugar");
        } else if (edad>=100) {
            System.out.println("Usted no puede jugar");
        } else {
            System.out.println("SI PUEDE JUGAR");
            while(oportunidades==1){
            i=3;
                do {
                    System.out.println("Digite el NUMERO de la opción que quiere \n 1.piedra \n 2.papel \n 3.tijera");
                    opcionClien = lectura.nextInt();
                    opcion = (int) (Math.random()*3  + 1);
                    System.out.println("La maquina escogió " + opcion);
                    if(opcionClien==1 && opcion==2){
                    System.out.println(" La maquina ganó");
                    System.out.println(" " + nombre + " has perdido");
                    }else if(opcionClien==1 && opcion==3){
                    System.out.println(" " + nombre + " has ganado");
                    System.out.println(" La maquina perdió");
                    }else if(opcionClien==1 && opcion==1){
                    System.out.println(" Quedaron en empate");
                    }   else if(opcionClien==2 && opcion==3){
                        System.out.println(" La maquina ganó");
                        System.out.println(" " + nombre + " has perdido");
                        }else if(opcionClien==2 && opcion==1){
                        System.out.println(" " + nombre + " has ganado");
                        System.out.println(" La maquina perdió");
                        }else if(opcionClien==2 && opcion==2){
                        System.out.println(" Quedaron en empate");
                    }   else if(opcionClien==3 && opcion==1){
                        System.out.println(" La maquina ganó");
                        System.out.println(" " + nombre + " has perdido");
                        }else if(opcionClien==3 && opcion==2){
                        System.out.println(" " + nombre + " has ganado");
                        System.out.println(" La maquina perdió");
                        }else if(opcionClien==3 && opcion==3){
                        System.out.println(" Quedaron en empate");
                    }
                    i--;   
                System.out.println(" Le quedan " + i + " vida/s");
                }while(i>0);
            System.out.println("Desea jugar de nuevo?! 1.Si o 2.No");
            oportunidades=lectura.nextInt();
            }
        }
        
        lectura.close();  
    }
}

