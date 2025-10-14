class hewan {
    String jenis_hewan = "mamalia";

    void def() {
        System.out.println("hewan yang melahirkan..");
    }
}

class hewan_air extends hewan {
    String name = "paus";
}

class hewan_darat extends hewan {
    String name = "kucing";
}

class app {
    public static void main(String[] args) {
        hewan_air object1 = new hewan_air();
        System.out.println(object1.name);
        System.out.println(object1.jenis_hewan);
        object1.def();
        hewan_darat object2 = new hewan_darat();
        System.out.println(object2.name);
        hewan objectHewan = new hewan();
        System.out.println(objectHewan.jenis_hewan);
        hewan objectHewan2 = new hewan_air();
        System.out.println(objectHewan2.jenis_hewan);
        // System.out.println(objectHewan2.name); error

    }
}
