package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.daaw.AbstractC0933Gb0;
import com.daaw.AbstractC9793y80;
import com.daaw.C7226oy;
import com.daaw.C9460wx;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : "";
    }

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String d(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto";
    }

    public static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C7226oy.c());
        arrayList.add(C9460wx.g());
        arrayList.add(AbstractC0933Gb0.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC0933Gb0.b("fire-core", "20.3.3"));
        arrayList.add(AbstractC0933Gb0.b("device-name", e(Build.PRODUCT)));
        arrayList.add(AbstractC0933Gb0.b("device-model", e(Build.DEVICE)));
        arrayList.add(AbstractC0933Gb0.b("device-brand", e(Build.BRAND)));
        arrayList.add(AbstractC0933Gb0.c("android-target-sdk", new AbstractC0933Gb0.a() { // from class: com.daaw.CL
            @Override // com.daaw.AbstractC0933Gb0.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(AbstractC0933Gb0.c("android-min-sdk", new AbstractC0933Gb0.a() { // from class: com.daaw.DL
            @Override // com.daaw.AbstractC0933Gb0.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(AbstractC0933Gb0.c("android-platform", new AbstractC0933Gb0.a() { // from class: com.daaw.EL
            @Override // com.daaw.AbstractC0933Gb0.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(AbstractC0933Gb0.c("android-installer", new AbstractC0933Gb0.a() { // from class: com.daaw.FL
            @Override // com.daaw.AbstractC0933Gb0.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String strA = AbstractC9793y80.a();
        if (strA != null) {
            arrayList.add(AbstractC0933Gb0.b("kotlin", strA));
        }
        return arrayList;
    }
}
