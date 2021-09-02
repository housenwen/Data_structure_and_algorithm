package com.cha;

public class Main {
    /**
     * 斐波那契数 0 1 1 2 3 5 8 13 ...
     * @param args
     */

    public static void main(String[] args) {
//        System.out.println(fib(0));
//        System.out.println(fib(1));
//        System.out.println(fib(2));
//        System.out.println(fib(3));
//        System.out.println(fib(4));
//        System.out.println(fib(5));
//        System.out.println(fib(6));
//        System.out.println(fib2(68));


//        check(40);
//        check2(40);

        TimeTool.check("fib",()-> System.out.println(fib(40)));
        TimeTool.check("fib2",()-> System.out.println(fib2(40)));

        TimeTool.check("fib3", new TimeTool.Task() {
            @Override
            public void execute() {
                System.out.println(fib(40));
            }
        });

    }

    public static void check(int n){
        long start = System.currentTimeMillis();
        System.out.println(fib(n));
        long end = System.currentTimeMillis();
        double delta = (end-start)/1000.0;
        System.out.println("耗时："+delta+"秒");
    }
    public static void check2(int n){
        long start = System.currentTimeMillis();
        System.out.println(fib2(n));
        long end = System.currentTimeMillis();
        double delta = (end-start)/1000.0;
        System.out.println("耗时："+delta+"秒");
    }

    public static int fib(int n){
        if (n<=1) return n;
        return fib(n-1)+fib(n-2);
    }

    public static int fib2(int n){
        if (n <= 1) return n;

        int first = 0;
        int second = 1;
        for (int i = 0; i < n-1  ; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}
