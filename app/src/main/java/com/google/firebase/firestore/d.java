package com.google.firebase.firestore;

import com.daaw.InterfaceC1457Lc0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public static final class b {
        public boolean e = false;
        public String a = "firestore.googleapis.com";
        public boolean b = true;
        public boolean c = true;
        public long d = 104857600;

        public static /* synthetic */ InterfaceC1457Lc0 a(b bVar) {
            bVar.getClass();
            return null;
        }

        public d f() {
            if (this.b || !this.a.equals("firestore.googleapis.com")) {
                return new d(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }
    }

    public InterfaceC1457Lc0 a() {
        return null;
    }

    public long b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.a.equals(dVar.a);
    }

    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        long j = this.d;
        return (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public String toString() {
        if (("FirebaseFirestoreSettings{host=" + this.a + ", sslEnabled=" + this.b + ", persistenceEnabled=" + this.c + ", cacheSizeBytes=" + this.d + ", cacheSettings=" + ((Object) null)) == null) {
            return "null";
        }
        throw null;
    }

    public d(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        b.a(bVar);
    }
}
