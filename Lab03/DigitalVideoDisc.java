package theAims;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // 1. Constructor chỉ có title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // 2. category, title, cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // 3. director, category, title, cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // 4. đầy đủ
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }
}
