package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.daaw.HO;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class GO {
    public static HO.a a(Context context, Uri uri) {
        return Build.VERSION.SDK_INT < 24 ? new HO.b(context, uri) : new HO.c(context, uri);
    }
}
