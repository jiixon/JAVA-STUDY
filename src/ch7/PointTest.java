package ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D.getLocation());
    }
}
class Pooint{
    int x,y;
    Pooint(int x, int y){
        this.x=x;
        this.y=y;
    }
    String getLocation(){
        return "x :" + x +"y :"+y;
    }
}
class Point3D extends Pooint{
    int z;
    Point3D(int x, int y, int z){
        super(x,y); //부모클래스의 생성자 Point(int x, int y)를 호출
        //중요! 부모클래스의 멤버변수는 이처럼 부모의 생성자에 의해 초기화되도록 해야한다!
        this.z = z;
    }
    String getLocation(){
        return "x :"+x+", y :"+y+", z :"+z;
    }
}

