package com.daaw;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.eQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4260eQ {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public C3146aQ d;

    public void A(C3146aQ c3146aQ) {
        this.d = c3146aQ;
    }

    public Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.c.put(str, bundle) : (Bundle) this.c.remove(str);
    }

    public void a(androidx.fragment.app.c cVar) {
        if (this.a.contains(cVar)) {
            throw new IllegalStateException("Fragment already added: " + cVar);
        }
        synchronized (this.a) {
            this.a.add(cVar);
        }
        cVar.M = true;
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    public void d(int i) {
        for (androidx.fragment.app.f fVar : this.b.values()) {
            if (fVar != null) {
                fVar.s(i);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.f fVar : this.b.values()) {
                printWriter.print(str);
                if (fVar != null) {
                    androidx.fragment.app.c cVarK = fVar.k();
                    printWriter.println(cVarK);
                    cVarK.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                androidx.fragment.app.c cVar = (androidx.fragment.app.c) this.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
            }
        }
    }

    public androidx.fragment.app.c f(String str) {
        androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.b.get(str);
        if (fVar != null) {
            return fVar.k();
        }
        return null;
    }

    public androidx.fragment.app.c g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            androidx.fragment.app.c cVar = (androidx.fragment.app.c) this.a.get(size);
            if (cVar != null && cVar.a0 == i) {
                return cVar;
            }
        }
        for (androidx.fragment.app.f fVar : this.b.values()) {
            if (fVar != null) {
                androidx.fragment.app.c cVarK = fVar.k();
                if (cVarK.a0 == i) {
                    return cVarK;
                }
            }
        }
        return null;
    }

    public androidx.fragment.app.c h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                androidx.fragment.app.c cVar = (androidx.fragment.app.c) this.a.get(size);
                if (cVar != null && str.equals(cVar.c0)) {
                    return cVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.f fVar : this.b.values()) {
            if (fVar != null) {
                androidx.fragment.app.c cVarK = fVar.k();
                if (str.equals(cVarK.c0)) {
                    return cVarK;
                }
            }
        }
        return null;
    }

    public androidx.fragment.app.c i(String str) {
        androidx.fragment.app.c cVarL;
        for (androidx.fragment.app.f fVar : this.b.values()) {
            if (fVar != null && (cVarL = fVar.k().l(str)) != null) {
                return cVarL;
            }
        }
        return null;
    }

    public int j(androidx.fragment.app.c cVar) {
        View view;
        View view2;
        ViewGroup viewGroup = cVar.k0;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.a.indexOf(cVar);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            androidx.fragment.app.c cVar2 = (androidx.fragment.app.c) this.a.get(i);
            if (cVar2.k0 == viewGroup && (view2 = cVar2.l0) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.a.size()) {
                return -1;
            }
            androidx.fragment.app.c cVar3 = (androidx.fragment.app.c) this.a.get(iIndexOf);
            if (cVar3.k0 == viewGroup && (view = cVar3.l0) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.f fVar : this.b.values()) {
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.f fVar : this.b.values()) {
            if (fVar != null) {
                arrayList.add(fVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap m() {
        return this.c;
    }

    public androidx.fragment.app.f n(String str) {
        return (androidx.fragment.app.f) this.b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public C3146aQ p() {
        return this.d;
    }

    public Bundle q(String str) {
        return (Bundle) this.c.get(str);
    }

    public void r(androidx.fragment.app.f fVar) {
        androidx.fragment.app.c cVarK = fVar.k();
        if (c(cVarK.G)) {
            return;
        }
        this.b.put(cVarK.G, fVar);
        if (cVarK.g0) {
            if (cVarK.f0) {
                this.d.e(cVarK);
            } else {
                this.d.o(cVarK);
            }
            cVarK.g0 = false;
        }
        if (FragmentManager.J0(2)) {
            cVarK.toString();
        }
    }

    public void s(androidx.fragment.app.f fVar) {
        androidx.fragment.app.c cVarK = fVar.k();
        if (cVarK.f0) {
            this.d.o(cVarK);
        }
        if (this.b.get(cVarK.G) == fVar && ((androidx.fragment.app.f) this.b.put(cVarK.G, null)) != null && FragmentManager.J0(2)) {
            cVarK.toString();
        }
    }

    public void t() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.b.get(((androidx.fragment.app.c) it.next()).G);
            if (fVar != null) {
                fVar.m();
            }
        }
        for (androidx.fragment.app.f fVar2 : this.b.values()) {
            if (fVar2 != null) {
                fVar2.m();
                androidx.fragment.app.c cVarK = fVar2.k();
                if (cVarK.N && !cVarK.f0()) {
                    if (cVarK.P && !this.c.containsKey(cVarK.G)) {
                        B(cVarK.G, fVar2.q());
                    }
                    s(fVar2);
                }
            }
        }
    }

    public void u(androidx.fragment.app.c cVar) {
        synchronized (this.a) {
            this.a.remove(cVar);
        }
        cVar.M = false;
    }

    public void v() {
        this.b.clear();
    }

    public void w(List list) {
        this.a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                androidx.fragment.app.c cVarF = f(str);
                if (cVarF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.J0(2)) {
                    cVarF.toString();
                }
                a(cVarF);
            }
        }
    }

    public void x(HashMap map) {
        this.c.clear();
        this.c.putAll(map);
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.b.size());
        for (androidx.fragment.app.f fVar : this.b.values()) {
            if (fVar != null) {
                androidx.fragment.app.c cVarK = fVar.k();
                B(cVarK.G, fVar.q());
                arrayList.add(cVarK.G);
                if (FragmentManager.J0(2)) {
                    cVarK.toString();
                    Objects.toString(cVarK.C);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.a.size());
                for (androidx.fragment.app.c cVar : this.a) {
                    arrayList.add(cVar.G);
                    if (FragmentManager.J0(2)) {
                        cVar.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
