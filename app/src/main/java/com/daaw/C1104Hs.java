package com.daaw;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.daaw.AbstractC8081s2;
import com.daaw.C5004h20;
import com.daaw.avee.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1104Hs {
    public static C10217zg1 e = new C10217zg1();
    public static C0321Ag1 f = new C0321Ag1();
    public static C10217zg1 g = new C10217zg1();
    public static C9938yg1 h = new C9938yg1();
    public static final Object i = new Object();
    public static C1104Hs j = null;
    public HashMap a = new HashMap();
    public HashMap b = new HashMap();
    public boolean c = false;
    public AbstractC8081s2 d;

    /* JADX INFO: renamed from: com.daaw.Hs$a */
    public class a implements AbstractC8081s2.a {
        public List a;

        @Override // com.daaw.AbstractC8081s2.a
        public boolean a(AbstractC8081s2 abstractC8081s2, Menu menu) {
            return false;
        }

        @Override // com.daaw.AbstractC8081s2.a
        public boolean b(AbstractC8081s2 abstractC8081s2, Menu menu) {
            C1104Hs.this.c = false;
            abstractC8081s2.f().inflate(ED0.a, menu);
            menu.findItem(AbstractC5056hD0.e).getSubMenu();
            return true;
        }

        @Override // com.daaw.AbstractC8081s2.a
        public void c(AbstractC8081s2 abstractC8081s2) {
            C1104Hs.this.d = null;
            if (!C1104Hs.this.c) {
                C1104Hs.this.g();
            }
            C1104Hs.e.a(Boolean.FALSE);
        }

        @Override // com.daaw.AbstractC8081s2.a
        public boolean d(AbstractC8081s2 abstractC8081s2, MenuItem menuItem) {
            if (menuItem.getItemId() != AbstractC5056hD0.e) {
                int itemId = menuItem.getItemId() - 10;
                if (itemId < 0 || itemId >= C1104Hs.this.a.size() || !C1104Hs.this.i((AbstractC3043a20) this.a.get(itemId))) {
                    return false;
                }
                abstractC8081s2.c();
                return true;
            }
            SubMenu subMenu = menuItem.getSubMenu();
            subMenu.clear();
            int size = C1104Hs.this.b.size();
            this.a.clear();
            if (size > 0) {
                for (Map.Entry entry : C1104Hs.this.a.entrySet()) {
                    AbstractC0441Bk1.c("" + ((AbstractC3043a20) entry.getKey()).toString() + " count: " + entry.getValue());
                    if (((Integer) entry.getValue()).intValue() == size && ((AbstractC3043a20) entry.getKey()).e() && ((size == 1 && ((AbstractC3043a20) entry.getKey()).g()) || (size > 1 && ((AbstractC3043a20) entry.getKey()).f()))) {
                        this.a.add((AbstractC3043a20) entry.getKey());
                    }
                }
            }
            for (int i = 0; i < this.a.size(); i++) {
                subMenu.add(0, i + 10, ((AbstractC3043a20) this.a.get(i)).c(), ((AbstractC3043a20) this.a.get(i)).d());
            }
            return true;
        }

        public a() {
            this.a = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hs$b */
    public class b {
        public AbstractC7524q2[] a;
        public Object b;

        public b() {
        }
    }

    public static C1104Hs j() {
        C1104Hs c1104Hs;
        C1104Hs c1104Hs2 = j;
        if (c1104Hs2 != null) {
            return c1104Hs2;
        }
        synchronized (i) {
            try {
                if (j == null) {
                    j = new C1104Hs();
                }
                c1104Hs = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1104Hs;
    }

    public final void g() {
        h.a();
        this.a.clear();
        this.b.clear();
    }

    public void h(C5004h20.a aVar) {
        f.a(aVar, Boolean.FALSE);
        b bVar = (b) this.b.remove(aVar);
        if (bVar != null) {
            for (AbstractC7524q2 abstractC7524q2 : bVar.a) {
                AbstractC3043a20 abstractC3043a20B = abstractC7524q2.b();
                Integer num = (Integer) this.a.get(abstractC3043a20B);
                if (num != null) {
                    int iIntValue = num.intValue() - 1;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    if (iIntValue > 0) {
                        this.a.put(abstractC3043a20B, numValueOf);
                    } else {
                        this.a.remove(abstractC3043a20B);
                    }
                }
            }
        }
        n();
    }

    public boolean i(AbstractC3043a20 abstractC3043a20) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.b.values().iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            b bVar = (b) it.next();
            AbstractC7524q2[] abstractC7524q2Arr = bVar.a;
            int length = abstractC7524q2Arr.length;
            while (true) {
                if (i2 < length) {
                    AbstractC7524q2 abstractC7524q2 = abstractC7524q2Arr[i2];
                    if (abstractC7524q2.b().equals(abstractC3043a20)) {
                        arrayList2.add(bVar.b);
                        arrayList.add(abstractC7524q2);
                        break;
                    }
                    i2++;
                }
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        abstractC3043a20.b(arrayList2, arrayList);
        return true;
    }

    public void k() {
        AbstractC8081s2 abstractC8081s2 = this.d;
        if (abstractC8081s2 != null) {
            this.c = true;
            abstractC8081s2.c();
            this.d = null;
        }
    }

    public void l(AbstractC7524q2[] abstractC7524q2Arr, Boolean bool, C5004h20.a aVar) {
        Object objD = aVar.d();
        if (!bool.booleanValue()) {
            h(aVar);
            return;
        }
        b bVar = new b();
        bVar.a = abstractC7524q2Arr;
        bVar.b = objD;
        m(aVar, bVar);
    }

    public void m(C5004h20.a aVar, b bVar) {
        f.a(aVar, Boolean.TRUE);
        this.b.put(aVar, bVar);
        HashMap map = new HashMap();
        for (AbstractC7524q2 abstractC7524q2 : bVar.a) {
            AbstractC3043a20 abstractC3043a20B = abstractC7524q2.b();
            if (((Integer) map.get(abstractC3043a20B)) != null) {
                AbstractC6278lb.k("There can only be unique ItemActionBase actions per item");
            } else {
                map.put(abstractC3043a20B, 1);
                Integer num = (Integer) this.a.get(abstractC3043a20B);
                if (num == null) {
                    num = 0;
                }
                this.a.put(abstractC3043a20B, Integer.valueOf(num.intValue() + 1));
            }
        }
        n();
    }

    public void n() {
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 == null) {
            this.c = true;
            AbstractC8081s2 abstractC8081s2 = this.d;
            if (abstractC8081s2 != null) {
                abstractC8081s2.c();
                return;
            }
            return;
        }
        if (this.b.size() <= 0) {
            AbstractC8081s2 abstractC8081s22 = this.d;
            if (abstractC8081s22 != null) {
                abstractC8081s22.c();
            }
        } else if (this.d == null) {
            this.d = mainActivityE1.x0(new a());
            e.a(Boolean.TRUE);
        }
        AbstractC8081s2 abstractC8081s23 = this.d;
        if (abstractC8081s23 != null) {
            abstractC8081s23.r(mainActivityE1.getString(JD0.k5, Integer.valueOf(this.b.size())));
        }
    }
}
