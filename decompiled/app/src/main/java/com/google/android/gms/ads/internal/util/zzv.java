package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.daaw.AbstractC9820yE1;
import com.daaw.XS1;

/* JADX INFO: loaded from: classes.dex */
public class zzv extends zzu {
    public static final boolean a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zze(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.H4)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.J4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        int iB = XS1.B(activity, configuration.screenHeightDp);
        int iB2 = XS1.B(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics displayMetricsZzs = zzt.zzs(windowManager);
        int i = displayMetricsZzs.heightPixels;
        int i2 = displayMetricsZzs.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.F4)).intValue();
        return (a(i, iB + dimensionPixelSize, iRound) && a(i2, iB2, iRound)) ? false : true;
    }
}
