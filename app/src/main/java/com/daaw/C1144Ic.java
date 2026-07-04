package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1144Ic extends AbstractC1316Jt.e.d.a.b.AbstractC0081e {
    public final String a;
    public final int b;
    public final NY c;

    /* JADX INFO: renamed from: com.daaw.Ic$b */
    public static final class b extends AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a {
        public String a;
        public Integer b;
        public NY c;

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C1144Ic(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a b(NY ny) {
            if (ny == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = ny;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e
    public NY b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e
    public int c() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.a.b.AbstractC0081e) {
            AbstractC1316Jt.e.d.a.b.AbstractC0081e abstractC0081e = (AbstractC1316Jt.e.d.a.b.AbstractC0081e) obj;
            if (this.a.equals(abstractC0081e.d()) && this.b == abstractC0081e.c() && this.c.equals(abstractC0081e.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }

    public C1144Ic(String str, int i, NY ny) {
        this.a = str;
        this.b = i;
        this.c = ny;
    }
}
