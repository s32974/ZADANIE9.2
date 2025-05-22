import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Corolla", 2010));
        cars.add(new Car("Honda Civic", 2008));
        cars.add(new Car("Ford Focus", 2015));
        cars.add(new Car("BMW 3 Series", 2012));
        cars.add(new Car("Audi A4", 2011));
        cars.add(new Car("Volkswagen Golf", 2009));
        cars.add(new Car("Mercedes-Benz C-Class", 2013));
        cars.add(new Car("Hyundai Elantra", 2014));
        cars.add(new Car("Kia Ceed", 2007));
        cars.add(new Car("Mazda 3", 2016));


        Collections.sort(cars);

//wyswietlanie
        for (Car car : cars) {
            System.out.println(car.year + " " + car.model);
        }
//----------------



        fillArray();

    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int numer = scanner.nextInt();
        if (numer < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return numer;
    }

    private static final int[] array = new int[10];

    public static void fillArray() {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                array[i] = 0;
            }
        }

    }
}