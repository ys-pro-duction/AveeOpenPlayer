package com.daaw;

/* JADX INFO: renamed from: com.daaw.dt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4118dt1 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public C4118dt1(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final int a() {
        d();
        return this.d;
    }

    public final String b() {
        d();
        return this.e;
    }

    public final void c() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        this.e = this.a + i2;
    }

    public final void d() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
