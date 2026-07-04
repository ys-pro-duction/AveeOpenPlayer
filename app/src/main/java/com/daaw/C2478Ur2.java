package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.daaw.C4972gv;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Ur2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2478Ur2 implements InterfaceC2682Wq2 {
    public final Context a;
    public final AbstractC1978Qc2 b;
    public final Executor c;
    public final C4219eF2 d;

    public C2478Ur2(Context context, Executor executor, AbstractC1978Qc2 abstractC1978Qc2, C4219eF2 c4219eF2) {
        this.a = context;
        this.b = abstractC1978Qc2;
        this.c = executor;
        this.d = c4219eF2;
    }

    public static String d(C4498fF2 c4498fF2) {
        try {
            return c4498fF2.x.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2) {
        String strD = d(c4498fF2);
        final Uri uri = strD != null ? Uri.parse(strD) : null;
        return AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.Sr2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c(uri, c9267wF2, c4498fF2, obj);
            }
        }, this.c);
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        Context context = this.a;
        return (context instanceof Activity) && C4218eF1.g(context) && !TextUtils.isEmpty(d(c4498fF2));
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(Uri uri, C9267wF2 c9267wF2, C4498fF2 c4498fF2, Object obj) {
        try {
            C4972gv c4972gvA = new C4972gv.b().a();
            c4972gvA.a.setData(uri);
            zzc zzcVar = new zzc(c4972gvA.a, null);
            final BT1 bt1 = new BT1();
            AbstractC5998kc2 abstractC5998kc2C = this.b.c(new C10054z42(c9267wF2, c4498fF2, null), new C8517tc2(new InterfaceC3761cd2() { // from class: com.daaw.Tr2
                @Override // com.daaw.InterfaceC3761cd2
                public final void a(boolean z, Context context, C4184e72 c4184e72) {
                    BT1 bt12 = bt1;
                    try {
                        zzt.zzi();
                        zzm.zza(context, (AdOverlayInfoParcel) bt12.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            bt1.b(new AdOverlayInfoParcel(zzcVar, null, abstractC5998kc2C.h(), null, new zzcaz(0, 0, false, false, false), null, null));
            this.d.a();
            return AbstractC7360pS2.h(abstractC5998kc2C.i());
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
