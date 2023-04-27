package heroesvsmonsters.models.properties;

public enum ItemType {
    GOLD("Pièces d'or"),
    LEATHER ("Morceau(x) de cuir(s)"),
    POTION ("Potion");

    private String nom;

    ItemType(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
