package com.daaw;

/* JADX INFO: renamed from: com.daaw.cT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3718cT2 extends OS2 {
    public final RR2 D;
    public final /* synthetic */ RunnableFutureC4275eT2 E;

    public C3718cT2(RunnableFutureC4275eT2 runnableFutureC4275eT2, RR2 rr2) {
        this.E = runnableFutureC4275eT2;
        this.D = rr2;
    }

    @Override // com.daaw.OS2
    public final /* bridge */ /* synthetic */ Object a() {
        RR2 rr2 = this.D;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zza = rr2.zza();
        AbstractC5381iO2.d(interfaceFutureC8236sc0Zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", rr2);
        return interfaceFutureC8236sc0Zza;
    }

    @Override // com.daaw.OS2
    public final String b() {
        return this.D.toString();
    }

    @Override // com.daaw.OS2
    public final void d(Throwable th) {
        this.E.f(th);
    }

    @Override // com.daaw.OS2
    public final /* synthetic */ void e(Object obj) {
        this.E.u((InterfaceFutureC8236sc0) obj);
    }

    @Override // com.daaw.OS2
    public final boolean f() {
        return this.E.isDone();
    }
}
