import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose The Day : ");
        int a = 0;
        ;
        a = in.nextInt();
        switch (a - 1) {
            case 0:
                System.out.println("Sat");
                int i;
                int j;
                for ( i =1;i<=5;i++) {
                    if (i==3) {
                        System.out.println();
                        continue;
                    }
                    for (j=1;j<=5-i;j++){
                        System.out.print(" ");
                    }
                    for ( j = 1; j <= (i); j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 1:
            case 2:
                System.out.println("Sun & Mon");
                int sum=0;
                System.out.println("Enter The size of array : ");
                int x=in.nextInt();
                int[] arr1 =new int[x];
                System.out.println("Enter The Element Of Array : ");
                for (int n =0;n<x;n++){
                    arr1[n]=in.nextInt();
                    sum+=arr1[n];
                }
                int average=sum/x;
                System.out.println("the average of element of array is : "+" "+average);
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                System.out.println("Please Enter The Size Of Array : ");
                int r =in.nextInt();
                int c=in.nextInt();
                System.out.println("Enter The Element Of The Array : ");
                int [][] arr2=new int[r][c];
                for (int ro=0;ro<r;ro++){
                    for (int co=0;co<c;co++){
                        arr2[ro][co]= in.nextInt();
                    }
                }
                System.out.println("The Array is : ");
                for (x=0;x<r;x++){
                    if (r==2){
                        System.out.println();
                    }
                    for(int y=0;y<c;y++){
                        System.out.print("["+arr2[x][y]+"]");
                        System.out.print("     ");
                    }
                }
                break;
            case 5:
                System.out.println("Thu");
                int []arr3=new int[]{1,2,3,4};
                Add(arr3);
                break;
            case 6:
                System.out.println("Fri");
                Friday(3);
                System.out.println();
                Friday(3.125F);
                Friday("Gamal");
                break;
            default:
                System.out.println("Enter a valid Day");
                break;
        }
    }
    public static void Add (int arr[]){
        for (int n=0;n< arr.length;n++){
            arr[n]=arr[n]+5;
        }
        System.out.println("After added num to array THe new array is : ");
        for (int f=0;f< arr.length;f++){
            System.out.print("["+arr[f]+"]");
            System.out.print(" ");
        }
    }
    public static int Friday(int n){
        String oop="OOP";
        for (int i=1;i<=n;i++){
            System.out.print(oop+" ");
        }
        return n;
    }
    public static float Friday(float n){
        System.out.println((n*3));
        return n;
    }
    public static String Friday(String name){
        System.out.println("Hello"+name);
        return name;
    }
}