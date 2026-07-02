package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class K5 {

    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ PI0 G;
        public final /* synthetic */ Context H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PI0 pi0, Context context, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = pi0;
            this.H = context;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.G, this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            return K5.c(this.G, this.H);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final Typeface c(PI0 pi0, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return RI0.a.a(context, pi0);
        }
        Typeface typefaceG = XI0.g(context, pi0.d());
        G10.d(typefaceG);
        G10.f(typefaceG, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return typefaceG;
    }

    public static final Object d(PI0 pi0, Context context, InterfaceC1416Ks interfaceC1416Ks) {
        return AbstractC8539th.f(C7850rC.b(), new a(pi0, context, null), interfaceC1416Ks);
    }
}
