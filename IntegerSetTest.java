public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet a = new IntegerSet();

        //Test 1 : การสร้าง การเพิ่ม และการเรียงลำดับ
        a.add(50);
        a.add(70);
        a.add(40);
        a.add(60);
        String s = "[40, 50, 60, 70]";
        if(a.toString().equals(s))
            System.out.println("Pass");
        else
            System.out.println("Fall"+a.toString());

        //Test 2 : การลบ
        a.remove(50);
        s = "[40, 60, 70]";
        if(a.toString().equals(s))
            System.out.println("Pass");
        else
            System.out.println("Fall"+a.toString());

        //Test 3 : 
    }
}
