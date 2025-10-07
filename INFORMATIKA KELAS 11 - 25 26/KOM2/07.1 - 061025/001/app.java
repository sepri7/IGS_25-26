class app {
    public static void main(String[] args) {
        System.out.println("break&Continue in While");
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            if (i == 5)
                break;
            i++;
        }
        System.out.println("----");
        int z = 1;
        while (z < 10) {
            System.out.println(z);
            z++;
            if (z == 5)
                continue;
            System.out.println("++++++");
        }
    }

}