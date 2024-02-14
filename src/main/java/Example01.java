public class Example01 {
    public static void main(String[] args) {
        decrementa(1);

        int x=73,y=0;
        int result = x/y;
        System.out.println("Result: " + result);
    }

    public static int decrementa(int num) {
        if(num==0)
            return 0;
        return decrementa(num);
    }

}
