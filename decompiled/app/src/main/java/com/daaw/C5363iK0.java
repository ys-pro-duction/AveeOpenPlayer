package com.daaw;

/* JADX INFO: renamed from: com.daaw.iK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5363iK0 implements InterfaceC6921ns {
    public final String a;
    public final X6 b;

    public C5363iK0(String str, X6 x6) {
        this.a = str;
        this.b = x6;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new C5643jK0(c4615ff0, abstractC9647xe, this);
    }

    public X6 b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }
}
