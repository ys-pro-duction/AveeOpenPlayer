package com.daaw;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class LV0 {
    public static Uri a(Uri uri) {
        return AbstractC6280lb1.a0(uri.getLastPathSegment()).matches("manifest(\\(.+\\))?") ? uri : Uri.withAppendedPath(uri, "Manifest");
    }
}
