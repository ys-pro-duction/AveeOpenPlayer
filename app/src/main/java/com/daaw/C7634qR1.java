package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: renamed from: com.daaw.qR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7634qR1 extends KR1 {
    public final InterfaceC5485im b;
    public final C7634qR1 c = this;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;
    public final InterfaceC8394t83 i;
    public final InterfaceC8394t83 j;
    public final InterfaceC8394t83 k;

    public /* synthetic */ C7634qR1(Context context, InterfaceC5485im interfaceC5485im, zzg zzgVar, JR1 jr1, AbstractC7355pR1 abstractC7355pR1) {
        this.b = interfaceC5485im;
        InterfaceC4758g83 interfaceC4758g83A = C5037h83.a(context);
        this.d = interfaceC4758g83A;
        InterfaceC4758g83 interfaceC4758g83A2 = C5037h83.a(zzgVar);
        this.e = interfaceC4758g83A2;
        InterfaceC4758g83 interfaceC4758g83A3 = C5037h83.a(jr1);
        this.f = interfaceC4758g83A3;
        this.g = C4469f83.b(new C3988dR1(interfaceC4758g83A, interfaceC4758g83A2, interfaceC4758g83A3));
        InterfaceC4758g83 interfaceC4758g83A4 = C5037h83.a(interfaceC5485im);
        this.h = interfaceC4758g83A4;
        InterfaceC8394t83 interfaceC8394t83B = C4469f83.b(new C4555fR1(interfaceC4758g83A4, interfaceC4758g83A2, interfaceC4758g83A3));
        this.i = interfaceC8394t83B;
        C6518mR1 c6518mR1 = new C6518mR1(interfaceC4758g83A4, interfaceC8394t83B);
        this.j = c6518mR1;
        this.k = C4469f83.b(new UR1(interfaceC4758g83A, c6518mR1));
    }

    @Override // com.daaw.KR1
    public final SharedPreferencesOnSharedPreferenceChangeListenerC3709cR1 a() {
        return (SharedPreferencesOnSharedPreferenceChangeListenerC3709cR1) this.g.zzb();
    }

    @Override // com.daaw.KR1
    public final C6239lR1 b() {
        return new C6239lR1(this.b, (C4266eR1) this.i.zzb());
    }

    @Override // com.daaw.KR1
    public final TR1 c() {
        return (TR1) this.k.zzb();
    }
}
