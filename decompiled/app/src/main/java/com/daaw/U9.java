package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class U9 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final FB h;

    public U9(String str, String str2, List list, String str3, String str4, String str5, String str6, FB fb) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = fb;
    }

    public static U9 a(Context context, SX sx, String str, String str2, List list, FB fb) {
        String packageName = context.getPackageName();
        String strG = sx.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new U9(str, str2, list, strG, packageName, string, str3, fb);
    }
}
