package com.google.android.gms.ads.identifier;

import com.daaw.AbstractC3469ba3;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public static final void zza(String str) {
        try {
            try {
                AbstractC3469ba3.b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        new StringBuilder(String.valueOf(str).length() + 65);
                    }
                    AbstractC3469ba3.a();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                AbstractC3469ba3.a();
            } catch (IndexOutOfBoundsException e2) {
                new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(e2.getMessage()).length());
                AbstractC3469ba3.a();
            } catch (RuntimeException e3) {
                e = e3;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                AbstractC3469ba3.a();
            }
        } catch (Throwable th) {
            AbstractC3469ba3.a();
            throw th;
        }
    }
}
