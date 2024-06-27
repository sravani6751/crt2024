import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int[] a=new int[n1];
        for (int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }

        int n2= sc.nextInt();
        int[] b=new int[n2];
        
for (int j=0;j<n2;j++){
            b[j]=sc.nextInt();
        }
        int[] res = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                res[k]=a[i];
                i++;
            }
            else{
                res[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            res[k]=a[i];
            i++;
            k++;
        }
        while(j<n2){
            res[k]=b[j];
            j++;
            k++;
        }
        for(int l=0;l<n1+n2;l++ ){
            System.out.print(res[l]+" ");
        }
    }
}
