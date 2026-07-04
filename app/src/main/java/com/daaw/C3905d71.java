package com.daaw;

/* JADX INFO: renamed from: com.daaw.d71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3905d71 implements InterfaceC3626c71 {
    public final NQ a;
    public final NQ b;

    public C3905d71(NQ nq, NQ nq2) {
        G10.g(nq, "convertToVector");
        G10.g(nq2, "convertFromVector");
        this.a = nq;
        this.b = nq2;
    }

    @Override // com.daaw.InterfaceC3626c71
    public NQ a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC3626c71
    public NQ b() {
        return this.b;
    }
}
