import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 7;
        arr[2] = 35;
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        // Output :
        // 1
        // 7
        // 35

        System.out.println(Arrays.toString(arr));
        // Output : [1, 7, 35]

        List<String> arrL = new ArrayList<>();
        arrL.add("Columbus");
        arrL.add("New York");
        arrL.add("Tokyo");
        System.out.println(arrL);
        // Output : [Columbus, New York, Tokyo]

        for (String city : arrL) {
            System.out.println(city);
        }
        // Output :
        // Columbus
        // New York
        // Tokyo

        Set<String>cities2 = new TreeSet<>();
        cities2.add("Dayton");
        cities2.add("Columbus");
        cities2.add("Cleveland");
        cities2.add("Miami");
        cities2.add("Charlotte");
        // cities2.add("Columbus");
        // No Duplicates !
        // Would not print a second columbus

        System.out.println(cities2);
        // Output : [Charlotte, Cleveland, Columbus, Dayton, Miami]
        // Sorted Order (Removes Duplicates)

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "What");
        hashMap.put(2, "If");
        hashMap.put(3, "?");

        System.out.println(hashMap);
        // Output : {1=What, 2=If, 3=?}

        Integer a = 7;
        // Has More Methods Than int
        // HOWEVER int uses less memory
    }
}