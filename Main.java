package control_work;

import control_work.toys.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Нажмите Enter для начала!");
        sc.nextLine();

        int numberOfToys = rand.nextInt(5, 10);
        ArrayList<Toy> quiz = getListOfToys(numberOfToys);
        System.out.println("В розыгрыше " + numberOfToys + " следующих игрушек: ");
        for (Toy x : quiz) {
            System.out.println(x.getInfo());
        }
        while (!quiz.isEmpty()) {
            System.out.println("Выигрышная игрушка: ");
            Toy win = winningToy(quiz);
            System.out.println(win.getInfo());
            quiz.remove(win);
            writeToFile(win);
            System.out.println("Для продолжения нажмите Enter");
            sc.nextLine();
        }
        try {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write("Викторина закончилась!\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Toy winningToy(ArrayList<Toy> list){
        int indexOfWin = new Random().nextInt(list.size());
        return list.get(indexOfWin);
    }

    public static ArrayList<Toy> getListOfToys(int numberOfToys) {
        ArrayList<Toy> nameList = new ArrayList<>();
        Toy car = new ToyCar();
        Toy robot = new Robot(getName());

        while (nameList.size() < numberOfToys) {
            int k = new Random().nextInt(100);
            if(k < robot.getChanceToLoss()) nameList.add(new Robot(getName()));
            else if (k < (100 - car.getChanceToLoss())) nameList.add(new Doll(getName()));
            else nameList.add(new ToyCar());
            k = 0;
        }
        return nameList;
    }

    private static String getName() {
        return String.valueOf(NamesOfToy.values()[new Random().nextInt(NamesOfToy.values().length)]);
    }

    private static void writeToFile(Toy toy){
        try{
            FileWriter writer = new FileWriter("log.txt", true);
            String info = toy.getInfo();
            writer.write(info);
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

