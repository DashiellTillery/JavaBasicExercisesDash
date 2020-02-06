public class Runner {
    public static void main(String[] args) {
        Car mycar = new Car(2019,"Tesla","Cybertruck");

        mycar.drive(50);
        System.out.println(mycar);

        Rectangle myrectangle = new Rectangle(30,40);
        System.out.println(myrectangle.getArea());
        System.out.println(myrectangle.diagonal());
    }

}
