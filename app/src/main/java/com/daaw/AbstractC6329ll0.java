package com.daaw;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.ll0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6329ll0 {

    /* JADX INFO: renamed from: com.daaw.ll0$b */
    public static final class b {
        public final String a;
        public final C0211b b;
        public C0211b c;
        public boolean d;
        public boolean e;

        /* JADX INFO: renamed from: com.daaw.ll0$b$a */
        public static final class a extends C0211b {
            public a() {
                super();
            }
        }

        /* JADX INFO: renamed from: com.daaw.ll0$b$b, reason: collision with other inner class name */
        public static class C0211b {
            public String a;
            public Object b;
            public C0211b c;

            public C0211b() {
            }
        }

        public static boolean j(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, double d) {
            return i(str, String.valueOf(d));
        }

        public b b(String str, int i) {
            return i(str, String.valueOf(i));
        }

        public b c(String str, long j) {
            return i(str, String.valueOf(j));
        }

        public b d(String str, Object obj) {
            return g(str, obj);
        }

        public b e(String str, boolean z) {
            return i(str, String.valueOf(z));
        }

        public final C0211b f() {
            C0211b c0211b = new C0211b();
            this.c.c = c0211b;
            this.c = c0211b;
            return c0211b;
        }

        public final b g(String str, Object obj) {
            C0211b c0211bF = f();
            c0211bF.b = obj;
            c0211bF.a = (String) AbstractC7785qy0.n(str);
            return this;
        }

        public final a h() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        public final b i(String str, Object obj) {
            a aVarH = h();
            aVarH.b = obj;
            aVarH.a = (String) AbstractC7785qy0.n(str);
            return this;
        }

        public b k() {
            this.d = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                r0 = 1
                boolean r1 = r8.d
                boolean r2 = r8.e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 32
                r3.<init>(r4)
                java.lang.String r4 = r8.a
                r3.append(r4)
                r4 = 123(0x7b, float:1.72E-43)
                r3.append(r4)
                com.daaw.ll0$b$b r4 = r8.b
                com.daaw.ll0$b$b r4 = r4.c
                java.lang.String r5 = ""
            L1c:
                if (r4 == 0) goto L66
                java.lang.Object r6 = r4.b
                boolean r7 = r4 instanceof com.daaw.AbstractC6329ll0.b.a
                if (r7 != 0) goto L31
                if (r6 != 0) goto L29
                if (r1 != 0) goto L63
                goto L31
            L29:
                if (r2 == 0) goto L31
                boolean r7 = j(r6)
                if (r7 != 0) goto L63
            L31:
                r3.append(r5)
                java.lang.String r5 = r4.a
                if (r5 == 0) goto L40
                r3.append(r5)
                r5 = 61
                r3.append(r5)
            L40:
                if (r6 == 0) goto L5e
                java.lang.Class r5 = r6.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L5e
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
                r5[r7] = r6
                java.lang.String r5 = java.util.Arrays.deepToString(r5)
                int r6 = r5.length()
                int r6 = r6 - r0
                r3.append(r5, r0, r6)
                goto L61
            L5e:
                r3.append(r6)
            L61:
                java.lang.String r5 = ", "
            L63:
                com.daaw.ll0$b$b r4 = r4.c
                goto L1c
            L66:
                r0 = 125(0x7d, float:1.75E-43)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6329ll0.b.toString():java.lang.String");
        }

        public b(String str) {
            C0211b c0211b = new C0211b();
            this.b = c0211b;
            this.c = c0211b;
            this.d = false;
            this.e = false;
            this.a = (String) AbstractC7785qy0.n(str);
        }
    }

    public static b a(Class cls) {
        return new b(cls.getSimpleName());
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
