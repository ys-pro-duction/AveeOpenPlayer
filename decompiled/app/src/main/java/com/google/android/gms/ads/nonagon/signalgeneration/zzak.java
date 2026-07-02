package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.daaw.AbstractC7360pS2;
import com.daaw.C9132vm2;
import com.daaw.InterfaceFutureC8236sc0;
import com.daaw.WR2;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbvg;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class zzak implements WR2 {
    public final Executor a;
    public final C9132vm2 b;

    public zzak(Executor executor, C9132vm2 c9132vm2) {
        this.a = executor;
        this.b = c9132vm2;
    }

    @Override // com.daaw.WR2
    public final /* bridge */ /* synthetic */ InterfaceFutureC8236sc0 zza(Object obj) {
        final zzbvg zzbvgVar = (zzbvg) obj;
        return AbstractC7360pS2.n(this.b.b(zzbvgVar), new WR2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj2) {
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzay.zzb().l(zzbvgVar.B).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = "{}";
                }
                return AbstractC7360pS2.h(zzamVar);
            }
        }, this.a);
    }
}
