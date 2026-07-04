package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Fs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0899Fs2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C0899Fs2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0795Es2((Context) this.a.zzb(), (AbstractC7686qd2) this.b.zzb(), (Executor) this.c.zzb());
    }
}
