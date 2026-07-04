package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.Vd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2525Vd1 {
    public static final a a = a.a;

    /* JADX INFO: renamed from: com.daaw.Vd1$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final InterfaceC2525Vd1 a() {
            return b.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vd1$b */
    public static final class b implements InterfaceC2525Vd1 {
        public static final b b = new b();

        /* JADX INFO: renamed from: com.daaw.Vd1$b$a */
        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ androidx.compose.ui.platform.a B;
            public final /* synthetic */ ViewOnAttachStateChangeListenerC0126b C;
            public final /* synthetic */ InterfaceC1021Gx0 D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.platform.a aVar, ViewOnAttachStateChangeListenerC0126b viewOnAttachStateChangeListenerC0126b, InterfaceC1021Gx0 interfaceC1021Gx0) {
                super(0);
                this.B = aVar;
                this.C = viewOnAttachStateChangeListenerC0126b;
                this.D = interfaceC1021Gx0;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m34invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m34invoke() {
                this.B.removeOnAttachStateChangeListener(this.C);
                AbstractC0917Fx0.g(this.B, this.D);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Vd1$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0126b implements View.OnAttachStateChangeListener {
            public final /* synthetic */ androidx.compose.ui.platform.a B;

            public ViewOnAttachStateChangeListenerC0126b(androidx.compose.ui.platform.a aVar) {
                this.B = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                G10.g(view, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                G10.g(view, "v");
                if (AbstractC0917Fx0.f(this.B)) {
                    return;
                }
                this.B.e();
            }
        }

        /* JADX INFO: renamed from: com.daaw.Vd1$b$c */
        public static final class c implements InterfaceC1021Gx0 {
            public final /* synthetic */ androidx.compose.ui.platform.a a;

            public c(androidx.compose.ui.platform.a aVar) {
                this.a = aVar;
            }

            @Override // com.daaw.InterfaceC1021Gx0
            public final void a() {
                this.a.e();
            }
        }

        @Override // com.daaw.InterfaceC2525Vd1
        public LQ a(androidx.compose.ui.platform.a aVar) {
            G10.g(aVar, "view");
            ViewOnAttachStateChangeListenerC0126b viewOnAttachStateChangeListenerC0126b = new ViewOnAttachStateChangeListenerC0126b(aVar);
            aVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0126b);
            c cVar = new c(aVar);
            AbstractC0917Fx0.a(aVar, cVar);
            return new a(aVar, viewOnAttachStateChangeListenerC0126b, cVar);
        }
    }

    LQ a(androidx.compose.ui.platform.a aVar);
}
