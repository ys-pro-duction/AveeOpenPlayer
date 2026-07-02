package com.daaw;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DW implements InterfaceC2177Rv {
    public static final c f = new b();
    public final C4840gT a;
    public final c b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public static class b implements c {
        public b() {
        }

        @Override // com.daaw.DW.c
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface c {
        HttpURLConnection a(URL url);
    }

    public DW(C4840gT c4840gT) {
        this(c4840gT, f);
    }

    @Override // com.daaw.InterfaceC2177Rv
    public void b() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final InputStream c(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.d = C6642ms.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                httpURLConnection.getContentEncoding();
            }
            this.d = httpURLConnection.getInputStream();
        }
        return this.d;
    }

    @Override // com.daaw.InterfaceC2177Rv
    public void cancel() {
        this.e = true;
    }

    @Override // com.daaw.InterfaceC2177Rv
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a(EnumC9190vz0 enumC9190vz0) {
        return e(this.a.e(), 0, null, this.a.b());
    }

    public final InputStream e(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new IOException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new IOException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.c = this.b.a(url);
        for (Map.Entry entry : map.entrySet()) {
            this.c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.c.setConnectTimeout(2500);
        this.c.setReadTimeout(2500);
        this.c.setUseCaches(false);
        this.c.setDoInput(true);
        this.c.connect();
        if (this.e) {
            return null;
        }
        int responseCode = this.c.getResponseCode();
        int i2 = responseCode / 100;
        if (i2 == 2) {
            return c(this.c);
        }
        if (i2 == 3) {
            String headerField = this.c.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new IOException("Received empty or null redirect url");
            }
            return e(new URL(url, headerField), i + 1, url, map);
        }
        if (responseCode == -1) {
            throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
        }
        throw new IOException("Request failed " + responseCode + ": " + this.c.getResponseMessage());
    }

    @Override // com.daaw.InterfaceC2177Rv
    public String getId() {
        return this.a.a();
    }

    public DW(C4840gT c4840gT, c cVar) {
        this.a = c4840gT;
        this.b = cVar;
    }
}
