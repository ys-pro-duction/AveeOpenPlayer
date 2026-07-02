package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.hZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5145hZ1 implements XC2 {
    public final Context a;
    public final zzq b;
    public final String c;
    public final HY1 d;
    public final C5145hZ1 e = this;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;
    public final InterfaceC8394t83 i;
    public final InterfaceC8394t83 j;
    public final InterfaceC8394t83 k;

    public /* synthetic */ C5145hZ1(HY1 hy1, Context context, String str, zzq zzqVar, AbstractC4866gZ1 abstractC4866gZ1) {
        this.d = hy1;
        this.a = context;
        this.b = zzqVar;
        this.c = str;
        InterfaceC4758g83 interfaceC4758g83A = C5037h83.a(context);
        this.f = interfaceC4758g83A;
        InterfaceC4758g83 interfaceC4758g83A2 = C5037h83.a(zzqVar);
        this.g = interfaceC4758g83A2;
        InterfaceC8394t83 interfaceC8394t83B = C4469f83.b(new C8897uv2(hy1.o));
        this.h = interfaceC8394t83B;
        InterfaceC8394t83 interfaceC8394t83B2 = C4469f83.b(C10292zv2.a());
        this.i = interfaceC8394t83B2;
        InterfaceC8394t83 interfaceC8394t83B3 = C4469f83.b(C4871ga2.a());
        this.j = interfaceC8394t83B3;
        this.k = C4469f83.b(new VC2(interfaceC4758g83A, hy1.p, interfaceC4758g83A2, hy1.V, interfaceC8394t83B, interfaceC8394t83B2, HF2.a(), interfaceC8394t83B3));
    }

    @Override // com.daaw.XC2
    public final BinderC2594Vu2 zza() {
        UC2 uc2 = (UC2) this.k.zzb();
        C8611tv2 c8611tv2 = (C8611tv2) this.h.zzb();
        zzcaz zzcazVarD = this.d.b.d();
        AbstractC7000o83.b(zzcazVarD);
        return new BinderC2594Vu2(this.a, this.b, this.c, uc2, c8611tv2, zzcazVarD, (C1071Hj2) this.d.a0.zzb());
    }
}
