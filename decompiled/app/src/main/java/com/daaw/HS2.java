package com.daaw;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzau;

/* JADX INFO: loaded from: classes.dex */
public final class HS2 extends RelativeLayout {
    public final zzau B;
    public boolean C;

    public HS2(Context context, String str, String str2, String str3) {
        super(context);
        zzau zzauVar = new zzau(context, str);
        this.B = zzauVar;
        zzauVar.zzo(str2);
        zzauVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C) {
            return false;
        }
        this.B.zzm(motionEvent);
        return false;
    }
}
