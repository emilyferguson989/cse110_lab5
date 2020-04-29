package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float localVal = getValue();
        float fahrenheit = ((localVal-32)*5) / 9;
        return (new Celsius(fahrenheit));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " F";
    }
}