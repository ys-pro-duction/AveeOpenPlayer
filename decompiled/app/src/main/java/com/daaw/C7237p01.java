package com.daaw;

/* JADX INFO: renamed from: com.daaw.p01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7237p01 {
    public final String a;
    public final int b;

    public C7237p01(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7237p01)) {
            return false;
        }
        C7237p01 c7237p01 = (C7237p01) obj;
        if (this.b != c7237p01.b) {
            return false;
        }
        return this.a.equals(c7237p01.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
