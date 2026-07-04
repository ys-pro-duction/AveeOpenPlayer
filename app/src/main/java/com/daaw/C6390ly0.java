package com.daaw;

import com.daaw.AbstractC5394iS;

/* JADX INFO: renamed from: com.daaw.ly0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6390ly0 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    private static final C6390ly0 DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    /* JADX INFO: renamed from: com.daaw.ly0$a */
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

    /* JADX INFO: renamed from: com.daaw.ly0$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b x(boolean z) {
            q();
            ((C6390ly0) this.C).h0(z);
            return this;
        }

        public b y(Q31 q31) {
            q();
            ((C6390ly0) this.C).i0(q31);
            return this;
        }

        public b() {
            super(C6390ly0.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ly0$c */
    public enum c {
        EXISTS(1),
        UPDATE_TIME(2),
        CONDITIONTYPE_NOT_SET(0);

        public final int B;

        c(int i) {
            this.B = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return CONDITIONTYPE_NOT_SET;
            }
            if (i == 1) {
                return EXISTS;
            }
            if (i != 2) {
                return null;
            }
            return UPDATE_TIME;
        }
    }

    static {
        C6390ly0 c6390ly0 = new C6390ly0();
        DEFAULT_INSTANCE = c6390ly0;
        AbstractC5394iS.V(C6390ly0.class, c6390ly0);
    }

    public static C6390ly0 d0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(Q31 q31) {
        q31.getClass();
        this.conditionType_ = q31;
        this.conditionTypeCase_ = 2;
    }

    public c c0() {
        return c.a(this.conditionTypeCase_);
    }

    public boolean e0() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    public Q31 f0() {
        return this.conditionTypeCase_ == 2 ? (Q31) this.conditionType_ : Q31.c0();
    }

    public final void h0(boolean z) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = Boolean.valueOf(z);
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C6390ly0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", Q31.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C6390ly0.class) {
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
