import java.util.List;

public interface OperacionesElecciones {
    void registrarCandidatos(List<Elecciones> candidatos, int numCandidatos);
    void registrarVotos(List<Elecciones> candidatos, int numVotantes);
    void mostrarResultados(List<Elecciones> candidatos);
}
