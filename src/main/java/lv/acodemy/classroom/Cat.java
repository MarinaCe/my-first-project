package lv.acodemy.classroom;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cat {

    private String name;
    private String color;
    @Setter
    private int age;
    @Setter
    private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;
    //private final int MAX_ENERGY = 5;
    private int energy = 5;

    public Cat(String name, String color, String breed, String gender, boolean hasFur) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.hasFur = hasFur;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat(String name) {
        this.name = name;
    }
    public boolean isHasFur() {
        return hasFur;
    }
    public void speak(){
        System.out.println("Meow!");
    }
    public void feed() {
        if (energy == 5) {
            System.out.println("I cannot eat anymore!");
        } else {
            energy++;
            System.out.println("Om-nom-nom!");
        }

    /*public void walk(){
        if(energy<=0){
            System.out.println("I dont have enough energy to walk!");
        } else {
            System.out.println("Walkie - walkie");
            energy--;
        }*/
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", hasFur=" + hasFur +
                '}';
    }
}
