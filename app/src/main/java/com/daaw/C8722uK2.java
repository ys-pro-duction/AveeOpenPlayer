package com.daaw;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.uK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8722uK2 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final Map h = new WeakHashMap();
    public boolean i;

    public final View a(String str) {
        return (View) this.c.get(str);
    }

    public final C8443tK2 b(View view) {
        C8443tK2 c8443tK2 = (C8443tK2) this.b.get(view);
        if (c8443tK2 != null) {
            this.b.remove(view);
        }
        return c8443tK2;
    }

    public final String c(String str) {
        return (String) this.g.get(str);
    }

    public final String d(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = (String) this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public final HashSet e() {
        return this.f;
    }

    public final HashSet f() {
        return this.e;
    }

    public final void g() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public final void h() {
        this.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        Boolean bool;
        String str;
        PJ2 pj2A = PJ2.a();
        if (pj2A != null) {
            for (CJ2 cj2 : pj2A.b()) {
                View viewF = cj2.f();
                if (cj2.j()) {
                    String strH = cj2.h();
                    if (viewF != null) {
                        if (viewF.isAttachedToWindow()) {
                            if (viewF.hasWindowFocus()) {
                                this.h.remove(viewF);
                                bool = Boolean.FALSE;
                            } else if (this.h.containsKey(viewF)) {
                                bool = (Boolean) this.h.get(viewF);
                            } else {
                                Map map = this.h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(viewF, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = viewF;
                                while (true) {
                                    if (view == null) {
                                        this.d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strB = AbstractC8164sK2.b(view);
                                    if (strB != null) {
                                        str = strB;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.e.add(strH);
                            this.a.put(viewF, strH);
                            for (SJ2 sj2 : cj2.i()) {
                                View view2 = (View) sj2.b().get();
                                if (view2 != null) {
                                    C8443tK2 c8443tK2 = (C8443tK2) this.b.get(view2);
                                    if (c8443tK2 != null) {
                                        c8443tK2.c(cj2.h());
                                    } else {
                                        this.b.put(view2, new C8443tK2(sj2, cj2.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f.add(strH);
                            this.c.put(strH, viewF);
                            this.g.put(strH, str);
                        }
                    } else {
                        this.f.add(strH);
                        this.g.put(strH, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean j(View view) {
        if (!this.h.containsKey(view)) {
            return true;
        }
        this.h.put(view, Boolean.TRUE);
        return false;
    }

    public final int k(View view) {
        if (this.d.contains(view)) {
            return 1;
        }
        return this.i ? 2 : 3;
    }
}
