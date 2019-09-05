package Java;

public class DivideTwoIntegers {

    public static void main(String [] args) {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        int a = 10;
        System.out.println(divideTwoIntegers.divide(100, 3));
    }
    public int divide(int dividend, int divisor) {
        final int MAX = Integer.MAX_VALUE;
        final int MIN = Integer.MIN_VALUE;
        //================= Base cases : Start ==============

        //Divisor can't be 0
        if (divisor == 0) return MAX;

        if (divisor == 1 || dividend == 0) return dividend;


        if (divisor == MIN) {
            /**
             * case 5:
             * dividend = int min
             * divisor = int min
             * return 1
             */
            if (dividend == MIN)
                return 1;
            else
            /**
             * case 3:
             * dividend  = Int_max {2,147,483,647}
             * divisor    = Int_min {-2147483648}
             * output is 0 since abs(int_min) > abs(int_max)
             */
                return 0;
        }


        if (dividend == MAX) {

            /**case 1
             * dividend = Int_max {2,147,483,647}
             * divisor  = -1
             * then our output should be Integer min
             */
            if (divisor == -1)
                return -dividend;


            /**
             * case 4
             * dividend = int_max
             * divisor = int_max
             * return 1
             */
            if (divisor == MAX)
                return 1;

        }

        if (dividend == MIN) {
            /**
             * case 2:
             * dividend = Int_min {-2147483648}
             * divisor = -1
             * then out output should be Integer Max ; 2147483648 is overflow to positive side
             */
            if (divisor == -1)
                return MAX;


            /**
             * case 6:
             * dividend = int min
             * divisor = int max
             * output is -1 since abs(int_min) > abs(int_max)
             */
            if (divisor == MAX)
                return -1;

            return (((divisor & 1) == 1)
                    ? divide(dividend + 1, divisor) //divisor is odd
                    : divide(dividend >> 1, divisor >> 1)); //divisor is even; then make 1 division


        }

        //================= Base cases : End ==============

        //================= Algo : Start ==============


        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;
        int quotient = 0;
        int divid = Math.abs(dividend);
        int divis = Math.abs(divisor);
        while (divid >= divis) {
            int temp = divis, multiple = 1;
            while ((temp << 1) >= 0 && (divid >= (temp << 1))) {
                temp <<= 1;
                multiple <<= 1;
                System.out.println(temp);
                System.out.println(multiple);
            }
            System.out.println("-----------------------");
            divid -= temp;
            quotient += multiple;
        }
        return sign > 0 ? quotient : -quotient;

    }
}
