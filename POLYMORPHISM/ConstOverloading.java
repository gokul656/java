public class ConstOverloading {
    public static void main(String[] args) {
        Overloadable loadOne = new Overloadable();
        Overloadable loadTwo = new Overloadable("Some", "Data");
        Overloadable loadThree = new Overloadable("Some", "Another", "Data");
    }
}


class Overloadable{

    String data1;
    String data2;
    String data3;
    // Creating constructors with different params
    Overloadable(){}

    Overloadable(String data1, String data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    Overloadable(String data1, String data2, String data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }
}