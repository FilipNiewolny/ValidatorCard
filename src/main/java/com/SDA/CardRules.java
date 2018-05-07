package com.SDA;

public class CardRules {
    private String exhibitor;
    private String prefix;
    private String length;

    public String getExhibitor() {
        return exhibitor;
    }

    public void setExhibitor(String exhibitor) {
        this.exhibitor = exhibitor;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "CardRules{" +
                "exhibitor='" + exhibitor + '\'' +
                ", prefix='" + prefix + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
