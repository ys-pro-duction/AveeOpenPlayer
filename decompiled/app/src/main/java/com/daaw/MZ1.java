package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class MZ1 implements YE2 {
    public final HY1 a;
    public Context b;
    public String c;

    public /* synthetic */ MZ1(HY1 hy1, LZ1 lz1) {
        this.a = hy1;
    }

    @Override // com.daaw.YE2
    public final /* synthetic */ YE2 a(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.daaw.YE2
    public final /* synthetic */ YE2 zza(String str) {
        this.c = str;
        return this;
    }

    @Override // com.daaw.YE2
    public final ZE2 zzc() {
        AbstractC7000o83.c(this.b, Context.class);
        return new OZ1(this.a, this.b, this.c, null);
    }
}
