package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SI1 implements HI1 {
    public final zzb a;
    public final C1071Hj2 b;
    public final InterfaceC6483mI2 c;
    public final AN1 e;
    public final C6077kq2 f;
    public final L12 g;
    public zzx h = null;
    public final PS2 i = AbstractC9322wT1.f;
    public final C5680jT1 d = new C5680jT1(null);

    public SI1(zzb zzbVar, AN1 an1, C6077kq2 c6077kq2, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2, L12 l12) {
        this.a = zzbVar;
        this.e = an1;
        this.f = c6077kq2;
        this.b = c1071Hj2;
        this.c = interfaceC6483mI2;
        this.g = l12;
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri c(Context context, C7782qx1 c7782qx1, Uri uri, View view, Activity activity) {
        if (c7782qx1 != null) {
            try {
                if (c7782qx1.e(uri)) {
                    return c7782qx1.a(uri, context, view, activity);
                }
            } catch (C8060rx1 unused) {
            } catch (Exception e) {
                zzt.zzo().u(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            AbstractC4274eT1.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        L12 l12;
        zza zzaVar = (zza) obj;
        String strC = QR1.c((String) map.get("u"), ((InterfaceC9334wW1) zzaVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            AbstractC4274eT1.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzbVar = this.a;
        if (zzbVar == null || zzbVar.zzc()) {
            AbstractC7360pS2.r((!((Boolean) zzba.zzc().b(AbstractC9820yE1.u9)).booleanValue() || (l12 = this.g) == null) ? AbstractC7360pS2.h(strC) : l12.c(strC, zzay.zze()), new OI1(this, zzaVar, map, str), this.i);
        } else {
            zzbVar.zzb(strC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r27, com.google.android.gms.ads.internal.client.zza r28, java.util.Map r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.SI1.h(java.lang.String, com.google.android.gms.ads.internal.client.zza, java.util.Map, java.lang.String):void");
    }

    public final void i(Context context, String str, String str2) {
        this.f.d(str);
        C1071Hj2 c1071Hj2 = this.b;
        if (c1071Hj2 != null) {
            BinderC9431wq2.a3(context, c1071Hj2, this.c, this.f, str, "dialog_not_shown", RP2.f("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r11 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.SI1.j(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    public final void k(boolean z) {
        AN1 an1 = this.e;
        if (an1 != null) {
            an1.h(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.AbstractC9820yE1.j8)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.AbstractC9820yE1.i8)).booleanValue()) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.SI1.l(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void m(int i) {
        if (this.b == null) {
            return;
        }
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
            C0967Gj2 c0967Gj2A = this.b.a();
            c0967Gj2A.b("action", "cct_action");
            c0967Gj2A.b("cct_open_status", AbstractC3940dF1.a(i));
            c0967Gj2A.g();
            return;
        }
        InterfaceC6483mI2 interfaceC6483mI2 = this.c;
        String strA = AbstractC3940dF1.a(i);
        C6204lI2 c6204lI2B = C6204lI2.b("cct_action");
        c6204lI2B.a("cct_open_status", strA);
        interfaceC6483mI2.a(c6204lI2B);
    }
}
