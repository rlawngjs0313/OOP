public class Midterm2 {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.onOff();
        ac.setCurrentTemperature(25);
        ac.setTemperature(22);
        ac.setCurrentTemperature(20);
        ac.setTemperature(20);
        ac.setTemperature(35);
        ac.onOff();
    }
}

class AirConditioner {

    private boolean isOn = false;
    private State state = State.난방;
    private Integer temperature = 23;
    private Integer targetTemperature = 24;

    // 메서드
    public void onOff(){
        if (isOn) {
            isOn = !isOn;
            System.out.println("에어컨을 끕니다.");
            System.out.println("* 상태: 꺼짐");
        } else {
            System.out.println("* 상태: 꺼짐");
            isOn = !isOn;
            System.out.println("에어컨을 켭니다.");
            System.out.printf("* 상태: %s / %s 모드 / 현재 온도 %d 도 / 목표 온도 %d 도\n", isOn ? "켜짐":"꺼짐", this.state, this.temperature, this.targetTemperature);
        }
    }

    public void setCurrentTemperature(Integer temperature){
        System.out.printf("현재 온도 %d 도로 설정\n", temperature);
        this.temperature = temperature;
        changeState();
        System.out.printf("* 상태: %s / %s 모드 / 현재 온도 %d 도 / 목표 온도 %d 도\n", isOn ? "켜짐":"꺼짐", this.state, this.temperature, this.targetTemperature);
    }

    public void setTemperature(Integer temperature){
        if (isTargetTemp(temperature)){
            System.out.printf("목표 온도 %d 도로 변경\n", temperature);
            this.targetTemperature = temperature;
        }
        changeState();
        System.out.printf("* 상태: %s / %s 모드 / 현재 온도 %d 도 / 목표 온도 %d 도\n", isOn ? "켜짐":"꺼짐", this.state, this.temperature, this.targetTemperature);
    }

    // private
    private boolean isTargetTemp(Integer temperature){
        if (16 <= temperature && temperature <= 30) {
            return true;
        } else {
            System.out.printf("목표 온도(%d 도)가 범위(16~30 도)를 벗어나 기존 값(%d 도) 유지\n", temperature, this.temperature);
            return false;
        }
    }

    private void changeState(){
        if (this.temperature < this.targetTemperature) {
            this.state = State.난방;
        } else if (this.temperature > this.targetTemperature) {
            this.state = State.냉방;
        } else {
            this.state = State.대기;
        }
    }
}

enum State {
    난방, 냉방, 대기
}