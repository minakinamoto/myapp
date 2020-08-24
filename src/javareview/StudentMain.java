package javareview;

public class StudentMain {
    public static void main(String[] args) {

        Student kwan = new Student(1,"kwan");

        Student kate = new Student(2,"Kate");

        System.out.println(kwan.getId() + " : " + kwan.getName());
        System.out.println(kate.getId() + " : " + kate.getName());
        System.out.println("-------------------------------------------------------");

        System.out.println(kwan);
        System.out.println(kate);
        System.out.println("-------------------------------------------------------");

        kwan.setMidtermScore(10.0);
        kwan.setFinalScore(8.0);
        System.out.println("Kwan's total score = " + kwan.getTotalScore());
        System.out.println("-------------------------------------------------------");
//
//
//        Student s = kwan;
//        s.id = 100;
//        System.out.println(kwan.id +" : " + s.name);
//
//        s = kate;
//        Student ploy;

    }

}
