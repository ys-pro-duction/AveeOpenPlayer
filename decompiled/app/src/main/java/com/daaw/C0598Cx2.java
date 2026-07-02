package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Cx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0598Cx2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final C10228zi2 b;
    public final String c;
    public final FF2 d;

    public C0598Cx2(PS2 ps2, C10228zi2 c10228zi2, FF2 ff2, String str) {
        this.a = ps2;
        this.b = c10228zi2;
        this.d = ff2;
        this.c = str;
    }

    public final /* synthetic */ C0711Dx2 a() {
        FF2 ff2 = this.d;
        C10228zi2 c10228zi2 = this.b;
        return new C0711Dx2(c10228zi2.b(ff2.f, this.c), c10228zi2.a());
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 17;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.Bx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
