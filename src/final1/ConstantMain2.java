package final1;

public class ConstantMain2 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 :" + Constant.MAX_USERS); //1000의 숫자의 의미를 파악하기 힘듬 ( 매직넘버문제 )
        int currentUserCount = 999;
        process(currentUserCount++); // 함수 호출이 끝난 후 ++
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수 :"+ currentUserCount);
        if (currentUserCount > Constant.MAX_USERS){
            System.out.println("대기자 등록");
        }else {
            System.out.println("게임에 참여");
        }
    }
}
