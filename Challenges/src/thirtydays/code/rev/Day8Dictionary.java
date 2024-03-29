package thirtydays.code.rev;

import java.util.HashMap;
import java.util.Scanner;

public class Day8Dictionary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> maps = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            maps.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(maps.containsKey(s)) {
            	System.out.println(s+ "=" + maps.get(s));
            }
            else
                {
                System.out.println("Not found");
            }
        }
        in.close();

	}

}
