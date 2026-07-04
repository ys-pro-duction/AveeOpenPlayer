package com.daaw;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.Aa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0297Aa1 implements InterfaceC0657Dk0 {
    public final Context a;
    public final InterfaceC0657Dk0 b;

    public AbstractC0297Aa1(Context context, InterfaceC0657Dk0 interfaceC0657Dk0) {
        this.a = context;
        this.b = interfaceC0657Dk0;
    }

    public static boolean e(String str) {
        return "file".equals(str) || "content".equals(str) || "android.resource".equals(str);
    }

    public abstract InterfaceC2177Rv b(Context context, String str);

    public abstract InterfaceC2177Rv c(Context context, Uri uri);

    @Override // com.daaw.InterfaceC0657Dk0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2177Rv a(Uri uri, int i, int i2) {
        String scheme = uri.getScheme();
        if (e(scheme)) {
            if (!AbstractC7951rb.a(uri)) {
                return c(this.a, uri);
            }
            return b(this.a, AbstractC7951rb.b(uri));
        }
        if (this.b == null) {
            return null;
        }
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return this.b.a(new C4840gT(uri.toString()), i, i2);
        }
        return null;
    }
}
