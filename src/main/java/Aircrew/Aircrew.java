package Aircrew;

public abstract class Aircrew {

    private String name;
    public Rank rank;

    public Aircrew(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return this.rank;
    }
}
