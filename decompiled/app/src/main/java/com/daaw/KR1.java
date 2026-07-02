package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KR1 {
    public static KR1 a;

    public static synchronized KR1 d(Context context) {
        try {
            KR1 kr1 = a;
            if (kr1 != null) {
                return kr1;
            }
            Context applicationContext = context.getApplicationContext();
            AbstractC9820yE1.a(applicationContext);
            zzg zzgVarH = zzt.zzo().h();
            zzgVarH.zzr(applicationContext);
            C7076oR1 c7076oR1 = new C7076oR1(null);
            c7076oR1.b(applicationContext);
            c7076oR1.c(zzt.zzB());
            c7076oR1.a(zzgVarH);
            c7076oR1.d(zzt.zzn());
            KR1 kr1E = c7076oR1.e();
            a = kr1E;
            kr1E.a().a();
            a.b().c();
            TR1 tr1C = a.c();
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.q0)).booleanValue()) {
                zzt.zzp();
                Map mapZzu = com.google.android.gms.ads.internal.util.zzt.zzu((String) zzba.zzc().b(AbstractC9820yE1.s0));
                Iterator it = mapZzu.keySet().iterator();
                while (it.hasNext()) {
                    tr1C.c((String) it.next());
                }
                tr1C.d(new RR1(tr1C, mapZzu));
            }
            return a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract SharedPreferencesOnSharedPreferenceChangeListenerC3709cR1 a();

    public abstract C6239lR1 b();

    public abstract TR1 c();
}
