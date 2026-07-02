package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class Qk3 {
    public final C10224zh3 a;
    public final Activity b;
    public final C2157Rq c;
    public final C2471Uq d;

    public /* synthetic */ Qk3(C10224zh3 c10224zh3, Activity activity, C2157Rq c2157Rq, C2471Uq c2471Uq, Ai3 ai3) {
        this.a = c10224zh3;
        this.b = activity;
        this.c = c2157Rq;
        this.d = c2471Uq;
    }

    public static /* bridge */ /* synthetic */ QY1 a(Qk3 qk3) throws C4304ea3 {
        Bundle bundle;
        List arrayList;
        List list;
        PackageInfo packageInfo;
        String strA;
        QY1 qy1 = new QY1();
        String strC = qk3.d.c();
        if (TextUtils.isEmpty(strC)) {
            try {
                bundle = qk3.a.a.getPackageManager().getApplicationInfo(qk3.a.a.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strC = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strC)) {
                throw new C4304ea3(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        qy1.a = strC;
        if (!qk3.d.b() && (strA = qk3.a.b.a()) != null) {
            qy1.b = strA;
        }
        if (qk3.c.b()) {
            arrayList = new ArrayList();
            int iA = qk3.c.a();
            if (iA == 1) {
                arrayList.add(KV1.GEO_OVERRIDE_EEA);
            } else if (iA == 2) {
                arrayList.add(KV1.GEO_OVERRIDE_NON_EEA);
            }
            arrayList.add(KV1.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        qy1.j = arrayList;
        qy1.f = qk3.a.c.b();
        qy1.e = Boolean.valueOf(qk3.d.b());
        int i = Build.VERSION.SDK_INT;
        qy1.d = Locale.getDefault().toLanguageTag();
        C7654qW1 c7654qW1 = new C7654qW1();
        c7654qW1.b = Integer.valueOf(i);
        c7654qW1.a = Build.MODEL;
        c7654qW1.c = 2;
        qy1.c = c7654qW1;
        Configuration configuration = qk3.a.a.getResources().getConfiguration();
        qk3.a.a.getResources().getConfiguration();
        EX1 ex1 = new EX1();
        ex1.a = Integer.valueOf(configuration.screenWidthDp);
        ex1.b = Integer.valueOf(configuration.screenHeightDp);
        ex1.c = Double.valueOf(qk3.a.a.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list = Collections.EMPTY_LIST;
        } else {
            Activity activity = qk3.b;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list = Collections.EMPTY_LIST;
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        YW1 yw1 = new YW1();
                        yw1.b = Integer.valueOf(rect.left);
                        yw1.c = Integer.valueOf(rect.right);
                        yw1.a = Integer.valueOf(rect.top);
                        yw1.d = Integer.valueOf(rect.bottom);
                        arrayList2.add(yw1);
                    }
                }
                list = arrayList2;
            }
        }
        ex1.d = list;
        qy1.g = ex1;
        C10224zh3 c10224zh3 = qk3.a;
        Application application = c10224zh3.a;
        try {
            packageInfo = c10224zh3.a.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        C4282eV1 c4282eV1 = new C4282eV1();
        c4282eV1.a = application.getPackageName();
        CharSequence applicationLabel = qk3.a.a.getPackageManager().getApplicationLabel(qk3.a.a.getApplicationInfo());
        c4282eV1.b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            c4282eV1.c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        qy1.h = c4282eV1;
        C5979kY1 c5979kY1 = new C5979kY1();
        c5979kY1.a = "2.1.0";
        qy1.i = c5979kY1;
        return qy1;
    }
}
