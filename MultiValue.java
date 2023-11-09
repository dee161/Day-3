// import java.util.*;

// class MultiValue {
//     int add;
//     double div;
//     int multi;
//     int sub;
//     String sname;

//     MultiValue(int a, double d, int m, int s, String name) {
//         add = a;
//         div = d;
//         multi = m;
//         sub = s;
//         sname = name;
//     }
// }

// class MultiValuetest {
//     static MultiValue getvalue(int a, int b, String name) {
//         return new MultiValue(a + b, (double) a / b, a * b, a - b, name);
//     }

//     public static void main(String[] args) {
//         int a;
//         int b;
//         String name;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the values:");
//         a = sc.nextInt();
//         b = sc.nextInt();
//         System.out.println("Enter the name:");
//         name = sc.next();
//         MultiValue m = getvalue(a, b, name);
//         System.out.println("Add is " + m.add);
//         System.out.println("Div is " + m.div);
//         System.out.println("Multi is " + m.multi);
//         System.out.println("Sub is " + m.sub);
//         System.out.println("Name is " + m.sname);
//         sc.close();
//     }
// }

import java.util.*;

class Demo {
    int add;
    double div;
    int multi;
    int sub;
    String name;
    int stringLength;

    public Demo(int a, double d, int m, int s, String sname, String inputString) {
        add = a;
        div = d;
        multi = m;
        sub = s;  
        name = sname;
        stringLength = inputString.length();
    }
}

class MultiValueTest {
    static Demo getValue(int a, int b, String inputString) {
        return new Demo(a + b, (double) a / b, a * b, a - b, "Demo", inputString);
    }

    public static void main(String[] args) {
        int a;
        int b;
        String inputString;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer value for 'a':");
        a = sc.nextInt();

        System.out.println("Enter an integer value for 'b':");
        b = sc.nextInt();

        sc.nextLine(); // Consume the newline character

        System.out.println("Enter a string:");
        inputString = sc.nextLine();

        Demo m = getValue(a, b, inputString);

        System.out.println("Add is " + m.add);
        System.out.println("Div is " + m.div);
        System.out.println("Multi is " + m.multi);
        System.out.println("Sub is " + m.sub);
        System.out.println("String Length is " + m.stringLength);
    }
}
