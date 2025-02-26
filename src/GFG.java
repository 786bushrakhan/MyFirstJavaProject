public class GFG {
    public static double PI = 3.14;
    private int radius;
    public GFG(int radius){
        this.radius = radius;

    }
    public double calculateArea(){
        return PI * radius * radius;
    }
    public static void main (String [] args){
        GFG obj = new GFG(5);
        System.out.println(obj.calculateArea());
    }
}
