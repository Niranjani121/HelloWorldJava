public class Vararg{
    public static void add(int...numbers){
        int sum=0;

        for(int num:numbers){
            sum=sum+num;
        }

        System.out.println("Sum :"+sum);
    }

    public static void main(String[] args) {
        add(10);
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
    }
}