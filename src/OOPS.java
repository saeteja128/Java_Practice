
class Car{
    String company = "Skoda";
    String model = "Slavia";
    String color = "Carbon Steel";
    int price = 1500000;

    void drive()
    {
        System.out.println("Would like to drive the car soon");
    }
    void lock()
    {
        System.out.println("Car is locked");
    }
    void unlock()
    {
        System.out.println("Car is unlocked");
    }

}
public class OOPS {
    public  static void main(String[] args)
    {
        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println(c1.company);
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);

        c2.color = "Tornado Red";
        System.out.println(c2.color);
    }


}
