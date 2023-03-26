import java.util.Scanner;

public class RetoI {
    public static void main(String[] args){
        double gradosCentigrados, gradosFahrenheit, gradosKelvin;
        double temHornoGradFah, temHornoGradKel;
        String temperatura;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Abuela digite la temperatura de su horno en °C");
        gradosCentigrados=lectura.nextDouble();
        System.out.println("Escriba en que temperatura desea el horno fahrenheit o kelvin");
        temperatura=lectura.next();
        if(temperatura.equals("fahrenheit")){
            gradosFahrenheit=(gradosCentigrados * 1.8) + 32;
            temHornoGradFah= gradosFahrenheit + 100;
            System.out.println("Abuela la temperatura de su horno en °f es " + temHornoGradFah);
        }else if(temperatura.equals("kelvin")){
            gradosKelvin=gradosCentigrados + 273.15;
            temHornoGradKel= gradosKelvin + 100;
            System.out.println("Abuela la temperatura de su horno en °k es " + temHornoGradKel);
        }else{
            System.out.println("Digito el tipo de temperatura mal, recuerde que es kelvin o fahrenheit");
        }
        
        lectura.close();
    }
}
