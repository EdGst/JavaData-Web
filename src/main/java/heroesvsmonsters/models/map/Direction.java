package heroesvsmonsters.models.map;

public enum Direction {

    NORTH("Nord"),
    SOUTH("Sud"),
    EAST("Est"),
    WEST("West");

    private String nom;

    Direction(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }


}
