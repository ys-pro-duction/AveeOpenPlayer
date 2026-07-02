package com.daaw;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: com.daaw.o80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6997o80 {
    public static final C5034h80 d(C5034h80 c5034h80, final Context context) throws C9743xy {
        G10.g(c5034h80, "<this>");
        G10.g(context, "androidContext");
        AbstractC2316Td0 abstractC2316Td0D = c5034h80.b().d();
        if (abstractC2316Td0D.d().compareTo(EnumC9912yb0.C) <= 0) {
            c5034h80.b().d().e("[init] declare Android Context");
        }
        C4755g80.g(c5034h80.b(), AbstractC1496Lm.e(AbstractC2656Wk0.b(false, new NQ() { // from class: com.daaw.l80
            @Override // com.daaw.NQ
            public final Object invoke(Object obj) {
                return AbstractC6997o80.e(context, (C2030Qk0) obj);
            }
        }, 1, null)), false, false, 6, null);
        return c5034h80;
    }

    public static final G91 e(final Context context, C2030Qk0 c2030Qk0) {
        G10.g(c2030Qk0, "$this$module");
        if (context instanceof Application) {
            InterfaceC3429bR interfaceC3429bR = new InterfaceC3429bR() { // from class: com.daaw.m80
                @Override // com.daaw.InterfaceC3429bR
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6997o80.f(context, (NN0) obj, (C1936Ps0) obj2);
                }
            };
            C7641qT0 c7641qT0 = new C7641qT0(new C3490bf(PN0.e.a(), AbstractC5624jG0.b(Application.class), null, interfaceC3429bR, EnumC4187e80.B, AbstractC1599Mm.k()));
            c2030Qk0.f(c7641qT0);
            if (c2030Qk0.e()) {
                c2030Qk0.g(c7641qT0);
            }
            AbstractC9464wy.a(new C5872k80(c2030Qk0, c7641qT0), AbstractC5624jG0.b(Context.class));
        } else {
            InterfaceC3429bR interfaceC3429bR2 = new InterfaceC3429bR() { // from class: com.daaw.n80
                @Override // com.daaw.InterfaceC3429bR
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6997o80.g(context, (NN0) obj, (C1936Ps0) obj2);
                }
            };
            C7641qT0 c7641qT02 = new C7641qT0(new C3490bf(PN0.e.a(), AbstractC5624jG0.b(Context.class), null, interfaceC3429bR2, EnumC4187e80.B, AbstractC1599Mm.k()));
            c2030Qk0.f(c7641qT02);
            if (c2030Qk0.e()) {
                c2030Qk0.g(c7641qT02);
            }
            new C5872k80(c2030Qk0, c7641qT02);
        }
        return G91.a;
    }

    public static final Application f(Context context, NN0 nn0, C1936Ps0 c1936Ps0) {
        G10.g(nn0, "$this$single");
        G10.g(c1936Ps0, "it");
        return (Application) context;
    }

    public static final Context g(Context context, NN0 nn0, C1936Ps0 c1936Ps0) {
        G10.g(nn0, "$this$single");
        G10.g(c1936Ps0, "it");
        return context;
    }
}
