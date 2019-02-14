import java.util.Scanner;
class SumKinteger{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);

int N=scan.nextInt();
int K=scan.nextInt();
int[] arr=new int[N];

for(int i=0;i<N;i++){
int temp=scan.nextInt();
arr[i]=temp;
}

System.out.println("output");


for(int k=0;k<N;k++)
System.out.println(arr[k]);

}
}
