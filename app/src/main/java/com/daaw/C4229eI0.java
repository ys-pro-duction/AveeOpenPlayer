package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.daaw.AbstractC9089ve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.eI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4229eI0 implements InterfaceC7301pE, InterfaceC6648mt0, XT, AbstractC9089ve.b, U70 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final C4615ff0 c;
    public final AbstractC9647xe d;
    public final String e;
    public final boolean f;
    public final AbstractC9089ve g;
    public final AbstractC9089ve h;
    public final C5858k51 i;
    public C3276as j;

    public C4229eI0(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C3951dI0 c3951dI0) {
        this.c = c4615ff0;
        this.d = abstractC9647xe;
        this.e = c3951dI0.c();
        this.f = c3951dI0.f();
        AbstractC9089ve abstractC9089veH = c3951dI0.b().h();
        this.g = abstractC9089veH;
        abstractC9647xe.j(abstractC9089veH);
        abstractC9089veH.a(this);
        AbstractC9089ve abstractC9089veH2 = c3951dI0.d().h();
        this.h = abstractC9089veH2;
        abstractC9647xe.j(abstractC9089veH2);
        abstractC9089veH2.a(this);
        C5858k51 c5858k51B = c3951dI0.e().b();
        this.i = c5858k51B;
        c5858k51B.a(abstractC9647xe);
        c5858k51B.b(this);
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        this.c.invalidateSelf();
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        if (this.i.c(obj, c8530tf0)) {
            return;
        }
        if (obj == InterfaceC7136of0.u) {
            this.g.n(c8530tf0);
        } else if (obj == InterfaceC7136of0.v) {
            this.h.n(c8530tf0);
        }
    }

    @Override // com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.j.e(rectF, matrix, z);
    }

    @Override // com.daaw.XT
    public void f(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((InterfaceC2371Tr) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new C3276as(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // com.daaw.InterfaceC7301pE
    public void g(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.h()).floatValue();
        float fFloatValue2 = ((Float) this.h.h()).floatValue();
        float fFloatValue3 = ((Float) this.i.i().h()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) this.i.e().h()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.g(f + fFloatValue2));
            this.j.g(canvas, this.a, (int) (i * AbstractC9678xk0.i(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.e;
    }

    @Override // com.daaw.T70
    public void h(S70 s70, int i, List list, S70 s702) {
        AbstractC9678xk0.k(s70, i, list, s702, this);
    }

    @Override // com.daaw.InterfaceC6648mt0
    public Path i() {
        Path pathI = this.j.i();
        this.b.reset();
        float fFloatValue = ((Float) this.g.h()).floatValue();
        float fFloatValue2 = ((Float) this.h.h()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.g(i + fFloatValue2));
            this.b.addPath(pathI, this.a);
        }
        return this.b;
    }
}
