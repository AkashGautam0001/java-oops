package properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Akash Gautam ObjectPrint{" + "num=" + num + '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        obj.toString();
        System.out.println(obj);
    }
}
