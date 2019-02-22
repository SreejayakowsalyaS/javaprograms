import java.util.Scanner;
class MaxnoArray{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter the values:");
int N=scan.nextInt();
int[] arr=new int[N];
for(int i=0;i<N;i++){
int temp=scan.nextInt();
arr[i]=temp;
}
int max=arr[0];
for(int i=1;i<N;i++){
if(max<arr[i])
max=arr[i];
}
System.out.println(max);
}
}

