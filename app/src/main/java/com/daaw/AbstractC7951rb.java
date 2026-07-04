package com.daaw;

import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7951rb {
    public static final int a = 22;

    public static boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public static String b(Uri uri) {
        return uri.toString().substring(a);
    }
}
