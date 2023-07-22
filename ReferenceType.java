public class ReferenceType {
    public static void main(String[] args){
        // 참조형
        // 참조형 데이터의 값 => 힙 메모리 영역
        // 변수에 대입되는 값 => 힙 메모리 영역의 주소값

        String a = new String("Hello!");
        System.out.println(a);

        String b = "Hello!";
        String c = "Hello!";

        if (a == b){
            System.out.println("a == b");
        }
        if (b == c){
            System.out.println("b == c");
        }

        // 상수(constants, final variables)
        // 한 번 값이 할당 => 재할당이 불가능
        // 전체를 대문자, 단어간 구분은 _

        final double PI = 3.14;
        System.out.println(PI);


    }
}
