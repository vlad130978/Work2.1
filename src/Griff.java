public class Griff extends Hogwarts {
    private int blagorod;
    private int chest;
    private int chrabr;

    public Griff(String name, int magic, int trans, int blagorod, int chest, int chrabr) {
        super(name, magic, trans);
        this.blagorod = blagorod;
        this.chest = chest;
        this.chrabr = chrabr;
    }

    public int getBlagorod() {
        return blagorod;
    }

    public int getChest() {
        return chest;
    }

    public int getChrabr() {
        return chrabr;
    }

    public void setBlagorod(int blagorod) {
        this.blagorod = blagorod;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public void setChrabr(int chrabr) {
        this.chrabr = chrabr;
    }
    private int sravni() {
        return blagorod + chest + chrabr;
    }
    private void sravnigrif (Griff griff) {
        int sravni1 = sravni();
        int sravni2 = griff.sravni();
        if (sravni1 > sravni2) {
            System.out.println("Студент %s лучше чем студент %s");
        } else if (sravni1 < sravni2) {System.out.println("Студент %s лучше чем студент %s");

        }
        else  {System.out.println("Студент %s и студент %s равны");

        }
    }
    public String toString() {
        return String.format("blagorod:  %s; chest:  %s; chrabr: %s", super.toString(), blagorod, chest, chrabr);
    }
}
