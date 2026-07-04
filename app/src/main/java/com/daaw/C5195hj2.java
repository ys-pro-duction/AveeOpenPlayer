package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.hj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5195hj2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;

    public C5195hj2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String str = (String) this.a.zzb();
        Context contextA = ((LX1) this.b).a();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        Map mapZzb = ((C5875k83) this.d).zzb();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.M4)).booleanValue()) {
            C6454mB1 c6454mB1 = new C6454mB1(new C9250wB1(contextA));
            c6454mB1.b(new InterfaceC6175lB1() { // from class: com.daaw.ij2
                @Override // com.daaw.InterfaceC6175lB1
                public final void a(C5891kC1 c5891kC1) {
                    c5891kC1.w(str);
                }
            });
            setSingleton = Collections.singleton(new C0623Db2(new C6033kj2(c6454mB1, mapZzb), ps2));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        AbstractC7000o83.b(setSingleton);
        return setSingleton;
    }
}
