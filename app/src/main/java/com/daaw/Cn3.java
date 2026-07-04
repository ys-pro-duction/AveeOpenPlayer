package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Cn3 {
    public int a;
    public int b;
    public int c;
    public byte[] d;

    public Cn3() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    public final Cn3 a(int i) {
        this.b = 1;
        return this;
    }

    public final Cn3 b(int i) {
        this.a = 1;
        return this;
    }

    public final Cn3 c(int i) {
        this.c = i;
        return this;
    }

    public final Ho3 d() {
        return new Ho3(this.a, this.b, this.c, this.d);
    }

    public /* synthetic */ Cn3(Ho3 ho3, AbstractC6895nm3 abstractC6895nm3) {
        this.a = ho3.a;
        this.b = ho3.b;
        this.c = ho3.c;
        this.d = ho3.d;
    }
}
