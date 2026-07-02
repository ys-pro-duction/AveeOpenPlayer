package com.daaw;

import com.daaw.AbstractC3454bX0;

/* JADX INFO: renamed from: com.daaw.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7125od extends AbstractC3454bX0.b {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public C7125od(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.i = str3;
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public int a() {
        return this.a;
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public int b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public long d() {
        return this.e;
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3454bX0.b) {
            AbstractC3454bX0.b bVar = (AbstractC3454bX0.b) obj;
            if (this.a == bVar.a() && this.b.equals(bVar.g()) && this.c == bVar.b() && this.d == bVar.j() && this.e == bVar.d() && this.f == bVar.e() && this.g == bVar.i() && this.h.equals(bVar.f()) && this.i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public String f() {
        return this.h;
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public String g() {
        return this.b;
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public String h() {
        return this.i;
    }

    public int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public int i() {
        return this.g;
    }

    @Override // com.daaw.AbstractC3454bX0.b
    public long j() {
        return this.d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.a + ", model=" + this.b + ", availableProcessors=" + this.c + ", totalRam=" + this.d + ", diskSpace=" + this.e + ", isEmulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }
}
