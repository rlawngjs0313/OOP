abstract class Printer {
    private String model;
    private int printedCount;
    private int availableCount;

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }

    public String getModel() {
        return model;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public int getPrintedCount() {
        return printedCount;
    }

    public void setPrintedCount() {
       this.printedCount++;
    }

    public void setAvailableCount() {
        this.availableCount--;
    }

    abstract boolean print();
}

class InkjetPrinter extends Printer{

    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (super.getAvailableCount() > 0) {
            super.setPrintedCount();
            super.setAvailableCount();
            return true;
        } else {
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", super.getModel(), super.getPrintedCount()+1);
            return false;
        }
    }
}

class LaserPrinter extends Printer{

    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (super.getAvailableCount() > 0) {
            super.setPrintedCount();
            super.setAvailableCount();
            return true;
        } else {
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", super.getModel(), super.getPrintedCount()+1);
            return false;
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}