package com.techniquesmyanmar.navigationex.Navigation.WebService.model;

/**
 * Created by user on 9/11/2018.
 */

public class Pokemon
{
    private String weight;

    private String img;

    private String[] weaknesses;

    private String spawn_time;

    private String[] type;

    private String egg;

    private String[] multipliers;

    private String id;

    private String num;

    private String height;

    private String candy;

    private String name;

    private String avg_spawns;

    private String spawn_chance;

    private Next_evolution[] next_evolution;

    private String candy_count;

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    public String getImg ()
    {
        return img;
    }

    public void setImg (String img)
    {
        this.img = img;
    }

    public String[] getWeaknesses ()
    {
        return weaknesses;
    }

    public void setWeaknesses (String[] weaknesses)
    {
        this.weaknesses = weaknesses;
    }

    public String getSpawn_time ()
    {
        return spawn_time;
    }

    public void setSpawn_time (String spawn_time)
    {
        this.spawn_time = spawn_time;
    }

    public String[] getType ()
    {
        return type;
    }

    public void setType (String[] type)
    {
        this.type = type;
    }

    public String getEgg ()
    {
        return egg;
    }

    public void setEgg (String egg)
    {
        this.egg = egg;
    }

    public String[] getMultipliers ()
    {
        return multipliers;
    }

    public void setMultipliers (String[] multipliers)
    {
        this.multipliers = multipliers;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getNum ()
    {
        return num;
    }

    public void setNum (String num)
    {
        this.num = num;
    }

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    public String getCandy ()
    {
        return candy;
    }

    public void setCandy (String candy)
    {
        this.candy = candy;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAvg_spawns ()
    {
        return avg_spawns;
    }

    public void setAvg_spawns (String avg_spawns)
    {
        this.avg_spawns = avg_spawns;
    }

    public String getSpawn_chance ()
    {
        return spawn_chance;
    }

    public void setSpawn_chance (String spawn_chance)
    {
        this.spawn_chance = spawn_chance;
    }

    public Next_evolution[] getNext_evolution ()
    {
        return next_evolution;
    }

    public void setNext_evolution (Next_evolution[] next_evolution)
    {
        this.next_evolution = next_evolution;
    }

    public String getCandy_count ()
    {
        return candy_count;
    }

    public void setCandy_count (String candy_count)
    {
        this.candy_count = candy_count;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [weight = "+weight+", img = "+img+", weaknesses = "+weaknesses+", spawn_time = "+spawn_time+", type = "+type+", egg = "+egg+", multipliers = "+multipliers+", id = "+id+", num = "+num+", height = "+height+", candy = "+candy+", name = "+name+", avg_spawns = "+avg_spawns+", spawn_chance = "+spawn_chance+", next_evolution = "+next_evolution+", candy_count = "+candy_count+"]";
    }
}

