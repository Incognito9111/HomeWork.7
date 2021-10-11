package model;

import service.CatService;

public class Api {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Mars", 0);
        cats[1] = new Cat("Luna", 0);
        cats[2] = new Cat("Hoki", 0);
        Plate plate = new Plate(new Eat("Meat", 10));
        CatService catService = new CatService(cats[0]);
        CatService catService1 = new CatService(cats[1]);
        CatService catService2 = new CatService(cats[2]);

        // First Cat
        System.out.println(cats[0].getName());
        System.out.println(plate.getEat().getName());
        System.out.println(cats[0].getSatiety());
        if (cats[0].getSatiety() < 10) {
            plate.addEat(new Eat("Milk", 3));
            catService.eat(plate.getEat());
        }
        System.out.println(plate.getEat().getName());
        System.out.println(cats[0].getSatiety() + "\n");

        // Two Cat
        System.out.println(cats[1].getName());
        System.out.println(plate.getEat().getName());
        System.out.println(cats[1].getSatiety());
        if (cats[1].getSatiety() < 10) {
            plate.addEat(new Eat("Fish", 3));
            catService1.eat(plate.getEat());
        }
        System.out.println(plate.getEat().getName());
        System.out.println(cats[1].getSatiety() + "\n");

        // Three Cat
        System.out.println(cats[2].getName());
        System.out.println(plate.getEat().getName());
        System.out.println(cats[2].getSatiety());
        if (cats[2].getSatiety() < 10) {
            plate.addEat(new Eat("Sausage", 3));
            catService2.eat(plate.getEat());
        }
        System.out.println(plate.getEat().getName());
        System.out.println(cats[2].getSatiety());

    }
}
