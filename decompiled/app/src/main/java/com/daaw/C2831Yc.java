package com.daaw;

import com.daaw.AbstractC6957o00;

/* JADX INFO: renamed from: com.daaw.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2831Yc extends AbstractC6957o00 {
    public final String a;
    public final String b;
    public final String c;
    public final AbstractC5294i41 d;
    public final AbstractC6957o00.b e;

    /* JADX INFO: renamed from: com.daaw.Yc$b */
    public static final class b extends AbstractC6957o00.a {
        public String a;
        public String b;
        public String c;
        public AbstractC5294i41 d;
        public AbstractC6957o00.b e;

        @Override // com.daaw.AbstractC6957o00.a
        public AbstractC6957o00 a() {
            return new C2831Yc(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // com.daaw.AbstractC6957o00.a
        public AbstractC6957o00.a b(AbstractC5294i41 abstractC5294i41) {
            this.d = abstractC5294i41;
            return this;
        }

        @Override // com.daaw.AbstractC6957o00.a
        public AbstractC6957o00.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.daaw.AbstractC6957o00.a
        public AbstractC6957o00.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.AbstractC6957o00.a
        public AbstractC6957o00.a e(AbstractC6957o00.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // com.daaw.AbstractC6957o00.a
        public AbstractC6957o00.a f(String str) {
            this.a = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC6957o00
    public AbstractC5294i41 b() {
        return this.d;
    }

    @Override // com.daaw.AbstractC6957o00
    public String c() {
        return this.b;
    }

    @Override // com.daaw.AbstractC6957o00
    public String d() {
        return this.c;
    }

    @Override // com.daaw.AbstractC6957o00
    public AbstractC6957o00.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6957o00) {
            AbstractC6957o00 abstractC6957o00 = (AbstractC6957o00) obj;
            String str = this.a;
            if (str != null ? str.equals(abstractC6957o00.f()) : abstractC6957o00.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(abstractC6957o00.c()) : abstractC6957o00.c() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(abstractC6957o00.d()) : abstractC6957o00.d() == null) {
                        AbstractC5294i41 abstractC5294i41 = this.d;
                        if (abstractC5294i41 != null ? abstractC5294i41.equals(abstractC6957o00.b()) : abstractC6957o00.b() == null) {
                            AbstractC6957o00.b bVar = this.e;
                            if (bVar != null ? bVar.equals(abstractC6957o00.e()) : abstractC6957o00.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC6957o00
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC5294i41 abstractC5294i41 = this.d;
        int iHashCode4 = (iHashCode3 ^ (abstractC5294i41 == null ? 0 : abstractC5294i41.hashCode())) * 1000003;
        AbstractC6957o00.b bVar = this.e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }

    public C2831Yc(String str, String str2, String str3, AbstractC5294i41 abstractC5294i41, AbstractC6957o00.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = abstractC5294i41;
        this.e = bVar;
    }
}
