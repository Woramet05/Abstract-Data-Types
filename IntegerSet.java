import java.util.ArrayList;
/*
 * ADT ที่เก็บ Integer จำนวนเต็มใดๆ ที่เรียงจากน้อยไปมาก ไม่เป็น null และไม่ซ้ำกัน
 */
public class IntegerSet {
    ArrayList<Integer> Numbers; //Rep
    // AF(ArrayList<Integer>) = เซตของตัวเลขทั้งหมดที่อยู่ใน ArrayList<Integer>
    // RI Integer ต้องเรียงจากน้อยไปมาก, Integer ห้ามมี null หรือตัวเลขซ้ำ
    public IntegerSet(){
        Numbers = new ArrayList<>();
        CheckRep();
    }
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
    * เพิ่มตัวเลขเข้าไป
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
    public void remove(Integer x){
        if (Numbers.contains(x) && x != null && Numbers != null) {
        Numbers.remove(x);
        }
        CheckRep();
    }
    public boolean contains(Integer x){
        return Numbers.contains(x);
    }
    public int size(){
        return Numbers.size();
    }
    public String toString(){
        return Numbers.toString();
    }
}
