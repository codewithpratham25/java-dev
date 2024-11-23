class Calculator {
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
}
public class hello {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r  = obj.add(4, 5);
        System.out.println(r);
    }
}