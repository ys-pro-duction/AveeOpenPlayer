package com.daaw;

import android.graphics.Path;
import com.daaw.C1069Hj0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.Ij0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1173Ij0 implements InterfaceC6648mt0, XT {
    public final String d;
    public final C1069Hj0 f;
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final List e = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.Ij0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C1069Hj0.a.values().length];
            a = iArr;
            try {
                iArr[C1069Hj0.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C1069Hj0.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C1069Hj0.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C1069Hj0.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C1069Hj0.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C1173Ij0(C1069Hj0 c1069Hj0) {
        this.d = c1069Hj0.c();
        this.f = c1069Hj0;
    }

    public final void a() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(((InterfaceC6648mt0) this.e.get(i)).i());
        }
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
        for (int i = 0; i < this.e.size(); i++) {
            ((InterfaceC6648mt0) this.e.get(i)).b(list, list2);
        }
    }

    public final void c(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            InterfaceC6648mt0 interfaceC6648mt0 = (InterfaceC6648mt0) this.e.get(size);
            if (interfaceC6648mt0 instanceof C3276as) {
                C3276as c3276as = (C3276as) interfaceC6648mt0;
                List listK = c3276as.k();
                for (int size2 = listK.size() - 1; size2 >= 0; size2--) {
                    Path pathI = ((InterfaceC6648mt0) listK.get(size2)).i();
                    pathI.transform(c3276as.l());
                    this.b.addPath(pathI);
                }
            } else {
                this.b.addPath(interfaceC6648mt0.i());
            }
        }
        InterfaceC6648mt0 interfaceC6648mt02 = (InterfaceC6648mt0) this.e.get(0);
        if (interfaceC6648mt02 instanceof C3276as) {
            C3276as c3276as2 = (C3276as) interfaceC6648mt02;
            List listK2 = c3276as2.k();
            for (int i = 0; i < listK2.size(); i++) {
                Path pathI2 = ((InterfaceC6648mt0) listK2.get(i)).i();
                pathI2.transform(c3276as2.l());
                this.a.addPath(pathI2);
            }
        } else {
            this.a.set(interfaceC6648mt02.i());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // com.daaw.XT
    public void f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) listIterator.previous();
            if (interfaceC2371Tr instanceof InterfaceC6648mt0) {
                this.e.add((InterfaceC6648mt0) interfaceC2371Tr);
                listIterator.remove();
            }
        }
    }

    @Override // com.daaw.InterfaceC6648mt0
    public Path i() {
        this.c.reset();
        if (this.f.d()) {
            return this.c;
        }
        int i = a.a[this.f.b().ordinal()];
        if (i == 1) {
            a();
        } else if (i == 2) {
            c(Path.Op.UNION);
        } else if (i == 3) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            c(Path.Op.INTERSECT);
        } else if (i == 5) {
            c(Path.Op.XOR);
        }
        return this.c;
    }
}
