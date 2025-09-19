package opps;

class Animal {
    public void cast() {
        System.out.println("hero,heroine,director...");
    }
}

class Hero extends Animal {
    public void cast() {
        System.out.println("Ranveer");
    }
}
class Heroine extends Animal {
    public void cast() {
        System.out.println("Rashmika");
    }
}
class Director extends Animal {
    public void cast() {
        System.out.println("SRV");
    }
}

public class poly {
    public static void main(String[] args) {
        Animal cast = new Animal();
        cast.cast();
        Animal movie = new Heroine();
        movie.cast();
        Animal Director = new Director();
        Director.cast();
        Animal Hero = new Hero();
        Hero.cast();
    }
}
