package io.muic.ooc.fab;

public abstract class Prey extends Animal {

    @Override
    protected Location movetoNewLocation(){
        return field.freeAdjacentLocation(getLocation());
    }

}
