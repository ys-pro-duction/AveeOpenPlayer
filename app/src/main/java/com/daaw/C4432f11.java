package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.f11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4432f11 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final C4432f11 DEFAULT_INSTANCE;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private C5974kX0 cause_;
    private Q31 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private AbstractC3317b10.d targetIds_ = AbstractC5394iS.y();
    private AbstractC4340ei resumeToken_ = AbstractC4340ei.C;

    /* JADX INFO: renamed from: com.daaw.f11$a */
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

    /* JADX INFO: renamed from: com.daaw.f11$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C4432f11.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.f11$c */
    public enum c implements AbstractC3317b10.a {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);

        public static final AbstractC3317b10.b I = new a();
        public final int B;

        /* JADX INFO: renamed from: com.daaw.f11$c$a */
        public class a implements AbstractC3317b10.b {
        }

        c(int i) {
            this.B = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return NO_CHANGE;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return REMOVE;
            }
            if (i == 3) {
                return CURRENT;
            }
            if (i != 4) {
                return null;
            }
            return RESET;
        }

        @Override // com.daaw.AbstractC3317b10.a
        public final int b() {
            if (this != UNRECOGNIZED) {
                return this.B;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C4432f11 c4432f11 = new C4432f11();
        DEFAULT_INSTANCE = c4432f11;
        AbstractC5394iS.V(C4432f11.class, c4432f11);
    }

    public static C4432f11 b0() {
        return DEFAULT_INSTANCE;
    }

    public C5974kX0 a0() {
        C5974kX0 c5974kX0 = this.cause_;
        return c5974kX0 == null ? C5974kX0.b0() : c5974kX0;
    }

    public Q31 c0() {
        Q31 q31 = this.readTime_;
        return q31 == null ? Q31.c0() : q31;
    }

    public AbstractC4340ei d0() {
        return this.resumeToken_;
    }

    public c e0() {
        c cVarA = c.a(this.targetChangeType_);
        return cVarA == null ? c.UNRECOGNIZED : cVarA;
    }

    public int f0() {
        return this.targetIds_.size();
    }

    public List g0() {
        return this.targetIds_;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C4432f11();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C4432f11.class) {
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
