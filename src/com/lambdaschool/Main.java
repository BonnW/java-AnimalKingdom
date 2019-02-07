package com.lambdaschool;

import java.util.ArrayList;

public class Main
{
    public static void printVehicles(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    {
        for (AbstractAnimal v : animals)
        {
            if(tester.test(v))
            {
                System.out.println(v.getName());
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<AbstractAnimal> Mammals = new ArrayList<AbstractAnimal>();
        Mammals.add(new Mammals());
        // write your code here
    }
}
