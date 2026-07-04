package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.eB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4203eB2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final Context b;
    public final C3367bB1 c;

    public C4203eB2(C3367bB1 c3367bB1, PS2 ps2, Context context) {
        this.c = c3367bB1;
        this.a = ps2;
        this.b = context;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 45;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.dB2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C4482fB2(new JSONObject());
            }
        });
    }
}
