package io.muic.ooc.fab;

import java.awt.*;

public enum AnimalType {
    RABBIT(0.08,Rabbit.class,Color.ORANGE,9),
    FOX(0.02,Fox.class,Color.BLUE,12),
    TIGER(0.01,Tiger.class,Color.RED,15),
    HUNTER(0.001,Hunter.class,Color.GREEN,0);


    private double breedingProbability;

    private Class animalClass;

    private Color color;
    private  int foodValue;

    AnimalType(double breedingProbability, Class animalClass,Color color,int foodValue) {
        this.breedingProbability = breedingProbability;
        this.animalClass = animalClass;
        this.color = color;
        this.foodValue = foodValue;
    }

    public double getBreedingProbability() {
        return breedingProbability;
    }

    public Class getAnimalClass() {
        return animalClass;
    }

    public Color getColor(){
        return color;
    }

    public int getFoodValue(){return foodValue;}
}
