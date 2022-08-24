public class Puff extends Hogwarts {
    private int um;
    private int mudr;
    private int tvorch;

    public Puff(String name, int magic, int trans, int um, int mudr, int tvorch) {
        super(name, magic, trans);
        this.um = um;
        this.mudr = mudr;
        this.tvorch = tvorch;
    }

    public int getUm() {
        return um;
    }

    public int getMudr() {
        return mudr;
    }

    public int getTvorch() {
        return tvorch;
    }

    public void setUm(int um) {
        this.um = um;
    }

    public void setMudr(int mudr) {
        this.mudr = mudr;
    }

    public void setTvorch(int tvorch) {
        this.tvorch = tvorch;
    }
    private int sravni() {
        return um + mudr + tvorch;
    }
    private void sravnipuff (Puff puff) {
        int sravni1 = sravni();
        int sravni2 = puff.sravni();
        if (sravni1 > sravni2) {
            System.out.println("Студент: %s лучше чем студент: %s");
        } else if (sravni1 < sravni2) {System.out.println("Студент: %s лучше чем студент: %s");

        }
        else  {System.out.println("Студент: %s и студент: %s равны");

        }
    }
    public String toString() {
        return String.format("um:  %s; mudr:  %s; tvorch: %s", super.toString(), um, mudr, tvorch);
    }
}
