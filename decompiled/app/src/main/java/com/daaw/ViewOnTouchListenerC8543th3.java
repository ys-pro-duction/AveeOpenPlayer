package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzs;

/* JADX INFO: renamed from: com.daaw.th3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC8543th3 implements View.OnTouchListener {
    public final /* synthetic */ zzs B;

    public ViewOnTouchListenerC8543th3(zzs zzsVar) {
        this.B = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzs zzsVar = this.B;
        if (zzsVar.I == null) {
            return false;
        }
        zzsVar.I.d(motionEvent);
        return false;
    }
}
