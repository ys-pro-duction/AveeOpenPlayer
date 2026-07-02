package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;
import com.daaw.C3930dD;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7993rj1 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final C7993rj1 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private C6390ly0 currentDocument_;
    private Object operation_;
    private UC updateMask_;
    private int operationCase_ = 0;
    private AbstractC3317b10.e updateTransforms_ = AbstractC5394iS.z();

    /* JADX INFO: renamed from: com.daaw.rj1$a */
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

    /* JADX INFO: renamed from: com.daaw.rj1$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(KC kc) {
            q();
            ((C7993rj1) this.C).z0(kc);
            return this;
        }

        public b B(UC uc) {
            q();
            ((C7993rj1) this.C).A0(uc);
            return this;
        }

        public b C(String str) {
            q();
            ((C7993rj1) this.C).B0(str);
            return this;
        }

        public b x(C3930dD.c cVar) {
            q();
            ((C7993rj1) this.C).g0(cVar);
            return this;
        }

        public b y(C6390ly0 c6390ly0) {
            q();
            ((C7993rj1) this.C).x0(c6390ly0);
            return this;
        }

        public b z(String str) {
            q();
            ((C7993rj1) this.C).y0(str);
            return this;
        }

        public b() {
            super(C7993rj1.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.rj1$c */
    public enum c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);

        public final int B;

        c(int i) {
            this.B = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return OPERATION_NOT_SET;
            }
            if (i == 1) {
                return UPDATE;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i == 5) {
                return VERIFY;
            }
            if (i != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        C7993rj1 c7993rj1 = new C7993rj1();
        DEFAULT_INSTANCE = c7993rj1;
        AbstractC5394iS.V(C7993rj1.class, c7993rj1);
    }

    public static b u0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public static b v0(C7993rj1 c7993rj1) {
        return (b) DEFAULT_INSTANCE.u(c7993rj1);
    }

    public static C7993rj1 w0(byte[] bArr) {
        return (C7993rj1) AbstractC5394iS.R(DEFAULT_INSTANCE, bArr);
    }

    public final void A0(UC uc) {
        uc.getClass();
        this.updateMask_ = uc;
    }

    public final void B0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    public final void g0(C3930dD.c cVar) {
        cVar.getClass();
        h0();
        this.updateTransforms_.add(cVar);
    }

    public final void h0() {
        AbstractC3317b10.e eVar = this.updateTransforms_;
        if (eVar.C()) {
            return;
        }
        this.updateTransforms_ = AbstractC5394iS.L(eVar);
    }

    public C6390ly0 i0() {
        C6390ly0 c6390ly0 = this.currentDocument_;
        return c6390ly0 == null ? C6390ly0.d0() : c6390ly0;
    }

    public String j0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public c k0() {
        return c.a(this.operationCase_);
    }

    public C3930dD l0() {
        return this.operationCase_ == 6 ? (C3930dD) this.operation_ : C3930dD.a0();
    }

    public KC m0() {
        return this.operationCase_ == 1 ? (KC) this.operation_ : KC.d0();
    }

    public UC n0() {
        UC uc = this.updateMask_;
        return uc == null ? UC.d0() : uc;
    }

    public List o0() {
        return this.updateTransforms_;
    }

    public String p0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public boolean q0() {
        return this.currentDocument_ != null;
    }

    public boolean r0() {
        return this.operationCase_ == 6;
    }

    public boolean s0() {
        return this.operationCase_ == 1;
    }

    public boolean t0() {
        return this.updateMask_ != null;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C7993rj1();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", KC.class, "updateMask_", "currentDocument_", C3930dD.class, "updateTransforms_", C3930dD.c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C7993rj1.class) {
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

    public final void x0(C6390ly0 c6390ly0) {
        c6390ly0.getClass();
        this.currentDocument_ = c6390ly0;
    }

    public final void y0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    public final void z0(KC kc) {
        kc.getClass();
        this.operation_ = kc;
        this.operationCase_ = 1;
    }
}
