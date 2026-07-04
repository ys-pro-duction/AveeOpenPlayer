package com.daaw;

import com.daaw.CV;

/* JADX INFO: renamed from: com.daaw.nI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6760nI0 {
    public final CW a;
    public final CV b;

    /* JADX INFO: renamed from: com.daaw.nI0$b */
    public static class b {
        public CW a;
        public CV.b b = new CV.b();

        public C6760nI0 c() {
            if (this.a != null) {
                return new C6760nI0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public b d(String str, String str2) {
            this.b.f(str, str2);
            return this;
        }

        public b e(CW cw) {
            if (cw == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.a = cw;
            return this;
        }
    }

    public CV a() {
        return this.b;
    }

    public CW b() {
        return this.a;
    }

    public String toString() {
        return "Request{url=" + this.a + '}';
    }

    public C6760nI0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b.c();
    }
}
