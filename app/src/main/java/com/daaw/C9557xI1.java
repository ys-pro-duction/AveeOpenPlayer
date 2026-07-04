package com.daaw;

import com.google.android.gms.ads.internal.util.zzbq;

/* JADX INFO: renamed from: com.daaw.xI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9557xI1 implements InterfaceC5526iu1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ PK1 b;

    public C9557xI1(zzbq zzbqVar, String str, PK1 pk1) {
        this.a = str;
        this.b = pk1;
    }

    @Override // com.daaw.InterfaceC5526iu1
    public final void a(C6933nu1 c6933nu1) {
        AbstractC4274eT1.zzj("Failed to load URL: " + this.a + "\n" + c6933nu1.toString());
        this.b.zza(null);
    }
}
