package com.daaw;

/* JADX INFO: renamed from: com.daaw.wF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9266wF1 implements InterfaceC3387bG1 {
    public final ES2 a;
    public final String b;

    public C9266wF1(ES2 es2, String str) {
        this.a = es2;
        this.b = str;
    }

    @Override // com.daaw.InterfaceC3387bG1
    public final ES2 a(InterfaceC1637Mv1 interfaceC1637Mv1) {
        ES2 es2A = this.a.a();
        es2A.e(this.b, interfaceC1637Mv1);
        return es2A;
    }
}
