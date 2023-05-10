/*Operators and More:

1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.

2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.

3. Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.

4. Complete the previous exercise by creating objects to attach to the array of references.
*/
import java.util.*;

public class Java6_1 {
    public static void main(String[] args) {
        int count = 0;
        long num = 10;

        while (count < 100) {
            long num1 = num / 10;
            long num2 = num % 10;
            for (long i = 10; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    long j = num / i;
                    if ((j % 10 == 0 && num2 == 0) || (i % 10 == 0 && num2 == 0)) {
                        continue;
                    }
                    String s = Long.toString(i) + Long.toString(j);
                    char[] ch = s.toCharArray();
                    Arrays.sort(ch);
                    String s1 = Long.toString(num);
                    char[] ch1 = s1.toCharArray();
                    Arrays.sort(ch1);
                    if (Arrays.equals(ch, ch1)) {
                        System.out.println(num);
                        count++;
                        break;
                    }
                }
            }
            num++;
        }
    }
}
/*
C:\Zemoso Work\Java assignments>javac Java6_1.java

C:\Zemoso Work\Java assignments>java Java6_1
1395
1435
1827
2187
10251
10426
10521
10575
11844
12546
12964
13243
14035
15624
17325
17437
18225
18265
19026
19215
21586
25375
25474
28476
29632
33655
33696
36855
37845
41665
42898
45684
45760
45864
47538
48672
49855
53865
56875
62968
63895
67392
67950
101299
102051
102541
102942
103968
104026
105021
105075
105264
105723
107163
107329
108135
108216
108864
110758
112468
114268
115672
115699
116478
116725
116928
117067
118575
121576
121815
122746
122764
123354
123538
124483
124488
124542
124978
125248
125433
125460
126027
126846
127417
129514
129775
131242
132615
133245
134275
134725
135828
135837
136525
136948
139824
140035
141345
145273
145314
*/
