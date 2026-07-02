package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: renamed from: com.daaw.uw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8901uw2 implements InterfaceC1447Kz2 {
    public final InterfaceC1447Kz2 a;
    public final FF2 b;
    public final Context c;
    public final OS1 d;

    public C8901uw2(C8340sx2 c8340sx2, FF2 ff2, Context context, OS1 os1) {
        this.a = c8340sx2;
        this.b = ff2;
        this.c = context;
        this.d = os1;
    }

    public final /* synthetic */ C9180vw2 a(C2406Tz2 c2406Tz2) {
        String str;
        boolean z;
        String strZzm;
        float f;
        int i;
        int i2;
        DisplayMetrics displayMetrics;
        zzq zzqVar = this.b.e;
        zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        } else {
            String str2 = null;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (zzq zzqVar2 : zzqVarArr) {
                boolean z5 = zzqVar2.zzi;
                if (!z5 && !z3) {
                    str2 = zzqVar2.zza;
                    z3 = true;
                }
                if (z5) {
                    if (!z4) {
                        z2 = true;
                    }
                    z4 = true;
                }
                if (z3 && z4) {
                    break;
                }
            }
            str = str2;
            z = z2;
        }
        Resources resources = this.c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzm = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            OS1 os1 = this.d;
            float f2 = displayMetrics.density;
            int i3 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            f = f2;
            i = i3;
            strZzm = os1.h().zzm();
        }
        StringBuilder sb = new StringBuilder();
        zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z6 = false;
            for (zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z6 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i4 = zzqVar3.zze;
                    if (i4 == -1) {
                        i4 = f != 0.0f ? (int) (zzqVar3.zzf / f) : -1;
                    }
                    sb.append(i4);
                    sb.append("x");
                    int i5 = zzqVar3.zzb;
                    if (i5 == -2) {
                        i5 = f != 0.0f ? (int) (zzqVar3.zzc / f) : -2;
                    }
                    sb.append(i5);
                }
            }
            if (z6) {
                if (sb.length() != 0) {
                    sb.insert(0, "|");
                }
                sb.insert(0, "320x50");
            }
        }
        return new C9180vw2(zzqVar, str, z, sb.toString(), f, i, i2, strZzm, this.b.p);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 7;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.m(this.a.zzb(), new WN2() { // from class: com.daaw.tw2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return this.a.a((C2406Tz2) obj);
            }
        }, AbstractC9322wT1.f);
    }
}
