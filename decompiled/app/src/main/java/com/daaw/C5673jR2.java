package com.daaw;

/* JADX INFO: renamed from: com.daaw.jR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5673jR2 extends AbstractRunnableC6240lR2 {
    public C5673jR2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Class cls, WR2 wr2) {
        super(interfaceFutureC8236sc0, cls, wr2);
    }

    @Override // com.daaw.AbstractRunnableC6240lR2
    public final /* bridge */ /* synthetic */ Object D(Object obj, Throwable th) {
        WR2 wr2 = (WR2) obj;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zza = wr2.zza(th);
        AbstractC5381iO2.d(interfaceFutureC8236sc0Zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", wr2);
        return interfaceFutureC8236sc0Zza;
    }

    @Override // com.daaw.AbstractRunnableC6240lR2
    public final /* synthetic */ void E(Object obj) {
        u((InterfaceFutureC8236sc0) obj);
    }
}
