package com.daaw;

import com.daaw.AbstractC3454bX0;

/* JADX INFO: renamed from: com.daaw.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7404pd extends AbstractC3454bX0.c {
    public final String a;
    public final String b;
    public final boolean c;

    public C7404pd(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.b = str2;
        this.c = z;
    }

    @Override // com.daaw.AbstractC3454bX0.c
    public boolean b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC3454bX0.c
    public String c() {
        return this.b;
    }

    @Override // com.daaw.AbstractC3454bX0.c
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3454bX0.c) {
            AbstractC3454bX0.c cVar = (AbstractC3454bX0.c) obj;
            if (this.a.equals(cVar.d()) && this.b.equals(cVar.c()) && this.c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}
