package com.daaw;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.wN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC9298wN1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C9856yN1 B;

    public DialogInterfaceOnClickListenerC9298wN1(C9856yN1 c9856yN1) {
        this.B = c9856yN1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C9856yN1 c9856yN1 = this.B;
        Intent intentI = c9856yN1.i();
        zzt.zzp();
        com.google.android.gms.ads.internal.util.zzt.zzS(c9856yN1.d, intentI);
    }
}
