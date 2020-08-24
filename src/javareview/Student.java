package javareview;

public class Student {

    // --- access specifier / access modifier ---
    // private, public, package (default), protected

    //-------------- 1. field, attribute , instance varaible --------------
    private int id;
    private String name;
    private Double midtermScore;
    private Double finalScore;

    //-------------- 2. constructor --------------
    // ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    public Student(int id,String name){
        this.id = id;
        this.name = name;

    }

    //-------------- 3. method (like function)--------------
    public double getTotalScore(){
        double total = midtermScore + finalScore;
        return total;
    }
    // 3.1 getters
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
    // 3.2 setters


    public void setName(String name) {
        this.name = name;
    }

    public void setMidtermScore(Double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }
    // toString Method


    public String toString() {
        return id + " --- " + name;
    }
}
