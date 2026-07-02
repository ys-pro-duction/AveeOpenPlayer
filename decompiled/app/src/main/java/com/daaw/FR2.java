package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class FR2 extends HR2 {
    public FR2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, WR2 wr2) {
        super(interfaceFutureC8236sc0, wr2);
    }

    @Override // com.daaw.HR2
    public final /* bridge */ /* synthetic */ Object D(Object obj, Object obj2) {
        WR2 wr2 = (WR2) obj;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zza = wr2.zza(obj2);
        AbstractC5381iO2.d(interfaceFutureC8236sc0Zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", wr2);
        return interfaceFutureC8236sc0Zza;
    }

    @Override // com.daaw.HR2
    public final /* synthetic */ void E(Object obj) {
        u((InterfaceFutureC8236sc0) obj);
    }
}
