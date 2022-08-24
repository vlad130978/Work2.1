public class Sliz extends Hogwarts{
    private int hitr;
    private int resh;
    private int vlast;

    public Sliz(String name, int magic, int trans, int hitr, int resh, int vlast) {
        super(name, magic, trans);
        this.hitr = hitr;
        this.resh = resh;
        this.vlast = vlast;
    }

    public int getHitr() {
        return hitr;
    }

    public int getResh() {
        return resh;
    }

    public int getVlast() {
        return vlast;
    }

    public void setHitr(int hitr) {
        this.hitr = hitr;
    }

    public void setResh(int resh) {
        this.resh = resh;
    }

    public void setVlast(int vlast) {
        this.vlast = vlast;
    }
    private int sravni() {
        return hitr + resh + vlast;
    }

    private void sravnihgorwarts (Sliz sliz) {
        int sravni1 = sravni();
        int sravni2 = sliz.sravni();
        if (sravni1 > sravni2) {
            System.out.println("Студент %s лучше чем студент %s");
        } else if (sravni1 < sravni2) {System.out.println("Студент %s лучше чем студент %s");

        }
        else  {System.out.println("Студент %s и студент %s равны");

        }
    }
    public String toString() {
        return String.format("hitr:  %s; resh:  %s; vlast: %s", super.toString(), hitr, resh, vlast);
    }
}
