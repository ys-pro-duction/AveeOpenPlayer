package com.daaw;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LO {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e = 0;
    public final String f;

    public LO(String str, String str2, String str3, List list) {
        this.a = (String) AbstractC8621ty0.g(str);
        this.b = (String) AbstractC8621ty0.g(str2);
        this.c = (String) AbstractC8621ty0.g(str3);
        this.d = (List) AbstractC8621ty0.g(list);
        this.f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List list = (List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
