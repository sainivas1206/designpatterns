package com.iterator;

public class Waitress {

    DinerMenu dinerMenu;

    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu){
        this.dinerMenu = dinerMenu;
    }

    public Waitress(PancakeHouseMenu pancakeHouseMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        if(dinerMenu != null){

        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nLUNCH");
        printMenu(dinerIterator);
        }

        if(pancakeHouseMenu != null){

            Iterator dinerIterator = pancakeHouseMenu.createIterator();
            System.out.println("MENU\n----\nLUNCH");
            printMenu(dinerIterator);
        }
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
