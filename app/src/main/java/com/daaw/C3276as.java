package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.daaw.AbstractC9089ve;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.as, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3276as implements InterfaceC7301pE, InterfaceC6648mt0, AbstractC9089ve.b, T70 {
    public final Paint a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final List h;
    public final C4615ff0 i;
    public List j;
    public C5858k51 k;

    public C3276as(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C7911rR0 c7911rR0) {
        this(c4615ff0, abstractC9647xe, c7911rR0.c(), c7911rR0.d(), f(c4615ff0, abstractC9647xe, c7911rR0.b()), j(c7911rR0.b()));
    }

    public static List f(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2371Tr interfaceC2371TrA = ((InterfaceC6921ns) list.get(i)).a(c4615ff0, abstractC9647xe);
            if (interfaceC2371TrA != null) {
                arrayList.add(interfaceC2371TrA);
            }
        }
        return arrayList;
    }

    public static V6 j(List list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6921ns interfaceC6921ns = (InterfaceC6921ns) list.get(i);
            if (interfaceC6921ns instanceof V6) {
                return (V6) interfaceC6921ns;
            }
        }
        return null;
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        this.i.invalidateSelf();
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) this.h.get(size);
            interfaceC2371Tr.b(arrayList, this.h.subList(0, size));
            arrayList.add(interfaceC2371Tr);
        }
    }

    @Override // com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        C5858k51 c5858k51 = this.k;
        if (c5858k51 != null) {
            c5858k51.c(obj, c8530tf0);
        }
    }

    @Override // com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        C5858k51 c5858k51 = this.k;
        if (c5858k51 != null) {
            this.c.preConcat(c5858k51.f());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) this.h.get(size);
            if (interfaceC2371Tr instanceof InterfaceC7301pE) {
                ((InterfaceC7301pE) interfaceC2371Tr).e(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // com.daaw.InterfaceC7301pE
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        C5858k51 c5858k51 = this.k;
        if (c5858k51 != null) {
            this.c.preConcat(c5858k51.f());
            i = (int) (((((this.k.h() == null ? 100 : ((Integer) this.k.h().h()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.a0() && m() && i != 255;
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(this.b, this.c, true);
            this.a.setAlpha(i);
            AbstractC0301Ab1.m(canvas, this.b, this.a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            Object obj = this.h.get(size);
            if (obj instanceof InterfaceC7301pE) {
                ((InterfaceC7301pE) obj).g(canvas, this.c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.f;
    }

    @Override // com.daaw.T70
    public void h(S70 s70, int i, List list, S70 s702) {
        if (s70.g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                s702 = s702.a(getName());
                if (s70.c(getName(), i)) {
                    list.add(s702.i(this));
                }
            }
            if (s70.h(getName(), i)) {
                int iE = i + s70.e(getName(), i);
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) this.h.get(i2);
                    if (interfaceC2371Tr instanceof T70) {
                        ((T70) interfaceC2371Tr).h(s70, iE, list, s702);
                    }
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC6648mt0
    public Path i() {
        this.c.reset();
        C5858k51 c5858k51 = this.k;
        if (c5858k51 != null) {
            this.c.set(c5858k51.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) this.h.get(size);
            if (interfaceC2371Tr instanceof InterfaceC6648mt0) {
                this.d.addPath(((InterfaceC6648mt0) interfaceC2371Tr).i(), this.c);
            }
        }
        return this.d;
    }

    public List k() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) this.h.get(i);
                if (interfaceC2371Tr instanceof InterfaceC6648mt0) {
                    this.j.add((InterfaceC6648mt0) interfaceC2371Tr);
                }
            }
        }
        return this.j;
    }

    public Matrix l() {
        C5858k51 c5858k51 = this.k;
        if (c5858k51 != null) {
            return c5858k51.f();
        }
        this.c.reset();
        return this.c;
    }

    public final boolean m() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof InterfaceC7301pE) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public C3276as(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, String str, boolean z, List list, V6 v6) {
        this.a = new C3078a90();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = c4615ff0;
        this.g = z;
        this.h = list;
        if (v6 != null) {
            C5858k51 c5858k51B = v6.b();
            this.k = c5858k51B;
            c5858k51B.a(abstractC9647xe);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) list.get(size);
            if (interfaceC2371Tr instanceof XT) {
                arrayList.add((XT) interfaceC2371Tr);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((XT) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}
