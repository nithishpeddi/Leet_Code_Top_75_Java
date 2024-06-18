import java.util.HashSet;
import java.util.Set;

public class DuplicateNum {
    public static void main(String args[]){
        int [] nums = { 1, 0, 2, 3, 2};
      
        boolean result = findDuplicate(nums);
        System.out.println("Duplicate Preset " + result);
    }
    public static boolean findDuplicate(int [] nums){
        Set<Integer> hashSet = new HashSet<>();
        for(int i: nums){
            if(hashSet.contains(i)){
                return true;
            } else {
                hashSet.add(i);
            }
        }
        return false;
    }
}
