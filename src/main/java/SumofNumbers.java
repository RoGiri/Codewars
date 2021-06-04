
public class SumofNumbers {
    public int GetSum(int a, int b) {
        int sum = 0; // initialize sum
        if (a == b ) { // see if a and b are same
            return a; // if so return a
        }
        else if ( a < b ){ // if a is bigger than b
            for (int i = a; i <= b; i++) // loop where a is the initial start variable
            {
                sum+=i; // sum the numbers 

            }
            return sum ; // return the sum
        }
        else {
            for (int i = b; i <= a; i++){ // loop where b is bigger then a
                sum+= i ; // sum teh numbers

            }

        }

        return sum;
    }
}
