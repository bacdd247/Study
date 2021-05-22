public class Hihi {
    public static void main(String[] args) {
         char[] a = {'d','e','t','c','h','o','e','v','r','t','x'};
         char[] b = new char[7];
         System.arraycopy(a, 2, b, 0, 7);
         for (int i=0; i < b.length; i ++) {
             System.out.println("b[" + i + "] = " + b[i]);
         }
    }
}