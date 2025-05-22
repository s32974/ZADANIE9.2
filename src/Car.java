class Car implements Comparable<Car> {

    public String model;
    public int year;

    public  Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

@Override
public int compareTo(Car o) {
        return Integer.compare(this.year, o.year);
}
}
