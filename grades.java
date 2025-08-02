import java.util.Scanner;

public class grades {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students in the class: ");
        int n = sc.nextInt();
        int[][] arr = new int[3][n];
        
        marks.getmarks(arr, n);

        System.out.println();
        System.out.println("                  Subject 1   Subject 2   Subject 3\n");
        for(int k=0; k<n; k++){        
            System.out.printf("Student %d marks: ", k+1);
            for(int l=0; l<3; l++){
                if(arr[l][k] >= 90) System.out.print("     A      ");
                else if(arr[l][k] >= 80 && arr[l][k] <=89) System.out.print("     B      ");
                else if(arr[l][k] >= 70 && arr[l][k] <=79) System.out.print("     C      ");
                else if(arr[l][k] >= 60 && arr[l][k] <=69) System.out.print("     D      ");
                else if(arr[l][k] <=59) System.out.print("     Fail   ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
