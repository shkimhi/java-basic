package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("SEOK", 24, 100); // ctrl+P 파라미터 뭐필요한지 알려주는 단축키
        MemberConstruct member2 = new MemberConstruct("SEOK2", 243, 1100);

        MemberConstruct[] members = {member1,member2};

        for(MemberConstruct memberConstruct : members){
            System.out.println("이름:" + memberConstruct.name + " 나이:" + memberConstruct.age + " 성적:" + memberConstruct.grade);
        }

    }
}
