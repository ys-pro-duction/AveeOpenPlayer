package com.google.android.material.carousel;

import com.daaw.AbstractC6991o7;
import com.daaw.InterfaceC1276Jj;
import com.google.android.material.carousel.a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public final a a;
    public final List b;
    public final List c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public b(a aVar, List list, List list2) {
        this.a = aVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        float f = ((a) list.get(list.size() - 1)).c().a - aVar.c().a;
        this.f = f;
        float f2 = aVar.h().a - ((a) list2.get(list2.size() - 1)).h().a;
        this.g = f2;
        this.d = j(f, list, true);
        this.e = j(f2, list2, false);
    }

    public static int a(a aVar) {
        for (int i = 0; i < aVar.e().size(); i++) {
            if (((a.c) aVar.e().get(i)).b >= 0.0f) {
                return i;
            }
        }
        return -1;
    }

    public static int b(a aVar, float f) {
        for (int iG = aVar.g(); iG < aVar.e().size(); iG++) {
            if (f == ((a.c) aVar.e().get(iG)).c) {
                return iG;
            }
        }
        return aVar.e().size() - 1;
    }

    public static int c(InterfaceC1276Jj interfaceC1276Jj, a aVar) {
        for (int size = aVar.e().size() - 1; size >= 0; size--) {
            if (((a.c) aVar.e().get(size)).b <= interfaceC1276Jj.a()) {
                return size;
            }
        }
        return -1;
    }

    public static int d(a aVar, float f) {
        for (int iB = aVar.b() - 1; iB >= 0; iB--) {
            if (f == ((a.c) aVar.e().get(iB)).c) {
                return iB;
            }
        }
        return 0;
    }

    public static b e(InterfaceC1276Jj interfaceC1276Jj, a aVar) {
        return new b(aVar, k(aVar), l(interfaceC1276Jj, aVar));
    }

    public static float[] j(float f, List list, boolean z) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            a aVar = (a) list.get(i2);
            a aVar2 = (a) list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? aVar2.c().a - aVar.c().a : aVar.h().a - aVar2.h().a) / f);
            i++;
        }
        return fArr;
    }

    public static List k(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        int iA = a(aVar);
        if (!m(aVar) && iA != -1) {
            int iB = (aVar.b() - 1) - iA;
            float f = aVar.c().b - (aVar.c().d / 2.0f);
            for (int i = 0; i <= iB; i++) {
                a aVar2 = (a) arrayList.get(arrayList.size() - 1);
                int size = aVar.e().size() - 1;
                int i2 = (iA + i) - 1;
                if (i2 >= 0) {
                    size = b(aVar2, ((a.c) aVar.e().get(i2)).c) - 1;
                }
                arrayList.add(p(aVar2, iA, size, f, (aVar.b() - i) - 1, (aVar.g() - i) - 1));
            }
        }
        return arrayList;
    }

    public static List l(InterfaceC1276Jj interfaceC1276Jj, a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        int iC = c(interfaceC1276Jj, aVar);
        if (!n(interfaceC1276Jj, aVar) && iC != -1) {
            int iG = iC - aVar.g();
            float f = aVar.c().b - (aVar.c().d / 2.0f);
            for (int i = 0; i < iG; i++) {
                a aVar2 = (a) arrayList.get(arrayList.size() - 1);
                int i2 = (iC - i) + 1;
                arrayList.add(p(aVar2, iC, i2 < aVar.e().size() ? d(aVar2, ((a.c) aVar.e().get(i2)).c) + 1 : 0, f, aVar.b() + i + 1, aVar.g() + i + 1));
            }
        }
        return arrayList;
    }

    public static boolean m(a aVar) {
        return aVar.a().b - (aVar.a().d / 2.0f) <= 0.0f || aVar.a() == aVar.c();
    }

    public static boolean n(InterfaceC1276Jj interfaceC1276Jj, a aVar) {
        return aVar.f().b + (aVar.f().d / 2.0f) >= ((float) interfaceC1276Jj.a()) || aVar.f() == aVar.h();
    }

    public static a o(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return a.i((a) list.get(i - 1), (a) list.get(i), AbstractC6991o7.b(0.0f, 1.0f, f2, f3, f));
            }
            i++;
            f2 = f3;
        }
        return (a) list.get(0);
    }

    public static a p(a aVar, int i, int i2, float f, int i3, int i4) {
        ArrayList arrayList = new ArrayList(aVar.e());
        arrayList.add(i2, (a.c) arrayList.remove(i));
        a.b bVar = new a.b(aVar.d());
        int i5 = 0;
        while (i5 < arrayList.size()) {
            a.c cVar = (a.c) arrayList.get(i5);
            float f2 = cVar.d;
            bVar.b((f2 / 2.0f) + f, cVar.c, f2, i5 >= i3 && i5 <= i4);
            f += cVar.d;
            i5++;
        }
        return bVar.e();
    }

    public a f() {
        return this.a;
    }

    public a g() {
        return (a) this.b.get(r0.size() - 1);
    }

    public a h() {
        return (a) this.c.get(r0.size() - 1);
    }

    public a i(float f, float f2, float f3) {
        float f4 = this.f + f2;
        float f5 = f3 - this.g;
        if (f < f4) {
            return o(this.b, AbstractC6991o7.b(1.0f, 0.0f, f2, f4, f), this.d);
        }
        if (f <= f5) {
            return this.a;
        }
        return o(this.c, AbstractC6991o7.b(0.0f, 1.0f, f5, f3, f), this.e);
    }
}
