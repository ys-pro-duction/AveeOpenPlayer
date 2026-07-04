package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;

/* JADX INFO: renamed from: com.daaw.sj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8272sj1 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final C8272sj1 DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private Q31 localWriteTime_;
    private AbstractC3317b10.e writes_ = AbstractC5394iS.z();
    private AbstractC3317b10.e baseWrites_ = AbstractC5394iS.z();

    /* JADX INFO: renamed from: com.daaw.sj1$a */
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

    /* JADX INFO: renamed from: com.daaw.sj1$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(Q31 q31) {
            q();
            ((C8272sj1) this.C).s0(q31);
            return this;
        }

        public b x(C7993rj1 c7993rj1) {
            q();
            ((C8272sj1) this.C).e0(c7993rj1);
            return this;
        }

        public b y(C7993rj1 c7993rj1) {
            q();
            ((C8272sj1) this.C).f0(c7993rj1);
            return this;
        }

        public b z(int i) {
            q();
            ((C8272sj1) this.C).r0(i);
            return this;
        }

        public b() {
            super(C8272sj1.DEFAULT_INSTANCE);
        }
    }

    static {
        C8272sj1 c8272sj1 = new C8272sj1();
        DEFAULT_INSTANCE = c8272sj1;
        AbstractC5394iS.V(C8272sj1.class, c8272sj1);
    }

    public static b o0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public static C8272sj1 p0(AbstractC4340ei abstractC4340ei) {
        return (C8272sj1) AbstractC5394iS.P(DEFAULT_INSTANCE, abstractC4340ei);
    }

    public static C8272sj1 q0(byte[] bArr) {
        return (C8272sj1) AbstractC5394iS.R(DEFAULT_INSTANCE, bArr);
    }

    public final void e0(C7993rj1 c7993rj1) {
        c7993rj1.getClass();
        g0();
        this.baseWrites_.add(c7993rj1);
    }

    public final void f0(C7993rj1 c7993rj1) {
        c7993rj1.getClass();
        h0();
        this.writes_.add(c7993rj1);
    }

    public final void g0() {
        AbstractC3317b10.e eVar = this.baseWrites_;
        if (eVar.C()) {
            return;
        }
        this.baseWrites_ = AbstractC5394iS.L(eVar);
    }

    public final void h0() {
        AbstractC3317b10.e eVar = this.writes_;
        if (eVar.C()) {
            return;
        }
        this.writes_ = AbstractC5394iS.L(eVar);
    }

    public C7993rj1 i0(int i) {
        return (C7993rj1) this.baseWrites_.get(i);
    }

    public int j0() {
        return this.baseWrites_.size();
    }

    public int k0() {
        return this.batchId_;
    }

    public Q31 l0() {
        Q31 q31 = this.localWriteTime_;
        return q31 == null ? Q31.c0() : q31;
    }

    public C7993rj1 m0(int i) {
        return (C7993rj1) this.writes_.get(i);
    }

    public int n0() {
        return this.writes_.size();
    }

    public final void r0(int i) {
        this.batchId_ = i;
    }

    public final void s0(Q31 q31) {
        q31.getClass();
        this.localWriteTime_ = q31;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C8272sj1();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", C7993rj1.class, "localWriteTime_", "baseWrites_", C7993rj1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C8272sj1.class) {
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
