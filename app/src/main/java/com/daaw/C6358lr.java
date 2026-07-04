package com.daaw;

import android.os.Build;

/* JADX INFO: renamed from: com.daaw.lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6358lr {
    public static final C6358lr i = new a().a();
    public EnumC1189In0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public C8315ss h;

    /* JADX INFO: renamed from: com.daaw.lr$a */
    public static final class a {
        public boolean a = false;
        public boolean b = false;
        public EnumC1189In0 c = EnumC1189In0.NOT_REQUIRED;
        public boolean d = false;
        public boolean e = false;
        public long f = -1;
        public long g = -1;
        public C8315ss h = new C8315ss();

        public C6358lr a() {
            return new C6358lr(this);
        }

        public a b(EnumC1189In0 enumC1189In0) {
            this.c = enumC1189In0;
            return this;
        }
    }

    public C6358lr() {
        this.a = EnumC1189In0.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new C8315ss();
    }

    public C8315ss a() {
        return this.h;
    }

    public EnumC1189In0 b() {
        return this.a;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public boolean e() {
        return this.h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6358lr.class != obj.getClass()) {
            return false;
        }
        C6358lr c6358lr = (C6358lr) obj;
        if (this.b == c6358lr.b && this.c == c6358lr.c && this.d == c6358lr.d && this.e == c6358lr.e && this.f == c6358lr.f && this.g == c6358lr.g && this.a == c6358lr.a) {
            return this.h.equals(c6358lr.h);
        }
        return false;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.h.hashCode();
    }

    public boolean i() {
        return this.e;
    }

    public void j(C8315ss c8315ss) {
        this.h = c8315ss;
    }

    public void k(EnumC1189In0 enumC1189In0) {
        this.a = enumC1189In0;
    }

    public void l(boolean z) {
        this.d = z;
    }

    public void m(boolean z) {
        this.b = z;
    }

    public void n(boolean z) {
        this.c = z;
    }

    public void o(boolean z) {
        this.e = z;
    }

    public void p(long j) {
        this.f = j;
    }

    public void q(long j) {
        this.g = j;
    }

    public C6358lr(a aVar) {
        this.a = EnumC1189In0.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new C8315ss();
        this.b = aVar.a;
        int i2 = Build.VERSION.SDK_INT;
        this.c = i2 >= 23 && aVar.b;
        this.a = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (i2 >= 24) {
            this.h = aVar.h;
            this.f = aVar.f;
            this.g = aVar.g;
        }
    }

    public C6358lr(C6358lr c6358lr) {
        this.a = EnumC1189In0.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new C8315ss();
        this.b = c6358lr.b;
        this.c = c6358lr.c;
        this.a = c6358lr.a;
        this.d = c6358lr.d;
        this.e = c6358lr.e;
        this.h = c6358lr.h;
    }
}
