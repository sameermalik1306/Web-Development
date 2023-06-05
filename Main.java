import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello");
//        int age=37;
//        String name="Sandeep";
//        float weight=80.5f;
//        double weight1=70.5;
//        System.out.println(age);
//        System.out.println(name);
//        System.out.println(weight);
//        System.out.println(weight1);
//
//        Boolean invalid=true;
//        byte marks=90;
//        float pi=3.14f;
//        float div=15.0f/4.0f;
//        long views=10000000000l;
//        char gender='M';
//        System.out.println(invalid);
//        System.out.println(marks);
//        System.out.println(pi);
//        System.out.println(div);
//        System.out.println(views);
//        System.out.println(gender);

//        Swap Two Numbers
//        int a=10;
//        int b=20;
//        System.out.println("Value of a before swap");
//        System.out.println(a);
//        System.out.println("Value of b before swap");
//        System.out.println(b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("Value of a after swap");
//        System.out.println(a);
//        System.out.println("Value of b after swap");
//        System.out.println(b);

//        int a=10;
//        int b=20;
//        int temp;
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a);
//        System.out.println(b);
//          double d =66.4;
//          int i=(int)d;
//          char c=(char)i;
//          System.out.println(i);
//          System.out.println(c);

//        System.out.println("Enter a String");
//        Scanner br=new Scanner(System.in);
//        String s=br.nextLine();
//        System.out.println(s);
//        System.out.println("Enter a integer");
//        int a=br.nextInt();
//        System.out.println("You have entered "+a);
//
//        int x=10,y=20;
//        char z='G';
//        String str="GFG";
//        System.out.println(x);
//        System.out.println(x+y);
//        System.out.println(x+""+y);
//        System.out.println(str+"");
//        System.out.println("Courses");

//        int x=100,y=200;
//        System.out.format("Value of x is %d\n",x);

//        System.out.println("Welcome to \"Geeksforgeeks\"");
//        System.out.println("Hi \nWelcome to the Course");
//        System.out.println("Hi \n Welcome to the Course");
//        int x=10,y=20;
//        System.out.println(x+y);
//        System.out.println(x-y);
//        System.out.println(x*y);
//        System.out.println(x/y);
//        int z=(x+y*10);
//        System.out.println(z);
//        z=x++;
//        System.out.println(z+""+x);
//        z=++x;
//        System.out.println(z+""+x);
//        Example of logical operators
//        boolean x=true,y=false;
//        System.out.println(x&&y);
//        System.out.println(x||y);
//        System.out.println(!y);

//        Example of Relational Operators
//        int x=10,y=20;
//        System.out.println(x==y);
//        System.out.println(x!=y);
//        System.out.println(x<y);
//        System.out.println(x>y);
//        System.out.println(x>=y);
//        System.out.println(x<=y);

//          int x=3,y=6;
//          System.out.println(x&y);
//          System.out.println(x|y);

//        int a=2,d=1;
//        System.out.println("Enter the nth term");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int ap=a+((n-1)*d);
//        System.out.println(ap);

//        Finding the nth term of ap
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the First Term");
//        int a=sc.nextInt();
//        System.out.println("Enter the Difference");
//        int d=sc.nextInt();
//        System.out.println("Enter the nth term");
//        int n=sc.nextInt();
//        int ap=a+(n-1)*d;
//        System.out.println(ap);

//        Nth term of the GP
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the First Term");
//        int a=sc.nextInt();
//        System.out.println("Ratio");
//        int r=sc.nextInt();
//        System.out.println("Nth term");
//        int n=sc.nextInt();
//        int gp=a*(int)(Math.pow(r,n-1));
//        System.out.println(gp);


//          Scanner sc=new Scanner(System.in);
//          System.out.println("Enter the nth term");
//          int n=sc.nextInt();
//          int sum=(n*(n+1))/2;
//          System.out.println(sum);


//        int a=8,b=7;
//        if(a>b)
//            System.out.println("A is greater");
//        else
//            System.out.println("B is greater");

