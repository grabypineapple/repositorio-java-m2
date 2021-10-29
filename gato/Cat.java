package gato;

public class Cat {
    private String name;
    private double energy;

    public Cat(String name)
    {
        this.name = name;
    }

    public void eat(Food food) {
        energy += food.getNutrition();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getEnergy()
    {
        return energy;
    }

    public void setEnergy(double energy)
    {
        this.energy = energy;
    }
}
