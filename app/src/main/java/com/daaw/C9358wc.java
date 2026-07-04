package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9358wc extends AbstractC1316Jt.d {
    public final NY a;
    public final String b;

    /* JADX INFO: renamed from: com.daaw.wc$b */
    public static final class b extends AbstractC1316Jt.d.a {
        public NY a;
        public String b;

        @Override // com.daaw.AbstractC1316Jt.d.a
        public AbstractC1316Jt.d a() {
            String str = "";
            if (this.a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new C9358wc(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.d.a
        public AbstractC1316Jt.d.a b(NY ny) {
            if (ny == null) {
                throw new NullPointerException("Null files");
            }
            this.a = ny;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.d.a
        public AbstractC1316Jt.d.a c(String str) {
            this.b = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.d
    public NY b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.d
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.d) {
            AbstractC1316Jt.d dVar = (AbstractC1316Jt.d) obj;
            if (this.a.equals(dVar.b()) && ((str = this.b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }

    public C9358wc(NY ny, String str) {
        this.a = ny;
        this.b = str;
    }
}
