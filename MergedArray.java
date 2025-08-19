import java.util.Scanner; 
public class MergedArray {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of first array:  ");
        int s1 = scan.nextInt();
        int[] array1= new int[s1];
        for(int i=0;i<s1;i++){
            array1[i]= scan.nextInt();
        }
        
        System.out.print("Enter the size of second array:  ");
        int s2 = scan.nextInt();
        int[] array2= new int[s2];
        for(int i=0;i<s2;i++){
            array2[i]= scan.nextInt();
        }
        int[] merged = new int[s1+s2];
        for(int i=0;i<s1;i++){
            merged[i]=array1[i];
        }
        for(int i=0;i<s2;i++){
            merged[s1+i]=array2[i];
        }
        System.out.println("The merged array: ");
        for(int i=0;i<s1+s2;i++){
            System.out.print(merged[i] + "  ");
        }
        scan.close();
    }
}