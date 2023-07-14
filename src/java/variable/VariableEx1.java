package java.variable; // 패키지를 명시하지 않으면 클래스가 유니크해지지 못해 똑같은 이름이 생길 수 있다.

/**
 * JAVA(OOP), 변수, 연산자, 제어문, 배열
 *
 * Java의 특징
 * (객체지향언어, 운영체제로부터 독립적, 인터프리터, 자동메모리(가비지 컬렉션)=소멸자가 없다)
 * (멀티쓰레드(멀티 환경을 제공, 정적,동적 바인딩을 지원)
 * - 객체지향 특징(추상화, 상속, 캡슐화, 다형성)
 * - 인터프리터(바이트코드를 특정 환경의 기계에서 실행될 수 있도록 바이트 코드를 바이너리 코드로 변환해준다.)
 *
 * Variable(가변, 변수), Constant(불변, 상수), Literal(할당 값) -> 세 가지를 구분
 *
 * 기본형(PrimitiveType),
 * - 정수형(byte(1)<short(2)<int(4)기본<long(8))
 * - 실수형(float(4)<double(8)기본)
 * - 문자형(char(2))
 * - 논리형(boolean(1))
 * 형변환 실습
 *
 *
 *
 * 참조형(ReferenceType)
 *
 */
public class VariableEx1 {
//    int a=10;
//    a=20; 설계도 역할을 하는 클래스에서는 추상화를 해야하고 구현을 해선 안된다.

    int variable;

    public static void main(String[] args) {
//        private int a = 10;  메소드 내에서 사용하는 지역 변수이기 때문에 private을 붙일 수 없다. 어차피 같은 스코프내에서만 사용가능하다.
//        static int a = 10; static변수는 클래스 로딩시점에 함께 로딩되므로 안불려질지도 모르는 메소드에 선언할 수 없다.

        int variable; // 지역 변수는 사용전에 초기화를 해야한다.

//        variable += 10; static메소드에서 new연산자로 클래스 인스턴스를 생성하지 않는다면 인스턴스 변수에 접근할 수 없다.

        final int constantValue; // 더이상 변하지 않는 상수를 의미한다.
        int a = 10; // 리터럴은 직접 할당해주는 값을 의미한다.


        /**
         * 형 변환 실습
         */
        byte byteValue1=10;
//        byte byteValue1=20; // 같은 메모리의 주소를 가리키고 있기 때문에 변수명은 같을 수 없다.
        byte byteValue2=20;

//        byte result = byteValue1+byteValue2; // 10과 20은 int와int의 연산이기 때문에 int형으로 받아야한다.
        byte result2 = (byte) (byteValue1+byteValue2);
        // 하지만 결과를 byte형태로 형변환하면 byte에 넣을 수 있다.

        System.out.println(result2);

        float floatValue= 20.3f;
        // 기본적으로 double형을 제공하기 떄문에 (float로 형변환 or F )를 사용한다.

        long intValue = Integer.MAX_VALUE+1;
        // int형끼리 연산이어서 범위를 벗어나기 떄문에 쓰레기 값이 된다.

        long intValue2 = Integer.MAX_VALUE+1L;
        // 따라서 maxValue(Int형)과 1L(Long형)으로 연산하여 8바이트에서 연산되도록 한다.
        System.out.println("intValue = " + intValue);

        for (int i = '?'; i <='z'; i++) { // int에 문자를 넣으면 아스키 코드가 들어간다
            System.out.printf("%c = %d\n",(char)i, i);
        }

        float f = 20.5f;
        double d= f;
//        f = d+f; // Double(8바이트)와 Float(4바이트) 연산을 하는데 임시 공간이 4바이트이기 때문에
        double g = d+f; //임시 공간을 (Double)8바이트로 맞춰주던가
        f = (float) (d+f); // 연산 결과를 (Float)4바이트로 형변환해야한다.


    }

}
