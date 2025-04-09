import java.util.HashMap;

class tribonacci{

    public static int trib(int n){
        return trib(n,new HashMap<>());
    }
    public static int trib(int n,HashMap<Integer,Integer> memo){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if( memo.containsKey(n)){
            return memo.get(n);
        }
        int result= trib(n-1)+trib(n-2)+trib(n-3);
        memo.put(n,result);
        return result;
    }

    public static void main(String [] args){
       System.out.println(trib(3));
    }
}