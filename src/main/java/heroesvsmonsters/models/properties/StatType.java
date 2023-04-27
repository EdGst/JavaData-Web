package heroesvsmonsters.models.properties;

public enum StatType {


    HP("Points de vie"),
    MANA ("Points de mana"),
    STRENGTH ("Points de force"),
    INTELLIGENCE("Points d'intelligence"),
    AGILITY("Points d'agilités");

    private String nom;

    StatType(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
