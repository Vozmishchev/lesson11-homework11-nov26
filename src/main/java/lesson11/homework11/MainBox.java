package lesson11.hw11;

public class MainBox {
    public static void main(String[] args) {

        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();

        System.out.println("addFruit: ");
        orange.addFruit(new Orange(),1);
        orange1.addFruit(new Orange(),2);
        apple.addFruit(new Apple(),2);
        apple1.addFruit(new Apple(),1);
        System.out.println("Box 1: "+orange.getWeight());
        System.out.println("Box 2: "+orange1.getWeight());
        System.out.println("Box 3: "+apple.getWeight());
        System.out.println("Box 4: "+apple1.getWeight());
        System.out.println("=================== ");
        System.out.println("Box 1 equals box 3: "+orange.compare(apple));
        System.out.println("Box 2 equals box 4: "+orange1.compare(apple1));
        System.out.println("=================== ");
        orange.pour(orange1);
        apple.pour(apple1);
        System.out.println("========================");
        System.out.println("Box 1: "+orange.getWeight());
        System.out.println("Box 2: "+orange1.getWeight());
        System.out.println("Box 3: "+apple.getWeight());
        System.out.println("Box 4: "+apple1.getWeight());
    }
}