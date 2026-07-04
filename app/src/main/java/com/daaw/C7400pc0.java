package com.daaw;

import com.daaw.AbstractC5394iS;
import com.daaw.AbstractC6027ki1;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.pc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7400pc0 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C7400pc0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private C0320Ag0 labels_ = C0320Ag0.e();
    private String database_ = "";

    /* JADX INFO: renamed from: com.daaw.pc0$a */
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

    /* JADX INFO: renamed from: com.daaw.pc0$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i) {
            q();
            ((C7400pc0) this.C).k0(i);
            return this;
        }

        public b x(Map map) {
            q();
            ((C7400pc0) this.C).f0().putAll(map);
            return this;
        }

        public b y(C3318b11 c3318b11) {
            q();
            ((C7400pc0) this.C).i0(c3318b11);
            return this;
        }

        public b z(String str) {
            q();
            ((C7400pc0) this.C).j0(str);
            return this;
        }

        public b() {
            super(C7400pc0.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pc0$c */
    public static final class c {
        public static final C10216zg0 a;

        static {
            AbstractC6027ki1.b bVar = AbstractC6027ki1.b.L;
            a = C10216zg0.d(bVar, "", bVar, "");
        }
    }

    static {
        C7400pc0 c7400pc0 = new C7400pc0();
        DEFAULT_INSTANCE = c7400pc0;
        AbstractC5394iS.V(C7400pc0.class, c7400pc0);
    }

    public static C7400pc0 e0() {
        return DEFAULT_INSTANCE;
    }

    public static b h0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public final Map f0() {
        return g0();
    }

    public final C0320Ag0 g0() {
        if (!this.labels_.i()) {
            this.labels_ = this.labels_.l();
        }
        return this.labels_;
    }

    public final void i0(C3318b11 c3318b11) {
        c3318b11.getClass();
        this.targetChange_ = c3318b11;
        this.targetChangeCase_ = 2;
    }

    public final void j0(String str) {
        str.getClass();
        this.database_ = str;
    }

    public final void k0(int i) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i);
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C7400pc0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", C3318b11.class, "labels_", c.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C7400pc0.class) {
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
