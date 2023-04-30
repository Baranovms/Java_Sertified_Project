package Sertified_Project.Task2_Java;


import java.util.ArrayList;
import java.util.List;


public class Project {
    public static void main(String[] args) {

        Toys toy1 = new Toys(0, "Кукла", 25);
        Toys toy2 = new Toys(1, "Машинка", 40);
        Toys toy3 = new Toys(2, "Робот", 13);
        Toys toy4 = new Toys(3, "Квадрокоптер", 65);
        Toys toy5 = new Toys(4, "Мяч", 25);

        List<Toys> toys = new ArrayList<Toys>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);
        toys.add(toy5);

        ToysStore toyStore = new ToysStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
    }
   
}