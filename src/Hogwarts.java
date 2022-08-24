public abstract class Hogwarts {
    private String name;
    private int magic;
    private int trans;

    public Hogwarts(String name, int magic, int trans) {
        this.name = name;
        this.magic = magic;
        this.trans = trans;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTrans() {
        return trans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTrans(int trans) {
        this.trans = trans;
    }

    private int sravni() {
        return magic + trans;
    }

    private void sravnihgorwarts (Hogwarts Hogwarts) {
        int sravni1 = sravni();
        int sravni2 = Hogwarts.sravni();
        if (sravni1 > sravni2) {
            System.out.println("Студент %s лучше чем студент %s");
        } else if (sravni1 < sravni2) {System.out.println("Студент %s лучше чем студент %s");

        }
        else  {System.out.println("Студент %s и студент %s равны");

        }
    }

    @Override
    public String toString() {
        return String.format("Student:  %s; magic:  %d; trans: %d", name, magic, trans);
    }

    public void print() {
        System.out.println(this);
    }
}

