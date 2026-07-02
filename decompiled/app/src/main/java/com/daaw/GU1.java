package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbe;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class GU1 {
    public final Context a;
    public final String b;
    public final zzcaz c;
    public final NE1 d;
    public final VE1 e;
    public final zzbh f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public AbstractC4567fU1 n;
    public boolean o;
    public boolean p;
    public long q;

    public GU1(Context context, zzcaz zzcazVar, String str, VE1 ve1, NE1 ne1) {
        zzbf zzbfVar = new zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f = zzbfVar.zzb();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = zzcazVar;
        this.b = str;
        this.e = ve1;
        this.d = ne1;
        String str2 = (String) zzba.zzc().b(AbstractC9820yE1.A);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                AbstractC4274eT1.zzk("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    public final void a(AbstractC4567fU1 abstractC4567fU1) {
        IE1.a(this.e, this.d, "vpc2");
        this.i = true;
        this.e.d("vpn", abstractC4567fU1.q());
        this.n = abstractC4567fU1;
    }

    public final void b() {
        if (!this.i || this.j) {
            return;
        }
        IE1.a(this.e, this.d, "vfr2");
        this.j = true;
    }

    public final void c() {
        this.m = true;
        if (!this.j || this.k) {
            return;
        }
        IE1.a(this.e, this.d, "vfp2");
        this.k = true;
    }

    public final void d() {
        if (!((Boolean) QF1.a.e()).booleanValue() || this.o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.b);
        bundle.putString("player", this.n.q());
        for (zzbe zzbeVar : this.f.zza()) {
            String strValueOf = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbeVar.zze));
            String strValueOf2 = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbeVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.g;
            if (i >= jArr.length) {
                zzt.zzp().zzh(this.a, this.c.B, "gmob-apps", bundle, true);
                this.o = true;
                return;
            }
            String str = this.h[i];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
            }
            i++;
        }
    }

    public final void e() {
        this.m = false;
    }

    public final void f(AbstractC4567fU1 abstractC4567fU1) {
        if (this.k && !this.l) {
            if (zze.zzc() && !this.l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            IE1.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long jC = zzt.zzB().c();
        if (this.m && this.p && this.q != -1) {
            this.f.zzb(TimeUnit.SECONDS.toNanos(1L) / (jC - this.q));
        }
        this.p = this.m;
        this.q = jC;
        long jLongValue = ((Long) zzba.zzc().b(AbstractC9820yE1.B)).longValue();
        long jI = abstractC4567fU1.i();
        int i = 0;
        while (true) {
            String[] strArr = this.h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > Math.abs(jI - this.g[i])) {
                String[] strArr2 = this.h;
                int i2 = 8;
                Bitmap bitmap = abstractC4567fU1.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }
}
