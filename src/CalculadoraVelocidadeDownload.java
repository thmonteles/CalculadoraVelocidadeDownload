import java.util.Scanner;

public class CalculadoraVelocidadeDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a distância em quilômetros
        System.out.println("Informe a distância entre o servidor e o dispositivo (em quilômetros): ");
        double distanciaServidores = scanner.nextDouble();

        // Solicitar a velocidade do plano de internet em Mbps
        System.out.println("Informe a velocidade do plano de internet (em Mbps): ");
        double velocidadePlano = scanner.nextDouble();

        // Calcular a velocidade de download estimada
        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        // Exibir o resultado
        System.out.println("A velocidade de download estimada é: " + velocidadeDownloadEstimada + " Mbps");

        scanner.close();
    }

    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        // Aplicando a formula para Cálculo da Velocidade de Download (em Mbps)
        double velocidadeDownloadEstimada = velocidadePlano / (1 + (distanciaServidores / 100));

        // Limitar a velocidade estimada para não exceder a velocidade do plano
        if (velocidadeDownloadEstimada > velocidadePlano) {
            return velocidadePlano;
        }

        return velocidadeDownloadEstimada;
    }
}
