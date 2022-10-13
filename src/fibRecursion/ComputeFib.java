package fibRecursion;

public class ComputeFib{
    
    public static int fibonacci(int numToCompute){
        //using recursion in this method, meaning there will be a
        //method stack that returns all values to parent method
        //avoid stack overflow by having an end clause, modify parameters,
        //and don't cause a heap collision (run out of memory)

        if(numToCompute <= 1)
            return numToCompute;
        else{
            return fibonacci(numToCompute -1) + fibonacci(numToCompute - 2);
        }
    }
}
