public class Loops {
    public static void main(String[] args) {
        // 반복문
        // 1. for
        // 초기화된 변수. 조건식. 증감식

        for (int i = 0; i < 10; i+=2){
            System.out.println(i);
        }

        // 2. while
        int b = 0;
        while (b > 0){
            System.out.println(b);
            b--;
        }

        int c =0;
        do {
            System.out.println(c);
            c--;
        }while(c>0);
    }
}
