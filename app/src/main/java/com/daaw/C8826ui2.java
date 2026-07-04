package com.daaw;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbrn;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.ui2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8826ui2 {
    public final C3945dG2 a;
    public final C7989ri2 b;

    public C8826ui2(C3945dG2 c3945dG2, C7989ri2 c7989ri2) {
        this.a = c3945dG2;
        this.b = c7989ri2;
    }

    public final SL1 a() throws RemoteException {
        SL1 sl1B = this.a.b();
        if (sl1B != null) {
            return sl1B;
        }
        AbstractC4274eT1.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final ZM1 b(String str) {
        ZM1 zm1O = a().o(str);
        this.b.e(str, zm1O);
        return zm1O;
    }

    public final C4502fG2 c(String str, JSONObject jSONObject) {
        ZL1 zl1Zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zl1Zzb = new BinderC9573xM1(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zl1Zzb = new BinderC9573xM1(new zzbrn());
            } else {
                SL1 sl1A = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zl1Zzb = sl1A.a(string) ? sl1A.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : sl1A.l(string) ? sl1A.zzb(string) : sl1A.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        AbstractC4274eT1.zzh("Invalid custom event.", e);
                        zl1Zzb = sl1A.zzb(str);
                    }
                } else {
                    zl1Zzb = sl1A.zzb(str);
                }
            }
            C4502fG2 c4502fG2 = new C4502fG2(zl1Zzb);
            this.b.d(str, c4502fG2);
            return c4502fG2;
        } catch (Throwable th) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.c9)).booleanValue()) {
                this.b.d(str, null);
            }
            throw new KF2(th);
        }
    }

    public final boolean d() {
        return this.a.b() != null;
    }
}
