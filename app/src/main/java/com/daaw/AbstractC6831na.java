package com.daaw;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.daaw.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6831na {
    public static File a(String str) {
        File file = new File(b(), "scenes");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static File b() {
        Context contextK = com.daaw.avee.a.k();
        AbstractC6278lb.f(contextK);
        return contextK.getFilesDir();
    }
}
