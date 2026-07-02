package com.daaw;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC8656u51;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6233lQ extends AbstractC5945kQ {

    /* JADX INFO: renamed from: com.daaw.lQ$a */
    public class a extends AbstractC8656u51.e {
        public final /* synthetic */ Rect a;

        public a(Rect rect) {
            this.a = rect;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lQ$c */
    public class c extends AbstractC8942v51 {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void a(AbstractC8656u51 abstractC8656u51) {
            abstractC8656u51.W(this);
        }

        @Override // com.daaw.AbstractC8942v51, com.daaw.AbstractC8656u51.f
        public void d(AbstractC8656u51 abstractC8656u51) {
            Object obj = this.a;
            if (obj != null) {
                C6233lQ.this.D(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                C6233lQ.this.D(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                C6233lQ.this.D(obj3, this.f, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.lQ$d */
    public class d extends AbstractC8656u51.e {
        public final /* synthetic */ Rect a;

        public d(Rect rect) {
            this.a = rect;
        }
    }

    public static boolean C(AbstractC8656u51 abstractC8656u51) {
        return (AbstractC5945kQ.l(abstractC8656u51.B()) && AbstractC5945kQ.l(abstractC8656u51.C()) && AbstractC5945kQ.l(abstractC8656u51.D())) ? false : true;
    }

    @Override // com.daaw.AbstractC5945kQ
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C9779y51 c9779y51 = (C9779y51) obj;
        if (c9779y51 != null) {
            c9779y51.E().clear();
            c9779y51.E().addAll(arrayList2);
            D(c9779y51, arrayList, arrayList2);
        }
    }

    @Override // com.daaw.AbstractC5945kQ
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        C9779y51 c9779y51 = new C9779y51();
        c9779y51.l0((AbstractC8656u51) obj);
        return c9779y51;
    }

    public void D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC8656u51 abstractC8656u51 = (AbstractC8656u51) obj;
        int i = 0;
        if (abstractC8656u51 instanceof C9779y51) {
            C9779y51 c9779y51 = (C9779y51) abstractC8656u51;
            int iO0 = c9779y51.o0();
            while (i < iO0) {
                D(c9779y51.n0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (C(abstractC8656u51)) {
            return;
        }
        List listE = abstractC8656u51.E();
        if (listE.size() == arrayList.size() && listE.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                abstractC8656u51.c((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC8656u51.X((View) arrayList.get(size2));
            }
        }
    }

    @Override // com.daaw.AbstractC5945kQ
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC8656u51) obj).c(view);
        }
    }

    @Override // com.daaw.AbstractC5945kQ
    public void b(Object obj, ArrayList arrayList) {
        AbstractC8656u51 abstractC8656u51 = (AbstractC8656u51) obj;
        if (abstractC8656u51 == null) {
            return;
        }
        int i = 0;
        if (abstractC8656u51 instanceof C9779y51) {
            C9779y51 c9779y51 = (C9779y51) abstractC8656u51;
            int iO0 = c9779y51.o0();
            while (i < iO0) {
                b(c9779y51.n0(i), arrayList);
                i++;
            }
            return;
        }
        if (C(abstractC8656u51) || !AbstractC5945kQ.l(abstractC8656u51.E())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            abstractC8656u51.c((View) arrayList.get(i));
            i++;
        }
    }

    @Override // com.daaw.AbstractC5945kQ
    public void e(ViewGroup viewGroup, Object obj) {
        AbstractC9221w51.a(viewGroup, (AbstractC8656u51) obj);
    }

    @Override // com.daaw.AbstractC5945kQ
    public boolean g(Object obj) {
        return obj instanceof AbstractC8656u51;
    }

    @Override // com.daaw.AbstractC5945kQ
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC8656u51) obj).clone();
        }
        return null;
    }

    @Override // com.daaw.AbstractC5945kQ
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC8656u51 abstractC8656u51T0 = (AbstractC8656u51) obj;
        AbstractC8656u51 abstractC8656u51 = (AbstractC8656u51) obj2;
        AbstractC8656u51 abstractC8656u512 = (AbstractC8656u51) obj3;
        if (abstractC8656u51T0 != null && abstractC8656u51 != null) {
            abstractC8656u51T0 = new C9779y51().l0(abstractC8656u51T0).l0(abstractC8656u51).t0(1);
        } else if (abstractC8656u51T0 == null) {
            abstractC8656u51T0 = abstractC8656u51 != null ? abstractC8656u51 : null;
        }
        if (abstractC8656u512 == null) {
            return abstractC8656u51T0;
        }
        C9779y51 c9779y51 = new C9779y51();
        if (abstractC8656u51T0 != null) {
            c9779y51.l0(abstractC8656u51T0);
        }
        c9779y51.l0(abstractC8656u512);
        return c9779y51;
    }

    @Override // com.daaw.AbstractC5945kQ
    public Object p(Object obj, Object obj2, Object obj3) {
        C9779y51 c9779y51 = new C9779y51();
        if (obj != null) {
            c9779y51.l0((AbstractC8656u51) obj);
        }
        if (obj2 != null) {
            c9779y51.l0((AbstractC8656u51) obj2);
        }
        if (obj3 != null) {
            c9779y51.l0((AbstractC8656u51) obj3);
        }
        return c9779y51;
    }

    @Override // com.daaw.AbstractC5945kQ
    public void r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC8656u51) obj).b(new b(view, arrayList));
    }

    @Override // com.daaw.AbstractC5945kQ
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC8656u51) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // com.daaw.AbstractC5945kQ
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC8656u51) obj).c0(new d(rect));
        }
    }

    @Override // com.daaw.AbstractC5945kQ
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC8656u51) obj).c0(new a(rect));
        }
    }

    @Override // com.daaw.AbstractC5945kQ
    public void z(Object obj, View view, ArrayList arrayList) {
        C9779y51 c9779y51 = (C9779y51) obj;
        List listE = c9779y51.E();
        listE.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC5945kQ.f(listE, (View) arrayList.get(i));
        }
        listE.add(view);
        arrayList.add(view);
        b(c9779y51, arrayList);
    }

    /* JADX INFO: renamed from: com.daaw.lQ$b */
    public class b implements AbstractC8656u51.f {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void a(AbstractC8656u51 abstractC8656u51) {
            abstractC8656u51.W(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void b(AbstractC8656u51 abstractC8656u51) {
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void c(AbstractC8656u51 abstractC8656u51) {
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void d(AbstractC8656u51 abstractC8656u51) {
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void e(AbstractC8656u51 abstractC8656u51) {
        }
    }
}
