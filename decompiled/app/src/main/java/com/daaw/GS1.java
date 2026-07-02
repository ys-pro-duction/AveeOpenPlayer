package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class GS1 {
    public final int a;

    public GS1(int i, int i2) {
        this.a = i2;
    }

    public final int a() {
        int i = this.a;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
