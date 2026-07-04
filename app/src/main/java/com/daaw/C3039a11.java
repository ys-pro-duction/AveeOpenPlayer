package com.daaw;

import com.daaw.AbstractC5394iS;
import com.daaw.C3318b11;

/* JADX INFO: renamed from: com.daaw.a11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3039a11 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    private static final C3039a11 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private Q31 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private Q31 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private AbstractC4340ei resumeToken_ = AbstractC4340ei.C;

    /* JADX INFO: renamed from: com.daaw.a11$a */
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

    /* JADX INFO: renamed from: com.daaw.a11$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(long j) {
            q();
            ((C3039a11) this.C).v0(j);
            return this;
        }

        public b B(C3318b11.d dVar) {
            q();
            ((C3039a11) this.C).w0(dVar);
            return this;
        }

        public b C(AbstractC4340ei abstractC4340ei) {
            q();
            ((C3039a11) this.C).x0(abstractC4340ei);
            return this;
        }

        public b D(Q31 q31) {
            q();
            ((C3039a11) this.C).y0(q31);
            return this;
        }

        public b E(int i) {
            q();
            ((C3039a11) this.C).z0(i);
            return this;
        }

        public b x() {
            q();
            ((C3039a11) this.C).i0();
            return this;
        }

        public b y(C3318b11.c cVar) {
            q();
            ((C3039a11) this.C).t0(cVar);
            return this;
        }

        public b z(Q31 q31) {
            q();
            ((C3039a11) this.C).u0(q31);
            return this;
        }

        public b() {
            super(C3039a11.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.a11$c */
    public enum c {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);

        public final int B;

        c(int i) {
            this.B = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i == 5) {
                return QUERY;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        C3039a11 c3039a11 = new C3039a11();
        DEFAULT_INSTANCE = c3039a11;
        AbstractC5394iS.V(C3039a11.class, c3039a11);
    }

    public static b r0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public static C3039a11 s0(byte[] bArr) {
        return (C3039a11) AbstractC5394iS.R(DEFAULT_INSTANCE, bArr);
    }

    public final void i0() {
        this.lastLimboFreeSnapshotVersion_ = null;
    }

    public C3318b11.c j0() {
        return this.targetTypeCase_ == 6 ? (C3318b11.c) this.targetType_ : C3318b11.c.d0();
    }

    public Q31 k0() {
        Q31 q31 = this.lastLimboFreeSnapshotVersion_;
        return q31 == null ? Q31.c0() : q31;
    }

    public long l0() {
        return this.lastListenSequenceNumber_;
    }

    public C3318b11.d m0() {
        return this.targetTypeCase_ == 5 ? (C3318b11.d) this.targetType_ : C3318b11.d.c0();
    }

    public AbstractC4340ei n0() {
        return this.resumeToken_;
    }

    public Q31 o0() {
        Q31 q31 = this.snapshotVersion_;
        return q31 == null ? Q31.c0() : q31;
    }

    public int p0() {
        return this.targetId_;
    }

    public c q0() {
        return c.a(this.targetTypeCase_);
    }

    public final void t0(C3318b11.c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    public final void u0(Q31 q31) {
        q31.getClass();
        this.lastLimboFreeSnapshotVersion_ = q31;
    }

    public final void v0(long j) {
        this.lastListenSequenceNumber_ = j;
    }

    public final void w0(C3318b11.d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 5;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C3039a11();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", C3318b11.d.class, C3318b11.c.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C3039a11.class) {
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

    public final void x0(AbstractC4340ei abstractC4340ei) {
        abstractC4340ei.getClass();
        this.resumeToken_ = abstractC4340ei;
    }

    public final void y0(Q31 q31) {
        q31.getClass();
        this.snapshotVersion_ = q31;
    }

    public final void z0(int i) {
        this.targetId_ = i;
    }
}
