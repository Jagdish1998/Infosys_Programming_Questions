import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }
        int ans = 0;
        int len = nums.length;
        int size = (1<<len);
        for(int i = 0; i < size; i++){
            int sum = 0;
            boolean flag = true;
            int first = nums[0];
            for(int j = 0; j < len; j++){
                if((i&(1<<j)) != 0){
                    if(flag){
                        flag = false;
                        first = nums[j];
                    }
                    sum += nums[j];
                }
            }
            if(sum % first == 0) ans++;
        }
        System.out.println(ans-1);
        in.close();
    }
}
