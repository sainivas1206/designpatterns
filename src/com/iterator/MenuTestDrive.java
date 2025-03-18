package com.iterator;

public class MenuTestDrive {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();
        Waitress waitressPan = new Waitress(pancakeHouseMenu);
        waitressPan.printMenu();
    }
}
