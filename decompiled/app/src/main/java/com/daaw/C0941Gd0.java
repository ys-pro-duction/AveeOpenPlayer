package com.daaw;

import java.io.File;

/* JADX INFO: renamed from: com.daaw.Gd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0941Gd0 {
    public static final b c = new b();
    public final RK a;
    public NK b;

    public C0941Gd0(RK rk) {
        this.a = rk;
        this.b = c;
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    public String c() {
        return this.b.b();
    }

    public final File d(String str) {
        return this.a.o(str, "userlog");
    }

    public final void e(String str) {
        this.b.a();
        this.b = c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    public void f(File file, int i) {
        this.b = new C9532xC0(file, i);
    }

    public void g(long j, String str) {
        this.b.e(j, str);
    }

    public C0941Gd0(RK rk, String str) {
        this(rk);
        e(str);
    }

    /* JADX INFO: renamed from: com.daaw.Gd0$b */
    public static final class b implements NK {
        public b() {
        }

        @Override // com.daaw.NK
        public String b() {
            return null;
        }

        @Override // com.daaw.NK
        public byte[] c() {
            return null;
        }

        @Override // com.daaw.NK
        public void a() {
        }

        @Override // com.daaw.NK
        public void d() {
        }

        @Override // com.daaw.NK
        public void e(long j, String str) {
        }
    }
}
