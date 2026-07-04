package com.daaw;

import com.daaw.C5091hM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.gM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4812gM {
    public final HL a;
    public final InterfaceC0412Bd0 b;
    public final C3130aM c;
    public C5091hM d;

    /* JADX INFO: renamed from: com.daaw.gM$a */
    public static final class a implements InterfaceC9149vq {
        public a() {
        }

        @Override // com.daaw.InterfaceC9149vq
        public void a(AbstractC8863uq abstractC8863uq) {
            G10.g(abstractC8863uq, "configUpdate");
            C4812gM.this.f(abstractC8863uq.b());
        }

        @Override // com.daaw.InterfaceC9149vq
        public void b(C3687cM c3687cM) {
            G10.g(c3687cM, "error");
            C4812gM.this.b.f("Config update error with code: " + c3687cM.a(), c3687cM);
        }
    }

    public C4812gM(MR0 mr0) {
        G10.g(mr0, "sharedPrefs");
        this.a = new HL(mr0.e());
        this.b = AbstractC0837Fd0.a(C4812gM.class);
        C3130aM c3130aMJ = C3130aM.j();
        G10.f(c3130aMJ, "getInstance(...)");
        this.c = c3130aMJ;
        C5091hM c5091hMC = new C5091hM.b().d(3600L).c();
        G10.f(c5091hMC, "build(...)");
        this.d = c5091hMC;
        c3130aMJ.o(c5091hMC);
        g(this, null, 1, null);
        d();
    }

    public static /* synthetic */ void g(C4812gM c4812gM, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = null;
        }
        c4812gM.f(set);
    }

    public static final void h(C4812gM c4812gM, Set set, AbstractC6963o11 abstractC6963o11) {
        G10.g(c4812gM, "this$0");
        G10.g(abstractC6963o11, "fetch");
        if (abstractC6963o11.n()) {
            c4812gM.b.e("Remote config fetch successful");
            c4812gM.j(c4812gM.c, set);
            return;
        }
        InterfaceC0412Bd0 interfaceC0412Bd0 = c4812gM.b;
        Exception excJ = abstractC6963o11.j();
        interfaceC0412Bd0.h("Remote config fetch failed: " + (excJ != null ? excJ.getMessage() : null));
    }

    public final void d() {
        this.c.g(new a());
    }

    public final List e() {
        Collection collectionA = AbstractC5303i60.a(AbstractC5624jG0.b(this.a.getClass()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (obj instanceof InterfaceC3347b70) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((GL) ((InterfaceC3347b70) it.next()).get(this.a));
        }
        return arrayList2;
    }

    public final void f(final Set set) {
        this.c.i().b(new InterfaceC5228hq0() { // from class: com.daaw.fM
            @Override // com.daaw.InterfaceC5228hq0
            public final void a(AbstractC6963o11 abstractC6963o11) {
                C4812gM.h(this.a, set, abstractC6963o11);
            }
        });
    }

    public final HL i() {
        return this.a;
    }

    public final void j(C3130aM c3130aM, Set set) {
        Iterable<String> iterable;
        Object next;
        if (set != null) {
            iterable = set;
        } else {
            List listE = e();
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listE, 10));
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(((GL) it.next()).a());
            }
            iterable = arrayList;
        }
        for (String str : iterable) {
            Iterator it2 = e().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (G10.c(((GL) next).a(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            GL gl = (GL) next;
            if (gl != null) {
                gl.c(c3130aM);
            }
        }
    }
}
