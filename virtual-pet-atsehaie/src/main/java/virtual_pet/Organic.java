package virtual_pet;

public class Organic extends VirtualPet {
    private int hungerLevel;
    private int boredom;
    private int fatigue;
    private int cleanliness;


    public Organic(String name, int hungerLevel, int boredom, int cleanliness, int fatigue) {
        super(name);
        this.boredom = boredom;
        this.hungerLevel = hungerLevel;
        this.cleanliness = cleanliness;
        this.fatigue = fatigue;
    }

    public void walk() {
        this.boredom--;
        this.cleanliness++;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void feed() {
        this.hungerLevel--;
    }


    public int getFatigue() {
        return fatigue;
    }


    public void play() {
        boredom = boredom - 2;
        if (boredom < 0) {
            boredom = 0;
        }
    }

    public void nap() {
        fatigue = fatigue - 1;
        if (fatigue < 0) {
            fatigue = 0;
        }
    }

    public void tick() {
        this.hungerLevel++;
        this.boredom++;
        this.fatigue++;
        this.cleanliness--;

    }
}

