package com.daaw;

import com.daaw.H11;

/* JADX INFO: renamed from: com.daaw.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7961rd extends H11.b {
    public final int a;
    public final int b;
    public final H11.a c;

    public C7961rd(int i, int i2, H11.a aVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
    }

    @Override // com.daaw.H11.b
    public H11.a a() {
        return this.c;
    }

    @Override // com.daaw.H11.b
    public int c() {
        return this.b;
    }

    @Override // com.daaw.H11.b
    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        H11.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof H11.b) {
            H11.b bVar = (H11.b) obj;
            if (this.a == bVar.e() && this.b == bVar.c() && ((aVar = this.c) != null ? aVar.equals(bVar.a()) : bVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        H11.a aVar = this.c;
        return i ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.a + ", existenceFilterCount=" + this.b + ", bloomFilter=" + this.c + "}";
    }
}
