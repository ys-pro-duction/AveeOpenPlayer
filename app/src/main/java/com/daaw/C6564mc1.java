package com.daaw;

import com.daaw.AbstractC5394iS;
import com.daaw.C0745Eg0;
import com.daaw.C3748cb;
import com.daaw.C4471f90;
import com.daaw.Q31;

/* JADX INFO: renamed from: com.daaw.mc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6564mc1 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final C6564mc1 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* JADX INFO: renamed from: com.daaw.mc1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC5394iS.d.values().length];
            a = iArr;
            try {
                iArr[AbstractC5394iS.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC5394iS.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractC5394iS.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AbstractC5394iS.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AbstractC5394iS.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AbstractC5394iS.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[AbstractC5394iS.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc1$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(AbstractC4340ei abstractC4340ei) {
            q();
            ((C6564mc1) this.C).A0(abstractC4340ei);
            return this;
        }

        public b B(double d) {
            q();
            ((C6564mc1) this.C).B0(d);
            return this;
        }

        public b C(C4471f90.b bVar) {
            q();
            ((C6564mc1) this.C).C0((C4471f90) bVar.n());
            return this;
        }

        public b D(long j) {
            q();
            ((C6564mc1) this.C).D0(j);
            return this;
        }

        public b E(C0745Eg0.b bVar) {
            q();
            ((C6564mc1) this.C).E0((C0745Eg0) bVar.n());
            return this;
        }

        public b G(C0745Eg0 c0745Eg0) {
            q();
            ((C6564mc1) this.C).E0(c0745Eg0);
            return this;
        }

        public b H(EnumC2464Uo0 enumC2464Uo0) {
            q();
            ((C6564mc1) this.C).F0(enumC2464Uo0);
            return this;
        }

        public b J(String str) {
            q();
            ((C6564mc1) this.C).G0(str);
            return this;
        }

        public b K(String str) {
            q();
            ((C6564mc1) this.C).H0(str);
            return this;
        }

        public b L(Q31.b bVar) {
            q();
            ((C6564mc1) this.C).I0((Q31) bVar.n());
            return this;
        }

        public b x(C3748cb.b bVar) {
            q();
            ((C6564mc1) this.C).y0((C3748cb) bVar.n());
            return this;
        }

        public b y(C3748cb c3748cb) {
            q();
            ((C6564mc1) this.C).y0(c3748cb);
            return this;
        }

        public b z(boolean z) {
            q();
            ((C6564mc1) this.C).z0(z);
            return this;
        }

        public b() {
            super(C6564mc1.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc1$c */
    public enum c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);

        public final int B;

        c(int i) {
            this.B = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i == 1) {
                return BOOLEAN_VALUE;
            }
            if (i == 2) {
                return INTEGER_VALUE;
            }
            if (i == 3) {
                return DOUBLE_VALUE;
            }
            if (i == 5) {
                return REFERENCE_VALUE;
            }
            if (i == 6) {
                return MAP_VALUE;
            }
            if (i == 17) {
                return STRING_VALUE;
            }
            if (i == 18) {
                return BYTES_VALUE;
            }
            switch (i) {
                case 8:
                    return GEO_POINT_VALUE;
                case 9:
                    return ARRAY_VALUE;
                case 10:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }
    }

    static {
        C6564mc1 c6564mc1 = new C6564mc1();
        DEFAULT_INSTANCE = c6564mc1;
        AbstractC5394iS.V(C6564mc1.class, c6564mc1);
    }

    public static C6564mc1 o0() {
        return DEFAULT_INSTANCE;
    }

    public static b x0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public final void A0(AbstractC4340ei abstractC4340ei) {
        abstractC4340ei.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = abstractC4340ei;
    }

    public final void B0(double d) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d);
    }

    public final void C0(C4471f90 c4471f90) {
        c4471f90.getClass();
        this.valueType_ = c4471f90;
        this.valueTypeCase_ = 8;
    }

    public final void D0(long j) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j);
    }

    public final void E0(C0745Eg0 c0745Eg0) {
        c0745Eg0.getClass();
        this.valueType_ = c0745Eg0;
        this.valueTypeCase_ = 6;
    }

    public final void F0(EnumC2464Uo0 enumC2464Uo0) {
        this.valueType_ = Integer.valueOf(enumC2464Uo0.b());
        this.valueTypeCase_ = 11;
    }

    public final void G0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    public final void H0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    public final void I0(Q31 q31) {
        q31.getClass();
        this.valueType_ = q31;
        this.valueTypeCase_ = 10;
    }

    public C3748cb l0() {
        return this.valueTypeCase_ == 9 ? (C3748cb) this.valueType_ : C3748cb.g0();
    }

    public boolean m0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public AbstractC4340ei n0() {
        return this.valueTypeCase_ == 18 ? (AbstractC4340ei) this.valueType_ : AbstractC4340ei.C;
    }

    public double p0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public C4471f90 q0() {
        return this.valueTypeCase_ == 8 ? (C4471f90) this.valueType_ : C4471f90.c0();
    }

    public long r0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public C0745Eg0 s0() {
        return this.valueTypeCase_ == 6 ? (C0745Eg0) this.valueType_ : C0745Eg0.b0();
    }

    public String t0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public String u0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public Q31 v0() {
        return this.valueTypeCase_ == 10 ? (Q31) this.valueType_ : Q31.c0();
    }

    public c w0() {
        return c.a(this.valueTypeCase_);
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C6564mc1();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", C0745Eg0.class, C4471f90.class, C3748cb.class, Q31.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C6564mc1.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC5394iS.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void y0(C3748cb c3748cb) {
        c3748cb.getClass();
        this.valueType_ = c3748cb;
        this.valueTypeCase_ = 9;
    }

    public final void z0(boolean z) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z);
    }
}
