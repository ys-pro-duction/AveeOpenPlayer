package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.daaw.nm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6894nm2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C6894nm2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return C6878nj1.a((Context) this.a.zzb()).f(((C4652fm2) this.b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
