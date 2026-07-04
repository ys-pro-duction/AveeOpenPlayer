package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.gT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4840gT {
    public final URL a;
    public final AV b;
    public final String c;
    public String d;
    public URL e;

    public C4840gT(URL url) {
        this(url, AV.b);
    }

    public String a() {
        String str = this.c;
        return str != null ? str : this.a.toString();
    }

    public Map b() {
        return this.b.a();
    }

    public final String c() {
        if (TextUtils.isEmpty(this.d)) {
            String string = this.c;
            if (TextUtils.isEmpty(string)) {
                string = this.a.toString();
            }
            this.d = Uri.encode(string, "@#&=*+-_.,:!?()/~'%");
        }
        return this.d;
    }

    public final URL d() {
        if (this.e == null) {
            this.e = new URL(c());
        }
        return this.e;
    }

    public URL e() {
        return d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4840gT) {
            C4840gT c4840gT = (C4840gT) obj;
            if (a().equals(c4840gT.a()) && this.b.equals(c4840gT.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return a() + '\n' + this.b.toString();
    }

    public C4840gT(String str) {
        this(str, AV.b);
    }

    public C4840gT(URL url, AV av) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (av != null) {
            this.a = url;
            this.c = null;
            this.b = av;
            return;
        }
        throw new IllegalArgumentException("Headers must not be null");
    }

    public C4840gT(String str, AV av) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        }
        if (av != null) {
            this.c = str;
            this.a = null;
            this.b = av;
            return;
        }
        throw new IllegalArgumentException("Headers must not be null");
    }
}
