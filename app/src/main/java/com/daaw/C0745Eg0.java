package com.daaw;

import com.daaw.AbstractC5394iS;
import com.daaw.AbstractC6027ki1;
import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Eg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0745Eg0 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    private static final C0745Eg0 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC2896Ys0 PARSER;
    private C0320Ag0 fields_ = C0320Ag0.e();

    /* JADX INFO: renamed from: com.daaw.Eg0$a */
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

    /* JADX INFO: renamed from: com.daaw.Eg0$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(String str) {
            str.getClass();
            q();
            ((C0745Eg0) this.C).g0().remove(str);
            return this;
        }

        public boolean x(String str) {
            str.getClass();
            return ((C0745Eg0) this.C).d0().containsKey(str);
        }

        public b y(Map map) {
            q();
            ((C0745Eg0) this.C).g0().putAll(map);
            return this;
        }

        public b z(String str, C6564mc1 c6564mc1) {
            str.getClass();
            c6564mc1.getClass();
            q();
            ((C0745Eg0) this.C).g0().put(str, c6564mc1);
            return this;
        }

        public b() {
            super(C0745Eg0.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Eg0$c */
    public static final class c {
        public static final C10216zg0 a = C10216zg0.d(AbstractC6027ki1.b.L, "", AbstractC6027ki1.b.N, C6564mc1.o0());
    }

    static {
        C0745Eg0 c0745Eg0 = new C0745Eg0();
        DEFAULT_INSTANCE = c0745Eg0;
        AbstractC5394iS.V(C0745Eg0.class, c0745Eg0);
    }

    public static C0745Eg0 b0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map g0() {
        return i0();
    }

    private C0320Ag0 h0() {
        return this.fields_;
    }

    private C0320Ag0 i0() {
        if (!this.fields_.i()) {
            this.fields_ = this.fields_.l();
        }
        return this.fields_;
    }

    public static b j0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public int c0() {
        return h0().size();
    }

    public Map d0() {
        return DesugarCollections.unmodifiableMap(h0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6564mc1 e0(String str, C6564mc1 c6564mc1) {
        str.getClass();
        C0320Ag0 c0320Ag0H0 = h0();
        return c0320Ag0H0.containsKey(str) ? (C6564mc1) c0320Ag0H0.get(str) : c6564mc1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6564mc1 f0(String str) {
        str.getClass();
        C0320Ag0 c0320Ag0H0 = h0();
        if (c0320Ag0H0.containsKey(str)) {
            return (C6564mc1) c0320Ag0H0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C0745Eg0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C0745Eg0.class) {
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
