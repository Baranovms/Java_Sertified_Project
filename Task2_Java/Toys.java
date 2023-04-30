package Sertified_Project.Task2_Java;

public class Toys {

    int id;
    String name;
    double weight;

    public Toys(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", weight=" + weight + "]";
    }
}
