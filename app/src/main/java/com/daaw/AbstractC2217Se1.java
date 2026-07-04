package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.Se1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2217Se1 {

    /* JADX INFO: renamed from: com.daaw.Se1$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            G10.g(view, "currentView");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Se1$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1764Ob0 invoke(View view) {
            G10.g(view, "viewParent");
            Object tag = view.getTag(AbstractC8134sD0.a);
            if (tag instanceof InterfaceC1764Ob0) {
                return (InterfaceC1764Ob0) tag;
            }
            return null;
        }
    }

    public static final InterfaceC1764Ob0 a(View view) {
        G10.g(view, "<this>");
        return (InterfaceC1764Ob0) UP0.q(UP0.u(SP0.i(view, a.B), b.B));
    }

    public static final void b(View view, InterfaceC1764Ob0 interfaceC1764Ob0) {
        G10.g(view, "<this>");
        view.setTag(AbstractC8134sD0.a, interfaceC1764Ob0);
    }
}
