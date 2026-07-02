package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: com.daaw.fY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4582fY0 implements InterfaceC0657Dk0 {
    public final InterfaceC0657Dk0 a;

    public AbstractC4582fY0(InterfaceC0657Dk0 interfaceC0657Dk0) {
        this.a = interfaceC0657Dk0;
    }

    public static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.daaw.InterfaceC0657Dk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2177Rv a(String str, int i, int i2) {
        Uri uriC;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("/")) {
            uriC = c(str);
        } else {
            Uri uri = Uri.parse(str);
            uriC = uri.getScheme() == null ? c(str) : uri;
        }
        return this.a.a(uriC, i, i2);
    }
}
