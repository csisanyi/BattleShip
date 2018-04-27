package com.matritellabs.utama.helper;

import java.util.Scanner;



public class Table {

    private boolean lost;
    private String name;
    private String[][] table = new String[10][10];


    public Table(String name) {
        this.name = name;

    }

    public boolean isLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[][] getTable() {
        return table;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }

    public Table initialisation() {

        System.out.println("Provide the player's name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Table nameTable = new Table(name);


        return nameTable;
    }
}
