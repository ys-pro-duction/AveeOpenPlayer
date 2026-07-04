package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.q62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7547q62 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;
    public final InterfaceC8394t83 i;
    public final InterfaceC8394t83 j;
    public final InterfaceC8394t83 k;
    public final InterfaceC8394t83 l;

    public C7547q62(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836, InterfaceC8394t83 interfaceC8394t837, InterfaceC8394t83 interfaceC8394t838, InterfaceC8394t83 interfaceC8394t839, InterfaceC8394t83 interfaceC8394t8310, InterfaceC8394t83 interfaceC8394t8311, InterfaceC8394t83 interfaceC8394t8312) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
        this.g = interfaceC8394t837;
        this.h = interfaceC8394t838;
        this.i = interfaceC8394t839;
        this.j = interfaceC8394t8310;
        this.k = interfaceC8394t8311;
        this.l = interfaceC8394t8312;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7268p62 zzb() {
        YH2 yh2 = (YH2) this.a.zzb();
        zzcaz zzcazVarA = ((XX1) this.b).a();
        ApplicationInfo applicationInfoZzb = ((C4652fm2) this.c).zzb();
        String strZzb = ((C7173om2) this.d).zzb();
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.a;
        return new C7268p62(yh2, zzcazVarA, applicationInfoZzb, strZzb, zzba.zza().a(), (PackageInfo) this.f.zzb(), C4469f83.a(this.g), ((JX1) this.h).zzb(), (String) this.i.zzb(), ((C2302Sz2) this.j).zzb(), ((I62) this.k).a(), (C7949ra2) this.l.zzb());
    }
}
