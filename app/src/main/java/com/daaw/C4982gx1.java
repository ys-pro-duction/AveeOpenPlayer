package com.daaw;

/* JADX INFO: renamed from: com.daaw.gx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4982gx1 implements InterfaceC10128zL2 {
    public final /* synthetic */ SK2 a;

    public C4982gx1(SK2 sk2) {
        this.a = sk2;
    }

    @Override // com.daaw.InterfaceC10128zL2
    public final void a(int i, long j, String str) {
        this.a.e(i, System.currentTimeMillis() - j, str);
    }

    @Override // com.daaw.InterfaceC10128zL2
    public final void b(int i, long j) {
        this.a.d(i, System.currentTimeMillis() - j);
    }
}
