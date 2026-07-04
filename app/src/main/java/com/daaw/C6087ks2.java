package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.ks2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6087ks2 implements InterfaceC3761cd2 {
    public final C4498fF2 a;
    public final ZM1 b;
    public final AdFormat c;
    public C6715n72 d = null;

    public C6087ks2(C4498fF2 c4498fF2, ZM1 zm1, AdFormat adFormat) {
        this.a = c4498fF2;
        this.b = zm1;
        this.c = adFormat;
    }

    @Override // com.daaw.InterfaceC3761cd2
    public final void a(boolean z, Context context, C4184e72 c4184e72) throws C3483bd2 {
        boolean z2;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.c.ordinal();
            if (iOrdinal == 1) {
                z2 = this.b.z(BinderC7744qp0.Z2(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 6) {
                        z2 = this.b.s(BinderC7744qp0.Z2(context));
                    }
                    throw new C3483bd2("Adapter failed to show.");
                }
                z2 = this.b.z1(BinderC7744qp0.Z2(context));
            }
            if (z2) {
                if (this.d == null) {
                    return;
                }
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u1)).booleanValue() || this.a.a0 != 2) {
                    return;
                }
                this.d.zza();
                return;
            }
            throw new C3483bd2("Adapter failed to show.");
        } catch (Throwable th) {
            throw new C3483bd2(th);
        }
    }

    public final void b(C6715n72 c6715n72) {
        this.d = c6715n72;
    }
}
