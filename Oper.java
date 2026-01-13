public class Oper{
    public static void main(String[] args){
        String username="admin";
        String password="1234";

        if(username.equals("admin")&&password.equals("password")){
            System.out.println("Login successfully");
        }
        else{
            System.out.println("Invalid username and password");
        }
    }
}
