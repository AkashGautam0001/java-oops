package access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Akash");
        int n = obj.num;
        // | class | Package | subclass | subclass | World |
        // | | | (same pkg) | (diff pkg) | (diff pkg & not subclass) |
        // public | + | + | + | + | + |
        // protected | + | + | + | + |
        // no modifuer | + | + | + | |
        // private | + | | | |

    }
}
