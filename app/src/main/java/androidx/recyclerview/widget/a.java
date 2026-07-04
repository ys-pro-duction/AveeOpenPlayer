package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.daaw.C1437Kx0;
import com.daaw.InterfaceC1229Ix0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h.a {
    public InterfaceC1229Ix0 a;
    public final ArrayList b;
    public final ArrayList c;
    public final InterfaceC0026a d;
    public Runnable e;
    public final boolean f;
    public final h g;
    public int h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0026a {
        void a(int i, int i2);

        void b(b bVar);

        void c(int i, int i2, Object obj);

        void d(b bVar);

        RecyclerView.D e(int i);

        void f(int i, int i2);

        void g(int i, int i2);

        void h(int i, int i2);
    }

    public static final class b {
        public int a;
        public int b;
        public Object c;
        public int d;

        public b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public String a() {
            int i = this.a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
        }
    }

    public a(InterfaceC0026a interfaceC0026a) {
        this(interfaceC0026a, false);
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f) {
            return;
        }
        bVar.c = null;
        this.a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i, int i2, int i3, Object obj) {
        b bVar = (b) this.a.b();
        if (bVar == null) {
            return new b(i, i2, i3, obj);
        }
        bVar.a = i;
        bVar.b = i2;
        bVar.d = i3;
        bVar.c = obj;
        return bVar;
    }

    public final void c(b bVar) {
        s(bVar);
    }

    public final void d(b bVar) {
        s(bVar);
    }

    public int e(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.b.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.b;
                    if (i4 <= i) {
                        int i5 = bVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.b;
                    if (i6 == i) {
                        i = bVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    public final void f(b bVar) {
        boolean z;
        byte b2;
        int i = bVar.b;
        int i2 = bVar.d + i;
        byte b3 = -1;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.d.e(i3) != null || h(i3)) {
                if (b3 == 0) {
                    k(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 1;
            } else {
                if (b3 == 1) {
                    s(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            b3 = b2;
        }
        if (i4 != bVar.d) {
            a(bVar);
            bVar = b(2, i, i4, null);
        }
        if (b3 == 0) {
            k(bVar);
        } else {
            s(bVar);
        }
    }

    public final void g(b bVar) {
        int i = bVar.b;
        int i2 = bVar.d + i;
        int i3 = i;
        byte b2 = -1;
        int i4 = 0;
        while (i < i2) {
            if (this.d.e(i) != null || h(i)) {
                if (b2 == 0) {
                    k(b(4, i3, i4, bVar.c));
                    i3 = i;
                    i4 = 0;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    s(b(4, i3, i4, bVar.c));
                    i3 = i;
                    i4 = 0;
                }
                b2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.d) {
            Object obj = bVar.c;
            a(bVar);
            bVar = b(4, i3, i4, obj);
        }
        if (b2 == 0) {
            k(bVar);
        } else {
            s(bVar);
        }
    }

    public final boolean h(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (n(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.d.d((b) this.c.get(i));
        }
        u(this.c);
        this.h = 0;
    }

    public void j() {
        i();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                this.d.d(bVar);
                this.d.g(bVar.b, bVar.d);
            } else if (i2 == 2) {
                this.d.d(bVar);
                this.d.h(bVar.b, bVar.d);
            } else if (i2 == 4) {
                this.d.d(bVar);
                this.d.c(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                this.d.d(bVar);
                this.d.a(bVar.b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        u(this.b);
        this.h = 0;
    }

    public final void k(b bVar) {
        int i;
        int i2 = bVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iW = w(bVar.b, i2);
        int i3 = bVar.b;
        int i4 = bVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.d; i6++) {
            int iW2 = w(bVar.b + (i * i6), bVar.a);
            int i7 = bVar.a;
            if (i7 == 2 ? iW2 != iW : !(i7 == 4 && iW2 == iW + 1)) {
                b bVarB = b(i7, iW, i5, bVar.c);
                l(bVarB, i3);
                a(bVarB);
                if (bVar.a == 4) {
                    i3 += i5;
                }
                iW = iW2;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = bVar.c;
        a(bVar);
        if (i5 > 0) {
            b bVarB2 = b(bVar.a, iW, i5, obj);
            l(bVarB2, i3);
            a(bVarB2);
        }
    }

    public void l(b bVar, int i) {
        this.d.b(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            this.d.h(i, bVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.d.c(i, bVar.d, bVar.c);
        }
    }

    public int m(int i) {
        return n(i, 0);
    }

    public int n(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = (b) this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean o(int i) {
        return (i & this.h) != 0;
    }

    public boolean p() {
        return this.b.size() > 0;
    }

    public boolean q() {
        return (this.c.isEmpty() || this.b.isEmpty()) ? false : true;
    }

    public boolean r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(b(4, i, i2, obj));
        this.h |= 4;
        return this.b.size() == 1;
    }

    public final void s(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            this.d.g(bVar.b, bVar.d);
            return;
        }
        if (i == 2) {
            this.d.f(bVar.b, bVar.d);
            return;
        }
        if (i == 4) {
            this.d.c(bVar.b, bVar.d, bVar.c);
        } else {
            if (i == 8) {
                this.d.a(bVar.b, bVar.d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void t() {
        this.g.b(this.b);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.b.clear();
    }

    public void u(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((b) list.get(i));
        }
        list.clear();
    }

    public void v() {
        u(this.b);
        u(this.c);
        this.h = 0;
    }

    public final int w(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.c.get(size);
            int i5 = bVar.a;
            if (i5 == 8) {
                int i6 = bVar.b;
                int i7 = bVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.b = i6 + 1;
                            bVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.b = i6 - 1;
                            bVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.d;
                    } else if (i5 == 2) {
                        i += bVar.d;
                    }
                } else if (i2 == 1) {
                    bVar.b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.b = i8 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.c.get(size2);
            if (bVar2.a == 8) {
                int i9 = bVar2.d;
                if (i9 == bVar2.b || i9 < 0) {
                    this.c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    public a(InterfaceC0026a interfaceC0026a, boolean z) {
        this.a = new C1437Kx0(30);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = 0;
        this.d = interfaceC0026a;
        this.f = z;
        this.g = new h(this);
    }
}
