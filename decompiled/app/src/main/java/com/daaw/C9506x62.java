package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.x62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9506x62 implements InterfaceC4758g83 {
    public final C8948v62 a;
    public final InterfaceC8394t83 b;

    public C9506x62(C8948v62 c8948v62, InterfaceC8394t83 interfaceC8394t83) {
        this.a = c8948v62;
        this.b = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = this.a.a(((LX1) this.b).a());
        AbstractC7000o83.b(contextA);
        return contextA;
    }
}
