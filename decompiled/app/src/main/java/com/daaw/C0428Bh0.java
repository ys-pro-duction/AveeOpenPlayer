package com.daaw;

import com.daaw.AbstractC5394iS;

/* JADX INFO: renamed from: com.daaw.Bh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0428Bh0 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    private static final C0428Bh0 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* JADX INFO: renamed from: com.daaw.Bh0$a */
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

    /* JADX INFO: renamed from: com.daaw.Bh0$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(J91 j91) {
            q();
            ((C0428Bh0) this.C).o0(j91);
            return this;
        }

        public b x(KC kc) {
            q();
            ((C0428Bh0) this.C).l0(kc);
            return this;
        }

        public b y(boolean z) {
            q();
            ((C0428Bh0) this.C).m0(z);
            return this;
        }

        public b z(C4660fo0 c4660fo0) {
            q();
            ((C0428Bh0) this.C).n0(c4660fo0);
            return this;
        }

        public b() {
            super(C0428Bh0.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bh0$c */
    public enum c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);

        public final int B;

        c(int i) {
            this.B = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i == 1) {
                return NO_DOCUMENT;
            }
            if (i == 2) {
                return DOCUMENT;
            }
            if (i != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        C0428Bh0 c0428Bh0 = new C0428Bh0();
        DEFAULT_INSTANCE = c0428Bh0;
        AbstractC5394iS.V(C0428Bh0.class, c0428Bh0);
    }

    public static b j0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public static C0428Bh0 k0(byte[] bArr) {
        return (C0428Bh0) AbstractC5394iS.R(DEFAULT_INSTANCE, bArr);
    }

    public KC e0() {
        return this.documentTypeCase_ == 2 ? (KC) this.documentType_ : KC.d0();
    }

    public c f0() {
        return c.a(this.documentTypeCase_);
    }

    public boolean g0() {
        return this.hasCommittedMutations_;
    }

    public C4660fo0 h0() {
        return this.documentTypeCase_ == 1 ? (C4660fo0) this.documentType_ : C4660fo0.c0();
    }

    public J91 i0() {
        return this.documentTypeCase_ == 3 ? (J91) this.documentType_ : J91.c0();
    }

    public final void l0(KC kc) {
        kc.getClass();
        this.documentType_ = kc;
        this.documentTypeCase_ = 2;
    }

    public final void m0(boolean z) {
        this.hasCommittedMutations_ = z;
    }

    public final void n0(C4660fo0 c4660fo0) {
        c4660fo0.getClass();
        this.documentType_ = c4660fo0;
        this.documentTypeCase_ = 1;
    }

    public final void o0(J91 j91) {
        j91.getClass();
        this.documentType_ = j91;
        this.documentTypeCase_ = 3;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C0428Bh0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", C4660fo0.class, KC.class, J91.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C0428Bh0.class) {
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
