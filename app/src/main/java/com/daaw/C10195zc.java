package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10195zc extends AbstractC1316Jt.e.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: com.daaw.zc$b */
    public static final class b extends AbstractC1316Jt.e.a.AbstractC0073a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        @Override // com.daaw.AbstractC1316Jt.e.a.AbstractC0073a
        public AbstractC1316Jt.e.a a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C10195zc(this.a, this.b, this.c, null, this.d, this.e, this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.a.AbstractC0073a
        public AbstractC1316Jt.e.a.AbstractC0073a b(String str) {
            this.e = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.a.AbstractC0073a
        public AbstractC1316Jt.e.a.AbstractC0073a c(String str) {
            this.f = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.a.AbstractC0073a
        public AbstractC1316Jt.e.a.AbstractC0073a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.a.AbstractC0073a
        public AbstractC1316Jt.e.a.AbstractC0073a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.a.AbstractC0073a
        public AbstractC1316Jt.e.a.AbstractC0073a f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.a.AbstractC0073a
        public AbstractC1316Jt.e.a.AbstractC0073a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.a
    public String b() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e.a
    public String c() {
        return this.f;
    }

    @Override // com.daaw.AbstractC1316Jt.e.a
    public String d() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.a
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.a) {
            AbstractC1316Jt.e.a aVar = (AbstractC1316Jt.e.a) obj;
            if (this.a.equals(aVar.e()) && this.b.equals(aVar.h()) && ((str = this.c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
                aVar.g();
                String str2 = this.d;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.e;
                    if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                        String str4 = this.f;
                        if (str4 != null ? str4.equals(aVar.c()) : aVar.c() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e.a
    public String f() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1316Jt.e.a
    public AbstractC1316Jt.e.a.b g() {
        return null;
    }

    @Override // com.daaw.AbstractC1316Jt.e.a
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + ((Object) null) + ", installationUuid=" + this.d + ", developmentPlatform=" + this.e + ", developmentPlatformVersion=" + this.f + "}";
    }

    public C10195zc(String str, String str2, String str3, AbstractC1316Jt.e.a.b bVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
