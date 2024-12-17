package refactoritzat;

// Classe interna Posicio
class Posicio {
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