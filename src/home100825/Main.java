package home100825;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Map<String,String> adil = new LinkedHashMap<>();
        adil.put("name","Adil");
        adil.put("Lastname","Memmedli");
        adil.put("UserId","12321");
        adil.put("Amount","300");
        adil.put("Transaction","120");


        Map<String,String> fail = new LinkedHashMap<>();
        fail.put("name","Fail");
        fail.put("Lastname","Memmedxan");
        fail.put("UserId","12322");
        fail.put("Amount","400");
        fail.put("Transaction","110");

        Map<String,String> fail1 = new LinkedHashMap<>();
        fail1.put("name","Fail");
        fail1.put("Lastname","Memmedxan");
        fail1.put("UserId","12322");
        fail1.put("Amount","400");
        fail1.put("Transaction","173");


        Map<String,String> nail = new LinkedHashMap<>();
        nail.put("name","Nail");
        nail.put("Lastname","Memmedov");
        nail.put("UserId","12323");
        nail.put("Amount","500");
        nail.put("Transaction","200");

        Map<String,String> nail1 = new LinkedHashMap<>();
        nail1.put("name","Nail");
        nail1.put("Lastname","Memmedov");
        nail1.put("UserId","12323");
        nail1.put("Amount","500");
        nail1.put("Transaction","50");

        Map<String,String> nail2 = new LinkedHashMap<>();
        nail2.put("name","Nail");
        nail2.put("Lastname","Memmedov");
        nail2.put("UserId","12323");
        nail2.put("Amount","500");
        nail2.put("Transaction","25");


        List<Map<String,String>> humanList = new ArrayList<>();
        humanList.add(adil);
        humanList.add(fail);
        humanList.add(fail1);
        humanList.add(nail);
        humanList.add(nail1);
        humanList.add(nail2);
        System.out.println(humanList);
        Set<String> humanset = new HashSet<>();
        for (Map<String,String> m: humanList) {
            if(100 < Integer.parseInt(m.get("Transaction"))) {
                humanset.add(m.get("name"));
//                System.out.println(m);

            }
        }
        System.out.println(humanset);
    }
}
