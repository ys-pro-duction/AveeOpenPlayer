package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.Ue1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2425Ue1 {

    /* JADX INFO: renamed from: com.daaw.Ue1$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            G10.g(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ue1$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3135aN0 invoke(View view) {
            G10.g(view, "view");
            Object tag = view.getTag(AbstractC8692uD0.a);
            if (tag instanceof InterfaceC3135aN0) {
                return (InterfaceC3135aN0) tag;
            }
            return null;
        }
    }

    public static final InterfaceC3135aN0 a(View view) {
        G10.g(view, "<this>");
        return (InterfaceC3135aN0) UP0.q(UP0.u(SP0.i(view, a.B), b.B));
    }

    public static final void b(View view, InterfaceC3135aN0 interfaceC3135aN0) {
        G10.g(view, "<this>");
        view.setTag(AbstractC8692uD0.a, interfaceC3135aN0);
    }
}
