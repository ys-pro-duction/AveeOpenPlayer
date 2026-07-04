package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: renamed from: com.daaw.dR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3988dR1 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C3988dR1(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new SharedPreferencesOnSharedPreferenceChangeListenerC3709cR1((Context) this.a.zzb(), (zzg) this.b.zzb(), (JR1) this.c.zzb());
    }
}
