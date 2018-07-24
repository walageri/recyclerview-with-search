package com.blogspot.programer27android.aslist.recycler;

public class Item {
    private String namasurats;
    private int linked;
    private int linkep;

    public Item(String namasurats, int linked, int linkep) {
        this.namasurats = namasurats;
        this.linked = linked;
        this.linkep = linkep;

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

    public int getLinkep() {
        return linkep;
    }

    public void setLinkep(int linkep) {
        this.linkep = linkep;
    }
}
