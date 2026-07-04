package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ri1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7988ri1 extends AbstractC7710qi1 {
    public static final String j = AbstractC1772Od0.f("WorkContinuationImpl");
    public final C0537Ci1 a;
    public final String b;
    public final RI c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public boolean h;
    public InterfaceC2054Qq0 i;

    public C7988ri1(C0537Ci1 c0537Ci1, List list) {
        this(c0537Ci1, null, RI.KEEP, list, null);
    }

    public static boolean i(C7988ri1 c7988ri1, Set set) {
        set.addAll(c7988ri1.c());
        Set setL = l(c7988ri1);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((String) it.next())) {
                return true;
            }
        }
        List listE = c7988ri1.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((C7988ri1) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c7988ri1.c());
        return false;
    }

    public static Set l(C7988ri1 c7988ri1) {
        HashSet hashSet = new HashSet();
        List listE = c7988ri1.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((C7988ri1) it.next()).c());
            }
        }
        return hashSet;
    }

    public InterfaceC2054Qq0 a() {
        if (this.h) {
            AbstractC1772Od0.c().h(j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.e)), new Throwable[0]);
        } else {
            VG vg = new VG(this);
            this.a.p().b(vg);
            this.i = vg.d();
        }
        return this.i;
    }

    public RI b() {
        return this.c;
    }

    public List c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List e() {
        return this.g;
    }

    public List f() {
        return this.d;
    }

    public C0537Ci1 g() {
        return this.a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }

    public C7988ri1(C0537Ci1 c0537Ci1, String str, RI ri, List list, List list2) {
        this.a = c0537Ci1;
        this.b = str;
        this.c = ri;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(((C7988ri1) it.next()).f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String strA = ((AbstractC1585Mi1) list.get(i)).a();
            this.e.add(strA);
            this.f.add(strA);
        }
    }
}
