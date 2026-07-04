package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JF2 {
    public static zzq a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4787gF2 c4787gF2 = (C4787gF2) it.next();
            if (c4787gF2.c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(c4787gF2.a, c4787gF2.b));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static C4787gF2 b(zzq zzqVar) {
        return zzqVar.zzi ? new C4787gF2(-3, 0, true) : new C4787gF2(zzqVar.zze, zzqVar.zzb, false);
    }
}
