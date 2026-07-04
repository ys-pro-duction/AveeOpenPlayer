package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Cr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0574Cr2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;

    public C0574Cr2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0470Br2 zzb() {
        return new C0470Br2((AbstractC9212w32) this.a.zzb(), (Context) this.b.zzb(), (Executor) this.c.zzb(), (C2958Zh2) this.d.zzb(), ((I62) this.e).a(), (WN2) this.f.zzb());
    }
}
