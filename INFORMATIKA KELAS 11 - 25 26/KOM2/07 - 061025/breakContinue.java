class breakContinue {
    public static void main(String[] agrs) {
        System.out.println("----Break&Continue");
        // break :
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5)
                break;
        }
        System.out.println("----");
        // continue :
        for (int i = 10; i <= 20; i += 2) {
            System.out.println(i);
            if (i == 16)
                continue;

            System.out.println("+");
        }
    }
}