package workshop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap();
		map.put(1, "a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		map.put(5,"e");
		System.out.println(map);
		
		List<Map.Entry<Integer,String>> list=map.entrySet().stream().collect(Collectors.toList());
		System.out.println(list);
		

	}

	

}
