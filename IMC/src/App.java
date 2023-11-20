import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.err.println("Indice de massa corporal(IMC) em Adultos.");

        System.err.println("Digite a sua Idade:");
        int idade = ler.nextInt();
        
        System.err.println("Digite a sua Altura:");
        double altura = ler.nextDouble();

        System.err.println("Digite o seu Peso:");
        int peso = ler.nextInt();

        ler.close();

        int idades = idade;
        int pesos = peso;
        double alturas = altura;
        String pesoIdeal = " e o peso Ideal seria : 56,66 Kg - 76,56 Kg";

        var IMC = pesos / (alturas * alturas);

        if (idades >= 17) {
            if (IMC < 18.5) {
            System.out.println("Abaixo do peso");

            } else if (IMC >= 18.5 && IMC < 24.9) {
                System.out.println("PESO NORMAL =>" + pesoIdeal);
            }
                else if (IMC >= 25.0 && IMC <= 29.9) {
                System.out.println("EXCESSO DE PESO =>" + pesoIdeal);
            }
                else if (IMC >= 30.0 && IMC <= 34.9) {
                System.out.println("OBESIDADE DE CLASSE =>" + pesoIdeal);
            }
                else if (IMC >= 35.0 && IMC < 39.9) {
                System.out.println("OBESIDADE DE CLASSE 2 =>" + pesoIdeal);
            }
                else{
                System.out.println("OBESIDADE DE CLASSE 3 =>" + pesoIdeal);
            }
        }
    }
}
