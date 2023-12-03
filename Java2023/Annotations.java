@Deprecated
class An {
    public void showDataForClassA() {
        System.out.println("A Class");
    }
}

class Bn extends An {
    @Override
    public void showDataForClassA() {
        System.out.println("B Class");
    }
}

public class Annotations {

    public static void main(String[] args) {
        Bn obj = new Bn();
        obj.showDataForClassA();

    }
}
