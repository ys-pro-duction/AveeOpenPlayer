package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Fd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0839Fd2 implements HI1 {
    public final WeakReference a;

    public /* synthetic */ C0839Fd2(C1151Id2 c1151Id2, AbstractC0735Ed2 abstractC0735Ed2) {
        this.a = new WeakReference(c1151Id2);
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        C1151Id2 c1151Id2 = (C1151Id2) this.a.get();
        if (c1151Id2 == null) {
            return;
        }
        c1151Id2.h.onAdClicked();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U9)).booleanValue()) {
            c1151Id2.i.i0();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            c1151Id2.i.zzs();
        }
    }
}
