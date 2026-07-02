package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SI2 {
    public static void a(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, TI2 ti2, EI2 ei2) {
        g(interfaceFutureC8236sc0, ti2, ei2, false);
    }

    public static void b(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, TI2 ti2, EI2 ei2) {
        g(interfaceFutureC8236sc0, ti2, ei2, true);
    }

    public static void c(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, TI2 ti2, EI2 ei2) {
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            AbstractC7360pS2.r(AbstractC4839gS2.C(interfaceFutureC8236sc0), new RI2(ti2, ei2), AbstractC9322wT1.f);
        }
    }

    public static void d(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, EI2 ei2) {
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            AbstractC7360pS2.r(AbstractC4839gS2.C(interfaceFutureC8236sc0), new PI2(ei2), AbstractC9322wT1.f);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzba.zzc().b(AbstractC9820yE1.z8), str);
    }

    public static int f(FF2 ff2) {
        int iZze = zzf.zze(ff2) - 1;
        return (iZze == 0 || iZze == 1) ? 7 : 23;
    }

    public static void g(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, TI2 ti2, EI2 ei2, boolean z) {
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            AbstractC7360pS2.r(AbstractC4839gS2.C(interfaceFutureC8236sc0), new QI2(ti2, ei2, z), AbstractC9322wT1.f);
        }
    }
}
