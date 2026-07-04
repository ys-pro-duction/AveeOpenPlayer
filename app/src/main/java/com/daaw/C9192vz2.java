package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.vz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9192vz2 implements InterfaceC1447Kz2 {
    public final JR1 a;
    public final PS2 b;
    public final Context c;

    public C9192vz2(JR1 jr1, PS2 ps2, Context context) {
        this.a = jr1;
        this.b = ps2;
        this.c = context;
    }

    public final /* synthetic */ C9471wz2 a() {
        if (!this.a.z(this.c)) {
            return new C9471wz2(null, null, null, null, null);
        }
        String strJ = this.a.j(this.c);
        String str = strJ == null ? "" : strJ;
        String strH = this.a.h(this.c);
        String str2 = strH == null ? "" : strH;
        String strF = this.a.f(this.c);
        String str3 = strF == null ? "" : strF;
        String strG = this.a.g(this.c);
        return new C9471wz2(str, str2, str3, strG == null ? "" : strG, "TIME_OUT".equals(str2) ? (Long) zzba.zzc().b(AbstractC9820yE1.f0) : null);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 34;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.b.S0(new Callable() { // from class: com.daaw.uz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
