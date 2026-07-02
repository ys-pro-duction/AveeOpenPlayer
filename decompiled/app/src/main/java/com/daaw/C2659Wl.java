package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2659Wl {
    public static final C2659Wl e = new a().b();
    public final J31 a;
    public final List b;
    public final C5957kT c;
    public final String d;

    /* JADX INFO: renamed from: com.daaw.Wl$a */
    public static final class a {
        public J31 a = null;
        public List b = new ArrayList();
        public C5957kT c = null;
        public String d = "";

        public a a(C1253Jd0 c1253Jd0) {
            this.b.add(c1253Jd0);
            return this;
        }

        public C2659Wl b() {
            return new C2659Wl(this.a, DesugarCollections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(C5957kT c5957kT) {
            this.c = c5957kT;
            return this;
        }

        public a e(J31 j31) {
            this.a = j31;
            return this;
        }
    }

    public C2659Wl(J31 j31, List list, C5957kT c5957kT, String str) {
        this.a = j31;
        this.b = list;
        this.c = c5957kT;
        this.d = str;
    }

    public static a e() {
        return new a();
    }

    public String a() {
        return this.d;
    }

    public C5957kT b() {
        return this.c;
    }

    public List c() {
        return this.b;
    }

    public J31 d() {
        return this.a;
    }

    public byte[] f() {
        return UA0.a(this);
    }
}
