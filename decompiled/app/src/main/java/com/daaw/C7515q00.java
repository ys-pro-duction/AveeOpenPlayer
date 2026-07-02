package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.q00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7515q00 {
    public String a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        try {
            if (this.a == null) {
                this.a = b(context);
            }
        } finally {
        }
        return "".equals(this.a) ? null : this.a;
    }
}