//        int a=8,b=7;
//        if(a>b) {
//            System.out.println("A is greater");
//        }
//        else {
//            System.out.println("B is greater");
//        }


//        System.out.println("Enter a Character");
//        Scanner sc=new Scanner(System.in);
//        char v=sc.next().charAt(0);
//        switch(v){
//            case'a':
//                System.out.println("Vowel");
//                break;
//            case 'e':
//                System.out.println("Vowel");
//                break;
//            case'i':
//                System.out.println("Vowel");
//                break;
//            case 'o':
//                System.out.println("Vowel");
//                break;
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Consonant");
//        }
//        int a=5,b=2,c=3;
//        if(a>b && a>c)
//            System.out.println("A is greater");
//        else if(b>a &&b>c)
//            System.out.println("b is greater");
//        else
//             System.out.println("C is greater");
//


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of A");
//        int a=sc.nextInt();
//
//        System.out.println("Enter the value of B");
//        int b=sc.nextInt();
//
//        System.out.println("Enter the value of C");
//        int c=sc.nextInt();
//
//        if(a>b && a>c)
//            System.out.println("A is greater");
//        else if(b>a &&b>c)
//            System.out.println("b is greater");
//        else
//             System.out.println("C is greater");

//        Program to find leaper and non leaper
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Year");
//        int n=sc.nextInt();
//        if((n%4==0 && n%100!=0) || (n%400==0))
//            System.out.println("Leaper");
//        else
//            System.out.println("Non Leaper");

//        for(int i=1;i<5;i++)
//            System.out.println("Hello "+i);

//        int i=0;
//        while(i<5){
//            System.out.println("Hello "+i);
//            i++;

//            int i=0;
//            while(i<5) {
//                System.out.println("Hello " + i);
//                i = i + 2;
//            }

//        int i=0;
//        do{
//            System.out.println("Hello "+i);
//            i++;
//        }while(i<5);

//        int i=20;
//        do{
//            System.out.println("Hello "+i);
//            i++;
//        }while(i<5);


//        for(int i=0;i<5;i++){
//            if(i==3)
//                continue;
//            System.out.println(i);
//        }

//        for(int i=0;i<5;i++){
//            if(i==1 || i==2)
//                continue;
//            System.out.println(i);
//        }

//        for(int i=0;i<5;i++){
//            if(i==3)
//                break;
//            System.out.println(i);
//        }

//        int i=0;
//        while(i<5){
//            i++;
//            if(i==2)
//               continue;
//            System.out.println(i);
//    }

//Scanner sc=new Scanner(System.in);
//for (int i=0;i<5;i++){
//    System.out.println("Enter the value of X");
//    int x=sc.nextInt();
//    System.out.println("Enter the value of Y");
//    int y=sc.nextInt();
//    if(y==0)
//        continue;
//    System.out.println(x/y);
//}
//Scanner sc =new Scanner(System.in);
//System.out.println("Enter the Number");
//int n=sc.nextInt();
//int count=0;
//while(n>0){
//    n=n/10;
//    count=count+1;
//}
//System.out.println(count);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n=sc.nextInt();
//        for(int i=1;i<=10;i++)
//            System.out.println(n*i);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n = sc.nextInt();
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(n * i);
//            i++;
//        }
//int i=1;
//while(i<=5){
//    System.out.print("*");
//    i++;
//}
//        int j=1;
//        while(j<=5){
//            System.out.println("*");
//            j++;
//        }

//       for(int i=1;i<=5;i++) {
//           for (int j = 1; j <= 6; j++) {
//               System.out.print("*");
//           }
//           System.out.println();
//       }


//        int []a={10,20,30,40};
//        System.out.println(a.length);
//        System.out.println(a[1]);
//        a[2]=50;
//        System.out.println(a[2]);

//        int []a=new int[3];
//        a[0]=10;
//        a[1]=20;
//        a[2]=30;
//        System.out.println(a[2]);

//        int []a=new int[7];
//        int x=10;
//        for(int i=0;i<a.length;i++){
//            a[i]=x;
//            x=x+10;
//        }
//        System.out.println(a[5]);

