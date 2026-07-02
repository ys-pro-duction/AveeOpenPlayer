package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.xl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9685xl2 implements zzo, InterfaceC7379pX1 {
    public final Context B;
    public final zzcaz C;
    public C7447pl2 D;
    public InterfaceC9334wW1 E;
    public boolean F;
    public boolean G;
    public long H;
    public zzda I;
    public boolean J;

    public C9685xl2(Context context, zzcaz zzcazVar) {
        this.B = context;
        this.C = zzcazVar;
    }

    public final Activity a() {
        InterfaceC9334wW1 interfaceC9334wW1 = this.E;
        if (interfaceC9334wW1 == null || interfaceC9334wW1.q()) {
            return null;
        }
        return this.E.zzi();
    }

    public final void b(C7447pl2 c7447pl2) {
        this.D = c7447pl2;
    }

    public final /* synthetic */ void c(String str) {
        JSONObject jSONObjectE = this.D.e();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectE.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.E.a("window.inspectorInfo", jSONObjectE.toString());
    }

    public final synchronized void d(zzda zzdaVar, C4802gJ1 c4802gJ1, TI1 ti1) {
        if (f(zzdaVar)) {
            try {
                zzt.zzz();
                InterfaceC9334wW1 interfaceC9334wW1A = KW1.a(this.B, C8494tX1.a(), "", false, false, null, null, this.C, null, null, null, C6454mB1.a(), null, null, null);
                this.E = interfaceC9334wW1A;
                InterfaceC7936rX1 interfaceC7936rX1ZzN = interfaceC9334wW1A.zzN();
                if (interfaceC7936rX1ZzN == null) {
                    AbstractC4274eT1.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzt.zzo().u(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdaVar.zze(AbstractC5908kG2.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        zzt.zzo().u(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.I = zzdaVar;
                interfaceC7936rX1ZzN.O(null, null, null, null, null, false, null, null, null, null, null, null, null, null, c4802gJ1, null, new C4513fJ1(this.B), ti1, null);
                interfaceC7936rX1ZzN.I(this);
                this.E.loadUrl((String) zzba.zzc().b(AbstractC9820yE1.G8));
                zzt.zzi();
                zzm.zza(this.B, new AdOverlayInfoParcel(this, this.E, 1, this.C), true);
                this.H = zzt.zzB().a();
            } catch (JW1 e2) {
                AbstractC4274eT1.zzk("Failed to obtain a web view for the ad inspector", e2);
                try {
                    zzt.zzo().u(e2, "InspectorUi.openInspector 0");
                    zzdaVar.zze(AbstractC5908kG2.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    zzt.zzo().u(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void e(final String str) {
        if (this.F && this.G) {
            AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.wl2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.c(str);
                }
            });
        }
    }

    public final synchronized boolean f(zzda zzdaVar) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue()) {
            AbstractC4274eT1.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(AbstractC5908kG2.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.D == null) {
            AbstractC4274eT1.zzj("Ad inspector had an internal error.");
            try {
                zzt.zzo().u(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdaVar.zze(AbstractC5908kG2.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.F && !this.G) {
            if (zzt.zzB().a() >= this.H + ((long) ((Integer) zzba.zzc().b(AbstractC9820yE1.I8)).intValue())) {
                return true;
            }
        }
        AbstractC4274eT1.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdaVar.zze(AbstractC5908kG2.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.daaw.InterfaceC7379pX1
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            zze.zza("Ad inspector loaded.");
            this.F = true;
            e("");
            return;
        }
        AbstractC4274eT1.zzj("Ad inspector failed to load.");
        try {
            zzt.zzo().u(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            zzda zzdaVar = this.I;
            if (zzdaVar != null) {
                zzdaVar.zze(AbstractC5908kG2.d(17, null, null));
            }
        } catch (RemoteException e) {
            zzt.zzo().u(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.J = true;
        this.E.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbv() {
        this.G = true;
        e("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby(int i) {
        this.E.destroy();
        if (!this.J) {
            zze.zza("Inspector closed.");
            zzda zzdaVar = this.I;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.G = false;
        this.F = false;
        this.H = 0L;
        this.J = false;
        this.I = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }
}
