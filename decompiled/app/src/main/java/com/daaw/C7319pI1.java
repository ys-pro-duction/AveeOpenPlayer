package com.daaw;

import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.pI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7319pI1 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC9334wW1 a;

    public C7319pI1(InterfaceC9334wW1 interfaceC9334wW1) {
        this.a = interfaceC9334wW1;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.a;
        new zzca(interfaceC9334wW1.getContext(), interfaceC9334wW1.zzn().B, (String) obj).zzb();
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        zzt.zzo().u(th, "DefaultGmsgHandlers.attributionReportingManager");
    }
}
