package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7506py0;
import com.daaw.BO2;
import com.daaw.BinderC1415Kr2;
import com.daaw.BinderC7744qp0;
import com.daaw.C0466Bq2;
import com.daaw.C3124aK1;
import com.daaw.C9179vw1;
import com.daaw.LL1;
import com.daaw.ZJ1;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.internal.ads.zzblg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzej {
    public static zzej i;
    public zzco f;
    public final Object a = new Object();
    public boolean c = false;
    public boolean d = false;
    public final Object e = new Object();
    public OnAdInspectorClosedListener g = null;
    public RequestConfiguration h = new RequestConfiguration.Builder().build();
    public final ArrayList b = new ArrayList();

    public static InitializationStatus k(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzblg zzblgVar = (zzblg) it.next();
            map.put(zzblgVar.B, new ZJ1(zzblgVar.C ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzblgVar.E, zzblgVar.D));
        }
        return new C3124aK1(map);
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            try {
                if (i == null) {
                    i = new zzej();
                }
                zzejVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzejVar;
    }

    public final void a(Context context) {
        if (this.f == null) {
            this.f = (zzco) new C9179vw1(zzay.zza(), context).d(context, false);
        }
    }

    public final void b(RequestConfiguration requestConfiguration) {
        try {
            this.f.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public final /* synthetic */ void i(Context context, String str) {
        synchronized (this.e) {
            l(context, null);
        }
    }

    public final /* synthetic */ void j(Context context, String str) {
        synchronized (this.e) {
            l(context, null);
        }
    }

    public final void l(Context context, String str) {
        try {
            LL1.a().b(context, null);
            this.f.zzk();
            this.f.zzl(null, BinderC7744qp0.Z2(null));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final float zza() {
        synchronized (this.e) {
            zzco zzcoVar = this.f;
            float fZze = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzcoVar.zze();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    public final RequestConfiguration zzc() {
        return this.h;
    }

    public final InitializationStatus zze() {
        InitializationStatus initializationStatusK;
        synchronized (this.e) {
            try {
                AbstractC7506py0.p(this.f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    initializationStatusK = k(this.f.zzg());
                } catch (RemoteException unused) {
                    AbstractC4274eT1.zzg("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            HashMap map = new HashMap();
                            map.put("com.google.android.gms.ads.MobileAds", new C0466Bq2(this.zza));
                            return map;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return initializationStatusK;
    }

    public final String zzh() {
        String strC;
        synchronized (this.e) {
            try {
                AbstractC7506py0.p(this.f != null, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    strC = BO2.c(this.f.zzf());
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzh("Unable to get internal version.", e);
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strC;
    }

    public final void zzl(Context context) {
        synchronized (this.e) {
            a(context);
            try {
                this.f.zzi();
            } catch (RemoteException unused) {
                AbstractC4274eT1.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(boolean z) {
        synchronized (this.e) {
            AbstractC7506py0.p(this.f != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.f.zzj(z);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to " + (z ? "enable" : "disable") + " Same App Key.", e);
                if (e.getMessage() != null && e.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzn(final android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzej.zzn(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    public final void zzq(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.e) {
            a(context);
            this.g = onAdInspectorClosedListener;
            try {
                this.f.zzm(new BinderC1415Kr2(null));
            } catch (RemoteException unused) {
                AbstractC4274eT1.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzr(Context context, String str) {
        synchronized (this.e) {
            AbstractC7506py0.p(this.f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f.zzn(BinderC7744qp0.Z2(context), str);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzs(Class cls) {
        synchronized (this.e) {
            try {
                this.f.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzt(boolean z) {
        synchronized (this.e) {
            AbstractC7506py0.p(this.f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f.zzp(z);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzu(float f) {
        boolean z = true;
        AbstractC7506py0.b(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.e) {
            if (this.f == null) {
                z = false;
            }
            AbstractC7506py0.p(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f.zzq(f);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzv(String str) {
        synchronized (this.e) {
            AbstractC7506py0.p(this.f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f.zzt(str);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzw(RequestConfiguration requestConfiguration) {
        AbstractC7506py0.b(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.e) {
            try {
                RequestConfiguration requestConfiguration2 = this.h;
                this.h = requestConfiguration;
                if (this.f == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    b(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzx() {
        synchronized (this.e) {
            zzco zzcoVar = this.f;
            boolean zZzv = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                zZzv = zzcoVar.zzv();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to get app mute state.", e);
            }
            return zZzv;
        }
    }
}
