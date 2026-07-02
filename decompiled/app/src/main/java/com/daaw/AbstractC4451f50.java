package com.daaw;

/* JADX INFO: renamed from: com.daaw.f50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4451f50 {

    /* JADX INFO: renamed from: com.daaw.f50$a */
    public static final class a extends AbstractC4451f50 {
        public final String a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            G10.g(str, "name");
            G10.g(str2, "desc");
            this.a = str;
            this.b = str2;
        }

        @Override // com.daaw.AbstractC4451f50
        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public String d() {
            return this.b;
        }

        public String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && G10.c(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.daaw.f50$b */
    public static final class b extends AbstractC4451f50 {
        public final String a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            G10.g(str, "name");
            G10.g(str2, "desc");
            this.a = str;
            this.b = str2;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            if ((i & 2) != 0) {
                str2 = bVar.b;
            }
            return bVar.b(str, str2);
        }

        @Override // com.daaw.AbstractC4451f50
        public String a() {
            return e() + d();
        }

        public final b b(String str, String str2) {
            G10.g(str, "name");
            G10.g(str2, "desc");
            return new b(str, str2);
        }

        public String d() {
            return this.b;
        }

        public String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G10.c(this.a, bVar.a) && G10.c(this.b, bVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public /* synthetic */ AbstractC4451f50(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    public AbstractC4451f50() {
    }
}
