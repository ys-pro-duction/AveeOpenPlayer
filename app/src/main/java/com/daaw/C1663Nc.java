package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1663Nc extends AbstractC1316Jt.e.f {
    public final String a;

    /* JADX INFO: renamed from: com.daaw.Nc$b */
    public static final class b extends AbstractC1316Jt.e.f.a {
        public String a;

        @Override // com.daaw.AbstractC1316Jt.e.f.a
        public AbstractC1316Jt.e.f a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new C1663Nc(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.f.a
        public AbstractC1316Jt.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.f
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.f) {
            return this.a.equals(((AbstractC1316Jt.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }

    public C1663Nc(String str) {
        this.a = str;
    }
}
