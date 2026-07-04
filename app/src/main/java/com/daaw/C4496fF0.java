package com.daaw;

/* JADX INFO: renamed from: com.daaw.fF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4496fF0 implements InterfaceC6921ns {
    public final String a;
    public final X6 b;
    public final X6 c;
    public final I6 d;
    public final boolean e;

    public C4496fF0(String str, X6 x6, X6 x62, I6 i6, boolean z) {
        this.a = str;
        this.b = x6;
        this.c = x62;
        this.d = i6;
        this.e = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new C4217eF0(c4615ff0, abstractC9647xe, this);
    }

    public I6 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public X6 d() {
        return this.b;
    }

    public X6 e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
