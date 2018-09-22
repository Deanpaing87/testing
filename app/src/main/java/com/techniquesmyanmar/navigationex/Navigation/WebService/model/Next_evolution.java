package com.techniquesmyanmar.navigationex.Navigation.WebService.model;

/**
 * Created by user on 9/11/2018.
 */

public class Next_evolution
{
    private String num;

    private String name;

    public String getNum ()
    {
        return num;
    }

    public void setNum (String num)
    {
        this.num = num;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [num = "+num+", name = "+name+"]";
    }
}


