package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Jf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263Jf2 implements InterfaceC4758g83 {
    public final C0526Cf2 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C1263Jf2(C0526Cf2 c0526Cf2, InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = c0526Cf2;
        this.b = interfaceC8394t83;
        this.c = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0623Db2(((C9107vh2) this.b).zzb(), (Executor) this.c.zzb());
    }
}
