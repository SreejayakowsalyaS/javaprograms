import java.util.Scanner;
class PalindromeorNot{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);

System.out.println("enter a integer:");
int N=scan.nextInt();
int temp=N;
int rev=0;

while(temp!=0){
rev=rev*10+temp%10;
temp=temp/10;

}
System.out.println("result:"+rev);
}
}
