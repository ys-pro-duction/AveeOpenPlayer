package com.daaw;

/* JADX INFO: renamed from: com.daaw.hM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5091hM {
    public final long a;
    public final long b;

    /* JADX INFO: renamed from: com.daaw.hM$b */
    public static class b {
        public long a = 60;
        public long b = com.google.firebase.remoteconfig.internal.c.j;

        public C5091hM c() {
            return new C5091hM(this);
        }

        public b d(long j) {
            if (j >= 0) {
                this.b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public C5091hM(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }
}
