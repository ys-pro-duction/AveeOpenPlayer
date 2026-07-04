package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class KA2 implements InterfaceC1447Kz2 {
    public final Context a;
    public final String b;
    public final PS2 c;

    public KA2(HP1 hp1, Context context, String str, PS2 ps2) {
        this.a = context;
        this.b = str;
        this.c = ps2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 42;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.c.S0(new Callable() { // from class: com.daaw.JA2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new LA2(new JSONObject());
            }
        });
    }
}
