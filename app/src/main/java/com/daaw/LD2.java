package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class LD2 {
    public final AG2 a;
    public final InterfaceC8104s62 b;
    public final Executor c;
    public KD2 d;

    public LD2(AG2 ag2, InterfaceC8104s62 interfaceC8104s62, Executor executor) {
        this.a = ag2;
        this.b = interfaceC8104s62;
        this.c = executor;
    }

    public final InterfaceFutureC8236sc0 c() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0E;
        KD2 kd2 = this.d;
        if (kd2 != null) {
            return AbstractC7360pS2.h(kd2);
        }
        if (((Boolean) IF1.a.e()).booleanValue()) {
            interfaceFutureC8236sc0E = AbstractC7360pS2.e(AbstractC7360pS2.m(AbstractC4839gS2.C(this.b.zzb().e(this.a.zza())), new ID2(this), this.c), C4090dn2.class, new HD2(this), this.c);
        } else {
            KD2 kd22 = new KD2(null, e(), null);
            this.d = kd22;
            interfaceFutureC8236sc0E = AbstractC7360pS2.h(kd22);
        }
        return AbstractC7360pS2.m(interfaceFutureC8236sc0E, new WN2() { // from class: com.daaw.qD2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return (KD2) obj;
            }
        }, this.c);
    }

    public final JG2 e() {
        FF2 ff2Zzg = this.b.zzg();
        return this.a.d(ff2Zzg.d, ff2Zzg.f, ff2Zzg.j);
    }
}
