package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.daaw.BS0;
import com.daaw.C1437Kx0;
import com.daaw.C7131oe0;
import com.daaw.InterfaceC1229Ix0;

/* JADX INFO: loaded from: classes.dex */
public class p {
    public final BS0 a = new BS0();
    public final C7131oe0 b = new C7131oe0();

    public static class a {
        public static InterfaceC1229Ix0 d = new C1437Kx0(20);
        public int a;
        public RecyclerView.m.b b;
        public RecyclerView.m.b c;

        public static void a() {
            while (d.b() != null) {
            }
        }

        public static a b() {
            a aVar = (a) d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.D d);

        void b(RecyclerView.D d, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void c(RecyclerView.D d, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void d(RecyclerView.D d, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);
    }

    public void a(RecyclerView.D d, RecyclerView.m.b bVar) {
        a aVarB = (a) this.a.get(d);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d, aVarB);
        }
        aVarB.a |= 2;
        aVarB.b = bVar;
    }

    public void b(RecyclerView.D d) {
        a aVarB = (a) this.a.get(d);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d, aVarB);
        }
        aVarB.a |= 1;
    }

    public void c(long j, RecyclerView.D d) {
        this.b.k(j, d);
    }

    public void d(RecyclerView.D d, RecyclerView.m.b bVar) {
        a aVarB = (a) this.a.get(d);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d, aVarB);
        }
        aVarB.c = bVar;
        aVarB.a |= 8;
    }

    public void e(RecyclerView.D d, RecyclerView.m.b bVar) {
        a aVarB = (a) this.a.get(d);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d, aVarB);
        }
        aVarB.b = bVar;
        aVarB.a |= 4;
    }

    public void f() {
        this.a.clear();
        this.b.c();
    }

    public RecyclerView.D g(long j) {
        return (RecyclerView.D) this.b.g(j);
    }

    public boolean h(RecyclerView.D d) {
        a aVar = (a) this.a.get(d);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.D d) {
        a aVar = (a) this.a.get(d);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.D d) {
        p(d);
    }

    public final RecyclerView.m.b l(RecyclerView.D d, int i) {
        a aVar;
        RecyclerView.m.b bVar;
        int iG = this.a.g(d);
        if (iG >= 0 && (aVar = (a) this.a.n(iG)) != null) {
            int i2 = aVar.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVar.a = i3;
                if (i == 4) {
                    bVar = aVar.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.c;
                }
                if ((i3 & 12) == 0) {
                    this.a.l(iG);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    public RecyclerView.m.b m(RecyclerView.D d) {
        return l(d, 8);
    }

    public RecyclerView.m.b n(RecyclerView.D d) {
        return l(d, 4);
    }

    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.D d = (RecyclerView.D) this.a.j(size);
            a aVar = (a) this.a.l(size);
            int i = aVar.a;
            if ((i & 3) == 3) {
                bVar.a(d);
            } else if ((i & 1) != 0) {
                RecyclerView.m.b bVar2 = aVar.b;
                if (bVar2 == null) {
                    bVar.a(d);
                } else {
                    bVar.c(d, bVar2, aVar.c);
                }
            } else if ((i & 14) == 14) {
                bVar.b(d, aVar.b, aVar.c);
            } else if ((i & 12) == 12) {
                bVar.d(d, aVar.b, aVar.c);
            } else if ((i & 4) != 0) {
                bVar.c(d, aVar.b, null);
            } else if ((i & 8) != 0) {
                bVar.b(d, aVar.b, aVar.c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.D d) {
        a aVar = (a) this.a.get(d);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public void q(RecyclerView.D d) {
        int iN = this.b.n() - 1;
        while (true) {
            if (iN < 0) {
                break;
            }
            if (d == this.b.o(iN)) {
                this.b.m(iN);
                break;
            }
            iN--;
        }
        a aVar = (a) this.a.remove(d);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
