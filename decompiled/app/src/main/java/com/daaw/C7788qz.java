package com.daaw;

import com.daaw.C2109Re;
import com.daaw.C5510ir;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7788qz {
    public C5791jr a;
    public C5791jr d;
    public boolean b = true;
    public boolean c = true;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public C2109Re.b g = null;
    public C2109Re.a h = new C2109Re.a();
    public ArrayList i = new ArrayList();

    public C7788qz(C5791jr c5791jr) {
        this.a = c5791jr;
        this.d = c5791jr;
    }

    public final void a(C8066rz c8066rz, int i, int i2, C8066rz c8066rz2, ArrayList arrayList, C7883rK0 c7883rK0) {
        int i3;
        C8066rz c8066rz3;
        ArrayList arrayList2;
        AbstractC2745Xg1 abstractC2745Xg1 = c8066rz.d;
        if (abstractC2745Xg1.c == null) {
            C5791jr c5791jr = this.a;
            if (abstractC2745Xg1 == c5791jr.e || abstractC2745Xg1 == c5791jr.f) {
                return;
            }
            if (c7883rK0 == null) {
                c7883rK0 = new C7883rK0(abstractC2745Xg1, i2);
                arrayList.add(c7883rK0);
            }
            C7883rK0 c7883rK02 = c7883rK0;
            abstractC2745Xg1.c = c7883rK02;
            c7883rK02.a(abstractC2745Xg1);
            for (InterfaceC6393lz interfaceC6393lz : abstractC2745Xg1.h.k) {
                if (interfaceC6393lz instanceof C8066rz) {
                    i3 = i;
                    c8066rz3 = c8066rz2;
                    arrayList2 = arrayList;
                    a((C8066rz) interfaceC6393lz, i3, 0, c8066rz3, arrayList2, c7883rK02);
                } else {
                    i3 = i;
                    c8066rz3 = c8066rz2;
                    arrayList2 = arrayList;
                }
                i = i3;
                c8066rz2 = c8066rz3;
                arrayList = arrayList2;
            }
            int i4 = i;
            C8066rz c8066rz4 = c8066rz2;
            ArrayList arrayList3 = arrayList;
            for (InterfaceC6393lz interfaceC6393lz2 : abstractC2745Xg1.i.k) {
                if (interfaceC6393lz2 instanceof C8066rz) {
                    a((C8066rz) interfaceC6393lz2, i4, 1, c8066rz4, arrayList3, c7883rK02);
                }
            }
            if (i4 == 1 && (abstractC2745Xg1 instanceof C0838Fd1)) {
                for (InterfaceC6393lz interfaceC6393lz3 : ((C0838Fd1) abstractC2745Xg1).k.k) {
                    if (interfaceC6393lz3 instanceof C8066rz) {
                        a((C8066rz) interfaceC6393lz3, i4, 2, c8066rz4, arrayList3, c7883rK02);
                    }
                }
            }
            for (C8066rz c8066rz5 : abstractC2745Xg1.h.l) {
                if (c8066rz5 == c8066rz4) {
                    c7883rK02.b = true;
                }
                a(c8066rz5, i4, 0, c8066rz4, arrayList3, c7883rK02);
            }
            for (C8066rz c8066rz6 : abstractC2745Xg1.i.l) {
                if (c8066rz6 == c8066rz4) {
                    c7883rK02.b = true;
                }
                a(c8066rz6, i4, 1, c8066rz4, arrayList3, c7883rK02);
            }
            if (i4 == 1 && (abstractC2745Xg1 instanceof C0838Fd1)) {
                Iterator it = ((C0838Fd1) abstractC2745Xg1).k.l.iterator();
                while (it.hasNext()) {
                    a((C8066rz) it.next(), i4, 2, c8066rz4, arrayList3, c7883rK02);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.daaw.C5791jr r19) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7788qz.b(com.daaw.jr):boolean");
    }

    public void c() {
        d(this.e);
        this.i.clear();
        C7883rK0.h = 0;
        i(this.a.e, 0, this.i);
        i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        HashSet hashSet = null;
        for (C5510ir c5510ir : this.d.w0) {
            if (c5510ir instanceof C7644qU) {
                arrayList.add(new C7922rU(c5510ir));
            } else {
                if (c5510ir.V()) {
                    if (c5510ir.c == null) {
                        c5510ir.c = new C2755Xj(c5510ir, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5510ir.c);
                } else {
                    arrayList.add(c5510ir.e);
                }
                if (c5510ir.X()) {
                    if (c5510ir.d == null) {
                        c5510ir.d = new C2755Xj(c5510ir, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5510ir.d);
                } else {
                    arrayList.add(c5510ir.f);
                }
                if (c5510ir instanceof OV) {
                    arrayList.add(new NV(c5510ir));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2745Xg1) it.next()).f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC2745Xg1 abstractC2745Xg1 = (AbstractC2745Xg1) it2.next();
            if (abstractC2745Xg1.b != this.d) {
                abstractC2745Xg1.d();
            }
        }
    }

    public final int e(C5791jr c5791jr, int i) {
        int size = this.i.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((C7883rK0) this.i.get(i2)).b(c5791jr, i));
        }
        return (int) jMax;
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.b || this.c) {
            for (C5510ir c5510ir : this.a.w0) {
                c5510ir.a = false;
                c5510ir.e.r();
                c5510ir.f.q();
            }
            C5791jr c5791jr = this.a;
            c5791jr.a = false;
            c5791jr.e.r();
            this.a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.F0(0);
        this.a.G0(0);
        C5510ir.b bVarS = this.a.s(0);
        C5510ir.b bVarS2 = this.a.s(1);
        if (this.b) {
            c();
        }
        int iQ = this.a.Q();
        int iR = this.a.R();
        this.a.e.h.d(iQ);
        this.a.f.h.d(iR);
        m();
        C5510ir.b bVar = C5510ir.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z) {
                Iterator it = this.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((AbstractC2745Xg1) it.next()).m()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && bVarS == C5510ir.b.WRAP_CONTENT) {
                this.a.l0(C5510ir.b.FIXED);
                C5791jr c5791jr2 = this.a;
                c5791jr2.E0(e(c5791jr2, 0));
                C5791jr c5791jr3 = this.a;
                c5791jr3.e.e.d(c5791jr3.P());
            }
            if (z && bVarS2 == C5510ir.b.WRAP_CONTENT) {
                this.a.A0(C5510ir.b.FIXED);
                C5791jr c5791jr4 = this.a;
                c5791jr4.h0(e(c5791jr4, 1));
                C5791jr c5791jr5 = this.a;
                c5791jr5.f.e.d(c5791jr5.v());
            }
        }
        C5791jr c5791jr6 = this.a;
        C5510ir.b bVar2 = c5791jr6.M[0];
        C5510ir.b bVar3 = C5510ir.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C5510ir.b.MATCH_PARENT) {
            int iP = c5791jr6.P() + iQ;
            this.a.e.i.d(iP);
            this.a.e.e.d(iP - iQ);
            m();
            C5791jr c5791jr7 = this.a;
            C5510ir.b bVar4 = c5791jr7.M[1];
            if (bVar4 == bVar3 || bVar4 == C5510ir.b.MATCH_PARENT) {
                int iV = c5791jr7.v() + iR;
                this.a.f.i.d(iV);
                this.a.f.e.d(iV - iR);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        for (AbstractC2745Xg1 abstractC2745Xg1 : this.e) {
            if (abstractC2745Xg1.b != this.a || abstractC2745Xg1.g) {
                abstractC2745Xg1.e();
            }
        }
        Iterator it2 = this.e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC2745Xg1 abstractC2745Xg12 = (AbstractC2745Xg1) it2.next();
            if (z2 || abstractC2745Xg12.b != this.a) {
                if (!abstractC2745Xg12.h.j || ((!abstractC2745Xg12.i.j && !(abstractC2745Xg12 instanceof C7922rU)) || (!abstractC2745Xg12.e.j && !(abstractC2745Xg12 instanceof C2755Xj) && !(abstractC2745Xg12 instanceof C7922rU)))) {
                    break;
                }
            }
        }
        this.a.l0(bVarS);
        this.a.A0(bVarS2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            for (C5510ir c5510ir : this.a.w0) {
                c5510ir.a = false;
                C6815nW c6815nW = c5510ir.e;
                c6815nW.e.j = false;
                c6815nW.g = false;
                c6815nW.r();
                C0838Fd1 c0838Fd1 = c5510ir.f;
                c0838Fd1.e.j = false;
                c0838Fd1.g = false;
                c0838Fd1.q();
            }
            C5791jr c5791jr = this.a;
            c5791jr.a = false;
            C6815nW c6815nW2 = c5791jr.e;
            c6815nW2.e.j = false;
            c6815nW2.g = false;
            c6815nW2.r();
            C0838Fd1 c0838Fd12 = this.a.f;
            c0838Fd12.e.j = false;
            c0838Fd12.g = false;
            c0838Fd12.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.F0(0);
        this.a.G0(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        C5510ir.b bVar;
        boolean z3 = false;
        C5510ir.b bVarS = this.a.s(0);
        C5510ir.b bVarS2 = this.a.s(1);
        int iQ = this.a.Q();
        int iR = this.a.R();
        if (z && (bVarS == (bVar = C5510ir.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2745Xg1 abstractC2745Xg1 = (AbstractC2745Xg1) it.next();
                if (abstractC2745Xg1.f == i && !abstractC2745Xg1.m()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && bVarS == C5510ir.b.WRAP_CONTENT) {
                    this.a.l0(C5510ir.b.FIXED);
                    C5791jr c5791jr = this.a;
                    c5791jr.E0(e(c5791jr, 0));
                    C5791jr c5791jr2 = this.a;
                    c5791jr2.e.e.d(c5791jr2.P());
                }
            } else if (z && bVarS2 == C5510ir.b.WRAP_CONTENT) {
                this.a.A0(C5510ir.b.FIXED);
                C5791jr c5791jr3 = this.a;
                c5791jr3.h0(e(c5791jr3, 1));
                C5791jr c5791jr4 = this.a;
                c5791jr4.f.e.d(c5791jr4.v());
            }
        }
        if (i == 0) {
            C5791jr c5791jr5 = this.a;
            C5510ir.b bVar2 = c5791jr5.M[0];
            if (bVar2 == C5510ir.b.FIXED || bVar2 == C5510ir.b.MATCH_PARENT) {
                int iP = c5791jr5.P() + iQ;
                this.a.e.i.d(iP);
                this.a.e.e.d(iP - iQ);
                z2 = true;
            }
            z2 = false;
        } else {
            C5791jr c5791jr6 = this.a;
            C5510ir.b bVar3 = c5791jr6.M[1];
            if (bVar3 == C5510ir.b.FIXED || bVar3 == C5510ir.b.MATCH_PARENT) {
                int iV = c5791jr6.v() + iR;
                this.a.f.i.d(iV);
                this.a.f.e.d(iV - iR);
                z2 = true;
            }
            z2 = false;
        }
        m();
        for (AbstractC2745Xg1 abstractC2745Xg12 : this.e) {
            if (abstractC2745Xg12.f == i && (abstractC2745Xg12.b != this.a || abstractC2745Xg12.g)) {
                abstractC2745Xg12.e();
            }
        }
        Iterator it2 = this.e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC2745Xg1 abstractC2745Xg13 = (AbstractC2745Xg1) it2.next();
            if (abstractC2745Xg13.f == i && (z2 || abstractC2745Xg13.b != this.a)) {
                if (!abstractC2745Xg13.h.j || !abstractC2745Xg13.i.j || (!(abstractC2745Xg13 instanceof C2755Xj) && !abstractC2745Xg13.e.j)) {
                    break;
                }
            }
        }
        this.a.l0(bVarS);
        this.a.A0(bVarS2);
        return z3;
    }

    public final void i(AbstractC2745Xg1 abstractC2745Xg1, int i, ArrayList arrayList) {
        for (InterfaceC6393lz interfaceC6393lz : abstractC2745Xg1.h.k) {
            if (interfaceC6393lz instanceof C8066rz) {
                a((C8066rz) interfaceC6393lz, i, 0, abstractC2745Xg1.i, arrayList, null);
            } else if (interfaceC6393lz instanceof AbstractC2745Xg1) {
                a(((AbstractC2745Xg1) interfaceC6393lz).h, i, 0, abstractC2745Xg1.i, arrayList, null);
            }
        }
        for (InterfaceC6393lz interfaceC6393lz2 : abstractC2745Xg1.i.k) {
            if (interfaceC6393lz2 instanceof C8066rz) {
                a((C8066rz) interfaceC6393lz2, i, 1, abstractC2745Xg1.h, arrayList, null);
            } else if (interfaceC6393lz2 instanceof AbstractC2745Xg1) {
                a(((AbstractC2745Xg1) interfaceC6393lz2).i, i, 1, abstractC2745Xg1.h, arrayList, null);
            }
        }
        int i2 = i;
        if (i2 == 1) {
            for (InterfaceC6393lz interfaceC6393lz3 : ((C0838Fd1) abstractC2745Xg1).k.k) {
                if (interfaceC6393lz3 instanceof C8066rz) {
                    a((C8066rz) interfaceC6393lz3, i2, 2, null, arrayList, null);
                }
                i2 = i;
            }
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public final void l(C5510ir c5510ir, C5510ir.b bVar, int i, C5510ir.b bVar2, int i2) {
        C2109Re.a aVar = this.h;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.g.b(c5510ir, aVar);
        c5510ir.E0(this.h.e);
        c5510ir.h0(this.h.f);
        c5510ir.g0(this.h.h);
        c5510ir.b0(this.h.g);
    }

    public void m() {
        VB vb;
        for (C5510ir c5510ir : this.a.w0) {
            if (!c5510ir.a) {
                C5510ir.b[] bVarArr = c5510ir.M;
                boolean z = false;
                C5510ir.b bVar = bVarArr[0];
                C5510ir.b bVar2 = bVarArr[1];
                int i = c5510ir.l;
                int i2 = c5510ir.m;
                C5510ir.b bVar3 = C5510ir.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C5510ir.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == C5510ir.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                VB vb2 = c5510ir.e.e;
                boolean z3 = vb2.j;
                VB vb3 = c5510ir.f.e;
                boolean z4 = vb3.j;
                if (z3 && z4) {
                    C5510ir.b bVar4 = C5510ir.b.FIXED;
                    l(c5510ir, bVar4, vb2.g, bVar4, vb3.g);
                    c5510ir.a = true;
                } else if (z3 && z) {
                    l(c5510ir, C5510ir.b.FIXED, vb2.g, bVar3, vb3.g);
                    if (bVar2 == C5510ir.b.MATCH_CONSTRAINT) {
                        c5510ir.f.e.m = c5510ir.v();
                    } else {
                        c5510ir.f.e.d(c5510ir.v());
                        c5510ir.a = true;
                    }
                } else if (z4 && z2) {
                    l(c5510ir, bVar3, vb2.g, C5510ir.b.FIXED, vb3.g);
                    if (bVar == C5510ir.b.MATCH_CONSTRAINT) {
                        c5510ir.e.e.m = c5510ir.P();
                    } else {
                        c5510ir.e.e.d(c5510ir.P());
                        c5510ir.a = true;
                    }
                }
                if (c5510ir.a && (vb = c5510ir.f.l) != null) {
                    vb.d(c5510ir.n());
                }
            }
        }
    }

    public void n(C2109Re.b bVar) {
        this.g = bVar;
    }
}
