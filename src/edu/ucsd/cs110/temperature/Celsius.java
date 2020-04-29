package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float localVal = getValue();
        float fahrenheit = (localVal*9)/5 + 32;
        return (new Fahrenheit(fahrenheit));
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " C";
    }
}