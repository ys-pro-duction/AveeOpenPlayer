package com.daaw;

import com.daaw.AbstractC3454bX0;

/* JADX INFO: renamed from: com.daaw.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6846nd extends AbstractC3454bX0.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final FB f;

    public C6846nd(String str, String str2, String str3, String str4, int i, FB fb) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        if (fb == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f = fb;
    }

    @Override // com.daaw.AbstractC3454bX0.a
    public String a() {
        return this.a;
    }

    @Override // com.daaw.AbstractC3454bX0.a
    public int c() {
        return this.e;
    }

    @Override // com.daaw.AbstractC3454bX0.a
    public FB d() {
        return this.f;
    }

    @Override // com.daaw.AbstractC3454bX0.a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3454bX0.a) {
            AbstractC3454bX0.a aVar = (AbstractC3454bX0.a) obj;
            if (this.a.equals(aVar.a()) && this.b.equals(aVar.f()) && this.c.equals(aVar.g()) && this.d.equals(aVar.e()) && this.e == aVar.c() && this.f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC3454bX0.a
    public String f() {
        return this.b;
    }

    @Override // com.daaw.AbstractC3454bX0.a
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
