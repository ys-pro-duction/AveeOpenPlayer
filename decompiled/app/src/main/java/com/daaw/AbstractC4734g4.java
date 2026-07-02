package com.daaw;

/* JADX INFO: renamed from: com.daaw.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4734g4 {
    public static final String[] a = {"unset", "start", "center", "end"};

    public static String a(int i, int i2) {
        if (i == 0) {
            return "unset";
        }
        if (i == 1) {
            return "start";
        }
        if (i == 2) {
            return "center";
        }
        if (i == 3) {
            return "end";
        }
        if (i2 == 0) {
            return "unset";
        }
        if (i2 == 1) {
            return "start";
        }
        if (i2 == 2) {
            return "center";
        }
        if (i2 == 3) {
            return "end";
        }
        AbstractC0441Bk1.c("unknown instance type");
        return "unset";
    }
}
