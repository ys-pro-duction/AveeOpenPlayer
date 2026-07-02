package com.daaw;

import com.google.android.gms.ads.internal.zzi;

/* JADX INFO: renamed from: com.daaw.u73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8668u73 implements InterfaceC10128zL2 {
    public final /* synthetic */ zzi a;

    public C8668u73(zzi zziVar) {
        this.a = zziVar;
    }

    @Override // com.daaw.InterfaceC10128zL2
    public final void a(int i, long j, String str) {
        this.a.I.e(i, System.currentTimeMillis() - j, str);
    }

    @Override // com.daaw.InterfaceC10128zL2
    public final void b(int i, long j) {
        this.a.I.d(i, System.currentTimeMillis() - j);
    }
}
