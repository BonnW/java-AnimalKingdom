package com.lambdaschool;

import java.util.Random;

public abstract class AbstractAnimal
{
   private Random rand = new Random();
   int id = rand.nextInt(1000000);

   private int energy = 1;
   public void eat(String food)
   {
       energy++;
   }

    public int getEnergy()
    {
        return energy;
    }

    private String name;
   public AbstractAnimal(String name)
   {
       this.name = name;
   }

    public void setName(String name)
    {
        this.name = name;
    }

    private int yearDiscovered;
   public AbstractAnimal(int year)
   {
       this.yearDiscovered = year;
   }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public void move(int steps)
    {
        energy = energy - steps;
    }

    public String breath()
    {
        return "GASP";
    }

    public String reproduce()
    {
        return "OH MY GOD I HAVE A BABY";
    }
}
