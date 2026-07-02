package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;
import com.daaw.C3748cb;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3930dD extends AbstractC5394iS implements InterfaceC2236Sj0 {
    private static final C3930dD DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC2896Ys0 PARSER;
    private String document_ = "";
    private AbstractC3317b10.e fieldTransforms_ = AbstractC5394iS.z();

    /* JADX INFO: renamed from: com.daaw.dD$a */
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

    /* JADX INFO: renamed from: com.daaw.dD$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C3930dD.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.dD$c */
    public static final class c extends AbstractC5394iS implements InterfaceC2236Sj0 {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile InterfaceC2896Ys0 PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: com.daaw.dD$c$a */
        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a A(C3748cb.b bVar) {
                q();
                ((c) this.C).p0((C3748cb) bVar.n());
                return this;
            }

            public a B(b bVar) {
                q();
                ((c) this.C).q0(bVar);
                return this;
            }

            public a x(C3748cb.b bVar) {
                q();
                ((c) this.C).m0((C3748cb) bVar.n());
                return this;
            }

            public a y(String str) {
                q();
                ((c) this.C).n0(str);
                return this;
            }

            public a z(C6564mc1 c6564mc1) {
                q();
                ((c) this.C).o0(c6564mc1);
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.daaw.dD$c$b */
        public enum b implements AbstractC3317b10.a {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);

            public static final AbstractC3317b10.b F = new a();
            public final int B;

            /* JADX INFO: renamed from: com.daaw.dD$c$b$a */
            public class a implements AbstractC3317b10.b {
            }

            b(int i) {
                this.B = i;
            }

            public static b a(int i) {
                if (i == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            @Override // com.daaw.AbstractC3317b10.a
            public final int b() {
                if (this != UNRECOGNIZED) {
                    return this.B;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX INFO: renamed from: com.daaw.dD$c$c, reason: collision with other inner class name */
        public enum EnumC0166c {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);

            public final int B;

            EnumC0166c(int i) {
                this.B = i;
            }

            public static EnumC0166c a(int i) {
                if (i == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (i) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5394iS.V(c.class, cVar);
        }

        public static a l0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        public C3748cb f0() {
            return this.transformTypeCase_ == 6 ? (C3748cb) this.transformType_ : C3748cb.g0();
        }

        public String g0() {
            return this.fieldPath_;
        }

        public C6564mc1 h0() {
            return this.transformTypeCase_ == 3 ? (C6564mc1) this.transformType_ : C6564mc1.o0();
        }

        public C3748cb i0() {
            return this.transformTypeCase_ == 7 ? (C3748cb) this.transformType_ : C3748cb.g0();
        }

        public b j0() {
            if (this.transformTypeCase_ != 2) {
                return b.SERVER_VALUE_UNSPECIFIED;
            }
            b bVarA = b.a(((Integer) this.transformType_).intValue());
            return bVarA == null ? b.UNRECOGNIZED : bVarA;
        }

        public EnumC0166c k0() {
            return EnumC0166c.a(this.transformTypeCase_);
        }

        public final void m0(C3748cb c3748cb) {
            c3748cb.getClass();
            this.transformType_ = c3748cb;
            this.transformTypeCase_ = 6;
        }

        public final void n0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        public final void o0(C6564mc1 c6564mc1) {
            c6564mc1.getClass();
            this.transformType_ = c6564mc1;
            this.transformTypeCase_ = 3;
        }

        public final void p0(C3748cb c3748cb) {
            c3748cb.getClass();
            this.transformType_ = c3748cb;
            this.transformTypeCase_ = 7;
        }

        public final void q0(b bVar) {
            this.transformType_ = Integer.valueOf(bVar.b());
            this.transformTypeCase_ = 2;
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", C6564mc1.class, C6564mc1.class, C6564mc1.class, C3748cb.class, C3748cb.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (c.class) {
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
    }

    static {
        C3930dD c3930dD = new C3930dD();
        DEFAULT_INSTANCE = c3930dD;
        AbstractC5394iS.V(C3930dD.class, c3930dD);
    }

    public static C3930dD a0() {
        return DEFAULT_INSTANCE;
    }

    public List b0() {
        return this.fieldTransforms_;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C3930dD();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C3930dD.class) {
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
}
