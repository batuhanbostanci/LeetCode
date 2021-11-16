
public class Palindrome {
    public static boolean palindrome(int x){
        int temp_x=x;
        int temp =0;
        while(temp_x>0){
            temp = temp*10 + temp_x%10;
            temp_x= temp_x/10;
        }
        if(x == temp)
            return true;
        else
            return false;
    }
    public static void main(String []args){
        System.out.println(palindrome(121));
    }
}
