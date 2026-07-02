package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NB2 implements InterfaceC4758g83 {
    public static C1758Nz2 a(Context context, C4559fS1 c4559fS1, C4838gS1 c4838gS1, Object obj, C7288pA2 c7288pA2, C7292pB2 c7292pB2, V73 v73, V73 v732, V73 v733, V73 v734, V73 v735, V73 v736, V73 v737, V73 v738, V73 v739, Executor executor, TI2 ti2, C1071Hj2 c1071Hj2) {
        HashSet hashSet = new HashSet();
        hashSet.add((C5329iB2) obj);
        hashSet.add(c7288pA2);
        hashSet.add(c7292pB2);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.G5)).booleanValue()) {
            hashSet.add((InterfaceC1447Kz2) v73.zzb());
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.H5)).booleanValue()) {
            hashSet.add((InterfaceC1447Kz2) v732.zzb());
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.I5)).booleanValue()) {
            hashSet.add((InterfaceC1447Kz2) v733.zzb());
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.J5)).booleanValue()) {
            hashSet.add((InterfaceC1447Kz2) v734.zzb());
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.N5)).booleanValue()) {
            hashSet.add((InterfaceC1447Kz2) v736.zzb());
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.O5)).booleanValue()) {
            hashSet.add((InterfaceC1447Kz2) v737.zzb());
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F2)).booleanValue()) {
            hashSet.add((InterfaceC1447Kz2) v739.zzb());
        }
        return new C1758Nz2(context, executor, hashSet, ti2, c1071Hj2);
    }
}
