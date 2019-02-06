package com.lambdaschool;

public class Fish extends AbstractAnimal
{
    public String name;

    public Fish(String name, int energy)
    {
        super(energy);
    }

    @Override
    public void eat()
    {
        energy++;
    }

    @Override
    public String move()
    {
        return "I just swam";
    }

    @Override
    public String breath()
    {
        return "I breath through my gills";
    }

    @Override
    public String reproduce()
    {
        return "That's a lot of eggs...";
    }
}
