package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;

/* JADX INFO: renamed from: com.daaw.uj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8830uj1 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final C8830uj1 DEFAULT_INSTANCE;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private Q31 commitTime_;
    private String streamId_ = "";
    private AbstractC4340ei streamToken_ = AbstractC4340ei.C;
    private AbstractC3317b10.e writeResults_ = AbstractC5394iS.z();

    /* JADX INFO: renamed from: com.daaw.uj1$a */
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

    /* JADX INFO: renamed from: com.daaw.uj1$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C8830uj1.DEFAULT_INSTANCE);
        }
    }

    static {
        C8830uj1 c8830uj1 = new C8830uj1();
        DEFAULT_INSTANCE = c8830uj1;
        AbstractC5394iS.V(C8830uj1.class, c8830uj1);
    }

    public static C8830uj1 b0() {
        return DEFAULT_INSTANCE;
    }

    public Q31 a0() {
        Q31 q31 = this.commitTime_;
        return q31 == null ? Q31.c0() : q31;
    }

    public AbstractC4340ei c0() {
        return this.streamToken_;
    }

    public C9116vj1 d0(int i) {
        return (C9116vj1) this.writeResults_.get(i);
    }

    public int e0() {
        return this.writeResults_.size();
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C8830uj1();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004\t", new Object[]{"streamId_", "streamToken_", "writeResults_", C9116vj1.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C8830uj1.class) {
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
