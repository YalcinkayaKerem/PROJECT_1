/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Project_1;

public class App {
    public static boolean s(int a){
        if(a==1)
            return true;
        return false;
    }
    public static int find(int[] arr,int min,int max)throws Exception{
        if(arr==null)
        throw new Exception("Null array!");
        if(min>max)
            throw new Exception("Wrong min and max value!");
        if(arr.length==0)
            throw new Exception("Empty array!");
        int amount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=min&&arr[i]<=max)
                amount++;
        }
        return amount;
    }
}

