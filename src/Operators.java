public class Operators {
        public static void main(String[] xy)
        {
            int a=30;
            System.out.println(a++);
            System.out.println(++a);
            System.out.println(a--);
            System.out.println(--a);
            System.out.println(~a);

            int x=10,y=20,z=30,r=40;
            float sum;
            sum=(r%y)*(y/10);
            System.out.println(x+y+z);
            System.out.println(x*r);
            System.out.println(r/y);
            System.out.println(r%y);
            System.out.println("oauo"+sum);
            // Shift operator
            System.out.println(x<<2);
            System.out.println(x<<3);
            System.out.println(x>>2);

            // logical operators
             System.out.println(x>y||y<z);
            System.out.println(x>y&&y<z);
            System.out.println(x>y&y<z);
            System.out.println(x>y|y<z);



            if(x<y&&y>z)
            {
                System.out.println("kjskjsj");
            }
            else {
                System.out.println("yoyoyo");
            }
            //Ternary Operator
            System.out.println(x>y?"y is min ":"x is min");


    main("");
    main("");
        }

        public static void main(String a)
        {
            int b=12;
            System.out.println("The output is "+b);

        }
    }
