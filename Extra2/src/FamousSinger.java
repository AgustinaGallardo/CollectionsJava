public class FamousSinger {
    private String name;
    private String bestSellingAlbum;

    public FamousSinger() {
    }

    public FamousSinger(String name, String bestSellingAlbum) {
        this.name = name;
        this.bestSellingAlbum = bestSellingAlbum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBestSellingAlbum() {
        return bestSellingAlbum;
    }

    public void setBestSellingAlbum(String bestSellingAlbum) {
        this.bestSellingAlbum = bestSellingAlbum;
    }

    @Override
    public String toString() {
        return "FamousSinger{" +
                "name='" + name + '\'' +
                ", bestSellingAlbum='" + bestSellingAlbum + '\'' +
                '}';
    }
}
