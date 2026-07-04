package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public interface CO0 {

    public static final class a {
        public final EO0 a;
        public final EO0 b;

        public a(EO0 eo0) {
            this(eo0, eo0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public a(EO0 eo0, EO0 eo02) {
            this.a = (EO0) AbstractC7115ob.e(eo0);
            this.b = (EO0) AbstractC7115ob.e(eo02);
        }
    }

    public static final class b implements CO0 {
        public final long a;
        public final a b;

        public b(long j) {
            this(j, 0L);
        }

        @Override // com.daaw.CO0
        public boolean e() {
            return false;
        }

        @Override // com.daaw.CO0
        public a g(long j) {
            return this.b;
        }

        @Override // com.daaw.CO0
        public long h() {
            return this.a;
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? EO0.c : new EO0(0L, j2));
        }
    }

    boolean e();

    a g(long j);

    long h();
}
