package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: renamed from: com.daaw.oR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7076oR1 {
    public Context a;
    public InterfaceC5485im b;
    public zzg c;
    public JR1 d;

    public /* synthetic */ C7076oR1(AbstractC6797nR1 abstractC6797nR1) {
    }

    public final C7076oR1 a(zzg zzgVar) {
        this.c = zzgVar;
        return this;
    }

    public final C7076oR1 b(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    public final C7076oR1 c(InterfaceC5485im interfaceC5485im) {
        interfaceC5485im.getClass();
        this.b = interfaceC5485im;
        return this;
    }

    public final C7076oR1 d(JR1 jr1) {
        this.d = jr1;
        return this;
    }

    public final KR1 e() {
        AbstractC7000o83.c(this.a, Context.class);
        AbstractC7000o83.c(this.b, InterfaceC5485im.class);
        AbstractC7000o83.c(this.c, zzg.class);
        AbstractC7000o83.c(this.d, JR1.class);
        return new C7634qR1(this.a, this.b, this.c, this.d, null);
    }
}
