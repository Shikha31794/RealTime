public class Mentor {

    void openBrowser(){
        System.out.println("Chrome Opened");
    }
    void loginUser(String username){
        System.out.println("User Logged In:" +username );
    }

    void addNumbers(int a,int b){
        int sum=a+b;
        System.out.println("Sum is:" +sum);
    }


    void isStatusCodeValid(int code){
        if(code==200){
            System.out.println("Status is True");
        } else {
            System.out.println("Status is False");
        }

    }

    public static void main(String[] args){
         Mentor mentor= new Mentor();
         mentor.openBrowser();
         mentor.loginUser("admin");
        mentor.addNumbers(15,15);
        mentor.isStatusCodeValid(200);
        mentor.isStatusCodeValid(100);

    }



    void loginuser(String username){
        System.out.println("User Logged In:" +username );
    }




}
