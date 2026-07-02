package com.daaw;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.daaw.Rt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2171Rt1 {
    public final String a;
    public final String b;

    public C2171Rt1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2171Rt1.class == obj.getClass()) {
            C2171Rt1 c2171Rt1 = (C2171Rt1) obj;
            if (TextUtils.equals(this.a, c2171Rt1.a) && TextUtils.equals(this.b, c2171Rt1.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }
}
