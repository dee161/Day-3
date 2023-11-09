// class demo {
//     // int z;

//     static int getValue(int x, int y) {
//         // z = x + y;
//         return (x + y);
//     }

//     public static void main(String[] args) {
//         int a = getValue(10, 20);
//         System.out.println("the value is " + a);
//     }
// }

// import java.util.Scanner;

// class demo{
//     static int[] getValue(int a,int b){
//         int[] arr = new int[2];
//         arr[0]=a+b;
//         arr[1]=a-b;
//         // System.out.println("the value is " + arr[0] + " " + arr[1]);
//         return arr;
//     }
//     public static void main(String[] args) {
//          int a,b;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a and b");
//         a=sc.nextInt();
//         b=sc.nextInt();

//       int[] p =  getValue(a,b);
//         System.out.println("the Arry is "+ " "+p[0]+" "+p[1]);
//     //   System.out.println("the Arry is"+p);

//     }
// }

// import java.util.Scanner;
// import javafx.util.Pair;

// class demo {
//     static Pair getValue(int i, String s) {
//         return new Pair<Integer, String>(i, s);
//         // System.out.println("the value is "+i+" "+s);
//         // System.out.println("hello");
//     }

//     public static void main(String[] args) {
//         int a;
//         String s;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a and b");
//         a = sc.nextInt();
//         s = sc.nextLine();
//         Pair<Integer, String> p = getValue(a, s);
//         System.out.println("the value is " + p.getKey() + " " + p.getValue());
//     }

// }

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// class Demo {
//     static List<Object> getValue() {
//         int id;
//         String name;
//         int salary;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of id and name and salary");
//         id = sc.nextInt();
//         sc.nextLine(); // Consume the newline character
//         name = sc.nextLine();
//         salary = sc.nextInt();

//         List<Object> values = new ArrayList<>();
//         values.add(id);
//         values.add(name);
//         values.add(salary);

//         return values;
//     }

//     public static void main(String[] args) {
//         List<Object> l = getValue();
//         System.out.println("id: " + l.get(0));
//         System.out.println("name: " + l.get(1));
//         System.out.println("salary: " + l.get(2));
//     }
// }

import java.util.*;

class demo {
    int add;
    double div;
    int multi;
    int sub;
    String name;

    demo(int a, double d, int m, int s,String sname) {
        add = a;
        div = d;
        multi = m;
        sub = s;
        name = sname;
    }
}

class MultiValuetest {
    static demo getvalue(int a, int b) {
        return new demo(a + b, (double) a / b, a * b, a - b,"dmdemo");
    }

    public static void main(String[] args) {
        int a;
        int b;                                      
        // int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        a = sc.nextInt();
        b = sc.nextInt();
        demo m = getvalue(a, b);
        System.out.println("Add is " + m.add);
        System.out.println("Div is " + m.div);
        System.out.println("Multi is " + m.multi);
        System.out.println("Sub is " + m.sub);
    }

}
