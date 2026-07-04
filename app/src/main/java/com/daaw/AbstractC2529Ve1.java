package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.Ve1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2529Ve1 {

    /* JADX INFO: renamed from: com.daaw.Ve1$a */
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

    /* JADX INFO: renamed from: com.daaw.Ve1$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0417Be1 invoke(View view) {
            G10.g(view, "view");
            Object tag = view.getTag(AbstractC8413tD0.a);
            if (tag instanceof InterfaceC0417Be1) {
                return (InterfaceC0417Be1) tag;
            }
            return null;
        }
    }

    public static final InterfaceC0417Be1 a(View view) {
        G10.g(view, "<this>");
        return (InterfaceC0417Be1) UP0.q(UP0.u(SP0.i(view, a.B), b.B));
    }

    public static final void b(View view, InterfaceC0417Be1 interfaceC0417Be1) {
        G10.g(view, "<this>");
        view.setTag(AbstractC8413tD0.a, interfaceC0417Be1);
    }
}
