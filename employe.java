import java.util.*;
import java.lang.*;
public class employe {
    public static void main(String[] args) {
        int n, key,i,flag = 0;
        int[] age = new int[50];
        int[] empID = new int[50];
        int[] salary = new int [50];
        String[] name = new String[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employes");
        n = sc.nextInt();
        System.out.println("enter the employee details one by one");
        for(i=0;i<n;i++){
            System.out.println("enter the name:");
            name[i]=sc.next();
            System.out.println("enter the age:");
            age[i]=sc.nextInt();
            System.out.println("enter the employee id:");
            empID[i]=sc.nextInt();
            System.out.println("enter the salary:");
            salary[i]=sc.nextInt();
        }
        System.out.println("employee information");
        System.out.println("********************************");
        do{
            System.out.println("enter the valid employee id or 9 to exit");
            key=sc.nextInt();
            if(key==9)
            break;
            else{
                for(i=0;i<n;i++){
                    if(key==empID[i]){
                        System.out.println("employee name is :"+name[i]);
                        System.out.println("the employee age is:"+age[i]);
                        System.out.println("the employee empid is:"+empID[i]);
                        System.out.println("the employee salary is:"+salary[i]);
                    }
                }
            }
        }while(true);
    }
}
