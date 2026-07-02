package com.daaw;

import com.google.firebase.Timestamp;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8271sj0 implements InterfaceC0344Am0 {
    public final List a = new ArrayList();
    public UY b = new UY(Collections.EMPTY_LIST, YC.c);
    public int c = 1;
    public AbstractC4340ei d = C9395wj1.v;
    public final C8829uj0 e;
    public final C7435pj0 f;

    public C8271sj0(C8829uj0 c8829uj0, C0722Ea1 c0722Ea1) {
        this.e = c8829uj0;
        this.f = c8829uj0.c(c0722Ea1);
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void a() {
        if (this.a.isEmpty()) {
            AbstractC6557mb.d(this.b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // com.daaw.InterfaceC0344Am0
    public List b(Iterable iterable) {
        UY uy = new UY(Collections.EMPTY_LIST, AbstractC6838nb1.g());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            Iterator itQ = this.b.q(new YC(tc, 0));
            while (itQ.hasNext()) {
                YC yc = (YC) itQ.next();
                if (!tc.equals(yc.d())) {
                    break;
                }
                uy = uy.p(Integer.valueOf(yc.c()));
            }
        }
        return p(uy);
    }

    @Override // com.daaw.InterfaceC0344Am0
    public C9967ym0 c(Timestamp timestamp, List list, List list2) {
        AbstractC6557mb.d(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i = this.c;
        this.c = i + 1;
        int size = this.a.size();
        if (size > 0) {
            AbstractC6557mb.d(((C9967ym0) this.a.get(size - 1)).e() < i, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        C9967ym0 c9967ym0 = new C9967ym0(i, timestamp, list, list2);
        this.a.add(c9967ym0);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC9688xm0 abstractC9688xm0 = (AbstractC9688xm0) it.next();
            this.b = this.b.p(new YC(abstractC9688xm0.g(), i));
            this.f.h(abstractC9688xm0.g().o());
        }
        return c9967ym0;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void d(C9967ym0 c9967ym0) {
        AbstractC6557mb.d(n(c9967ym0.e(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.a.remove(0);
        UY uyS = this.b;
        Iterator it = c9967ym0.h().iterator();
        while (it.hasNext()) {
            TC tcG = ((AbstractC9688xm0) it.next()).g();
            this.e.f().g(tcG);
            uyS = uyS.s(new YC(tcG, c9967ym0.e()));
        }
        this.b = uyS;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public C9967ym0 e(int i) {
        int iM = m(i + 1);
        if (iM < 0) {
            iM = 0;
        }
        if (this.a.size() > iM) {
            return (C9967ym0) this.a.get(iM);
        }
        return null;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public C9967ym0 f(int i) {
        int iM = m(i);
        if (iM < 0 || iM >= this.a.size()) {
            return null;
        }
        C9967ym0 c9967ym0 = (C9967ym0) this.a.get(iM);
        AbstractC6557mb.d(c9967ym0.e() == i, "If found batch must match", new Object[0]);
        return c9967ym0;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public AbstractC4340ei g() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void h(AbstractC4340ei abstractC4340ei) {
        this.d = (AbstractC4340ei) AbstractC8342sy0.b(abstractC4340ei);
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void i(C9967ym0 c9967ym0, AbstractC4340ei abstractC4340ei) {
        int iE = c9967ym0.e();
        int iN = n(iE, "acknowledged");
        AbstractC6557mb.d(iN == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        C9967ym0 c9967ym02 = (C9967ym0) this.a.get(iN);
        AbstractC6557mb.d(iE == c9967ym02.e(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(iE), Integer.valueOf(c9967ym02.e()));
        this.d = (AbstractC4340ei) AbstractC8342sy0.b(abstractC4340ei);
    }

    @Override // com.daaw.InterfaceC0344Am0
    public List j() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public boolean k(TC tc) {
        Iterator itQ = this.b.q(new YC(tc, 0));
        if (itQ.hasNext()) {
            return ((YC) itQ.next()).d().equals(tc);
        }
        return false;
    }

    public long l(C1872Pc0 c1872Pc0) {
        Iterator it = this.a.iterator();
        long jC = 0;
        while (it.hasNext()) {
            jC += (long) c1872Pc0.l((C9967ym0) it.next()).c();
        }
        return jC;
    }

    public final int m(int i) {
        if (this.a.isEmpty()) {
            return 0;
        }
        return i - ((C9967ym0) this.a.get(0)).e();
    }

    public final int n(int i, String str) {
        int iM = m(i);
        AbstractC6557mb.d(iM >= 0 && iM < this.a.size(), "Batches must exist to be %s", str);
        return iM;
    }

    public boolean o() {
        return this.a.isEmpty();
    }

    public final List p(UY uy) {
        ArrayList arrayList = new ArrayList();
        Iterator it = uy.iterator();
        while (it.hasNext()) {
            C9967ym0 c9967ym0F = f(((Integer) it.next()).intValue());
            if (c9967ym0F != null) {
                arrayList.add(c9967ym0F);
            }
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void start() {
        if (o()) {
            this.c = 1;
        }
    }
}
