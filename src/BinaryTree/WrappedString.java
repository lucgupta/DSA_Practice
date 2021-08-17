package BinaryTree;

public class WrappedString {
    public static void main(String[] args) {
        WrappedString x = new WrappedString();
        WrappedString x2 = m1(x);
        WrappedString x4 = new WrappedString();
        x2 = x4;
    }

    static WrappedString m1(WrappedString mx){
        mx = new WrappedString();
        return mx;
    }
}