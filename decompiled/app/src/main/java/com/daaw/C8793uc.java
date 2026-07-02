package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8793uc extends AbstractC1316Jt.a.AbstractC0071a {
    public final String a;
    public final String b;
    public final String c;

    /* JADX INFO: renamed from: com.daaw.uc$b */
    public static final class b extends AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a {
        public String a;
        public String b;
        public String c;

        @Override // com.daaw.AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a
        public AbstractC1316Jt.a.AbstractC0071a a() {
            String str = "";
            if (this.a == null) {
                str = " arch";
            }
            if (this.b == null) {
                str = str + " libraryName";
            }
            if (this.c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C8793uc(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a
        public AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.a = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a
        public AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.c = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a
        public AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.a.AbstractC0071a
    public String b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.a.AbstractC0071a
    public String c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.a.AbstractC0071a
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.a.AbstractC0071a) {
            AbstractC1316Jt.a.AbstractC0071a abstractC0071a = (AbstractC1316Jt.a.AbstractC0071a) obj;
            if (this.a.equals(abstractC0071a.b()) && this.b.equals(abstractC0071a.d()) && this.c.equals(abstractC0071a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.a + ", libraryName=" + this.b + ", buildId=" + this.c + "}";
    }

    public C8793uc(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
