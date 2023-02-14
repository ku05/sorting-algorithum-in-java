import java.util.*;
class bubble{
    public static void main(String args[]){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the array:");
        int a[]=new int[5];
        for(int i=0;i<5;i++){
                a[i]=SC.nextInt();
            }
        for(int j=0;j<4;j++){
            for(int i=j+1;i<5;i++){
                if(a[j]>a[i]){
                  int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("After sorting the array:");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}