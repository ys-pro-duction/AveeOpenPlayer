package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.dp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4099dp2 implements InterfaceC3189aa2, zza, InterfaceC7273p72, V62 {
    public final Context B;
    public final ZF2 C;
    public final C9267wF2 D;
    public final C4498fF2 E;
    public final C6077kq2 F;
    public Boolean G;
    public final boolean H = ((Boolean) zzba.zzc().b(AbstractC9820yE1.N6)).booleanValue();
    public final InterfaceC6483mI2 I;
    public final String J;

    public C4099dp2(Context context, ZF2 zf2, C9267wF2 c9267wF2, C4498fF2 c4498fF2, C6077kq2 c6077kq2, InterfaceC6483mI2 interfaceC6483mI2, String str) {
        this.B = context;
        this.C = zf2;
        this.D = c9267wF2;
        this.E = c4498fF2;
        this.F = c6077kq2;
        this.I = interfaceC6483mI2;
        this.J = str;
    }

    private final boolean l() {
        if (this.G == null) {
            synchronized (this) {
                if (this.G == null) {
                    String str = (String) zzba.zzc().b(AbstractC9820yE1.r1);
                    zzt.zzp();
                    String strZzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.B);
                    boolean zMatches = false;
                    if (str != null && strZzp != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzp);
                        } catch (RuntimeException e) {
                            zzt.zzo().u(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.G = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.G.booleanValue();
    }

    @Override // com.daaw.V62
    public final void U(C3483bd2 c3483bd2) {
        if (this.H) {
            C6204lI2 c6204lI2A = a("ifts");
            c6204lI2A.a("reason", "exception");
            if (!TextUtils.isEmpty(c3483bd2.getMessage())) {
                c6204lI2A.a("msg", c3483bd2.getMessage());
            }
            this.I.a(c6204lI2A);
        }
    }

    public final C6204lI2 a(String str) {
        C6204lI2 c6204lI2B = C6204lI2.b(str);
        c6204lI2B.h(this.D, null);
        c6204lI2B.f(this.E);
        c6204lI2B.a(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, this.J);
        if (!this.E.v.isEmpty()) {
            c6204lI2B.a("ancn", (String) this.E.v.get(0));
        }
        if (this.E.k0) {
            c6204lI2B.a("device_connectivity", true != zzt.zzo().x(this.B) ? "offline" : "online");
            c6204lI2B.a("event_timestamp", String.valueOf(zzt.zzB().a()));
            c6204lI2B.a("offline_ad", "1");
        }
        return c6204lI2B;
    }

    @Override // com.daaw.V62
    public final void d(zze zzeVar) {
        zze zzeVar2;
        if (this.H) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String strA = this.C.a(str);
            C6204lI2 c6204lI2A = a("ifts");
            c6204lI2A.a("reason", "adapter");
            if (i >= 0) {
                c6204lI2A.a("arec", String.valueOf(i));
            }
            if (strA != null) {
                c6204lI2A.a("areec", strA);
            }
            this.I.a(c6204lI2A);
        }
    }

    public final void e(C6204lI2 c6204lI2) {
        if (!this.E.k0) {
            this.I.a(c6204lI2);
            return;
        }
        this.F.j(new C6635mq2(zzt.zzB().a(), this.D.b.b.b, this.I.b(c6204lI2), 2));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.E.k0) {
            e(a("click"));
        }
    }

    @Override // com.daaw.V62
    public final void zzb() {
        if (this.H) {
            InterfaceC6483mI2 interfaceC6483mI2 = this.I;
            C6204lI2 c6204lI2A = a("ifts");
            c6204lI2A.a("reason", "blocked");
            interfaceC6483mI2.a(c6204lI2A);
        }
    }

    @Override // com.daaw.InterfaceC3189aa2
    public final void zzi() {
        if (l()) {
            this.I.a(a("adapter_shown"));
        }
    }

    @Override // com.daaw.InterfaceC3189aa2
    public final void zzj() {
        if (l()) {
            this.I.a(a("adapter_impression"));
        }
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        if (l() || this.E.k0) {
            e(a("impression"));
        }
    }
}
