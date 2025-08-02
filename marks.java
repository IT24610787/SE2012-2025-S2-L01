import java.util.Scanner;

public class marks{

    static Scanner sc = new Scanner(System.in);
    
    public static void getmarks(int[][] arr, int n){

        int std_id, sub_id, choice, mark, sum;
        double avg;

        for(int i=0; i<n; i++){
            do{
                System.out.print("\nEnter student id: ");
                std_id = sc.nextInt();
            }while(std_id<1 || std_id>n);

            for(int j=0; j<3; j++){
                do{
                    System.out.print("Enter subject id: ");
                    sub_id = sc.nextInt();
                }while(sub_id<1 || sub_id>3);
                
                do{
                    System.out.print("Enter the mark: ");
                    mark = sc.nextInt();
                    arr[sub_id-1][std_id-1] = mark;
                }while(mark<0 || mark>100);
            }       
        }
        
        do{
            System.out.println();
            System.out.println("1.Update student marks");
            System.out.println("2.Get average for a subject");
            System.out.println("3.Get average for a student");
            System.out.println("4.Get total mark of a student");
            System.out.println("5.Exit and display marks");
            System.out.println();

            System.out.print("What is your choice: ");
            choice = sc.nextInt();
        
            switch (choice) {
            case 1:
                do{
                    System.out.print("Enter student id: ");
                    std_id = sc.nextInt();
                }while(std_id<1 || std_id>n);

                do{
                    System.out.print("Enter subject id: ");
                    sub_id = sc.nextInt();
                }while(sub_id<1 || sub_id>3);
                        
                do{
                    System.out.print("Enter the new mark: ");
                    mark = sc.nextInt();
                    arr[sub_id-1][std_id-1] = mark;
                }while(mark<0 || mark>100);
                break;
            
            case 2:
                do{
                    System.out.print("Enter subject id: ");
                    sub_id = sc.nextInt();
                }while(sub_id<1 || sub_id>3);

                sum=0;
                for(int i=0; i<n; i++){
                    sum = sum + arr[sub_id-1][i];
                }
                avg = (double)sum/n;
                System.out.printf("Average of subject %d is %.2f\n\n", sub_id, avg);
                break;

            case 3:
                do{
                    System.out.print("Enter student id: ");
                    std_id = sc.nextInt();
                }while(std_id<1 || std_id>n);

                sum=0;
                for(int j=0; j<3; j++){
                    sum = sum + arr[j][std_id-1];
                }
                avg = (double)sum/3;
                System.out.printf("Average of student %d is %.2f\n\n", std_id, avg);
                break;

            case 4:
                do{
                    System.out.print("Enter student id: ");
                    std_id = sc.nextInt();
                }while(std_id<1 || std_id>n);

                sum=0;
                for(int j=0; j<3; j++){
                    sum = sum+ arr[j][std_id-1];
                }
                System.out.printf("Total marks of student %d is %d\n\n", std_id, sum);
                break;

            case 5:
                break;

            default:
                System.out.println("Invalid choice. Enter again!");
                break;
            }
        }while(choice!=5);
    }
    public static void main(String[] arg){
        
        System.out.print("Enter number of students in the class: ");
        int n = sc.nextInt();
        int[][] arr = new int[3][n];
        
        getmarks(arr, n);

        System.out.println();
        System.out.println("                  Subject 1   Subject 2   Subject 3\n");
        for(int k=0; k<n; k++){
            System.out.printf("Student %d marks: ", k+1);
            for(int l=0; l<3; l++){
                System.out.printf("    %d      ", arr[l][k]);
            }
            System.out.println();
        }
        sc.close();
    }
}