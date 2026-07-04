package com.daaw;

/* JADX INFO: renamed from: com.daaw.aL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3128aL1 implements FT1 {
    public final /* synthetic */ C3407bL1 a;

    public C3128aL1(C3407bL1 c3407bL1) {
        this.a = c3407bL1;
    }

    @Override // com.daaw.FT1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final InterfaceC8442tK1 interfaceC8442tK1 = (InterfaceC8442tK1) obj;
        AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.ZK1
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8442tK1 interfaceC8442tK12 = interfaceC8442tK1;
                interfaceC8442tK12.r("/result", GI1.o);
                interfaceC8442tK12.zzc();
            }
        });
    }
}
