package com.daaw;

import com.daaw.YV0;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7867rG0 {
    public final C0560Co0 a;
    public final O90 b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public static final /* synthetic */ W60[] l = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C7867rG0.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C7867rG0.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C7867rG0.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C7867rG0.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C7867rG0.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C7867rG0.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C7867rG0.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C7867rG0.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    public static final b k = new b(null);

    /* JADX INFO: renamed from: com.daaw.rG0$a */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final InterfaceC4923gl a(C7867rG0 c7867rG0, W60 w60) {
            G10.g(c7867rG0, "types");
            G10.g(w60, "property");
            return c7867rG0.c(AbstractC9393wj.a(w60.getName()), this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.rG0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final I80 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
            G10.g(interfaceC2968Zk0, "module");
            InterfaceC4923gl interfaceC4923glB = AbstractC5366iL.b(interfaceC2968Zk0, YV0.a.w0);
            if (interfaceC4923glB == null) {
                return null;
            }
            C8387t71 c8387t71J = C8387t71.C.j();
            List parameters = interfaceC4923glB.k().getParameters();
            G10.f(parameters, "getParameters(...)");
            Object objC0 = AbstractC2455Um.C0(parameters);
            G10.f(objC0, "single(...)");
            return M80.h(c8387t71J, interfaceC4923glB, AbstractC1496Lm.e(new C3450bW0((Z71) objC0)));
        }

        public b() {
        }
    }

    public C7867rG0(InterfaceC2968Zk0 interfaceC2968Zk0, C0560Co0 c0560Co0) {
        G10.g(interfaceC2968Zk0, "module");
        G10.g(c0560Co0, "notFoundClasses");
        this.a = c0560Co0;
        this.b = AbstractC3192ab0.b(EnumC7395pb0.C, new C7589qG0(interfaceC2968Zk0));
        this.c = new a(1);
        this.d = new a(1);
        this.e = new a(1);
        this.f = new a(2);
        this.g = new a(3);
        this.h = new a(1);
        this.i = new a(2);
        this.j = new a(3);
    }

    public static final InterfaceC4346ej0 f(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "$module");
        return interfaceC2968Zk0.r0(YV0.x).q();
    }

    public final InterfaceC4923gl c(String str, int i) {
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        InterfaceC10240zl interfaceC10240zlG = e().g(c2352Tm0L, EnumC5496io0.I);
        InterfaceC4923gl interfaceC4923gl = interfaceC10240zlG instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlG : null;
        return interfaceC4923gl == null ? this.a.d(new C6607ml(YV0.x, c2352Tm0L), AbstractC1496Lm.e(Integer.valueOf(i))) : interfaceC4923gl;
    }

    public final InterfaceC4923gl d() {
        return this.c.a(this, l[0]);
    }

    public final InterfaceC4346ej0 e() {
        return (InterfaceC4346ej0) this.b.getValue();
    }
}
