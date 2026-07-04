package com.daaw;

import com.daaw.AbstractC5674jS;
import com.daaw.TA0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4992h implements R7 {
    public final YP0 a;

    /* JADX INFO: renamed from: com.daaw.h$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[B7.values().length];
            try {
                iArr[B7.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B7.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B7.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public AbstractC4992h(YP0 yp0) {
        G10.g(yp0, "protocol");
        this.a = yp0;
    }

    @Override // com.daaw.R7
    public List a(TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7) {
        G10.g(ta0, "container");
        G10.g(interfaceC2026Qj0, "proto");
        G10.g(b7, "kind");
        List listK = null;
        if (interfaceC2026Qj0 instanceof CA0) {
            AbstractC5674jS.f fVarG = this.a.g();
            if (fVarG != null) {
                listK = (List) ((CA0) interfaceC2026Qj0).x(fVarG);
            }
        } else {
            if (!(interfaceC2026Qj0 instanceof HA0)) {
                throw new IllegalStateException(("Unknown message: " + interfaceC2026Qj0).toString());
            }
            int i = a.a[b7.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + b7).toString());
            }
            AbstractC5674jS.f fVarL = this.a.l();
            if (fVarL != null) {
                listK = (List) ((HA0) interfaceC2026Qj0).x(fVarL);
            }
        }
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), ta0.b()));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List b(KA0 ka0, InterfaceC2664Wm0 interfaceC2664Wm0) {
        G10.g(ka0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        List listK = (List) ka0.x(this.a.o());
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), interfaceC2664Wm0));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List c(TA0 ta0, HA0 ha0) {
        G10.g(ta0, "container");
        G10.g(ha0, "proto");
        AbstractC5674jS.f fVarJ = this.a.j();
        List listK = fVarJ != null ? (List) ha0.x(fVarJ) : null;
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), ta0.b()));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List d(TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7, int i, OA0 oa0) {
        G10.g(ta0, "container");
        G10.g(interfaceC2026Qj0, "callableProto");
        G10.g(b7, "kind");
        G10.g(oa0, "proto");
        List listK = (List) oa0.x(this.a.h());
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), ta0.b()));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List f(TA0.a aVar) {
        G10.g(aVar, "container");
        List listK = (List) aVar.f().x(this.a.a());
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), aVar.b()));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List h(TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7) {
        List listK;
        G10.g(ta0, "container");
        G10.g(interfaceC2026Qj0, "proto");
        G10.g(b7, "kind");
        if (interfaceC2026Qj0 instanceof C9524xA0) {
            listK = (List) ((C9524xA0) interfaceC2026Qj0).x(this.a.c());
        } else if (interfaceC2026Qj0 instanceof CA0) {
            listK = (List) ((CA0) interfaceC2026Qj0).x(this.a.f());
        } else {
            if (!(interfaceC2026Qj0 instanceof HA0)) {
                throw new IllegalStateException(("Unknown message: " + interfaceC2026Qj0).toString());
            }
            int i = a.a[b7.ordinal()];
            if (i == 1) {
                listK = (List) ((HA0) interfaceC2026Qj0).x(this.a.i());
            } else if (i == 2) {
                listK = (List) ((HA0) interfaceC2026Qj0).x(this.a.m());
            } else {
                if (i != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listK = (List) ((HA0) interfaceC2026Qj0).x(this.a.n());
            }
        }
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), ta0.b()));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List i(TA0 ta0, HA0 ha0) {
        G10.g(ta0, "container");
        G10.g(ha0, "proto");
        AbstractC5674jS.f fVarK = this.a.k();
        List listK = fVarK != null ? (List) ha0.x(fVarK) : null;
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), ta0.b()));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List j(TA0 ta0, AA0 aa0) {
        G10.g(ta0, "container");
        G10.g(aa0, "proto");
        List listK = (List) aa0.x(this.a.d());
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), ta0.b()));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List l(MA0 ma0, InterfaceC2664Wm0 interfaceC2664Wm0) {
        G10.g(ma0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        List listK = (List) ma0.x(this.a.p());
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C8966vA0) it.next(), interfaceC2664Wm0));
        }
        return arrayList;
    }

    public final YP0 m() {
        return this.a;
    }
}
