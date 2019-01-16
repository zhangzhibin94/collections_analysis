/**
 * Created by zzb on 2019/1/16.
 */

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzb
 * @create 2019-01-16 10:36
 * @desc 分析集合框架
 **/
public class CollectionsAnalysis {
    @Test
    public void testHashMap(){
        Map<Integer,String> testMap = new HashMap<Integer,String>();
        testMap.put(1,"testMap");
        Object obj = "awgfawg";
        int hashCode = obj.hashCode();
        System.out.println(hashCode);
    }
}
