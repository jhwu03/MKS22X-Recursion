public class recursion{
  /*You may write additional private methods */

   /*Recursively find the sqrt using Newton's approximation
    *tolerance is the allowed percent error the squared answer is away from n.
    *precondition: n is non-negative

   */
   public static double sqrt(double n, double tolerance){
    return sqrtH(n,1,tolerance);
   }

   public static double sqrtH(double n,double guess,double error){
     if(n * error < guess * guess || n *error > guess * guess){
       return sqrtH(n,(n/guess + guess)/2,error);
     }
     else{
       return guess;
     }
   }

   /*Recursively find the n'th fibbonaci number in linear time
    *fib(0) = 1; fib(1) = 1; fib(5) = 5
    *precondition: n is non-negative
    */
   public static int fib(int n){

   }

   /*As Per classwork*/
   public static ArrayList<Integer> makeAllSums(){
   }
}
