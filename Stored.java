package janani;
import java.util.Scanner;
public class Stored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp=0,i,j,n=4;
/*System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
int []a=new int[n];*/
int a[]={9,7,5,4};
for(i=0;i<n;i++){
	//a[i]=ja.nextInt();

for(j=i+1;j<n;j++){
	if(a[i]>a[j]){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}

System.out.print(a[i]+" ");
	}

}
}
