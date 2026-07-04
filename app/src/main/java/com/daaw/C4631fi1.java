package com.daaw;

import android.os.Handler;
import android.view.View;
import com.daaw.U30;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.fi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4631fi1 {
    public static final C4631fi1 a = new C4631fi1();
    public static final AtomicReference b = new AtomicReference(InterfaceC4342ei1.a.a());
    public static final int c = 8;

    /* JADX INFO: renamed from: com.daaw.fi1$a */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ U30 B;

        public a(U30 u30) {
            this.B = u30;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            G10.g(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            G10.g(view, "v");
            view.removeOnAttachStateChangeListener(this);
            U30.a.a(this.B, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.fi1$b */
    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ WE0 G;
        public final /* synthetic */ View H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WE0 we0, View view, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = we0;
            this.H = view;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new b(this.G, this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            View view;
            Object objC = I10.c();
            int i = this.F;
            try {
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    WE0 we0 = this.G;
                    this.F = 1;
                    if (we0.b0(this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                if (AbstractC4910gi1.f(view) == this.G) {
                    AbstractC4910gi1.i(this.H, null);
                }
                return G91.a;
            } finally {
                if (AbstractC4910gi1.f(this.H) == this.G) {
                    AbstractC4910gi1.i(this.H, null);
                }
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public final WE0 a(View view) {
        G10.g(view, "rootView");
        WE0 we0A = ((InterfaceC4342ei1) b.get()).a(view);
        AbstractC4910gi1.i(view, we0A);
        C6524mT c6524mT = C6524mT.B;
        Handler handler = view.getHandler();
        G10.f(handler, "rootView.handler");
        view.addOnAttachStateChangeListener(new a(AbstractC9104vh.d(c6524mT, BU.b(handler, "windowRecomposer cleanup").m1(), null, new b(we0A, view, null), 2, null)));
        return we0A;
    }
}
