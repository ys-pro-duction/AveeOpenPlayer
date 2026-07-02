package com.daaw;

/* JADX INFO: renamed from: com.daaw.xR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9592xR0 implements InterfaceC6921ns {
    public final String a;
    public final int b;
    public final Q6 c;
    public final boolean d;

    public C9592xR0(String str, int i, Q6 q6, boolean z) {
        this.a = str;
        this.b = i;
        this.c = q6;
        this.d = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new C6517mR0(c4615ff0, abstractC9647xe, this);
    }

    public String b() {
        return this.a;
    }

    public Q6 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
