package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.yt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10004yt2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C10004yt2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C9725xt2((Context) this.a.zzb(), (Executor) this.b.zzb(), (AbstractC1167Ih2) this.c.zzb());
    }
}
