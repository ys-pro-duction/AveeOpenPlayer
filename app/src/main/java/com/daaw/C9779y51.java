package com.daaw;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC8656u51;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.y51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9779y51 extends AbstractC8656u51 {
    public int m0;
    public ArrayList k0 = new ArrayList();
    public boolean l0 = true;
    public boolean n0 = false;
    public int o0 = 0;

    /* JADX INFO: renamed from: com.daaw.y51$a */
    public class a extends AbstractC8942v51 {
        public final /* synthetic */ AbstractC8656u51 a;

        public a(AbstractC8656u51 abstractC8656u51) {
            this.a = abstractC8656u51;
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void a(AbstractC8656u51 abstractC8656u51) {
            this.a.a0();
            abstractC8656u51.W(this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.y51$b */
    public static class b extends AbstractC8942v51 {
        public C9779y51 a;

        public b(C9779y51 c9779y51) {
            this.a = c9779y51;
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void a(AbstractC8656u51 abstractC8656u51) {
            C9779y51 c9779y51 = this.a;
            int i = c9779y51.m0 - 1;
            c9779y51.m0 = i;
            if (i == 0) {
                c9779y51.n0 = false;
                c9779y51.q();
            }
            abstractC8656u51.W(this);
        }

        @Override // com.daaw.AbstractC8942v51, com.daaw.AbstractC8656u51.f
        public void d(AbstractC8656u51 abstractC8656u51) {
            C9779y51 c9779y51 = this.a;
            if (c9779y51.n0) {
                return;
            }
            c9779y51.h0();
            this.a.n0 = true;
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public void T(View view) {
        super.T(view);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8656u51) this.k0.get(i)).T(view);
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public void Y(View view) {
        super.Y(view);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8656u51) this.k0.get(i)).Y(view);
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public void a0() {
        if (this.k0.isEmpty()) {
            h0();
            q();
            return;
        }
        v0();
        if (this.l0) {
            Iterator it = this.k0.iterator();
            while (it.hasNext()) {
                ((AbstractC8656u51) it.next()).a0();
            }
            return;
        }
        for (int i = 1; i < this.k0.size(); i++) {
            ((AbstractC8656u51) this.k0.get(i - 1)).b(new a((AbstractC8656u51) this.k0.get(i)));
        }
        AbstractC8656u51 abstractC8656u51 = (AbstractC8656u51) this.k0.get(0);
        if (abstractC8656u51 != null) {
            abstractC8656u51.a0();
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public void c0(AbstractC8656u51.e eVar) {
        super.c0(eVar);
        this.o0 |= 8;
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8656u51) this.k0.get(i)).c0(eVar);
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public void e0(AbstractC8879ut0 abstractC8879ut0) {
        super.e0(abstractC8879ut0);
        this.o0 |= 4;
        if (this.k0 != null) {
            for (int i = 0; i < this.k0.size(); i++) {
                ((AbstractC8656u51) this.k0.get(i)).e0(abstractC8879ut0);
            }
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public void f0(AbstractC9500x51 abstractC9500x51) {
        super.f0(abstractC9500x51);
        this.o0 |= 2;
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8656u51) this.k0.get(i)).f0(abstractC9500x51);
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public void h(B51 b51) {
        if (K(b51.b)) {
            for (AbstractC8656u51 abstractC8656u51 : this.k0) {
                if (abstractC8656u51.K(b51.b)) {
                    abstractC8656u51.h(b51);
                    b51.c.add(abstractC8656u51);
                }
            }
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public String i0(String str) {
        String strI0 = super.i0(str);
        for (int i = 0; i < this.k0.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strI0);
            sb.append("\n");
            sb.append(((AbstractC8656u51) this.k0.get(i)).i0(str + "  "));
            strI0 = sb.toString();
        }
        return strI0;
    }

    @Override // com.daaw.AbstractC8656u51
    public void j(B51 b51) {
        super.j(b51);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8656u51) this.k0.get(i)).j(b51);
        }
    }

    @Override // com.daaw.AbstractC8656u51
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C9779y51 b(AbstractC8656u51.f fVar) {
        return (C9779y51) super.b(fVar);
    }

    @Override // com.daaw.AbstractC8656u51
    public void k(B51 b51) {
        if (K(b51.b)) {
            for (AbstractC8656u51 abstractC8656u51 : this.k0) {
                if (abstractC8656u51.K(b51.b)) {
                    abstractC8656u51.k(b51);
                    b51.c.add(abstractC8656u51);
                }
            }
        }
    }

    @Override // com.daaw.AbstractC8656u51
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C9779y51 c(View view) {
        for (int i = 0; i < this.k0.size(); i++) {
            ((AbstractC8656u51) this.k0.get(i)).c(view);
        }
        return (C9779y51) super.c(view);
    }

    public C9779y51 l0(AbstractC8656u51 abstractC8656u51) {
        m0(abstractC8656u51);
        long j = this.D;
        if (j >= 0) {
            abstractC8656u51.b0(j);
        }
        if ((this.o0 & 1) != 0) {
            abstractC8656u51.d0(u());
        }
        if ((this.o0 & 2) != 0) {
            y();
            abstractC8656u51.f0(null);
        }
        if ((this.o0 & 4) != 0) {
            abstractC8656u51.e0(x());
        }
        if ((this.o0 & 8) != 0) {
            abstractC8656u51.c0(t());
        }
        return this;
    }

    public final void m0(AbstractC8656u51 abstractC8656u51) {
        this.k0.add(abstractC8656u51);
        abstractC8656u51.S = this;
    }

    @Override // com.daaw.AbstractC8656u51
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC8656u51 clone() {
        C9779y51 c9779y51 = (C9779y51) super.clone();
        c9779y51.k0 = new ArrayList();
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            c9779y51.m0(((AbstractC8656u51) this.k0.get(i)).clone());
        }
        return c9779y51;
    }

    public AbstractC8656u51 n0(int i) {
        if (i < 0 || i >= this.k0.size()) {
            return null;
        }
        return (AbstractC8656u51) this.k0.get(i);
    }

    public int o0() {
        return this.k0.size();
    }

    @Override // com.daaw.AbstractC8656u51
    public void p(ViewGroup viewGroup, C51 c51, C51 c512, ArrayList arrayList, ArrayList arrayList2) {
        long jA = A();
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            AbstractC8656u51 abstractC8656u51 = (AbstractC8656u51) this.k0.get(i);
            if (jA > 0 && (this.l0 || i == 0)) {
                long jA2 = abstractC8656u51.A();
                if (jA2 > 0) {
                    abstractC8656u51.g0(jA2 + jA);
                } else {
                    abstractC8656u51.g0(jA);
                }
            }
            abstractC8656u51.p(viewGroup, c51, c512, arrayList, arrayList2);
        }
    }

    @Override // com.daaw.AbstractC8656u51
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C9779y51 W(AbstractC8656u51.f fVar) {
        return (C9779y51) super.W(fVar);
    }

    @Override // com.daaw.AbstractC8656u51
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C9779y51 X(View view) {
        for (int i = 0; i < this.k0.size(); i++) {
            ((AbstractC8656u51) this.k0.get(i)).X(view);
        }
        return (C9779y51) super.X(view);
    }

    @Override // com.daaw.AbstractC8656u51
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C9779y51 b0(long j) {
        ArrayList arrayList;
        super.b0(j);
        if (this.D >= 0 && (arrayList = this.k0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC8656u51) this.k0.get(i)).b0(j);
            }
        }
        return this;
    }

    @Override // com.daaw.AbstractC8656u51
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C9779y51 d0(TimeInterpolator timeInterpolator) {
        this.o0 |= 1;
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC8656u51) this.k0.get(i)).d0(timeInterpolator);
            }
        }
        return (C9779y51) super.d0(timeInterpolator);
    }

    public C9779y51 t0(int i) {
        if (i == 0) {
            this.l0 = true;
            return this;
        }
        if (i == 1) {
            this.l0 = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
    }

    @Override // com.daaw.AbstractC8656u51
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C9779y51 g0(long j) {
        return (C9779y51) super.g0(j);
    }

    public final void v0() {
        b bVar = new b(this);
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ((AbstractC8656u51) it.next()).b(bVar);
        }
        this.m0 = this.k0.size();
    }
}
