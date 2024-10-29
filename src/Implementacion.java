import java.util.List;
import java.util.Scanner;

public class Implementacion implements OperacionesElecciones {
    private Scanner scanner = new Scanner(System.in);

    // Método para registrar los candidatos
    @Override
    public void registrarCandidatos(List<Elecciones> candidatos, int numCandidatos) {
        for (int i = 0; i < numCandidatos; i++) {
            System.out.print("Ingrese el nombre del candidato " + (i + 1) + ": ");
            String nombre = scanner.next();
            candidatos.add(new Elecciones(nombre)); // Agrega el candidato a la lista
        }
    }

    // Método para registrar los votos
    @Override
    public void registrarVotos(List<Elecciones> candidatos, int numVotantes) {
        System.out.println("\nIngrese el número del candidato por el que cada votante vota (1 a " + candidatos.size() + "):");
        for (int i = 0; i < numVotantes; i++) {
            System.out.print("Voto del votante " + (i + 1) + ": ");
            int voto = scanner.nextInt();

            if (voto > 0 && voto <= candidatos.size()) {
                candidatos.get(voto - 1).incrementarVoto(); // Incrementa el voto del candidato correspondiente
            } else {
                System.out.println("Voto no válido.");
            }
        }
    }
    

    // Método para mostrar los resultados
    @Override
    public void mostrarResultados(List<Elecciones> candidatos) {
        // Ordenar los candidatos por el número de votos en orden descendente
        candidatos.sort((c1, c2) -> Integer.compare(c2.getVotos(), c1.getVotos()));

        System.out.println("\nResultados de las elecciones:");
        int lugar = 1;
        for (Elecciones candidato : candidatos) {
            System.out.println("Lugar " + lugar + ": " + candidato.getNombre() + " con " + candidato.getVotos() + " votos");
            lugar++;
        }
    }
}


