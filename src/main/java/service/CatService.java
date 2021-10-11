package service;

import model.Cat;
import model.Eat;

public class CatService {
    private Cat cat;

    public CatService(Cat cat) {
        this.cat = cat;
    }


    public int eat(Eat eat) {
        while (cat.getSatiety() <= 10) {
            if (cat.getSatiety() == 10) {
                System.out.println("Kот наелся его аппетит: " + cat.getSatiety());
                return cat.getSatiety();
            }
            if (eat.getCount() < 1) {
                System.out.println("Еда закончилась");
                return cat.getSatiety();
            }
            cat.setSatiety(cat.getSatiety() + 1);
            eat.decreaseCount();
        }
        return cat.getSatiety();
    }
}
