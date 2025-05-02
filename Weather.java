import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que ingrese la temperatura en celcius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:
        //Si es bajo 0: Te estás congelando
        //Si es entre 0 y 10: Hace mucho frío 
        //Si es entre 11 y 17: Con un abrigo estás bien
        //Si es entre 18 y 25: Parece que ha llegado el verano
        //Si es entre 26 y 35: Que calooorrrrr
        //Si es mayor a 36: Ahí no hay quien viva

        //Imprime el resultado
        Scanner clima = new Scanner(System.in);
        System.out.print("Hola... ¿Cuál es tu temperatura el día de hoy?");
        double temperatura = clima.nextDouble();
        clima.close();
        if (temperatura<0) {
            System.out.println("Te estás congelando");
        } else if (temperatura <= 10.0){
            System.out.println("Hace mucho frío");
        } else if (temperatura <= 17){
            System.out.println("Con un abrigo estás bien");
        } else if (temperatura <= 25){
            System.out.println("Parece que ha llegado el verano");
        } else if (temperatura <= 35){
            System.out.println("Que calooorrrrr");
        } else if (temperatura>36){
            System.out.println("Ahí no hay quien viva");
        }
    }
}