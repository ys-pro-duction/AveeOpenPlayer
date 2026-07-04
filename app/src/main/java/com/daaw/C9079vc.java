package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9079vc extends AbstractC1316Jt.c {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: com.daaw.vc$b */
    public static final class b extends AbstractC1316Jt.c.a {
        public String a;
        public String b;

        @Override // com.daaw.AbstractC1316Jt.c.a
        public AbstractC1316Jt.c a() {
            String str = "";
            if (this.a == null) {
                str = " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C9079vc(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.c.a
        public AbstractC1316Jt.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.a = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.c.a
        public AbstractC1316Jt.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.b = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.c
    public String b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.c
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.c) {
            AbstractC1316Jt.c cVar = (AbstractC1316Jt.c) obj;
            if (this.a.equals(cVar.b()) && this.b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }

    public C9079vc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
