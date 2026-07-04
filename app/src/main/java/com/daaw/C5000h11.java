package com.daaw;

import j$.util.Objects;

/* JADX INFO: renamed from: com.daaw.h11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5000h11 {
    public final Z01 a;
    public final int b;
    public final long c;
    public final EnumC7573qC0 d;
    public final CU0 e;
    public final CU0 f;
    public final AbstractC4340ei g;
    public final Integer h;

    public C5000h11(Z01 z01, int i, long j, EnumC7573qC0 enumC7573qC0, CU0 cu0, CU0 cu02, AbstractC4340ei abstractC4340ei, Integer num) {
        this.a = (Z01) AbstractC8342sy0.b(z01);
        this.b = i;
        this.c = j;
        this.f = cu02;
        this.d = enumC7573qC0;
        this.e = (CU0) AbstractC8342sy0.b(cu0);
        this.g = (AbstractC4340ei) AbstractC8342sy0.b(abstractC4340ei);
        this.h = num;
    }

    public Integer a() {
        return this.h;
    }

    public CU0 b() {
        return this.f;
    }

    public EnumC7573qC0 c() {
        return this.d;
    }

    public AbstractC4340ei d() {
        return this.g;
    }

    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5000h11.class == obj.getClass()) {
            C5000h11 c5000h11 = (C5000h11) obj;
            if (this.a.equals(c5000h11.a) && this.b == c5000h11.b && this.c == c5000h11.c && this.d.equals(c5000h11.d) && this.e.equals(c5000h11.e) && this.f.equals(c5000h11.f) && this.g.equals(c5000h11.g) && Objects.equals(this.h, c5000h11.h)) {
                return true;
            }
        }
        return false;
    }

    public CU0 f() {
        return this.e;
    }

    public Z01 g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b) * 31) + ((int) this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(this.h);
    }

    public C5000h11 i(Integer num) {
        return new C5000h11(this.a, this.b, this.c, this.d, this.e, this.f, this.g, num);
    }

    public C5000h11 j(CU0 cu0) {
        return new C5000h11(this.a, this.b, this.c, this.d, this.e, cu0, this.g, this.h);
    }

    public C5000h11 k(AbstractC4340ei abstractC4340ei, CU0 cu0) {
        return new C5000h11(this.a, this.b, this.c, this.d, cu0, this.f, abstractC4340ei, null);
    }

    public C5000h11 l(long j) {
        return new C5000h11(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h);
    }

    public String toString() {
        return "TargetData{target=" + this.a + ", targetId=" + this.b + ", sequenceNumber=" + this.c + ", purpose=" + this.d + ", snapshotVersion=" + this.e + ", lastLimboFreeSnapshotVersion=" + this.f + ", resumeToken=" + this.g + ", expectedCount=" + this.h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5000h11(Z01 z01, int i, long j, EnumC7573qC0 enumC7573qC0) {
        CU0 cu0 = CU0.C;
        this(z01, i, j, enumC7573qC0, cu0, cu0, C6305lg1.t, null);
    }
}
