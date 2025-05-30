import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        Scanner form = new Scanner(System.in);
        System.out.print("Ingresa tu nombre de usuario: ");
        String nameUS = form.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        String password = form.nextLine();
        form.close();
        if (nameUS.equals("acpp2510") && password.equals("p@ss1234")){
            System.out.print("Acceso concedido");
        } else {
            System.out.print("Nombre de usuario o contraseña incorrecta");
        }

    }
}
