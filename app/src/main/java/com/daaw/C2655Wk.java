package com.daaw;

/* JADX INFO: renamed from: com.daaw.Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2655Wk implements InterfaceC6921ns {
    public final String a;
    public final X6 b;
    public final O6 c;
    public final boolean d;
    public final boolean e;

    public C2655Wk(String str, X6 x6, O6 o6, boolean z, boolean z2) {
        this.a = str;
        this.b = x6;
        this.c = o6;
        this.d = z;
        this.e = z2;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new SF(c4615ff0, abstractC9647xe, this);
    }

    public String b() {
        return this.a;
    }

    public X6 c() {
        return this.b;
    }

    public O6 d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
