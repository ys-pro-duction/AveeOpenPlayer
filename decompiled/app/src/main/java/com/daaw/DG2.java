package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class DG2 {
    public final CG2 a = new CG2();
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final CG2 a() {
        CG2 cg2 = this.a;
        CG2 cg2Clone = cg2.clone();
        cg2.B = false;
        cg2.C = false;
        return cg2Clone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.d + "\n\tNew pools created: " + this.b + "\n\tPools removed: " + this.c + "\n\tEntries added: " + this.f + "\n\tNo entries retrieved: " + this.e + "\n";
    }

    public final void c() {
        this.f++;
    }

    public final void d() {
        this.b++;
        this.a.B = true;
    }

    public final void e() {
        this.e++;
    }

    public final void f() {
        this.d++;
    }

    public final void g() {
        this.c++;
        this.a.C = true;
    }
}
