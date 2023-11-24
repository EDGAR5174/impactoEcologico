
import java.util.Scanner;

public class ImpactoEcologico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener información del usuario
        System.out.println("Calculadora de Impacto Ecológico");
        System.out.print("Ingrese la cantidad de edificios: ");
        int cantidadEdificios = scanner.nextInt();

        System.out.print("Ingrese la cantidad de vehículos: ");
        int cantidadVehiculos = scanner.nextInt();

        // Calcular emisiones de dióxido de carbono
        double emisionesEdificios = calcularEmisionesEdificios(cantidadEdificios);
        double emisionesVehiculos = calcularEmisionesVehiculos(cantidadVehiculos);

        // Mostrar resultados
        System.out.println("\nResumen del Impacto Ecológico:");
        System.out.println("Emisiones de edificios: " + emisionesEdificios + " toneladas de CO2 por año");
        System.out.println("Emisiones de vehículos: " + emisionesVehiculos + " toneladas de CO2 por año");

        double totalEmisiones = emisionesEdificios + emisionesVehiculos;
        System.out.println("Total de emisiones: " + totalEmisiones + " toneladas de CO2 por año");

        // Cerrar el escáner
        scanner.close();
    }

    private static double calcularEmisionesEdificios(int cantidadEdificios) {
        // Supongamos que cada edificio emite 10 toneladas de CO2 por año
        double emisionesPorEdificio = 10.0;
        return cantidadEdificios * emisionesPorEdificio;
    }

    private static double calcularEmisionesVehiculos(int cantidadVehiculos) {
        // Supongamos que cada vehículo emite 5 toneladas de CO2 por año
        double emisionesPorVehiculo = 5.0;
        return cantidadVehiculos * emisionesPorVehiculo;
    }
}