package com.daaw;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcn;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class UB2 implements InterfaceC1447Kz2 {
    public final PS2 a;

    public UB2(PS2 ps2) {
        this.a = ps2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 51;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.TB2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) zzba.zzc().b(AbstractC9820yE1.K);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().b(AbstractC9820yE1.L)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, zzcn.zza(str2));
                        }
                    }
                }
                return new VB2(map);
            }
        });
    }
}
