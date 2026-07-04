package com.daaw;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: renamed from: com.daaw.cs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3834cs0 {
    public static final String a = AbstractC1772Od0.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            AbstractC1772Od0.c().a(a, String.format("%s %s", cls.getName(), z ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e) {
            AbstractC1772Od0.c().a(a, String.format("%s could not be %s", cls.getName(), z ? "enabled" : "disabled"), e);
        }
    }
}
