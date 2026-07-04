package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.daaw.AbstractC10226zi0;

/* JADX INFO: loaded from: classes.dex */
public class zzw extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzh(Context context, String str, String str2) {
        NotificationChannel notificationChannelA = AbstractC10226zi0.a("offline_notification_channel", "AdMob Offline Notifications", 2);
        notificationChannelA.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelA);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzi(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzj(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzp();
        return (zzt.zzz(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
