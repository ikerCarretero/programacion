public class Person {
    private String nom;
    private String cognom;

    public Person(String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;
    }

    public String obtenirNomCompleto() {
        return nom + " " + cognom;
    }

    public void mostrarInformacio() {
        System.out.println("Nom: " + nom);
        System.out.println("Cognom: " + cognom);
    }
}