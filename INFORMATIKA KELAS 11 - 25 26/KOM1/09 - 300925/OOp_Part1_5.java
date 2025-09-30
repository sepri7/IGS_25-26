class x {
    String note = "dari X";

    void Say() {
        System.out.println("MEthod x");
    }
}

class y extends x {
}

public class OOp_Part1_5 {
    public static void main(String[] args) {
        y obj_y = new y();
        System.out.println(obj_y.note);
        obj_y.Say();
    }
}
