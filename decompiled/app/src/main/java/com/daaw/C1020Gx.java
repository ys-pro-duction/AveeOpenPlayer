package com.daaw;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.daaw.Gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1020Gx implements InterfaceC6857nf0 {
    @Override // com.daaw.InterfaceC6857nf0
    public InterfaceC5173hf0 a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C0916Fx(httpURLConnection);
    }
}
