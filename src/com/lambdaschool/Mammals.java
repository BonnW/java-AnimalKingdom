package com.lambdaschool;

public class Mammals extends AbstractAnimal
{
    public String name;

    public Mammals(String name, int yearDiscovered, int energy)
    {
        super(energy);
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void eat()
    {
        energy++;
    }

    @Override
    public String move()
    {
        return "I just walker";
    }

    @Override
    public String breath()
    {
        return "I breath air into my lungs";
    }

    @Override
    public String reproduce()
    {
        return "Holy **** I have a child";
    }
}
