public class Methods {


    boolean isEven(int a) {
        boolean sum = (a % 2) == 0;
        System.out.println (sum);
        return sum;
    }

    boolean isOdd(int b) {
        boolean isOdd1 = (b % 2) != 0;
        System.out.println (isOdd1);
        return isOdd1;
    }

    double circleField(double c) {
        double area = Math.pow (c,2) * 3.14;
        System.out.println (area);
        return area;
    }

    int power(int d){
        int sum1 = (int) Math.pow (3,2);
        System.out.println (sum1);
        return sum1;
    }

}

