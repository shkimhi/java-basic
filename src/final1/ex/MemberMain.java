package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("1", "kim");
        member.print();

        member.changeData("1","lee");
        member.print();
    }
}
