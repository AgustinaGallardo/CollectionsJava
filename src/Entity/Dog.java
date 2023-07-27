package Entity;

public class Dog {
    private String name;
    private String race;
    public Dog() {
    }
    public Dog(String name, String race) {
        this.name = name;
        this.race = race;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
