package com.juancnuno.normalizefilterstring;

public final class NormalizeFilterString {

    private NormalizeFilterString() {
    }

    public static Object normalize(String string) {
        return string.replaceAll("[^&0-9A-Z_a-z]+", " ").strip().toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(normalize(args[0]));
    }
}
