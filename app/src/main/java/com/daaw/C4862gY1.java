package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.gY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4862gY1 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C4862gY1(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final QP1 zzb() {
        Context contextA = ((LX1) this.a).a();
        WI2 wi2 = (WI2) this.b.zzb();
        C9011vL1 c9011vL1B = zzt.zzf().b(contextA, zzcaz.e(), wi2);
        InterfaceC5927kL1 interfaceC5927kL1 = AbstractC6773nL1.b;
        c9011vL1B.a("google.afma.request.getAdDictionary", interfaceC5927kL1, interfaceC5927kL1);
        return new PP1(contextA, zzt.zzf().b(contextA, zzcaz.e(), wi2).a("google.afma.sdkConstants.getSdkConstants", interfaceC5927kL1, interfaceC5927kL1));
    }
}
