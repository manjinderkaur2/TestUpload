public class dowhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i != 12) {
                System.out.print(i + ",");
            } else
                System.out.print(i);
            i += 4;
        }
        while (i <= 12);

    }
}
