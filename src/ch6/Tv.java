package ch6;

class Tv {
    //TV의 속성(매개변수)
    String color; //색상
    boolean power; //전원상태(on/off)
    int channel; //채널

    //TV의 기능(메서드)
    void power() {
        power = !power;
    } //TV 켜거나 끄는 기능

    void channelUp() {
        ++channel;
    } //TV의 채널을 높이는 기능

    void channelDown() {
        --channel;
    } //TV의 채널을 낮추는 기능
}
