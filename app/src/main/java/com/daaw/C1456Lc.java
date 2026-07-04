package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1456Lc extends AbstractC1316Jt.e.d.AbstractC0085d {
    public final String a;

    /* JADX INFO: renamed from: com.daaw.Lc$b */
    public static final class b extends AbstractC1316Jt.e.d.AbstractC0085d.a {
        public String a;

        @Override // com.daaw.AbstractC1316Jt.e.d.AbstractC0085d.a
        public AbstractC1316Jt.e.d.AbstractC0085d a() {
            String str = "";
            if (this.a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new C1456Lc(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.AbstractC0085d.a
        public AbstractC1316Jt.e.d.AbstractC0085d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.a = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.AbstractC0085d
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.AbstractC0085d) {
            return this.a.equals(((AbstractC1316Jt.e.d.AbstractC0085d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }

    public C1456Lc(String str) {
        this.a = str;
    }
}
