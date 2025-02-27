import java.util.Scanner;

public class EXERCICIO_008_Distancias {
    public static void main(String[] args) {

        //8 Desenvolva um programa em Java que leia uma distância em metros e mostre os
        //valores relativos em outras medidas.


        Scanner sc = new Scanner(System.in);

        // Solicita a distância em metros.
        System.out.print("Digite uma distância em metros: ");
        float metros = sc.nextFloat();

        // Converte em outras medidas.
        float km = metros / 1000;
        float hm = metros / 100;
        float dam = metros / 10;
        float dm = metros * 10;
        float cm = metros * 100;
        float mm = metros * 1000;

        // Exibe os resultados.
        System.out.println("Distância de "+km+ " km");
        System.out.println("Distância de "+hm+ " hm");
        System.out.println("Distância de "+dam+ " dam");
        System.out.println("Distância de "+dm+ " dm");
        System.out.println("Distância de "+cm+ " cm");
        System.out.println("Distância de "+mm+ " mm");

        // Fecha o scanner.
        sc.close();

    }
}

// Digite uma distância em metros: 100
// Distância de 0.1 km
// Distância de 1.0 hm
// Distância de 10.0 dam
// Distância de 1000.0 dm
// Distância de 10000.0 cm
// Distância de 100000.0 mm