package com.daaw;

import android.content.Context;
import com.daaw.W3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.kL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5925kL {
    public final InterfaceC7569qB0 a;
    public final String b;
    public Integer c = null;

    public C5925kL(Context context, InterfaceC7569qB0 interfaceC7569qB0, String str) {
        this.a = interfaceC7569qB0;
        this.b = str;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C3594c1.b((Map) it.next()));
        }
        return arrayList;
    }

    public final void a(W3.c cVar) {
        ((W3) this.a.get()).e(cVar);
    }

    public final void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3594c1 c3594c1 = (C3594c1) it.next();
            while (arrayDeque.size() >= i) {
                k(((W3.c) arrayDeque.pollFirst()).b);
            }
            W3.c cVarF = c3594c1.f(this.b);
            a(cVarF);
            arrayDeque.offer(cVarF);
        }
    }

    public final boolean d(List list, C3594c1 c3594c1) {
        String strC = c3594c1.c();
        String strE = c3594c1.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3594c1 c3594c12 = (C3594c1) it.next();
            if (c3594c12.c().equals(strC) && c3594c12.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    public List e() throws C3316b1 {
        o();
        List listF = f();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(C3594c1.a((W3.c) it.next()));
        }
        return arrayList;
    }

    public final List f() {
        return ((W3) this.a.get()).f(this.b, "");
    }

    public final ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3594c1 c3594c1 = (C3594c1) it.next();
            if (!d(list2, c3594c1)) {
                arrayList.add(c3594c1);
            }
        }
        return arrayList;
    }

    public final ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3594c1 c3594c1 = (C3594c1) it.next();
            if (!d(list2, c3594c1)) {
                arrayList.add(c3594c1.f(this.b));
            }
        }
        return arrayList;
    }

    public final int i() {
        if (this.c == null) {
            this.c = Integer.valueOf(((W3) this.a.get()).d(this.b));
        }
        return this.c.intValue();
    }

    public void j() throws C3316b1 {
        o();
        l(f());
    }

    public final void k(String str) {
        ((W3) this.a.get()).clearConditionalUserProperty(str, null, null);
    }

    public final void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((W3.c) it.next()).b);
        }
    }

    public void m(List list) {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }

    public final void n(List list) throws C3316b1 {
        if (list.isEmpty()) {
            j();
            return;
        }
        List listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    public final void o() throws C3316b1 {
        if (this.a.get() == null) {
            throw new C3316b1("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
