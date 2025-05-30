import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al score
        //Al finalizar el juego imprime cual fue tu score /20
        //Si el score es 15 o más, imprime: Tú si que sabes mucho
        //Si el score es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        Scanner quiz = new Scanner(System.in);
        System.out.println("¡Bienvenido a la juego de trivia!\nA continuación, te presentamos 4 preguntas con 4 opciones de respuesta.\n¡Buena Suerte!");
        System.out.println();
        System.out.println("1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware? \n" +
                        "\t a. Ada Lovelace \n"+
                        "\t b. Jude Milhon \n"+
                        "\t c. Martha Ackelsberg \n"+
                        "\t d. Jane Jacobs");
        String answer1 = quiz.nextLine().toLowerCase();
        System.out.println();

        System.out.println("2. ¿Quién es Fuencisla Clemares?\n"+
                        "\t a. La directora general de IBM Europa, Oriente Medio y África \n"+
                        "\t b. La vicepresidenta de Microsoft Western Europe \n"+
                        "\t c. La directora general de Google en España y Portugal \n"+
                        "\t d. Fundadora y CEO de Marsi Bionics \n");
        String answer2 = quiz.nextLine().toLowerCase();
        System.out.println();

        System.out.println("3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?\n"+
                "\t a. Primera programadora de software \n"+
                "\t b. Una actriz de cine \n"+
                "\t c. Inventora del procesador de datos \n"+
                "\t d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS \n");
        String answer3 = quiz.nextLine().toLowerCase().trim();
        System.out.println();

        System.out.println("4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?\n"+
                "\t a. Katherine Johnson, Dorothy Vaughan y Mary Jackson \n"+
                "\t b. Jessica Miller, Emily Johnson, Sarah Davis \n"+
                "\t c. bell hooks, Toni Morrison y Alice Walker \n"+
                "\t d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman \n");
        String answer4 = quiz.nextLine().toLowerCase();

        quiz.close();
        byte score = 0;
        switch (answer1) {
            case "b":
                score += 5;
                break;
            default:
                break;
        }

        switch (answer2) {
            case "c":
                score += 5;
                break;
            default:
                break;
        }

        switch (answer3) {
            case "b y d":
                score += 5;
                break;
            default:
                break;
        }

        switch (answer4) {
            case "a":
                score += 5;
                break;
            default:
                break;
        }

        if (score < 5) {
            System.out.println("Tu score es: "+ score + ". Buena suerte la próxima vez.\n¡Fin!");
        } else if (score < 15) {
            System.out.println("Tu score es: "+ score + ". No lo has hecho mal.\n¡Fin!");
        } else if (score >= 15) {
            System.out.println("Tu score es: "+ score + ". Tú si que sabes mucho.\n¡Fin!");
        }
        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

    }
    
}