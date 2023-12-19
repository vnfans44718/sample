package itwill01;

public class MemberFieldMain {
    public static void main(String[] args) {
        MemberField memberField = new MemberField();

        memberField.no = 3886;
        memberField.name = "박연진";
        memberField.realName = "임지연";
        memberField.crime = true;

        System.out.println("죄수번호 : " + memberField.no);
        System.out.println("이름 : " + memberField.name);
        System.out.println("배우 :  " + memberField.realName);
        System.out.println("죄질이 나쁜가? :" + memberField.crime);
    }
}
