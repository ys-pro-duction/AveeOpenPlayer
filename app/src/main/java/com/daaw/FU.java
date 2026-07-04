package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class FU {
    public static final C4908gi d = C4908gi.h(":status");
    public static final C4908gi e = C4908gi.h(":method");
    public static final C4908gi f = C4908gi.h(":path");
    public static final C4908gi g = C4908gi.h(":scheme");
    public static final C4908gi h = C4908gi.h(":authority");
    public static final C4908gi i = C4908gi.h(":host");
    public static final C4908gi j = C4908gi.h(":version");
    public final C4908gi a;
    public final C4908gi b;
    public final int c;

    public FU(String str, String str2) {
        this(C4908gi.h(str), C4908gi.h(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof FU) {
            FU fu = (FU) obj;
            if (this.a.equals(fu.a) && this.b.equals(fu.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.a.y(), this.b.y());
    }

    public FU(C4908gi c4908gi, String str) {
        this(c4908gi, C4908gi.h(str));
    }

    public FU(C4908gi c4908gi, C4908gi c4908gi2) {
        this.a = c4908gi;
        this.b = c4908gi2;
        this.c = c4908gi.s() + 32 + c4908gi2.s();
    }
}
