package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC5394iS;
import com.daaw.C1839Ou;
import com.daaw.C9474x00;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LY0 extends AbstractC5394iS implements InterfaceC2236Sj0 {
    private static final LY0 DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile InterfaceC2896Ys0 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private C1839Ou endAt_;
    private C9474x00 limit_;
    private int offset_;
    private j select_;
    private C1839Ou startAt_;
    private h where_;
    private AbstractC3317b10.e from_ = AbstractC5394iS.z();
    private AbstractC3317b10.e orderBy_ = AbstractC5394iS.z();

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

        public b A(C9474x00.b bVar) {
            q();
            ((LY0) this.C).z0((C9474x00) bVar.n());
            return this;
        }

        public b B(C1839Ou.b bVar) {
            q();
            ((LY0) this.C).A0((C1839Ou) bVar.n());
            return this;
        }

        public b C(h hVar) {
            q();
            ((LY0) this.C).B0(hVar);
            return this;
        }

        public b x(c.a aVar) {
            q();
            ((LY0) this.C).g0((c) aVar.n());
            return this;
        }

        public b y(i iVar) {
            q();
            ((LY0) this.C).h0(iVar);
            return this;
        }

        public b z(C1839Ou.b bVar) {
            q();
            ((LY0) this.C).y0((C1839Ou) bVar.n());
            return this;
        }

        public b() {
            super(LY0.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC5394iS implements InterfaceC2236Sj0 {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final c DEFAULT_INSTANCE;
        private static volatile InterfaceC2896Ys0 PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(boolean z) {
                q();
                ((c) this.C).f0(z);
                return this;
            }

            public a y(String str) {
                q();
                ((c) this.C).g0(str);
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5394iS.V(c.class, cVar);
        }

        public static a e0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        public boolean c0() {
            return this.allDescendants_;
        }

        public String d0() {
            return this.collectionId_;
        }

        public final void f0(boolean z) {
            this.allDescendants_ = z;
        }

        public final void g0(String str) {
            str.getClass();
            this.collectionId_ = str;
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
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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

    public static final class d extends AbstractC5394iS implements InterfaceC2236Sj0 {
        private static final d DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile InterfaceC2896Ys0 PARSER;
        private AbstractC3317b10.e filters_ = AbstractC5394iS.z();
        private int op_;

        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(Iterable iterable) {
                q();
                ((d) this.C).c0(iterable);
                return this;
            }

            public a y(b bVar) {
                q();
                ((d) this.C).i0(bVar);
                return this;
            }

            public a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        public enum b implements AbstractC3317b10.a {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);

            public static final AbstractC3317b10.b G = new a();
            public final int B;

            public class a implements AbstractC3317b10.b {
            }

            b(int i) {
                this.B = i;
            }

            public static b a(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 1) {
                    return AND;
                }
                if (i != 2) {
                    return null;
                }
                return OR;
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
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            AbstractC5394iS.V(d.class, dVar);
        }

        public static d e0() {
            return DEFAULT_INSTANCE;
        }

        public static a h0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        public final void c0(Iterable iterable) {
            d0();
            Q.a(iterable, this.filters_);
        }

        public final void d0() {
            AbstractC3317b10.e eVar = this.filters_;
            if (eVar.C()) {
                return;
            }
            this.filters_ = AbstractC5394iS.L(eVar);
        }

        public List f0() {
            return this.filters_;
        }

        public b g0() {
            b bVarA = b.a(this.op_);
            return bVarA == null ? b.UNRECOGNIZED : bVarA;
        }

        public final void i0(b bVar) {
            this.op_ = bVar.b();
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", h.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (d.class) {
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

    public enum e implements AbstractC3317b10.a {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);

        public static final AbstractC3317b10.b G = new a();
        public final int B;

        public class a implements AbstractC3317b10.b {
        }

        e(int i) {
            this.B = i;
        }

        public static e a(int i) {
            if (i == 0) {
                return DIRECTION_UNSPECIFIED;
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

    public static final class f extends AbstractC5394iS implements InterfaceC2236Sj0 {
        private static final f DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile InterfaceC2896Ys0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private g field_;
        private int op_;
        private C6564mc1 value_;

        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(g gVar) {
                q();
                ((f) this.C).i0(gVar);
                return this;
            }

            public a y(b bVar) {
                q();
                ((f) this.C).j0(bVar);
                return this;
            }

            public a z(C6564mc1 c6564mc1) {
                q();
                ((f) this.C).k0(c6564mc1);
                return this;
            }

            public a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        public enum b implements AbstractC3317b10.a {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);

            public static final AbstractC3317b10.b O = new a();
            public final int B;

            public class a implements AbstractC3317b10.b {
            }

            b(int i) {
                this.B = i;
            }

            public static b a(int i) {
                switch (i) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
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
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            AbstractC5394iS.V(f.class, fVar);
        }

        public static f d0() {
            return DEFAULT_INSTANCE;
        }

        public static a h0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        public g e0() {
            g gVar = this.field_;
            return gVar == null ? g.b0() : gVar;
        }

        public b f0() {
            b bVarA = b.a(this.op_);
            return bVarA == null ? b.UNRECOGNIZED : bVarA;
        }

        public C6564mc1 g0() {
            C6564mc1 c6564mc1 = this.value_;
            return c6564mc1 == null ? C6564mc1.o0() : c6564mc1;
        }

        public final void i0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        public final void j0(b bVar) {
            this.op_ = bVar.b();
        }

        public final void k0(C6564mc1 c6564mc1) {
            c6564mc1.getClass();
            this.value_ = c6564mc1;
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (f.class) {
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

    public static final class g extends AbstractC5394iS implements InterfaceC2236Sj0 {
        private static final g DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile InterfaceC2896Ys0 PARSER;
        private String fieldPath_ = "";

        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(String str) {
                q();
                ((g) this.C).e0(str);
                return this;
            }

            public a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            AbstractC5394iS.V(g.class, gVar);
        }

        public static g b0() {
            return DEFAULT_INSTANCE;
        }

        public static a d0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        public String c0() {
            return this.fieldPath_;
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (g.class) {
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

    public static final class h extends AbstractC5394iS implements InterfaceC2236Sj0 {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final h DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile InterfaceC2896Ys0 PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(d.a aVar) {
                q();
                ((h) this.C).j0((d) aVar.n());
                return this;
            }

            public a y(f.a aVar) {
                q();
                ((h) this.C).k0((f) aVar.n());
                return this;
            }

            public a z(k.a aVar) {
                q();
                ((h) this.C).l0((k) aVar.n());
                return this;
            }

            public a() {
                super(h.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);

            public final int B;

            b(int i) {
                this.B = i;
            }

            public static b a(int i) {
                if (i == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i == 2) {
                    return FIELD_FILTER;
                }
                if (i != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            AbstractC5394iS.V(h.class, hVar);
        }

        public static h e0() {
            return DEFAULT_INSTANCE;
        }

        public static a i0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        public d d0() {
            return this.filterTypeCase_ == 1 ? (d) this.filterType_ : d.e0();
        }

        public f f0() {
            return this.filterTypeCase_ == 2 ? (f) this.filterType_ : f.d0();
        }

        public b g0() {
            return b.a(this.filterTypeCase_);
        }

        public k h0() {
            return this.filterTypeCase_ == 3 ? (k) this.filterType_ : k.c0();
        }

        public final void j0(d dVar) {
            dVar.getClass();
            this.filterType_ = dVar;
            this.filterTypeCase_ = 1;
        }

        public final void k0(f fVar) {
            fVar.getClass();
            this.filterType_ = fVar;
            this.filterTypeCase_ = 2;
        }

        public final void l0(k kVar) {
            kVar.getClass();
            this.filterType_ = kVar;
            this.filterTypeCase_ = 3;
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", d.class, f.class, k.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (h.class) {
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

    public static final class i extends AbstractC5394iS implements InterfaceC2236Sj0 {
        private static final i DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile InterfaceC2896Ys0 PARSER;
        private int direction_;
        private g field_;

        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(e eVar) {
                q();
                ((i) this.C).f0(eVar);
                return this;
            }

            public a y(g gVar) {
                q();
                ((i) this.C).g0(gVar);
                return this;
            }

            public a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            AbstractC5394iS.V(i.class, iVar);
        }

        public static a e0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        public e c0() {
            e eVarA = e.a(this.direction_);
            return eVarA == null ? e.UNRECOGNIZED : eVarA;
        }

        public g d0() {
            g gVar = this.field_;
            return gVar == null ? g.b0() : gVar;
        }

        public final void f0(e eVar) {
            this.direction_ = eVar.b();
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (i.class) {
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

    public static final class j extends AbstractC5394iS implements InterfaceC2236Sj0 {
        private static final j DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile InterfaceC2896Ys0 PARSER;
        private AbstractC3317b10.e fields_ = AbstractC5394iS.z();

        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            AbstractC5394iS.V(j.class, jVar);
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (j.class) {
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

    public static final class k extends AbstractC5394iS implements InterfaceC2236Sj0 {
        private static final k DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile InterfaceC2896Ys0 PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        public static final class a extends AbstractC5394iS.a implements InterfaceC2236Sj0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a x(g gVar) {
                q();
                ((k) this.C).g0(gVar);
                return this;
            }

            public a y(b bVar) {
                q();
                ((k) this.C).h0(bVar);
                return this;
            }

            public a() {
                super(k.DEFAULT_INSTANCE);
            }
        }

        public enum b implements AbstractC3317b10.a {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);

            public static final AbstractC3317b10.b I = new a();
            public final int B;

            public class a implements AbstractC3317b10.b {
            }

            b(int i) {
                this.B = i;
            }

            public static b a(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 2) {
                    return IS_NAN;
                }
                if (i == 3) {
                    return IS_NULL;
                }
                if (i == 4) {
                    return IS_NOT_NAN;
                }
                if (i != 5) {
                    return null;
                }
                return IS_NOT_NULL;
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
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            AbstractC5394iS.V(k.class, kVar);
        }

        public static k c0() {
            return DEFAULT_INSTANCE;
        }

        public static a f0() {
            return (a) DEFAULT_INSTANCE.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(g gVar) {
            gVar.getClass();
            this.operandType_ = gVar;
            this.operandTypeCase_ = 2;
        }

        public g d0() {
            return this.operandTypeCase_ == 2 ? (g) this.operandType_ : g.b0();
        }

        public b e0() {
            b bVarA = b.a(this.op_);
            return bVarA == null ? b.UNRECOGNIZED : bVarA;
        }

        public final void h0(b bVar) {
            this.op_ = bVar.b();
        }

        @Override // com.daaw.AbstractC5394iS
        public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
            InterfaceC2896Ys0 bVar;
            a aVar = null;
            switch (a.a[dVar.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                    if (interfaceC2896Ys0 != null) {
                        return interfaceC2896Ys0;
                    }
                    synchronized (k.class) {
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
        LY0 ly0 = new LY0();
        DEFAULT_INSTANCE = ly0;
        AbstractC5394iS.V(LY0.class, ly0);
    }

    public static LY0 k0() {
        return DEFAULT_INSTANCE;
    }

    public static b x0() {
        return (b) DEFAULT_INSTANCE.t();
    }

    public final void A0(C1839Ou c1839Ou) {
        c1839Ou.getClass();
        this.startAt_ = c1839Ou;
    }

    public final void B0(h hVar) {
        hVar.getClass();
        this.where_ = hVar;
    }

    public final void g0(c cVar) {
        cVar.getClass();
        i0();
        this.from_.add(cVar);
    }

    public final void h0(i iVar) {
        iVar.getClass();
        j0();
        this.orderBy_.add(iVar);
    }

    public final void i0() {
        AbstractC3317b10.e eVar = this.from_;
        if (eVar.C()) {
            return;
        }
        this.from_ = AbstractC5394iS.L(eVar);
    }

    public final void j0() {
        AbstractC3317b10.e eVar = this.orderBy_;
        if (eVar.C()) {
            return;
        }
        this.orderBy_ = AbstractC5394iS.L(eVar);
    }

    public C1839Ou l0() {
        C1839Ou c1839Ou = this.endAt_;
        return c1839Ou == null ? C1839Ou.f0() : c1839Ou;
    }

    public c m0(int i2) {
        return (c) this.from_.get(i2);
    }

    public int n0() {
        return this.from_.size();
    }

    public C9474x00 o0() {
        C9474x00 c9474x00 = this.limit_;
        return c9474x00 == null ? C9474x00.b0() : c9474x00;
    }

    public i p0(int i2) {
        return (i) this.orderBy_.get(i2);
    }

    public int q0() {
        return this.orderBy_.size();
    }

    public C1839Ou r0() {
        C1839Ou c1839Ou = this.startAt_;
        return c1839Ou == null ? C1839Ou.f0() : c1839Ou;
    }

    public h s0() {
        h hVar = this.where_;
        return hVar == null ? h.e0() : hVar;
    }

    public boolean t0() {
        return this.endAt_ != null;
    }

    public boolean u0() {
        return this.limit_ != null;
    }

    public boolean v0() {
        return this.startAt_ != null;
    }

    public boolean w0() {
        return this.where_ != null;
    }

    @Override // com.daaw.AbstractC5394iS
    public final Object x(AbstractC5394iS.d dVar, Object obj, Object obj2) {
        InterfaceC2896Ys0 bVar;
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new LY0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5394iS.N(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", c.class, "where_", "orderBy_", i.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2896Ys0 interfaceC2896Ys0 = PARSER;
                if (interfaceC2896Ys0 != null) {
                    return interfaceC2896Ys0;
                }
                synchronized (LY0.class) {
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

    public final void y0(C1839Ou c1839Ou) {
        c1839Ou.getClass();
        this.endAt_ = c1839Ou;
    }

    public final void z0(C9474x00 c9474x00) {
        c9474x00.getClass();
        this.limit_ = c9474x00;
    }
}
