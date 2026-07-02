package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: renamed from: com.daaw.fZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4587fZ1 implements WC2 {
    public final HY1 a;
    public Context b;
    public String c;
    public zzq d;

    public /* synthetic */ C4587fZ1(HY1 hy1, AbstractC4298eZ1 abstractC4298eZ1) {
        this.a = hy1;
    }

    @Override // com.daaw.WC2
    public final /* synthetic */ WC2 a(zzq zzqVar) {
        zzqVar.getClass();
        this.d = zzqVar;
        return this;
    }

    @Override // com.daaw.WC2
    public final /* synthetic */ WC2 b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.daaw.WC2
    public final /* synthetic */ WC2 zzb(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // com.daaw.WC2
    public final XC2 zzd() {
        AbstractC7000o83.c(this.b, Context.class);
        AbstractC7000o83.c(this.c, String.class);
        AbstractC7000o83.c(this.d, zzq.class);
        return new C5145hZ1(this.a, this.b, this.c, this.d, null);
    }
}
