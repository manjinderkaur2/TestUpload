public class forLoop {
    public static void main(String[] args) {
        int y=1;
        while(y<=10){
            if(y!=10){
                System.out.print(y+",");
            }
            else
                System.out.print(y);
            y++;
        }
        System.out.println();
        int z=32;
        do{
            if(z!=2){
                System.out.print(z+",");
            }
            else
                System.out.print(z);
            z=z-2;
        }
        while(z>=2);
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if (i != 10) {
                System.out.print(i + ",");
            } else
                System.out.print(i);
        }
    }
}
