package com.daaw;

/* JADX INFO: renamed from: com.daaw.li1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6315li1 {
    public static final int a = c(1, 3);
    public static final int b = c(1, 4);
    public static final int c = c(2, 0);
    public static final int d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'F' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.daaw.li1$b */
    public static class b {
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
        public static final b Q;
        public static final b R;
        public static final b S;
        public static final b T;
        public static final b U;
        public static final /* synthetic */ b[] V;
        public final c B;
        public final int C;

        /* JADX INFO: renamed from: com.daaw.li1$b$a */
        public enum a extends b {
            public a(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            @Override // com.daaw.AbstractC6315li1.b
            public boolean g() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.daaw.li1$b$b, reason: collision with other inner class name */
        public enum C0210b extends b {
            public C0210b(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            @Override // com.daaw.AbstractC6315li1.b
            public boolean g() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.daaw.li1$b$c */
        public enum c extends b {
            public c(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            @Override // com.daaw.AbstractC6315li1.b
            public boolean g() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.daaw.li1$b$d */
        public enum d extends b {
            public d(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            @Override // com.daaw.AbstractC6315li1.b
            public boolean g() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            D = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            E = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            F = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            G = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            H = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            I = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            J = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            K = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            L = aVar;
            c cVar3 = c.MESSAGE;
            C0210b c0210b = new C0210b("GROUP", 9, cVar3, 3);
            M = c0210b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            N = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            O = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            P = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            Q = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            R = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            S = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            T = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            U = bVar14;
            V = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0210b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) V.clone();
        }

        public c a() {
            return this.B;
        }

        public int c() {
            return this.C;
        }

        public boolean g() {
            return true;
        }

        public b(String str, int i, c cVar, int i2) {
            this.B = cVar;
            this.C = i2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.li1$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC4629fi.B),
        ENUM(null),
        MESSAGE(null);

        public final Object B;

        c(Object obj) {
            this.B = obj;
        }
    }

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    public static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
