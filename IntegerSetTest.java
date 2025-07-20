public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet a = new IntegerSet();

        System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        //Test 1 : การสร้าง การเพิ่ม และการเรียงลำดับ (add)
        a.add(1);
        a.add(4);
        a.add(3);
        a.add(2);
        String s = "[1, 2, 3, 4]";
        if(a.toString().equals(s)){
            System.out.println("Pass");
            passed++;
        }else{
            System.out.println("Fall"+a.toString());
            failed++;
        }

        //Test 2 : การลบ (remove)
        a.remove(2);
        s = "[1, 3, 4]";
        if(a.toString().equals(s)){
            System.out.println("Pass");
            passed++;
        }else{
            System.out.println("Fall"+a.toString());
            failed++;
        }
        //Test 3 : การเพิ่มข้อมูลที่ซ้ำกัน 
        a.add(4);
        s = "[1, 3, 4]";
        if (a.size() == 3) {
            System.out.println("Pass");
            passed++;
        }else{
            System.out.println("Fall"+a.toString());
            failed++;
        }
        //Test 4 : การตรวจสอบข้อมูล (contains)
        if (a.contains(1) && !a.contains(2)) {
            System.out.println("Pass");
            passed++;
        }else{
            System.out.println("Fall"+a.toString());
            failed++;
        }

        // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        }else{
            System.out.println("Some tests failed.");
        }
    }
}
