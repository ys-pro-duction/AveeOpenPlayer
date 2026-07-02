package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class VY1 implements XB2 {
    public final HY1 a;
    public Context b;
    public String c;

    public /* synthetic */ VY1(HY1 hy1, OY1 oy1) {
        this.a = hy1;
    }

    @Override // com.daaw.XB2
    public final /* synthetic */ XB2 a(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.daaw.XB2
    public final /* synthetic */ XB2 zza(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // com.daaw.XB2
    public final YB2 zzc() {
        AbstractC7000o83.c(this.b, Context.class);
        AbstractC7000o83.c(this.c, String.class);
        return new XY1(this.a, this.b, this.c, null);
    }
}
