import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car bmv = new Car(1997, 3.4);
        Car fiat = new Car(2003, 2.8);
        Car mercedes = new Car(2009, 5.0);
        Car volkswagen = new Car(1989, 1.6);
        Car audi = new Car(2015, 4.8);
        Car toyota = new Car(2022, 3.5);
        Car ford = new Car(2017, 1.0);

        List<Car> cars1 = new ArrayList<>(List.of(bmv,fiat,mercedes, volkswagen, audi,toyota, ford));
        System.out.println(cars1);

        Collections.sort(cars1, (o1, o2) -> {
            if (o1.getYearOfManufacture() < o2.getYearOfManufacture()) {
                return -1;
            }else if(o1.getYearOfManufacture() > o2.getYearOfManufacture()){
                return 1;
            } else return 0;
        });
        System.out.println(cars1);

        Set<Car> CarsSet = new TreeSet<>();
        CarsSet.addAll(cars1);
        System.out.println(CarsSet);

        System.out.println("-------------------------------------------------");

        for(Integer lists1 : new Range(1,100)) {
            System.out.println(lists1);
        }
            System.out.println("---------------------------------------");
            for (Integer lists2 : new RangeWithStep(1,100,2)){
                System.out.println(lists2);
            }


    }
}
