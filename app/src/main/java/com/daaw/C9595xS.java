package com.daaw;

/* JADX INFO: renamed from: com.daaw.xS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9595xS {
    public final String a;
    public final boolean b;

    /* JADX INFO: renamed from: com.daaw.xS$a */
    public static final class a {
        public String a = "";
        public boolean b = true;

        public final C9595xS a() {
            if (this.a.length() > 0) {
                return new C9595xS(this.a, this.b);
            }
            throw new IllegalStateException("adsSdkName must be set");
        }

        public final a b(String str) {
            G10.g(str, "adsSdkName");
            this.a = str;
            return this;
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }
    }

    public C9595xS(String str, boolean z) {
        G10.g(str, "adsSdkName");
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9595xS)) {
            return false;
        }
        C9595xS c9595xS = (C9595xS) obj;
        return G10.c(this.a, c9595xS.a) && this.b == c9595xS.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + AbstractC8813ug.a(this.b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.a + ", shouldRecordObservation=" + this.b;
    }
}
