package com.daaw;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class O83 {
    public final BS0 a;

    public O83(BS0 bs0) {
        this.a = bs0;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        BS0 bs0;
        if (uri != null) {
            bs0 = (BS0) this.a.get(uri.toString());
        } else {
            bs0 = null;
        }
        if (bs0 == null) {
            return null;
        }
        return (String) bs0.get("".concat(str3));
    }
}
