import refactoritzat.Posicio;

public class Figura {
    private String nom;
    private Posicio posicio;

    public Figura(String nom) {
        this.nom = nom;
        this.posicio = new Posicio(0, 0);
    }

    public void desplaçar(int dx, int dy) {
        posicio.desplaçar(dx, dy);
    }

    public void mostrarPosicio() {
        System.out.println("Posició de " + nom + ": " + posicio.getX() + ", " + posicio.getY());
    }
}