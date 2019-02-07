package com.lambdaschool;

public class Birds extends AbstractAnimal
{
    public String name;

    public Birds(String name, int energy)
    {
        super(energy);
    }

    @Override public String getName()
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
        return "I flap my wings";
    }

    @Override
    public String breath()
    {
        return "I breath air in my gills";
    }

    @Override
    public String reproduce()
    {
        return "I just laid some eggs";
    }
}
