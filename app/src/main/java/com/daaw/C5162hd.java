package com.daaw;

import com.daaw.AbstractC1836Ot0;
import com.daaw.C1732Nt0;

/* JADX INFO: renamed from: com.daaw.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5162hd extends AbstractC1836Ot0 {
    public final String b;
    public final C1732Nt0.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    /* JADX INFO: renamed from: com.daaw.hd$b */
    public static final class b extends AbstractC1836Ot0.a {
        public String a;
        public C1732Nt0.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        @Override // com.daaw.AbstractC1836Ot0.a
        public AbstractC1836Ot0 a() {
            String str = "";
            if (this.b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C5162hd(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1836Ot0.a
        public AbstractC1836Ot0.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.AbstractC1836Ot0.a
        public AbstractC1836Ot0.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1836Ot0.a
        public AbstractC1836Ot0.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.daaw.AbstractC1836Ot0.a
        public AbstractC1836Ot0.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // com.daaw.AbstractC1836Ot0.a
        public AbstractC1836Ot0.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.daaw.AbstractC1836Ot0.a
        public AbstractC1836Ot0.a g(C1732Nt0.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = aVar;
            return this;
        }

        @Override // com.daaw.AbstractC1836Ot0.a
        public AbstractC1836Ot0.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public b() {
        }

        public b(AbstractC1836Ot0 abstractC1836Ot0) {
            this.a = abstractC1836Ot0.d();
            this.b = abstractC1836Ot0.g();
            this.c = abstractC1836Ot0.b();
            this.d = abstractC1836Ot0.f();
            this.e = Long.valueOf(abstractC1836Ot0.c());
            this.f = Long.valueOf(abstractC1836Ot0.h());
            this.g = abstractC1836Ot0.e();
        }
    }

    @Override // com.daaw.AbstractC1836Ot0
    public String b() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1836Ot0
    public long c() {
        return this.f;
    }

    @Override // com.daaw.AbstractC1836Ot0
    public String d() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1836Ot0
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1836Ot0) {
            AbstractC1836Ot0 abstractC1836Ot0 = (AbstractC1836Ot0) obj;
            String str4 = this.b;
            if (str4 != null ? str4.equals(abstractC1836Ot0.d()) : abstractC1836Ot0.d() == null) {
                if (this.c.equals(abstractC1836Ot0.g()) && ((str = this.d) != null ? str.equals(abstractC1836Ot0.b()) : abstractC1836Ot0.b() == null) && ((str2 = this.e) != null ? str2.equals(abstractC1836Ot0.f()) : abstractC1836Ot0.f() == null) && this.f == abstractC1836Ot0.c() && this.g == abstractC1836Ot0.h() && ((str3 = this.h) != null ? str3.equals(abstractC1836Ot0.e()) : abstractC1836Ot0.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1836Ot0
    public String f() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1836Ot0
    public C1732Nt0.a g() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1836Ot0
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.daaw.AbstractC1836Ot0
    public AbstractC1836Ot0.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }

    public C5162hd(String str, C1732Nt0.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}
