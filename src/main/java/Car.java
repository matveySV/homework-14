public class Car implements Comparable<Car>{
    private Integer yearOfManufacture;
    private Double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int compareTo(Car o) {
        return (this.getEngineCapacity().compareTo(o.getEngineCapacity()));
       }
}
