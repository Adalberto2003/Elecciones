
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Implementacion implementacion = new Implementacion();

        // Solicitar el número de candidatos y votantes
        System.out.print("Ingrese el número de candidatos: ");
        int numCandidatos = scanner.nextInt();
        System.out.print("Ingrese el número de votantes: ");
        int numVotantes = scanner.nextInt();

        // Crear una lista de candidatos y registrar sus nombres
        List<Elecciones> candidatos = new ArrayList<>();
        implementacion.registrarCandidatos(candidatos, numCandidatos);

        // Registrar los votos de los votantes
        implementacion.registrarVotos(candidatos, numVotantes);

        // Mostrar los resultados
        implementacion.mostrarResultados(candidatos);

        
    }
}
