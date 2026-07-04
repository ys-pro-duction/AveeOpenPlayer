package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.mj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6600mj2 implements InterfaceC3189aa2, zza, InterfaceC7273p72, V62 {
    public final Context B;
    public final ZF2 C;
    public final C1071Hj2 D;
    public final C9267wF2 E;
    public final C4498fF2 F;
    public final C6077kq2 G;
    public Boolean H;
    public final boolean I = ((Boolean) zzba.zzc().b(AbstractC9820yE1.N6)).booleanValue();

    public C6600mj2(Context context, ZF2 zf2, C1071Hj2 c1071Hj2, C9267wF2 c9267wF2, C4498fF2 c4498fF2, C6077kq2 c6077kq2) {
        this.B = context;
        this.C = zf2;
        this.D = c1071Hj2;
        this.E = c9267wF2;
        this.F = c4498fF2;
        this.G = c6077kq2;
    }

    private final boolean l() {
        if (this.H == null) {
            synchronized (this) {
                if (this.H == null) {
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
                    this.H = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.H.booleanValue();
    }

    @Override // com.daaw.V62
    public final void U(C3483bd2 c3483bd2) {
        if (this.I) {
            C0967Gj2 c0967Gj2A = a("ifts");
            c0967Gj2A.b("reason", "exception");
            if (!TextUtils.isEmpty(c3483bd2.getMessage())) {
                c0967Gj2A.b("msg", c3483bd2.getMessage());
            }
            c0967Gj2A.g();
        }
    }

    public final C0967Gj2 a(String str) {
        C0967Gj2 c0967Gj2A = this.D.a();
        c0967Gj2A.e(this.E.b.b);
        c0967Gj2A.d(this.F);
        c0967Gj2A.b("action", str);
        if (!this.F.v.isEmpty()) {
            c0967Gj2A.b("ancn", (String) this.F.v.get(0));
        }
        if (this.F.k0) {
            c0967Gj2A.b("device_connectivity", true != zzt.zzo().x(this.B) ? "offline" : "online");
            c0967Gj2A.b("event_timestamp", String.valueOf(zzt.zzB().a()));
            c0967Gj2A.b("offline_ad", "1");
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.W6)).booleanValue()) {
            boolean z = zzf.zze(this.E.a.a) != 1;
            c0967Gj2A.b("scar", String.valueOf(z));
            if (z) {
                zzl zzlVar = this.E.a.a.d;
                c0967Gj2A.c("ragent", zzlVar.zzp);
                c0967Gj2A.c("rtype", zzf.zza(zzf.zzb(zzlVar)));
            }
        }
        return c0967Gj2A;
    }

    @Override // com.daaw.V62
    public final void d(zze zzeVar) {
        zze zzeVar2;
        if (this.I) {
            C0967Gj2 c0967Gj2A = a("ifts");
            c0967Gj2A.b("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                c0967Gj2A.b("arec", String.valueOf(i));
            }
            String strA = this.C.a(str);
            if (strA != null) {
                c0967Gj2A.b("areec", strA);
            }
            c0967Gj2A.g();
        }
    }

    public final void e(C0967Gj2 c0967Gj2) {
        if (!this.F.k0) {
            c0967Gj2.g();
            return;
        }
        this.G.j(new C6635mq2(zzt.zzB().a(), this.E.b.b.b, c0967Gj2.f(), 2));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.F.k0) {
            e(a("click"));
        }
    }

    @Override // com.daaw.V62
    public final void zzb() {
        if (this.I) {
            C0967Gj2 c0967Gj2A = a("ifts");
            c0967Gj2A.b("reason", "blocked");
            c0967Gj2A.g();
        }
    }

    @Override // com.daaw.InterfaceC3189aa2
    public final void zzi() {
        if (l()) {
            a("adapter_shown").g();
        }
    }

    @Override // com.daaw.InterfaceC3189aa2
    public final void zzj() {
        if (l()) {
            a("adapter_impression").g();
        }
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        if (l() || this.F.k0) {
            e(a("impression"));
        }
    }
}
