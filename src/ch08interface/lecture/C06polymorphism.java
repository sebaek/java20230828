package ch08interface.lecture;

import ch07extends.book.exercise.p12.B;

public class C06polymorphism {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setWeapon(new Gun());
        hero.attack();

        hero.setWeapon(new Bow());
        hero.attack();

        System.out.println("게임 종료");
    }
}

class Hero {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.trigger();
    }
}

interface Weapon {
    void trigger();
}

class Gun implements Weapon {
    @Override
    public void trigger() {
        System.out.println("총을 쏩니다.");
    }
}

class Bow implements Weapon {
    @Override
    public void trigger() {
        System.out.println("활을 쏩니다.");
    }
}



