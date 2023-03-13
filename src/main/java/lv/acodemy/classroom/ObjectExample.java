package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik =  new Cat("Barsik" );
        System.out.println(barsik.getAge());
        barsik.getAge();
        System.out.println(barsik);
        barsik.setAge(4);
        System.out.println( barsik.getAge());


        barsik.setWeight(6.5);
        System.out.println(barsik.getWeight());

        Cat marusja = new Cat("Marusja");
        barsik.feed();

        marusja.feed();
        marusja.feed();
        marusja.feed();
        marusja.feed();
        marusja.feed();
        System.out.println(marusja.getEnergy());
       }
}
