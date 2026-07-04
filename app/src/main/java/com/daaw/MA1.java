package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes.dex */
public final class MA1 implements Runnable {
    public final /* synthetic */ Context B;
    public final /* synthetic */ String C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;

    public MA1(zzay zzayVar, Context context, String str, boolean z, boolean z2) {
        this.B = context;
        this.C = str;
        this.D = z;
        this.E = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzt.zzp();
        AlertDialog.Builder builderZzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.B);
        builderZzJ.setMessage(this.C);
        if (this.D) {
            builderZzJ.setTitle("Error");
        } else {
            builderZzJ.setTitle("Info");
        }
        if (this.E) {
            builderZzJ.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzJ.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC6450mA1(this));
            builderZzJ.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzJ.create().show();
    }
}
