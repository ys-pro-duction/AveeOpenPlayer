package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.daaw.AbstractC5377iN2;
import com.daaw.AbstractC5936kN2;
import com.daaw.AbstractC6503mN2;
import com.daaw.AbstractC6782nN2;
import com.daaw.AbstractC9322wT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.Gq3;
import com.daaw.HN2;
import com.daaw.InterfaceC6224lN2;
import com.daaw.InterfaceC9334wW1;
import com.daaw.TM2;
import com.daaw.UM2;
import com.daaw.VM2;
import com.daaw.WM2;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzw {
    public InterfaceC6224lN2 f;
    public InterfaceC9334wW1 c = null;
    public boolean e = false;
    public String a = null;
    public VM2 d = null;
    public String b = null;

    public final void a(String str) {
        b(str, new HashMap());
    }

    public final void b(final String str, final Map map) {
        AbstractC9322wT1.e.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(str, map);
            }
        });
    }

    public final void c(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            b("onError", map);
        }
    }

    public final /* synthetic */ void d(String str, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.c;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.U(str, map);
        }
    }

    public final void e(AbstractC5936kN2 abstractC5936kN2) {
        if (!TextUtils.isEmpty(abstractC5936kN2.b())) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.va)).booleanValue()) {
                this.a = abstractC5936kN2.b();
            }
        }
        switch (abstractC5936kN2.a()) {
            case 8152:
                a("onLMDOverlayOpened");
                break;
            case 8153:
                a("onLMDOverlayClicked");
                break;
            case 8155:
                a("onLMDOverlayClose");
                break;
            case 8157:
                this.a = null;
                this.b = null;
                this.e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(abstractC5936kN2.a()));
                b("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final AbstractC6782nN2 f() {
        AbstractC6503mN2 abstractC6503mN2C = AbstractC6782nN2.c();
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.va)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                abstractC6503mN2C.b(str);
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC6503mN2C.a(this.b);
        }
        return abstractC6503mN2C.c();
    }

    public final void g() {
        if (this.f == null) {
            this.f = new Gq3(this);
        }
    }

    public final synchronized void zza(InterfaceC9334wW1 interfaceC9334wW1, Context context) {
        this.c = interfaceC9334wW1;
        if (!zzk(context)) {
            c("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        b("on_play_store_bind", map);
    }

    public final void zzb() {
        VM2 vm2;
        if (!this.e || (vm2 = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            vm2.d(f(), this.f);
            a("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        VM2 vm2;
        if (!this.e || (vm2 = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        TM2 tm2C = UM2.c();
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.va)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                tm2C.b(str);
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            tm2C.a(this.b);
        }
        vm2.c(tm2C.c(), this.f);
    }

    public final void zzg() {
        VM2 vm2;
        if (!this.e || (vm2 = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            vm2.b(f(), this.f);
            a("onLMDOverlayExpand");
        }
    }

    public final void zzj(InterfaceC9334wW1 interfaceC9334wW1, AbstractC5377iN2 abstractC5377iN2) {
        if (interfaceC9334wW1 == null) {
            c("adWebview missing", "onLMDShow");
            return;
        }
        this.c = interfaceC9334wW1;
        if (!this.e && !zzk(interfaceC9334wW1.getContext())) {
            c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.va)).booleanValue()) {
            this.b = abstractC5377iN2.g();
        }
        g();
        VM2 vm2 = this.d;
        if (vm2 != null) {
            vm2.a(abstractC5377iN2, this.f);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!HN2.a(context)) {
            return false;
        }
        try {
            this.d = WM2.a(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.d == null) {
            this.e = false;
            return false;
        }
        g();
        this.e = true;
        return true;
    }
}
