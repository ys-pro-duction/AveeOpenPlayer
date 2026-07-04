package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3748cb extends AbstractC5394iS implements InterfaceC4305eb {
    private static final C3748cb DEFAULT_INSTANCE;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private AbstractC3317b10.e values_ = AbstractC5394iS.z();

    /* JADX INFO: renamed from: com.daaw.cb$a */
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

    /* JADX INFO: renamed from: com.daaw.cb$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC4305eb {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public int A() {
            return ((C3748cb) this.C).i0();
        }

        public b B(int i) {
            q();
            ((C3748cb) this.C).k0(i);
            return this;
        }

        @Override // com.daaw.InterfaceC4305eb
        public List g() {
            return DesugarCollections.unmodifiableList(((C3748cb) this.C).g());
        }

        public b x(Iterable iterable) {
            q();
            ((C3748cb) this.C).d0(iterable);
            return this;
        }

        public b y(C6564mc1 c6564mc1) {
            q();
            ((C3748cb) this.C).e0(c6564mc1);
            return this;
        }

        public C6564mc1 z(int i) {
            return ((C3748cb) this.C).h0(i);
        }

        public b() {
            super(C3748cb.DEFAULT_INSTANCE);
        }
    }

    static {
        C3748cb c3748cb = new C3748cb();
        DEFAULT_INSTANCE = c3748cb;
        AbstractC5394iS.V(C3748cb.class, c3748cb);
    }

    public static C3748cb g0() {
        return DEFAULT_INSTANCE;
    }

    public static b j0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public final void d0(Iterable iterable) {
        f0();
        Q.a(iterable, this.values_);
    }

    public final void e0(C6564mc1 c6564mc1) {
        c6564mc1.getClass();
        f0();
        this.values_.add(c6564mc1);
    }

    public final void f0() {
        AbstractC3317b10.e eVar = this.values_;
        if (eVar.C()) {
            return;
        }
        this.values_ = AbstractC5394iS.L(eVar);
    }

    @Override // com.daaw.InterfaceC4305eb
    public List g() {
        return this.values_;
    }

    public C6564mc1 h0(int i) {
        return (C6564mc1) this.values_.get(i);
    }

    public int i0() {
        return this.values_.size();
    }

    public final void k0(int i) {
        f0();
        this.values_.remove(i);
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C3748cb();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C6564mc1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C3748cb.class) {
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
