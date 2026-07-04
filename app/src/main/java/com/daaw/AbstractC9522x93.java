package com.daaw;

import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.x93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9522x93 {
    public static final C2407Ua a = new C2407Ua();

    public static synchronized Uri a(String str) {
        C2407Ua c2407Ua = a;
        Uri uri = (Uri) c2407Ua.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c2407Ua.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
