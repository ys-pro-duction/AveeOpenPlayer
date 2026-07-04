package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class O03 implements NW2 {
    public final Context a;
    public final NW2 b;

    public O03(Context context) {
        W13 w13 = new W13();
        this.a = context.getApplicationContext();
        this.b = w13;
    }

    @Override // com.daaw.NW2
    public final /* bridge */ /* synthetic */ InterfaceC7659qX2 zza() {
        return new C8080s13(this.a, ((W13) this.b).zza());
    }
}
