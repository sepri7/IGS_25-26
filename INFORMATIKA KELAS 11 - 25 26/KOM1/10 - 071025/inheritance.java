
class inheritance {
    public static void main(String[] args) {
        a objA = new a();
        objA.say();
        b objB = new b();
        objB.say();
    }
}

class a {
    public void say() {
        System.out.println("dari A");
    }
}

class b extends a {
    public void say() {
        System.out.println("dari B");
    }
}