package com.daaw;

/* JADX INFO: renamed from: com.daaw.uw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8900uw1 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public C8900uw1(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        AbstractC7506py0.f(str);
        AbstractC7506py0.f(str2);
        AbstractC7506py0.a(j >= 0);
        AbstractC7506py0.a(j2 >= 0);
        AbstractC7506py0.a(j3 >= 0);
        AbstractC7506py0.a(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final C8900uw1 a(Long l, Long l2, Boolean bool) {
        return new C8900uw1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }

    public final C8900uw1 b(long j, long j2) {
        return new C8900uw1(this.a, this.b, this.c, this.d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    public final C8900uw1 c(long j) {
        return new C8900uw1(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }
}
