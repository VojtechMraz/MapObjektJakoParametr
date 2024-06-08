import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        map.put("klic", "hodnota");
        map.put("key", "value");
        
        System.out.println(returnSize(map));
    }

    public static int returnSize(Map map){
        return map.size();
    }
}
