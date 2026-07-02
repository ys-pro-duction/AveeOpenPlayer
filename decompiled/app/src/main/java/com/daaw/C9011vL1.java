package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.vL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9011vL1 {
    public static final zzbd b = new C7052oL1();
    public static final zzbd c = new C7331pL1();
    public final C3685cL1 a;

    public C9011vL1(Context context, zzcaz zzcazVar, String str, WI2 wi2) {
        this.a = new C3685cL1(context, zzcazVar, str, b, c, wi2);
    }

    public final InterfaceC4810gL1 a(String str, InterfaceC5648jL1 interfaceC5648jL1, InterfaceC5368iL1 interfaceC5368iL1) {
        return new C10127zL1(this.a, str, interfaceC5648jL1, interfaceC5368iL1);
    }

    public final EL1 b() {
        return new EL1(this.a);
    }
}
