package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player rugen = new Player("Rugen",10,15);
        System.out.println(rugen.toString());
        saveObject(rugen);

        rugen.setHitPoints(8);
        System.out.println(rugen);
        rugen.setStrength(45);
        rugen.setWeapon("Desert Eagle");
        saveObject(rugen);
        loadObject(rugen);
        System.out.println(rugen);

        ISaveable monster;
        monster = new Monster("Draculla",60,89);
        System.out.println(monster.toString());
        saveObject(monster);
    }
    public static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index=0;
        System.out.println("Choose \n 0: Quit\n1: Enter a string\n");
        while(!quit) {
            System.out.println("Choose a option: ");

            int s = scanner.nextInt();
            scanner.nextLine();
            switch (s){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }

        }
        return values;
    }
    public static void saveObject(ISaveable objectToSave)
    {
        for (int i=0;i<objectToSave.write().size();i++)
        {
            System.out.println("Saving " +objectToSave.write().get(i)+" to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }
}
