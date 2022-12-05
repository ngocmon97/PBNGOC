package Ex;

import java.util.ArrayList;
import java.util.List;

public class Khupho extends Nguoi {

    List<Hogiadinh> family;

    public Khupho() {
        this.family = new ArrayList<>();
    }

    public List<Hogiadinh> getFamily() {
        return family;
    }

    public void setFamily(List<Hogiadinh> family) {
        this.family = family;
    }

    public void addFamily(Hogiadinh family) {
        this.family.add(family);
    }
}

