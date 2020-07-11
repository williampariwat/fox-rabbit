package io.muic.ooc.fab;

import java.util.Iterator;
import java.util.List;

public abstract class Predator extends Animal {
    private int foodLevel;


    public void initialize(boolean randomAge, Field field, Location location) {
        super.initialize(randomAge, field, location);
        foodLevel = RANDOM.nextInt(AnimalType.RABBIT.getFoodValue());
    }

    public void act(List<Animal> newAnimal) {
        incrementHunger();
        super.act(newAnimal);
    }

    private void incrementHunger() {
        foodLevel--;
        if (foodLevel <= 0) {
            setDead();
        }
    }

    private Location findFood() {
        List<Location> adjacent = field.adjacentLocations(getLocation());
        Iterator<Location> it = adjacent.iterator();
        AnimalType[] preys = getPrey();

        while (it.hasNext()) {
            Location where = it.next();
            Animal animal = (Animal) field.getObjectAt(where);
            if (animal != null) {
                for (AnimalType prey : preys){
                    if(animal.getClass() == animal.getClass() && animal.isAlive()){
                        animal.setDead();
                        foodLevel = prey.getFoodValue();
                        return where;
                    }
                }
            }
        }
        return null;
    }


    protected Location movetoNewLocation() {
        Location newLocation = findFood();
        if (newLocation == null) {
            // No food found - try to move to a free location.
            newLocation = field.freeAdjacentLocation(getLocation());
        }
        return newLocation;
    }

    protected abstract AnimalType[] getPrey();

}
