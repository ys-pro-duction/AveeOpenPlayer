package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzffh;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class NG2 {
    public final HashMap a = new HashMap();

    public final MG2 a(EG2 eg2, Context context, C8148sG2 c8148sG2, TG2 tg2) {
        MG2 mg2 = (MG2) this.a.get(eg2);
        if (mg2 != null) {
            return mg2;
        }
        BG2 bg2 = new BG2(zzffh.e(eg2, context));
        MG2 mg22 = new MG2(bg2, new VG2(bg2, c8148sG2, tg2));
        this.a.put(eg2, mg22);
        return mg22;
    }
}
