package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class K62 extends zzdm {
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final List F;
    public final long G;
    public final String H;
    public final C3553br2 I;
    public final Bundle J;

    public K62(C4498fF2 c4498fF2, String str, C3553br2 c3553br2, C5622jF2 c5622jF2, String str2) {
        String string = null;
        this.C = c4498fF2 == null ? null : c4498fF2.d0;
        this.D = str2;
        this.E = c5622jF2 == null ? null : c5622jF2.b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = c4498fF2.x.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.B = string != null ? string : str;
        this.F = c3553br2.c();
        this.I = c3553br2;
        this.G = zzt.zzB().a() / 1000;
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.M6)).booleanValue() || c5622jF2 == null) {
            this.J = new Bundle();
        } else {
            this.J = c5622jF2.j;
        }
        this.H = (!((Boolean) zzba.zzc().b(AbstractC9820yE1.W8)).booleanValue() || c5622jF2 == null || TextUtils.isEmpty(c5622jF2.h)) ? "" : c5622jF2.h;
    }

    public final long zzc() {
        return this.G;
    }

    public final String zzd() {
        return this.H;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.J;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        C3553br2 c3553br2 = this.I;
        if (c3553br2 != null) {
            return c3553br2.a();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.B;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.D;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.C;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.F;
    }

    public final String zzk() {
        return this.E;
    }
}
