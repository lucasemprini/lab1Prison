package view.Interfaces;

import model.Crime;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CrimeTextArea extends JTextArea {
    private final List<Crime> list = new ArrayList<>();

    public CrimeTextArea() {
        super();
    }

    public void appendCrime(final Crime c) {
        super.append(c.toString() + "\n");
        this.list.add(c);
    }

    public List<Crime> getList() {
        return list;
    }
}
