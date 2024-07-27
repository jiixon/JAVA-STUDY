package construct;

public class MemberInitMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 17);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct m: members){
            System.out.println("이름: " + m.name + ", 나이: "+ m.age + ", 점수: " + m.grade);
        }
    }
}
