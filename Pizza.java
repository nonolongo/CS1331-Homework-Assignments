//I worked on the homework assignment alone, using only course materials
public class Pizza {
    private int numSlices;
    private String[] toppings;
    private boolean hasCheese, isGlutenFree;

    public Pizza() {
        this(8, true, false, new String[0]);
    }

    public Pizza(int s, boolean c, boolean g, String[] t) {
        numSlices = s;
        toppings = t;
        hasCheese = c;
        isGlutenFree = g;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] t) {
        toppings = t;
    }

    public int getNumSlices() {
        return numSlices;
    }

    public void setNumSlices(int s) {
        numSlices = s;
    }

    public void setHasCheese(boolean c) {
        hasCheese = c;
    }

    public void setIsGlutenFree(boolean g) {
        isGlutenFree = g;
    }

    public void printToppings() {
        System.out.println("Pizza Toppings:");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println("{" + toppings[i] + "}");
        }
    }

    public void changeFirstTopping(String s1) {
        if (toppings.length > 0) {
            toppings[0] = s1;
        }
    }
}
