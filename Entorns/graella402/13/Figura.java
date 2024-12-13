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

    // Classe interna Posicio
    private class Posicio {
        private int x;
        private int y;

        public Posicio(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void desplaçar(int dx, int dy) {
            x += dx;
            y += dy;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}