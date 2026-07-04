package com.daaw;

import com.daaw.H11;

/* JADX INFO: renamed from: com.daaw.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7683qd extends H11.a {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public C7683qd(boolean z, int i, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // com.daaw.H11.a
    public boolean a() {
        return this.a;
    }

    @Override // com.daaw.H11.a
    public int b() {
        return this.c;
    }

    @Override // com.daaw.H11.a
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H11.a) {
            H11.a aVar = (H11.a) obj;
            if (this.a == aVar.a() && this.b == aVar.e() && this.c == aVar.b() && this.d == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.H11.a
    public int f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public String toString() {
        return "ExistenceFilterBloomFilterInfo{applied=" + this.a + ", hashCount=" + this.b + ", bitmapLength=" + this.c + ", padding=" + this.d + "}";
    }
}
