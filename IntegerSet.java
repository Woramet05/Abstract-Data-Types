import java.util.ArrayList;
/*
 * ADT ที่เก็บ Integer จำนวนเต็มใดๆ ที่เรียงจากน้อยไปมาก ไม่เป็น null และไม่ซ้ำกัน
 */
public class IntegerSet {
    ArrayList<Integer> Numbers; //Rep
    // AF(Number) = เซตของตัวเลขทั้งหมดที่อยู่ใน ArrayList<Integer>
    // RI Integer ต้องเรียงจากน้อยไปมาก, Integer ห้ามมี null หรือตัวเลขซ้ำ

    /*
     * เริ่มต้นสร้างเซตว่าง
     */
    public IntegerSet(){
        Numbers = new ArrayList<>();
        CheckRep();
    }
    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    private void CheckRep() {
        if (Numbers == null) {
            throw new RuntimeException("Number must not contain NULL.");
        }
        if (Numbers.size() > 1) {
            for (int i = 0; i < Numbers.size() - 1; i++) {
                if (Numbers.get(i) >= Numbers.get(i + 1)) {
                    throw new RuntimeException("Error!!");
                }
            }
        }
    }
    /*
    * การเพิ่มตัวเลขเข้าไป
    * @param x ตัวเลขที่ต้องการเพิ่ม
     */
    public void add(Integer x) {
        if (!Numbers.contains(x) && Numbers != null && x != null) {
            if (Numbers.size() == 0) {
                Numbers.add(x);
            } else { 
                if (Numbers.get(0) > x) {
                    Numbers.add(0, x);
                } else {
                    for (int i = 0; i < Numbers.size(); i++) {
                        if (i == Numbers.size() - 1) {
                            Numbers.add(x);
                            break;
                        } 
                        if (Numbers.get(i) < x && x < Numbers.get(i + 1)) {
                            Numbers.add(i+1, x);
                            break;
                        }
                    }
                }
            }
        }
        CheckRep();
    }
    /*
     * การลบตัวเลข
     * @param x ตัวเลขที่ต้องการลบ
     */
    public void remove(Integer x){
        if (Numbers.contains(x) && x != null && Numbers != null) {
            Numbers.remove(x);
        }
        CheckRep();
    }
    /*
     * ตรวจสอบว่ามีตัวเลขอยู้ในเซตมั้ย
     * @param x คือตัวอักษรที่ต้องการตรวจสอบ
     * @return true หากมี x อยู่ในเซต, false หากไม่มี
     */
    public boolean contains(Integer x){
        return Numbers.contains(x);
    }
    /*
     * คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเซต
     */
    public int size(){
        return Numbers.size();
    }
    public String toString(){
        return Numbers.toString();
    }
}
