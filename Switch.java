public class Switch{
    public static void main(String[] args){
        int button=1;
        switch(button){
            case 1:
                System.out.println("Fan On");
                break;
                case 2:
                    System.out.println("Fan Off");
                    break;
                    default :
                    System.out.println("Wrong button");
        }
    }
}