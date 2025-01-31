public class Films {

    private int id;
    private String nom;
    private String category;
    private String temps;

    public Films(FilmBuilder builder) {
        this.id = builder.id;
        this.nom = builder.nom;
        this.category = builder.category;
        this.temps = builder.temps;
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

    public static class FilmBuilder {
        private final int id;
        private final String nom;
        private final String category;
        private final String temps;

        public FilmBuilder(int id, String nom, String category, String temps) {
            this.id = id;
            this.nom = nom;
            this.category = category;
            this.temps = temps;
        }
    }
}
