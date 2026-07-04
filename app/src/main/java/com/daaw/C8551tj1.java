package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;
import com.daaw.AbstractC6027ki1;

/* JADX INFO: renamed from: com.daaw.tj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8551tj1 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C8551tj1 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private C0320Ag0 labels_ = C0320Ag0.e();
    private String database_ = "";
    private String streamId_ = "";
    private AbstractC3317b10.e writes_ = AbstractC5394iS.z();
    private AbstractC4340ei streamToken_ = AbstractC4340ei.C;

    /* JADX INFO: renamed from: com.daaw.tj1$a */
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

    /* JADX INFO: renamed from: com.daaw.tj1$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b x(C7993rj1 c7993rj1) {
            q();
            ((C8551tj1) this.C).d0(c7993rj1);
            return this;
        }

        public b y(String str) {
            q();
            ((C8551tj1) this.C).h0(str);
            return this;
        }

        public b z(AbstractC4340ei abstractC4340ei) {
            q();
            ((C8551tj1) this.C).i0(abstractC4340ei);
            return this;
        }

        public b() {
            super(C8551tj1.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.tj1$c */
    public static final class c {
        public static final C10216zg0 a;

        static {
            AbstractC6027ki1.b bVar = AbstractC6027ki1.b.L;
            a = C10216zg0.d(bVar, "", bVar, "");
        }
    }

    static {
        C8551tj1 c8551tj1 = new C8551tj1();
        DEFAULT_INSTANCE = c8551tj1;
        AbstractC5394iS.V(C8551tj1.class, c8551tj1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(C7993rj1 c7993rj1) {
        c7993rj1.getClass();
        e0();
        this.writes_.add(c7993rj1);
    }

    private void e0() {
        AbstractC3317b10.e eVar = this.writes_;
        if (eVar.C()) {
            return;
        }
        this.writes_ = AbstractC5394iS.L(eVar);
    }

    public static C8551tj1 f0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.database_ = str;
    }

    public final void i0(AbstractC4340ei abstractC4340ei) {
        abstractC4340ei.getClass();
        this.streamToken_ = abstractC4340ei;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C8551tj1();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", C7993rj1.class, "streamToken_", "labels_", c.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C8551tj1.class) {
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
