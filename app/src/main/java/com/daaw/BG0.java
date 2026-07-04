package com.daaw;

import com.daaw.RM0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class BG0 {
    public static final int a = 36;

    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ RM0 B;
        public final /* synthetic */ String C;
        public final /* synthetic */ InterfaceC6258lW0 D;
        public final /* synthetic */ InterfaceC6258lW0 E;

        /* JADX INFO: renamed from: com.daaw.BG0$a$a, reason: collision with other inner class name */
        public static final class C0047a implements InterfaceC8973vC {
            public final /* synthetic */ RM0.a a;

            public C0047a(RM0.a aVar) {
                this.a = aVar;
            }

            @Override // com.daaw.InterfaceC8973vC
            public void a() {
                this.a.a();
            }
        }

        public static final class b extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ InterfaceC6258lW0 B;
            public final /* synthetic */ InterfaceC6258lW0 C;
            public final /* synthetic */ RM0 D;

            /* JADX INFO: renamed from: com.daaw.BG0$a$b$a, reason: collision with other inner class name */
            public static final class C0048a implements InterfaceC4249eN0 {
                public final /* synthetic */ RM0 a;

                public C0048a(RM0 rm0) {
                    this.a = rm0;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, RM0 rm0) {
                super(0);
                this.B = interfaceC6258lW0;
                this.C = interfaceC6258lW02;
                this.D = rm0;
            }

            @Override // com.daaw.LQ
            public final Object invoke() {
                return ((InterfaceC3692cN0) this.B.getValue()).b(new C0048a(this.D), this.C.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RM0 rm0, String str, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02) {
            super(1);
            this.B = rm0;
            this.C = str;
            this.D = interfaceC6258lW0;
            this.E = interfaceC6258lW02;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8973vC invoke(C9252wC c9252wC) {
            G10.g(c9252wC, "$this$DisposableEffect");
            b bVar = new b(this.D, this.E, this.B);
            BG0.c(this.B, bVar.invoke());
            return new C0047a(this.B.d(this.C, bVar));
        }
    }

    public static final Object b(Object[] objArr, InterfaceC3692cN0 interfaceC3692cN0, String str, LQ lq, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        Object objC;
        G10.g(objArr, "inputs");
        G10.g(lq, "init");
        interfaceC5781jp.e(441892779);
        if ((i2 & 2) != 0) {
            interfaceC3692cN0 = AbstractC3971dN0.b();
        }
        int i3 = i2 & 4;
        Object objA = null;
        if (i3 != 0) {
            str = null;
        }
        interfaceC5781jp.e(1059366469);
        if (str == null || str.length() == 0) {
            str = Integer.toString(AbstractC3540bp.a(interfaceC5781jp, 0), AbstractC9956yk.a(a));
            G10.f(str, "toString(this, checkRadix(radix))");
        }
        interfaceC5781jp.L();
        if (interfaceC3692cN0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        }
        RM0 rm0 = (RM0) interfaceC5781jp.O(TM0.b());
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        interfaceC5781jp.e(-568225417);
        boolean zP = false;
        for (Object obj : objArrCopyOf) {
            zP |= interfaceC5781jp.P(obj);
        }
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            if (rm0 != null && (objC = rm0.c(str)) != null) {
                objA = interfaceC3692cN0.a(objC);
            }
            objF = objA == null ? lq.invoke() : objA;
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        if (rm0 != null) {
            AbstractC8420tF.b(rm0, str, new a(rm0, str, AbstractC7923rU0.i(interfaceC3692cN0, interfaceC5781jp, 0), AbstractC7923rU0.i(objF, interfaceC5781jp, 0)), interfaceC5781jp, 0);
        }
        interfaceC5781jp.L();
        return objF;
    }

    public static final void c(RM0 rm0, Object obj) {
        String str;
        if (obj == null || rm0.a(obj)) {
            return;
        }
        if (obj instanceof InterfaceC6808nU0) {
            InterfaceC6808nU0 interfaceC6808nU0 = (InterfaceC6808nU0) obj;
            if (interfaceC6808nU0.i() == AbstractC7923rU0.f() || interfaceC6808nU0.i() == AbstractC7923rU0.k() || interfaceC6808nU0.i() == AbstractC7923rU0.h()) {
                str = "MutableState containing " + interfaceC6808nU0.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
