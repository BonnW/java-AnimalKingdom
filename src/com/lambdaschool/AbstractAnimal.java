package com.lambdaschool;

public abstract class AbstractAnimal
{
    int energy;
    String name;
    int yearDiscovered;
    int id;

    public AbstractAnimal(int energy)
    {
        this.energy = energy;
    }

    public AbstractAnimal()
    {
        energy = 1;
    }

    public abstract String getName();


    public abstract void eat();

    public abstract String move();


    public abstract String breath();


    public abstract String reproduce();

}



