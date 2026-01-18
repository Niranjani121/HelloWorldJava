public class ReferenceExam{
    public static void ChangeValue(int[] arr){
        arr[0]=100;
    }

    public static void main(String[] args) {
        int[] numbers={10,20,30};
        System.out.println("Before method :"+numbers[0]);
        ChangeValue(numbers); //Pass by Reference
        System.out.println("After method :"+numbers[0]);
    }
}