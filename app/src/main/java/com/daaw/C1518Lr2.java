package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Lr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1518Lr2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C1518Lr2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0895Fr2((Context) this.a.zzb(), (AbstractC9212w32) this.b.zzb(), (Executor) this.c.zzb());
    }
}
