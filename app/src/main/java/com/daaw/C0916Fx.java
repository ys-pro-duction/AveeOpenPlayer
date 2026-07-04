package com.daaw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.daaw.Fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0916Fx implements InterfaceC5173hf0, AutoCloseable {
    public final HttpURLConnection B;

    public C0916Fx(HttpURLConnection httpURLConnection) {
        this.B = httpURLConnection;
    }

    @Override // com.daaw.InterfaceC5173hf0
    public boolean G0() {
        try {
            return this.B.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    public final String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // com.daaw.InterfaceC5173hf0
    public String c0() {
        return this.B.getContentType();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.B.disconnect();
    }

    @Override // com.daaw.InterfaceC5173hf0
    public String g0() {
        try {
            if (G0()) {
                return null;
            }
            return "Unable to fetch " + this.B.getURL() + ". Failed with " + this.B.getResponseCode() + "\n" + a(this.B);
        } catch (IOException e) {
            AbstractC1876Pd0.d("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // com.daaw.InterfaceC5173hf0
    public InputStream m0() {
        return this.B.getInputStream();
    }
}
