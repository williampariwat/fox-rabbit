package io.muic.ooc.fab;

public class Hunter extends Predator{

    @Override
    protected void setDead(){}

    @Override
    protected AnimalType[] getPrey() {
        return new AnimalType[]{AnimalType.FOX,AnimalType.RABBIT,AnimalType.TIGER};
    }

    @Override
    protected int getMaxAge() {
        return 100;
    }

    @Override
    protected double getBreedingProbability() {
        return 0.003;
    }

    @Override
    protected int getMaxLitterSize() {
        return 1;
    }

    @Override
    protected int getBreedingAge() {
        return 25;
    }
}
