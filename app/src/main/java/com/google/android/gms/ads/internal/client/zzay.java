package com.google.android.gms.ads.internal.client;

import com.daaw.AH1;
import com.daaw.C10111zH1;
import com.daaw.C4822gO1;
import com.daaw.JQ1;
import com.daaw.XS1;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class zzay {
    public static final zzay f = new zzay();
    public final XS1 a;
    public final zzaw b;
    public final String c;
    public final zzcaz d;
    public final Random e;

    public zzay() {
        XS1 xs1 = new XS1();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new C10111zH1(), new JQ1(), new C4822gO1(), new AH1());
        String strH = XS1.h();
        zzcaz zzcazVar = new zzcaz(0, 233702000, true, false, false);
        Random random = new Random();
        this.a = xs1;
        this.b = zzawVar;
        this.c = strH;
        this.d = zzcazVar;
        this.e = random;
    }

    public static zzaw zza() {
        return f.b;
    }

    public static XS1 zzb() {
        return f.a;
    }

    public static zzcaz zzc() {
        return f.d;
    }

    public static String zzd() {
        return f.c;
    }

    public static Random zze() {
        return f.e;
    }
}
