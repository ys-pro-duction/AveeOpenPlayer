package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.mi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6595mi2 implements InterfaceC7552q72 {
    public final InterfaceC9334wW1 B;

    public C6595mi2(InterfaceC9334wW1 interfaceC9334wW1) {
        this.B = interfaceC9334wW1;
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void a(Context context) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.onResume();
        }
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void e(Context context) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.destroy();
        }
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void o(Context context) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.onPause();
        }
    }
}
