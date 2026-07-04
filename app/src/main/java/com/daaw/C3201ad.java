package com.daaw;

/* JADX INFO: renamed from: com.daaw.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3201ad extends AbstractC0725Eb0 {
    public final String a;
    public final String b;

    public C3201ad(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // com.daaw.AbstractC0725Eb0
    public String b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC0725Eb0
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0725Eb0) {
            AbstractC0725Eb0 abstractC0725Eb0 = (AbstractC0725Eb0) obj;
            if (this.a.equals(abstractC0725Eb0.b()) && this.b.equals(abstractC0725Eb0.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
