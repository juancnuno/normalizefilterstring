package com.juancnuno.normalizefilterstring;

final class NormalizeFilterString {

    private NormalizeFilterString() {
    }

    public static void main(String[] args) {
        System.out.println(args[0].toLowerCase().replaceAll("[^_0-9a-z]+", " "));
    }
}
