package com.daaw;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.daaw.uq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8866uq2 extends TimerTask {
    public final /* synthetic */ AlertDialog B;
    public final /* synthetic */ Timer C;
    public final /* synthetic */ zzl D;

    public C8866uq2(BinderC9431wq2 binderC9431wq2, AlertDialog alertDialog, Timer timer, zzl zzlVar) {
        this.B = alertDialog;
        this.C = timer;
        this.D = zzlVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.B.dismiss();
        this.C.cancel();
        zzl zzlVar = this.D;
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
