package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.Fk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0866Fk1 implements InterfaceC1589Mj1 {
    public final InterfaceC1797Oj1 a;
    public final InterfaceC1797Oj1 b;

    public C0866Fk1(InterfaceC1797Oj1 interfaceC1797Oj1, InterfaceC1797Oj1 interfaceC1797Oj12) {
        this.a = interfaceC1797Oj1;
        this.b = interfaceC1797Oj12;
    }

    @Override // com.daaw.InterfaceC1797Oj1
    public final /* bridge */ /* synthetic */ Object a() {
        return new C0337Ak1((Context) this.a.a(), (C5199hk1) this.b.a());
    }
}
