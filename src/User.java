public class User {

    private int id;
    private String nom;
    private EUserRoles roles;

    public User(int id, String nom, EUserRoles roles) {
        this.id = id;
        this.nom = nom;
        this.roles = roles;
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

    public EUserRoles getRoles() {
        return roles;
    }

    public void setRoles(EUserRoles roles) {
        this.roles = roles;
    }
}
