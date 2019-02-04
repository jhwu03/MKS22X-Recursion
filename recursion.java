import java.util.ArrayList;
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
     return fibH(n,0,1,0);
   }

  public static int fibH(int target, int firstn , int secondn , int current){
    if (current >= target){
      return firstn;
    }else{
      return fibH(target,secondn,firstn + secondn, current + 1);
    }
  }

   /*As Per classwork*/
   public static ArrayList<Integer> makeAllSums(int n){
     ArrayList<Integer> sums = new ArrayList<Integer>();
     makeAllSumsH(n,0,sums);
     return sums;
   }

  public static void makeAllSumsH(int n, int partial, ArrayList<Integer> sums) {
    if (n > 0) {
      makeAllSumsH(n - 1, partial, sums);
      makeAllSumsH(n - 1, partial + n, sums);
    } else {
      sums.add(partial);
    }
  }
}
