package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.pB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7292pB2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final List b;
    public final C4214eE1 c;

    public C7292pB2(C4214eE1 c4214eE1, PS2 ps2, List list) {
        this.c = c4214eE1;
        this.a = ps2;
        this.b = list;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 48;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.oB2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C7571qB2(this.a.b);
            }
        });
    }
}
