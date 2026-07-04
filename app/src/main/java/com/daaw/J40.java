package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class J40 extends AbstractC8670u80 {
    public static final /* synthetic */ W60[] k = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(J40.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    public final a h;
    public LQ i;
    public final InterfaceC0881Fo0 j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a B = new a("FROM_DEPENDENCIES", 0);
        public static final a C = new a("FROM_CLASS_LOADER", 1);
        public static final a D = new a("FALLBACK", 2);
        public static final /* synthetic */ a[] E;
        public static final /* synthetic */ YG F;

        static {
            a[] aVarArrA = a();
            E = aVarArrA;
            F = AbstractC3110aH.a(aVarArrA);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{B, C, D};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) E.clone();
        }
    }

    public static final class b {
        public final InterfaceC2968Zk0 a;
        public final boolean b;

        public b(InterfaceC2968Zk0 interfaceC2968Zk0, boolean z) {
            G10.g(interfaceC2968Zk0, "ownerModuleDescriptor");
            this.a = interfaceC2968Zk0;
            this.b = z;
        }

        public final InterfaceC2968Zk0 a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J40(InterfaceC10174zX0 interfaceC10174zX0, a aVar) {
        super(interfaceC10174zX0);
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(aVar, "kind");
        this.h = aVar;
        this.j = interfaceC10174zX0.h(new G40(this, interfaceC10174zX0));
        int i = c.a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                f(false);
            } else {
                if (i != 3) {
                    throw new C6902no0();
                }
                f(true);
            }
        }
    }

    public static final T40 I0(J40 j40, InterfaceC10174zX0 interfaceC10174zX0) {
        G10.g(j40, "this$0");
        G10.g(interfaceC10174zX0, "$storageManager");
        C3799cl0 c3799cl0R = j40.r();
        G10.f(c3799cl0R, "getBuiltInsModule(...)");
        return new T40(c3799cl0R, interfaceC10174zX0, new I40(j40));
    }

    public static final b J0(J40 j40) {
        G10.g(j40, "this$0");
        LQ lq = j40.i;
        if (lq == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVar = (b) lq.invoke();
        j40.i = null;
        return bVar;
    }

    public static final b N0(InterfaceC2968Zk0 interfaceC2968Zk0, boolean z) {
        G10.g(interfaceC2968Zk0, "$moduleDescriptor");
        return new b(interfaceC2968Zk0, z);
    }

    @Override // com.daaw.AbstractC8670u80
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public List v() {
        Iterable iterableV = super.v();
        G10.f(iterableV, "getClassDescriptorFactories(...)");
        InterfaceC10174zX0 interfaceC10174zX0U = U();
        G10.f(interfaceC10174zX0U, "getStorageManager(...)");
        C3799cl0 c3799cl0R = r();
        G10.f(c3799cl0R, "getBuiltInsModule(...)");
        return AbstractC2455Um.y0(iterableV, new F40(interfaceC10174zX0U, c3799cl0R, null, 4, null));
    }

    public final T40 L0() {
        return (T40) AbstractC9895yX0.a(this.j, this, k[0]);
    }

    @Override // com.daaw.AbstractC8670u80
    public InterfaceC2280Su0 M() {
        return L0();
    }

    public final void M0(InterfaceC2968Zk0 interfaceC2968Zk0, boolean z) {
        G10.g(interfaceC2968Zk0, "moduleDescriptor");
        O0(new H40(interfaceC2968Zk0, z));
    }

    public final void O0(LQ lq) {
        G10.g(lq, "computation");
        this.i = lq;
    }

    @Override // com.daaw.AbstractC8670u80
    public Z2 g() {
        return L0();
    }
}
