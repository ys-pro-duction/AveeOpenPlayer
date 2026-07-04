package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class XH0 {
    public static final XH0 b = new XH0(0);
    public final int a;

    public XH0(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && XH0.class == obj.getClass() && this.a == ((XH0) obj).a;
    }

    public int hashCode() {
        return this.a;
    }
}
