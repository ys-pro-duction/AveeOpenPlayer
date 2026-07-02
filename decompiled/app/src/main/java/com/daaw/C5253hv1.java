package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.hv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5253hv1 extends AbstractC9435wr1 implements InterfaceC7486pt1 {
    public final List D;
    public final List E;
    public ES2 F;

    public C5253hv1(C5253hv1 c5253hv1) {
        super(c5253hv1.B);
        ArrayList arrayList = new ArrayList(c5253hv1.D.size());
        this.D = arrayList;
        arrayList.addAll(c5253hv1.D);
        ArrayList arrayList2 = new ArrayList(c5253hv1.E.size());
        this.E = arrayList2;
        arrayList2.addAll(c5253hv1.E);
        this.F = c5253hv1.F;
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        ES2 es2A = this.F.a();
        for (int i = 0; i < this.D.size(); i++) {
            if (i < list.size()) {
                es2A.e((String) this.D.get(i), es2.b((InterfaceC1637Mv1) list.get(i)));
            } else {
                es2A.e((String) this.D.get(i), InterfaceC1637Mv1.t);
            }
        }
        for (InterfaceC1637Mv1 interfaceC1637Mv1 : this.E) {
            InterfaceC1637Mv1 interfaceC1637Mv1B = es2A.b(interfaceC1637Mv1);
            if (interfaceC1637Mv1B instanceof C8335sw1) {
                interfaceC1637Mv1B = es2A.b(interfaceC1637Mv1);
            }
            if (interfaceC1637Mv1B instanceof C5229hq1) {
                return ((C5229hq1) interfaceC1637Mv1B).a();
            }
        }
        return InterfaceC1637Mv1.t;
    }

    @Override // com.daaw.AbstractC9435wr1, com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        return new C5253hv1(this);
    }

    public C5253hv1(String str, List list, List list2, ES2 es2) {
        super(str);
        this.D = new ArrayList();
        this.F = es2;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.D.add(((InterfaceC1637Mv1) it.next()).zzi());
            }
        }
        this.E = new ArrayList(list2);
    }
}
