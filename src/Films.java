public class Films {

    private int id;
    private String nom;
    private String category;
    private String temps;


    public Films(int id, String nom, String category, String temps) {
        this.id = id;
        this.nom = nom;
        this.category = category;
        this.temps = temps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }
}
