package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.C9245wA0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SM {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    public static final b K;
    public static final b L;
    public static final b M;
    public static final b N;
    public static final b O;
    public static final b P;
    public static final b a;
    public static final b b;
    public static final b c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final d p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;

    public static class b extends d {
        public b(int i) {
            super(i, 1);
        }

        @Override // com.daaw.SM.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i) {
            return Boolean.valueOf((i & (1 << this.a)) != 0);
        }

        @Override // com.daaw.SM.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.a;
            }
            return 0;
        }
    }

    public static class c extends d {
        public final AbstractC3595c10.a[] c;

        public c(int i, AbstractC3595c10.a[] aVarArr) {
            super(i, g(aVarArr));
            this.c = aVarArr;
        }

        private static /* synthetic */ void f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public static int g(Object[] objArr) {
            if (objArr == null) {
                f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + objArr.getClass());
        }

        @Override // com.daaw.SM.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC3595c10.a d(int i) {
            int i2 = (1 << this.b) - 1;
            int i3 = this.a;
            int i4 = (i & (i2 << i3)) >> i3;
            for (AbstractC3595c10.a aVar : this.c) {
                if (aVar.b() == i4) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // com.daaw.SM.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(AbstractC3595c10.a aVar) {
            return aVar.b() << this.a;
        }
    }

    public static abstract class d {
        public final int a;
        public final int b;

        public static d a(d dVar, AbstractC3595c10.a[] aVarArr) {
            return new c(dVar.a + dVar.b, aVarArr);
        }

        public static b b(d dVar) {
            return new b(dVar.a + dVar.b);
        }

        public static b c() {
            return new b(0);
        }

        public abstract Object d(int i);

        public abstract int e(Object obj);

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    static {
        b bVarC = d.c();
        a = bVarC;
        b = d.b(bVarC);
        b bVarC2 = d.c();
        c = bVarC2;
        d dVarA = d.a(bVarC2, RA0.values());
        d = dVarA;
        d dVarA2 = d.a(dVarA, EA0.values());
        e = dVarA2;
        d dVarA3 = d.a(dVarA2, C9245wA0.c.values());
        f = dVarA3;
        b bVarB = d.b(dVarA3);
        g = bVarB;
        b bVarB2 = d.b(bVarB);
        h = bVarB2;
        b bVarB3 = d.b(bVarB2);
        i = bVarB3;
        b bVarB4 = d.b(bVarB3);
        j = bVarB4;
        b bVarB5 = d.b(bVarB4);
        k = bVarB5;
        b bVarB6 = d.b(bVarB5);
        l = bVarB6;
        m = d.b(bVarB6);
        b bVarB7 = d.b(dVarA);
        n = bVarB7;
        o = d.b(bVarB7);
        d dVarA4 = d.a(dVarA2, DA0.values());
        p = dVarA4;
        b bVarB8 = d.b(dVarA4);
        q = bVarB8;
        b bVarB9 = d.b(bVarB8);
        r = bVarB9;
        b bVarB10 = d.b(bVarB9);
        s = bVarB10;
        b bVarB11 = d.b(bVarB10);
        t = bVarB11;
        b bVarB12 = d.b(bVarB11);
        u = bVarB12;
        b bVarB13 = d.b(bVarB12);
        v = bVarB13;
        b bVarB14 = d.b(bVarB13);
        w = bVarB14;
        x = d.b(bVarB14);
        b bVarB15 = d.b(dVarA4);
        y = bVarB15;
        b bVarB16 = d.b(bVarB15);
        z = bVarB16;
        b bVarB17 = d.b(bVarB16);
        A = bVarB17;
        b bVarB18 = d.b(bVarB17);
        B = bVarB18;
        b bVarB19 = d.b(bVarB18);
        C = bVarB19;
        b bVarB20 = d.b(bVarB19);
        D = bVarB20;
        b bVarB21 = d.b(bVarB20);
        E = bVarB21;
        b bVarB22 = d.b(bVarB21);
        F = bVarB22;
        G = d.b(bVarB22);
        b bVarB23 = d.b(bVarC2);
        H = bVarB23;
        b bVarB24 = d.b(bVarB23);
        I = bVarB24;
        J = d.b(bVarB24);
        b bVarB25 = d.b(dVarA2);
        K = bVarB25;
        b bVarB26 = d.b(bVarB25);
        L = bVarB26;
        M = d.b(bVarB26);
        b bVarC3 = d.c();
        N = bVarC3;
        O = d.b(bVarC3);
        P = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.SM.a(int):void");
    }

    public static int b(boolean z2, RA0 ra0, EA0 ea0, boolean z3, boolean z4, boolean z5) {
        if (ra0 == null) {
            a(10);
        }
        if (ea0 == null) {
            a(11);
        }
        return c.e(Boolean.valueOf(z2)) | e.e(ea0) | d.e(ra0) | K.e(Boolean.valueOf(z3)) | L.e(Boolean.valueOf(z4)) | M.e(Boolean.valueOf(z5));
    }
}
