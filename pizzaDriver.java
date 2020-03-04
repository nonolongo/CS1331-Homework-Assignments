
public class pizzaDriver {

    public static void main(String[] args) {
        Pizza p1 = new Pizza(12, true, true, new String[] { "Sausage","Chicken","Pineapple" });
        System.out.println(p1.getToppings());
        System.out.println(p1.getNumSlices());
        p1.changeFirstTopping("mushroom");
        p1.printToppings();
        System.out.println(p1);
    }

}
