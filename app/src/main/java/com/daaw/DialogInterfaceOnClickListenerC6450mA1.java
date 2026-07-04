package com.daaw;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.mA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC6450mA1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ MA1 B;

    public DialogInterfaceOnClickListenerC6450mA1(MA1 ma1) {
        this.B = ma1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzt.zzp();
        com.google.android.gms.ads.internal.util.zzt.zzT(this.B.B, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
