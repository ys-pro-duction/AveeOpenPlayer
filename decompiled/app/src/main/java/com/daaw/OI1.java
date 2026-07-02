package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class OI1 implements InterfaceC6244lS2 {
    public final /* synthetic */ zza a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SI1 d;

    public OI1(SI1 si1, zza zzaVar, Map map, String str) {
        this.d = si1;
        this.a = zzaVar;
        this.b = map;
        this.c = str;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        zza zzaVar = this.a;
        Map map = this.b;
        String str = this.c;
        this.d.h((String) obj, zzaVar, map, str);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        zzt.zzo().u(th, "OpenGmsgHandler.attributionReportingManager");
    }
}
