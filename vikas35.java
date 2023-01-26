import java.util.*;
public class vikas35 {
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>(4,0.8F);

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        // hashset is almost like arraylist but the only difference is that in hashset , searching takes constant time
        // this is due to hashing and hence making it much faster
    }
}
// The load factor is the measure that decides when to increase the capacity of the Map. The default load factor is 75% of the capacity. The threshold of a HashMap is approximately the product of current capacity and load factor. Rehashing is the process of re-calculating the hash code of already stored entries.