package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();

    public final zzbf zza(String str, double d, double d2) {
        int i = 0;
        while (i < this.a.size()) {
            double dDoubleValue = ((Double) this.c.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) this.b.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        this.a.add(i, str);
        this.c.add(i, Double.valueOf(d));
        this.b.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, null);
    }
}
