package com.daaw;

import com.daaw.AbstractC5394iS;
import com.daaw.AbstractC6027ki1;
import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class KC extends AbstractC5394iS implements InterfaceC2236Sj0 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final KC DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private Q31 createTime_;
    private C0320Ag0 fields_ = C0320Ag0.e();
    private String name_ = "";
    private Q31 updateTime_;

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

    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b x(Map map) {
            q();
            ((KC) this.C).f0().putAll(map);
            return this;
        }

        public b y(String str) {
            q();
            ((KC) this.C).l0(str);
            return this;
        }

        public b z(Q31 q31) {
            q();
            ((KC) this.C).m0(q31);
            return this;
        }

        public b() {
            super(KC.DEFAULT_INSTANCE);
        }
    }

    public static final class c {
        public static final C10216zg0 a = C10216zg0.d(AbstractC6027ki1.b.L, "", AbstractC6027ki1.b.N, C6564mc1.o0());
    }

    static {
        KC kc = new KC();
        DEFAULT_INSTANCE = kc;
        AbstractC5394iS.V(KC.class, kc);
    }

    public static KC d0() {
        return DEFAULT_INSTANCE;
    }

    public static b k0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.name_ = str;
    }

    public Map e0() {
        return DesugarCollections.unmodifiableMap(i0());
    }

    public final Map f0() {
        return j0();
    }

    public String g0() {
        return this.name_;
    }

    public Q31 h0() {
        Q31 q31 = this.updateTime_;
        return q31 == null ? Q31.c0() : q31;
    }

    public final C0320Ag0 i0() {
        return this.fields_;
    }

    public final C0320Ag0 j0() {
        if (!this.fields_.i()) {
            this.fields_ = this.fields_.l();
        }
        return this.fields_;
    }

    public final void m0(Q31 q31) {
        q31.getClass();
        this.updateTime_ = q31;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new KC();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\t\u0004\t", new Object[]{"name_", "fields_", c.a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (KC.class) {
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
