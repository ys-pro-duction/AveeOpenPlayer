package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: renamed from: com.daaw.Hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1060Hh {
    public final InputStream a(String str) throws IOException {
        G10.g(str, "path");
        ClassLoader classLoader = C1060Hh.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
