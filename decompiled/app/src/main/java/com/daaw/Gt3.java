package com.daaw;

import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

/* JADX INFO: loaded from: classes.dex */
public final class Gt3 implements InterfaceC6244lS2 {
    public final /* synthetic */ zzaa a;

    public Gt3(zzaa zzaaVar) {
        this.a = zzaaVar;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* synthetic */ void a(Object obj) {
        AbstractC4274eT1.zze("Initialized webview successfully for SDKCore.");
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        zzt.zzo().u(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.a;
        zzf.zzc(zzaaVar.N, zzaaVar.F, "sgf", new Pair("sgf_reason", th.getMessage()));
        AbstractC4274eT1.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }
}
