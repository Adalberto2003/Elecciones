public class Elecciones {
	
	
    private String nombre;
    private int votos;

    // Constructor que inicializa el nombre del candidato y los votos en 0
    public Elecciones(String nombre) {
        this.nombre = nombre;
        this.votos = 0;
    }

    // Getter para el nombre del candidato
    public String getNombre() {
        return nombre;
    }

    // Getter para el número de votos
    public int getVotos() {
        return votos;
    }

    // Método para incrementar votos
    public void incrementarVoto() {
        this.votos++;
    }
}
