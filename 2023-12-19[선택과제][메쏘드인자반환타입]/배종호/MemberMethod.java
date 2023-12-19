package itwill01;

public class MemberMethod {
    public void method1(){
        System.out.println("public void method1()실행");
    }
    public void method2(){
        System.out.println("public void method2()실행");
    }
    public void method3(int a){
        System.out.println("method3 :"+ a);
    }
    public void method4(String a, int c){
        System.out.println("이름 :" +a + "나이: " + c);
    }
    public void method5(String c, String d, int b){
        System.out.println("이름 :" +c + "주소: " + d + "나이"+b);

    }
}
