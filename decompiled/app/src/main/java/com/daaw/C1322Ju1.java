package com.daaw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.daaw.Ju1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1322Ju1 extends FilterInputStream implements AutoCloseable {
    public final HttpURLConnection B;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1322Ju1(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.B = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.B.disconnect();
    }
}
