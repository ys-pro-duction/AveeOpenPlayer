package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.jZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5702jZ extends AbstractC5394iS implements InterfaceC2236Sj0 {
    private static final C5702jZ DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private AbstractC3317b10.e fields_ = AbstractC5394iS.z();

    /* JADX INFO: renamed from: com.daaw.jZ$a */
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

    /* JADX INFO: renamed from: com.daaw.jZ$b */
    public static final class b extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5702jZ.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jZ$c */
    public static final class c extends AbstractC5394iS implements InterfaceC2236Sj0 {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile InterfaceC2896Ys0 PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: com.daaw.jZ$c$a */
        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.daaw.jZ$c$b */
        public enum b implements AbstractC3317b10.a {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);

            public static final AbstractC3317b10.b G = new a();
            public final int B;

            /* JADX INFO: renamed from: com.daaw.jZ$c$b$a */
            public class a implements AbstractC3317b10.b {
            }

            b(int i) {
                this.B = i;
            }

            public static b a(int i) {
                if (i == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i == 1) {
                    return ASCENDING;
                }
                if (i != 2) {
                    return null;
                }
                return DESCENDING;
            }

            @Override // com.daaw.AbstractC3317b10.a
            public final int b() {
                if (this != UNRECOGNIZED) {
                    return this.B;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX INFO: renamed from: com.daaw.jZ$c$c, reason: collision with other inner class name */
        public enum EnumC0198c {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);

            public final int B;

            EnumC0198c(int i) {
                this.B = i;
            }

            public static EnumC0198c a(int i) {
                if (i == 0) {
                    return VALUEMODE_NOT_SET;
                }
                if (i == 2) {
                    return ORDER;
                }
                if (i != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5394iS.V(c.class, cVar);
        }

        public String a0() {
            return this.fieldPath_;
        }

        public b b0() {
            if (this.valueModeCase_ != 2) {
                return b.ORDER_UNSPECIFIED;
            }
            b bVarA = b.a(((Integer) this.valueMode_).intValue());
            return bVarA == null ? b.UNRECOGNIZED : bVarA;
        }

        public EnumC0198c c0() {
            return EnumC0198c.a(this.valueModeCase_);
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (c.class) {
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

    static {
        C5702jZ c5702jZ = new C5702jZ();
        DEFAULT_INSTANCE = c5702jZ;
        AbstractC5394iS.V(C5702jZ.class, c5702jZ);
    }

    public static C5702jZ b0(byte[] bArr) {
        return (C5702jZ) AbstractC5394iS.R(DEFAULT_INSTANCE, bArr);
    }

    public List a0() {
        return this.fields_;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new C5702jZ();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", c.class, "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (C5702jZ.class) {
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
