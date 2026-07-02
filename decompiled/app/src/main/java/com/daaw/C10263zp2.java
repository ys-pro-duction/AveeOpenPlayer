package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.zp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10263zp2 {
    public final C9147vp2 a;
    public final PS2 b;

    public C10263zp2(C9147vp2 c9147vp2, PS2 ps2) {
        this.a = c9147vp2;
        this.b = ps2;
    }

    public final void a(InterfaceC9554xH2 interfaceC9554xH2) {
        final C9147vp2 c9147vp2 = this.a;
        AbstractC7360pS2.r(this.b.S0(new Callable() { // from class: com.daaw.xp2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c9147vp2.getWritableDatabase();
            }
        }), new C9984yp2(this, interfaceC9554xH2), this.b);
    }
}
