package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.w51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9221w51 {
    public static AbstractC8656u51 a = new C5995kc();
    public static ThreadLocal b = new ThreadLocal();
    public static ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC8656u51 abstractC8656u51) {
        if (c.contains(viewGroup) || !AbstractC2317Td1.U(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (abstractC8656u51 == null) {
            abstractC8656u51 = a;
        }
        AbstractC8656u51 abstractC8656u51Clone = abstractC8656u51.clone();
        d(viewGroup, abstractC8656u51Clone);
        AbstractC7895rN0.b(viewGroup, null);
        c(viewGroup, abstractC8656u51Clone);
    }

    public static C2407Ua b() {
        C2407Ua c2407Ua;
        WeakReference weakReference = (WeakReference) b.get();
        if (weakReference != null && (c2407Ua = (C2407Ua) weakReference.get()) != null) {
            return c2407Ua;
        }
        C2407Ua c2407Ua2 = new C2407Ua();
        b.set(new WeakReference(c2407Ua2));
        return c2407Ua2;
    }

    public static void c(ViewGroup viewGroup, AbstractC8656u51 abstractC8656u51) {
        if (abstractC8656u51 == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC8656u51, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, AbstractC8656u51 abstractC8656u51) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC8656u51) it.next()).T(viewGroup);
            }
        }
        if (abstractC8656u51 != null) {
            abstractC8656u51.l(viewGroup, true);
        }
        AbstractC7895rN0.a(viewGroup);
    }

    /* JADX INFO: renamed from: com.daaw.w51$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public AbstractC8656u51 B;
        public ViewGroup C;

        /* JADX INFO: renamed from: com.daaw.w51$a$a, reason: collision with other inner class name */
        public class C0247a extends AbstractC8942v51 {
            public final /* synthetic */ C2407Ua a;

            public C0247a(C2407Ua c2407Ua) {
                this.a = c2407Ua;
            }

            @Override // com.daaw.AbstractC8656u51.f
            public void a(AbstractC8656u51 abstractC8656u51) {
                ((ArrayList) this.a.get(a.this.C)).remove(abstractC8656u51);
                abstractC8656u51.W(this);
            }
        }

        public a(AbstractC8656u51 abstractC8656u51, ViewGroup viewGroup) {
            this.B = abstractC8656u51;
            this.C = viewGroup;
        }

        public final void a() {
            this.C.getViewTreeObserver().removeOnPreDrawListener(this);
            this.C.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!AbstractC9221w51.c.remove(this.C)) {
                return true;
            }
            C2407Ua c2407UaB = AbstractC9221w51.b();
            ArrayList arrayList = (ArrayList) c2407UaB.get(this.C);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c2407UaB.put(this.C, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.B);
            this.B.b(new C0247a(c2407UaB));
            this.B.l(this.C, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC8656u51) it.next()).Y(this.C);
                }
            }
            this.B.V(this.C);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            AbstractC9221w51.c.remove(this.C);
            ArrayList arrayList = (ArrayList) AbstractC9221w51.b().get(this.C);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC8656u51) it.next()).Y(this.C);
                }
            }
            this.B.m(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
