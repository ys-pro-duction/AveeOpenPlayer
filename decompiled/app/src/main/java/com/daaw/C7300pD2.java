package com.daaw;

/* JADX INFO: renamed from: com.daaw.pD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7300pD2 implements PD2 {
    public final PD2 a;
    public InterfaceC8104s62 b;

    public C7300pD2(PD2 pd2) {
        this.a = pd2;
    }

    @Override // com.daaw.PD2
    public final /* bridge */ /* synthetic */ InterfaceFutureC8236sc0 a(QD2 qd2, OD2 od2, Object obj) {
        return c(qd2, od2, null);
    }

    @Override // com.daaw.PD2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC8104s62 zzd() {
        return this.b;
    }

    public final synchronized InterfaceFutureC8236sc0 c(QD2 qd2, OD2 od2, InterfaceC8104s62 interfaceC8104s62) {
        this.b = interfaceC8104s62;
        if (qd2.a == null) {
            return ((C7021oD2) this.a).c(qd2, od2, interfaceC8104s62);
        }
        V42 v42Zzb = interfaceC8104s62.zzb();
        return v42Zzb.i(v42Zzb.k(AbstractC7360pS2.h(qd2.a)));
    }
}
