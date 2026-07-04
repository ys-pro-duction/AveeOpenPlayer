package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class IZ1 implements InterfaceC3937dE2 {
    public final HY1 a;
    public Context b;
    public String c;
    public zzq d;

    public /* synthetic */ IZ1(HY1 hy1, HZ1 hz1) {
        this.a = hy1;
    }

    @Override // com.daaw.InterfaceC3937dE2
    public final /* synthetic */ InterfaceC3937dE2 a(zzq zzqVar) {
        zzqVar.getClass();
        this.d = zzqVar;
        return this;
    }

    @Override // com.daaw.InterfaceC3937dE2
    public final /* synthetic */ InterfaceC3937dE2 b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.daaw.InterfaceC3937dE2
    public final /* synthetic */ InterfaceC3937dE2 zzb(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // com.daaw.InterfaceC3937dE2
    public final InterfaceC4215eE2 zzd() {
        AbstractC7000o83.c(this.b, Context.class);
        AbstractC7000o83.c(this.c, String.class);
        AbstractC7000o83.c(this.d, zzq.class);
        return new KZ1(this.a, this.b, this.c, this.d, null);
    }
}
