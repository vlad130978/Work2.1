public class Kogtev extends Hogwarts {
private int trud;
private int vern;
private int chestn;

    public Kogtev(String name, int magic, int trans, int trud, int vern, int chestn) {
        super(name, magic, trans);
        this.trud = trud;
        this.vern = vern;
        this.chestn = chestn;
    }

    public int getTrud() {
        return trud;
    }

    public int getVern() {
        return vern;
    }

    public int getChestn() {
        return chestn;
    }

    public void setTrud(int trud) {
        this.trud = trud;
    }

    public void setVern(int vern) {
        this.vern = vern;
    }

    public void setChestn(int chestn) {
        this.chestn = chestn;
    }
    private int sravni() {
        return trud + vern + chestn;
    }
    private void sravnikogtev (Kogtev kogtev) {
        int sravni1 = sravni();
        int sravni2 = kogtev.sravni();
        if (sravni1 > sravni2) {
            System.out.println("Студент %s лучше чем студент %s");
        } else if (sravni1 < sravni2) {System.out.println("Студент %s лучше чем студент %s");

        }
        else  {System.out.println("Студент %s и студент %s равны");

        }
    }
    public String toString() {
        return String.format("trud:  %s; vern:  %s; chestn: %s", super.toString(), trud, vern, chestn);
    }
}
