package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.Wm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2666Wm2 implements S82 {
    public final Context B;
    public final JR1 C;

    public C2666Wm2(Context context, JR1 jr1) {
        this.B = context;
        this.C = jr1;
    }

    @Override // com.daaw.S82
    public final void t0(C9267wF2 c9267wF2) {
        if (TextUtils.isEmpty(c9267wF2.b.b.d)) {
            return;
        }
        this.C.u(this.B, c9267wF2.a.a.d);
        this.C.q(this.B, c9267wF2.b.b.d);
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
    }
}