//        int []a={1,2,3,4,5,6,7,8,9,10};
//        for(int i=0;i<a.length;i++)
//            System.out.println(a[i]);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of Array ");
//        int n=sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i <n; i++) {
//            System.out.println("Enter the value at index " + i);
//            a[i] = sc.nextInt();
//            System.out.println("");
//        }
//        for(int i=0;i<n;i++)
//            System.out.println(a[i]);

//        int[] a = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum = sum + a[i];
//        }
//        System.out.println("The Sum of array "+sum);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Sie of an array");
//        int n=sc.nextInt();
//        int []a=new int [n];
//        for(int i=0;i<n;i++) {
//            System.out.println("Enter the " + i + " element of an array");
//            a[i]=sc.nextInt();
//        }
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum=sum+a[i];
//        }
//        System.out.println("Sum of the Array is "+sum);

//        Scanner sc=new Scanner(System.in);
//
//        int []a={1,2,3,4,5};
//        int sum=0;
//        for(int i=0;i<a.length;i++) {
//            sum = sum + a[i];
//        }
//        System.out.println("AVG of Array is "+(sum/a.length));

//        int[] a = {10, 20, 30, 40, 10, 20};
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            count = count + 1;
//        }
//        System.out.println(count);

//     int []a={10,20,30,40,50};
//     Scanner sc=new Scanner(System.in);
//           System.out.println("Enter the Size of an array");
//           int n=sc.nextInt();
//           System.out.println("Enter Element");
//           int p=sc.nextInt();
//           for(int i=0;i<n;i++) {
//               if (p == a[i])
//                   System.out.println("Present at index "+i);
//           }

//         Scanner sc=new Scanner(System.in);
//         int [][]a=new int[2][3];
//         for(int i=0;i<2;i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.println("Enter the element at "+i+"row and "+j+"Column");
//                 a[i][j] = sc.nextInt();
//             }
//         }
//        for(int i=0;i<2;i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Element at "+i+"Row and "+j+"Column is "+a[i][j]);
//            }
//        }


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Rows");
//        int rows=sc.nextInt();
//        System.out.println("Enter Columns");
//        int columns=sc.nextInt();
//        int [][]a=new int[rows][columns];
//        for(int i=0;i<rows;i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.println("Enter the element at "+i+"row and "+j+"Column");
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<rows;i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.println("Element at "+i+"Row and "+j+"Column is "+a[i][j]);
//            }
//        }


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Rows");
//        int rows=sc.nextInt();
//        System.out.println("Enter Columns");
//        int columns=sc.nextInt();
//        int [][]a=new int[rows][columns];
//        for(int i=0;i<rows;i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.println("Enter the element at "+i+"row and "+j+"Column");
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<rows;i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.println(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("Enter the Number to Search");
//        int x=sc.nextInt();
//        for(int  i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                if(a[i][j]==x){
//                    System.out.println("Found at index "+a[i][j]);
//                }
//            }
//        }
//00,01,02,03
//10,11,12,13
//20,21,22,23


//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the Name");
//String name=sc.nextLine();
//System.out.println("Your name is : "+name);

//String firstName="Tony";
//String lastName="Stark";
//String fullName=firstName+" "+lastName;
//System.out.println(fullName);
//        System.out.println(fullName.length());
//        System.out.println(fullName.charAt(3));
//

//        String name1="Tony";
//        String name2="Tony";
//        if(name1.compareTo(name2)==0){
//         System.out.println("Equals");
//        }
//        else
//            System.out.println("Not Equal");

//        String sentence="My name is Tony";
//        System.out.println(sentence.substring(3 ));
//        System.out.println(sentence.length());
//        System.out.println(sentence.substring(0,4));
//        String name=sentence.substring(11,sentence.length());
//        System.out.println(name);
//
//   int a=10;
//   int b=0;
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);

//        Bubble Sort
//        int arr[] = {7, 8, 3, 1, 2};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}