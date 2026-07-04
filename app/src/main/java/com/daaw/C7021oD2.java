package com.daaw;

/* JADX INFO: renamed from: com.daaw.oD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7021oD2 implements PD2 {
    public InterfaceC8104s62 a;

    @Override // com.daaw.PD2
    public final /* bridge */ /* synthetic */ InterfaceFutureC8236sc0 a(QD2 qd2, OD2 od2, Object obj) {
        return c(qd2, od2, null);
    }

    @Override // com.daaw.PD2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC8104s62 zzd() {
        return this.a;
    }

    public final synchronized InterfaceFutureC8236sc0 c(QD2 qd2, OD2 od2, InterfaceC8104s62 interfaceC8104s62) {
        V42 v42Zzb;
        try {
            if (interfaceC8104s62 != null) {
                this.a = interfaceC8104s62;
            } else {
                this.a = (InterfaceC8104s62) od2.a(qd2.b).zzh();
            }
            v42Zzb = this.a.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return v42Zzb.i(v42Zzb.j());
    }
}
