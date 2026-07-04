package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;
import com.daaw.C9474x00;
import com.daaw.LY0;

/* JADX INFO: renamed from: com.daaw.b11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3318b11 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    private static final C3318b11 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private C9474x00 expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* JADX INFO: renamed from: com.daaw.b11$a */
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

    /* JADX INFO: renamed from: com.daaw.b11$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(Q31 q31) {
            q();
            ((C3318b11) this.C).k0(q31);
            return this;
        }

        public b B(AbstractC4340ei abstractC4340ei) {
            q();
            ((C3318b11) this.C).l0(abstractC4340ei);
            return this;
        }

        public b C(int i) {
            q();
            ((C3318b11) this.C).m0(i);
            return this;
        }

        public b x(c cVar) {
            q();
            ((C3318b11) this.C).h0(cVar);
            return this;
        }

        public b y(C9474x00.b bVar) {
            q();
            ((C3318b11) this.C).i0((C9474x00) bVar.n());
            return this;
        }

        public b z(d dVar) {
            q();
            ((C3318b11) this.C).j0(dVar);
            return this;
        }

        public b() {
            super(C3318b11.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.b11$c */
    public static final class c extends AbstractC5394iS implements InterfaceC2236Sj0 {
        private static final c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile InterfaceC2896Ys0 PARSER;
        private AbstractC3317b10.e documents_ = AbstractC5394iS.z();

        /* JADX INFO: renamed from: com.daaw.b11$c$a */
        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(String str) {
                q();
                ((c) this.C).b0(str);
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5394iS.V(c.class, cVar);
        }

        public static c d0() {
            return DEFAULT_INSTANCE;
        }

        public static a g0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        public final void b0(String str) {
            str.getClass();
            c0();
            this.documents_.add(str);
        }

        public final void c0() {
            AbstractC3317b10.e eVar = this.documents_;
            if (eVar.C()) {
                return;
            }
            this.documents_ = AbstractC5394iS.L(eVar);
        }

        public String e0(int i) {
            return (String) this.documents_.get(i);
        }

        public int f0() {
            return this.documents_.size();
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
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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

    /* JADX INFO: renamed from: com.daaw.b11$d */
    public static final class d extends AbstractC5394iS implements InterfaceC2236Sj0 {
        private static final d DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile InterfaceC2896Ys0 PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        /* JADX INFO: renamed from: com.daaw.b11$d$a */
        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(String str) {
                q();
                ((d) this.C).g0(str);
                return this;
            }

            public a y(LY0.b bVar) {
                q();
                ((d) this.C).h0((LY0) bVar.n());
                return this;
            }

            public a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            AbstractC5394iS.V(d.class, dVar);
        }

        public static d c0() {
            return DEFAULT_INSTANCE;
        }

        public static a f0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        public String d0() {
            return this.parent_;
        }

        public LY0 e0() {
            return this.queryTypeCase_ == 2 ? (LY0) this.queryType_ : LY0.k0();
        }

        public final void g0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        public final void h0(LY0 ly0) {
            ly0.getClass();
            this.queryType_ = ly0;
            this.queryTypeCase_ = 2;
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", LY0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (d.class) {
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
        C3318b11 c3318b11 = new C3318b11();
        DEFAULT_INSTANCE = c3318b11;
        AbstractC5394iS.V(C3318b11.class, c3318b11);
    }

    public static b g0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(Q31 q31) {
        q31.getClass();
        this.resumeType_ = q31;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(AbstractC4340ei abstractC4340ei) {
        abstractC4340ei.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = abstractC4340ei;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(int i) {
        this.targetId_ = i;
    }

    public final void i0(C9474x00 c9474x00) {
        c9474x00.getClass();
        this.expectedCount_ = c9474x00;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C3318b11();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0000\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\f\t", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", d.class, c.class, "targetId_", "once_", Q31.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C3318b11.class) {
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
