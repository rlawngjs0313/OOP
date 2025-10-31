public class Homework5 {
    public static void main(String[] args){
        Computer computer = new Computer("Core i7", "32GB", "2TB", "White", "700W");
        Monitor monitor = new Monitor("32", "Black", "45W");
        PersonalComputer personalComputer = new PersonalComputer(monitor, computer);
        personalComputer.turnOn();
        personalComputer.printInfo();
    }
}

class PersonalComputer {

    private Monitor monitor;
    private Computer computer;

    public PersonalComputer(Monitor monitor, Computer computer){
        this.monitor = monitor;
        this.computer = computer;
    }

    public void turnOn(){
        this.computer.turnOn();
        this.monitor.turnOn();
    }

    public void printInfo(){
        this.computer.printInfo();
        this.monitor.printInfo();
    }
}

class Monitor {

    private String monitorSize;
    private String color;
    private String power;

    public Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the monitor");
    }

    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.printf(" Size: %s inch\n Color: %s\n Power: %s\n", this.monitorSize, this.color, this.power);
    }
}

class Computer {

    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the computer");
    }

    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n Memory: %s\n HardDisk: %s\n Color: %s\n Power: %s\n",
                this.cpu, this.memory, this.hd, this.color, this.power);
    }
}