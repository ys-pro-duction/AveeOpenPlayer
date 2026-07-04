package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzad;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Hz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1135Hz2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final Context b;

    public C1135Hz2(PS2 ps2, Context context) {
        this.a = ps2;
        this.b = context;
    }

    public final /* synthetic */ InterfaceC1343Jz2 a() {
        final Bundle bundleZzb = zzad.zzb(this.b, (String) zzba.zzc().b(AbstractC9820yE1.b6));
        if (bundleZzb.isEmpty()) {
            return null;
        }
        return new InterfaceC1343Jz2() { // from class: com.daaw.Gz2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", bundleZzb);
            }
        };
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 37;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.Fz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
