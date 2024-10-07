import java.util.Scanner;

/*
 pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (DD/MM/AAAA): ");
        String fecha = sc.nextLine();
        String[] partes = fecha.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        String signo = "";
        String horoscopo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            horoscopo = "Hoy es un buen dia para innovar.";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            horoscopo = "Escucha tu intuición.";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            horoscopo = "La energía está a tu favor.";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            horoscopo = "La paciencia te traera recompensas.";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
            horoscopo = "Comunicación es la clave.";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
            horoscopo = "Cuida de tus emociones.";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
            horoscopo = "Brilla con confianza.";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
            horoscopo = "La atención al detalle es importante.";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
            horoscopo = "Busca el equilibrio en tus relaciones.";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
            horoscopo = "La pasión te guiará hoy";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
            horoscopo = "La aventura te espera";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
            horoscopo = "La disciplina te llevará lejos";
        } else {
            horoscopo = "Fecha no válida.";
        }

        System.out.println("Tu signo zod es: " + signo);
        System.out.println("La frase de tu signp es: " + horoscopo);

    }
}
