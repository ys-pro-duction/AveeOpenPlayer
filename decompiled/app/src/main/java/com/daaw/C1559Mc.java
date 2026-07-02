package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1559Mc extends AbstractC1316Jt.e.AbstractC0086e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    /* JADX INFO: renamed from: com.daaw.Mc$b */
    public static final class b extends AbstractC1316Jt.e.AbstractC0086e.a {
        public Integer a;
        public String b;
        public String c;
        public Boolean d;

        @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e.a
        public AbstractC1316Jt.e.AbstractC0086e a() {
            String str = "";
            if (this.a == null) {
                str = " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C1559Mc(this.a.intValue(), this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e.a
        public AbstractC1316Jt.e.AbstractC0086e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.c = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e.a
        public AbstractC1316Jt.e.AbstractC0086e.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e.a
        public AbstractC1316Jt.e.AbstractC0086e.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e.a
        public AbstractC1316Jt.e.AbstractC0086e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e
    public String b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e
    public int c() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e
    public String d() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.AbstractC0086e
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.AbstractC0086e) {
            AbstractC1316Jt.e.AbstractC0086e abstractC0086e = (AbstractC1316Jt.e.AbstractC0086e) obj;
            if (this.a == abstractC0086e.c() && this.b.equals(abstractC0086e.d()) && this.c.equals(abstractC0086e.b()) && this.d == abstractC0086e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }

    public C1559Mc(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
