package Sertified_Project.Task2_Java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToysStore {
    private List<Toys> toys;

    public ToysStore(List<Toys> toys) {
        this.toys = toys;
    }
    
    public Toys getToyForPrice() {
        RandToys random = new RandToys();
        Toys toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toys toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("Sertified_Project/Task2_Java/Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
