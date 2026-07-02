package com.daaw;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: com.daaw.uP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8742uP2 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(MD0.a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
