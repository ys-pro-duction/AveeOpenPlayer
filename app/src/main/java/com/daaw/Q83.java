package com.daaw;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class Q83 implements InterfaceC1534Lv2 {
    public final /* synthetic */ C9327wU2 a;

    public Q83(U83 u83, C9327wU2 c9327wU2) {
        this.a = c9327wU2;
    }

    @Override // com.daaw.InterfaceC1534Lv2
    public final boolean zza() {
        return this.a.m() && Log.isLoggable(this.a.w().D(), 3);
    }
}
