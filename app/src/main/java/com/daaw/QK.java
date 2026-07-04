package com.daaw;

import com.daaw.C10270zr;
import com.daaw.NU0;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class QK {
    public static Comparator a = new a();
    public static Comparator b = new b();
    public static Comparator c = new c();
    public static Comparator d = new d();

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C10270zr.s sVar, C10270zr.s sVar2) {
            return sVar.l().compareTo(sVar2.l());
        }
    }

    public class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C10270zr.s sVar, C10270zr.s sVar2) {
            return sVar.m().compareTo(sVar2.m());
        }
    }

    public class c implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C10270zr.s sVar, C10270zr.s sVar2) {
            return QK.a(sVar.k(), sVar2.k());
        }
    }

    public class d implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C10270zr.s sVar, C10270zr.s sVar2) {
            return QK.a(sVar.h(), sVar2.h());
        }
    }

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static Comparator b(NU0.h hVar, int i) {
        int i2 = hVar.a;
        if (i2 != 8) {
            i = i2;
        }
        return c(hVar, i);
    }

    public static Comparator c(NU0.h hVar, int i) {
        Comparator comparator = null;
        if (hVar == null) {
            return null;
        }
        boolean z = hVar.b;
        switch (hVar.a) {
            case 0:
                comparator = a;
                break;
            case 1:
                comparator = a;
                break;
            case 2:
                comparator = a;
                break;
            case 3:
                comparator = b;
                break;
            case 4:
                comparator = c;
                z = !z;
                break;
            case 5:
                comparator = c;
                z = !z;
                break;
            case 6:
                comparator = d;
                z = !z;
                break;
            case 7:
                comparator = d;
                z = !z;
                break;
            case 8:
                comparator = a;
                break;
        }
        return (comparator == null || !z) ? comparator : Collections.reverseOrder(comparator);
    }
}
