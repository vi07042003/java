import java.util.*;
import java.lang.*;
public class student {
    public static void main(String[] args) {
        int n, key,i,flag = 0;
        int[] age = new int[50];
        int[] div = new int[50];
        int[] enrllno = new int [50];
        String[] name = new String[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students");
        n = sc.nextInt();
        System.out.println("enter the students details one by one");
        for(i=0;i<n;i++){
            System.out.println("enter the name:");
            name[i]=sc.next();
            System.out.println("enter the age:");
            age[i]=sc.nextInt();
            System.out.println("enter the div:");
            div[i]=sc.nextInt();
            System.out.println("enter the enrllno:");
            enrllno[i]=sc.nextInt();
        }
        System.out.println("student information");
        System.out.println("********************************");
        do{
            System.out.println("enter the valid enrllno or 9 to exit");
            key=sc.nextInt();
            if(key==9)
            break;
            else{
                for(i=0;i<n;i++){
                    if(key==enrllno[i]){
                        System.out.println("the student name is :"+name[i]);
                        System.out.println("the student age is:"+age[i]);
                        System.out.println("the student div is:"+div[i]);
                        System.out.println("the student enrllno is:"+enrllno[i]);
                    }
                }
            }
        }while(true);
    }
}


