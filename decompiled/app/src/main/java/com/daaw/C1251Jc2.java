package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Jc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1251Jc2 implements InterfaceC4758g83 {
    public final C8517tc2 a;
    public final InterfaceC8394t83 b;

    public C1251Jc2(C8517tc2 c8517tc2, InterfaceC8394t83 interfaceC8394t83) {
        this.a = c8517tc2;
        this.b = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.a.d((Executor) this.b.zzb());
    }
}
