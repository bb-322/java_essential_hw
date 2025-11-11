package hw4.task4;

class Celsius implements ConverterTemperature {
    double temp;

    public Celsius(double val) {
        temp = val;
    }

    @Override
    public double toCelsius() {
        return temp;
    }

    @Override
    public double toFahrenheit() {
        return Math.round((temp * 9 / 5) + 32);
    }

    @Override
    public double toKelvin() {
        return temp + 273.15;
    }
}

class Fahrenheit implements ConverterTemperature {
    double temp;

    public Fahrenheit(double val) {
        temp = val;
    }

    @Override
    public double toCelsius() {
        return Math.round((temp - 32) * 5 / 9);
    }

    @Override
    public double toFahrenheit() {
        return temp;
    }

    @Override
    public double toKelvin() {
        return Math.round((temp - 32) * 5/9 + 273.15);
    }
}

class Kelvin implements ConverterTemperature {
    double temp;

    public Kelvin(double val) {
        temp = val;
    }

    @Override
    public double toCelsius() {
        return Math.round((temp - 273.15));
    }

    @Override
    public double toFahrenheit() {
        return Math.round((temp - 273.15) * 9 / 5 + 32);
    }

    @Override
    public double toKelvin() {
        return temp;
    }
}