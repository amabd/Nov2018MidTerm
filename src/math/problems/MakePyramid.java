package math.problems;

public class MakePyramid {
        public static void printTriagle(int n)
        {

            int k = 2*n - 2;

            // outer loop to handle number of rows
            //  n in this case
            for (int i=0; i<n; i++)
            {
                // inner loop to handle number spaces
                for (int j=0; j<k; j++)
                {
                    // printing spaces
                    System.out.print(" ");
                }
                k = k - 1;
                //  inner loop to handle number of columns
                for (int j=0; j<=i; j++ )
                {
                    // printing stars
                    System.out.print("* ");
                }

                // ending line after each row
                System.out.println();
            }

        }


        public static void main(String[] args) {

            int n = 6;
            printTriagle(n);
        }

    }


    /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */




