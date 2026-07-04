package com.daaw;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.daaw.xT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9599xT {
    public static final int a = ET.a;
    public static final C9599xT b = new C9599xT();

    public static C9599xT f() {
        return b;
    }

    public int a(Context context) {
        return ET.b(context);
    }

    public Intent b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && HB.g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C6878nj1.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i, int i2) {
        return d(context, i, i2, null);
    }

    public PendingIntent d(Context context, int i, int i2, String str) {
        Intent intentB = b(context, i, str);
        if (intentB == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, intentB, E82.a | 134217728);
    }

    public String e(int i) {
        return ET.c(i);
    }

    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i) {
        int iG = ET.g(context, i);
        if (ET.h(context, iG)) {
            return 18;
        }
        return iG;
    }

    public boolean i(Context context, String str) {
        return ET.l(context, str);
    }

    public boolean j(int i) {
        return ET.j(i);
    }

    public void k(Context context, int i) throws BT, CT {
        ET.a(context, i);
    }
}
