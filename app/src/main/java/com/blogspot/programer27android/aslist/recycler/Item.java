package com.blogspot.programer27android.aslist.recycler;

public class Item {
    private String namasurats;
    private int linked;

    public Item(String namasurats, int linked) {
        this.namasurats = namasurats;
        this.linked = linked;
    }

    public String getNamasurats() {
        return namasurats;
    }

    public void setNamasurats(String namasurats) {
        this.namasurats = namasurats;
    }

    public int getLinked() {
        return linked;
    }

    public void setLinked(int linked) {
        this.linked = linked;
    }
}
