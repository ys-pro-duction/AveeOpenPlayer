package com.daaw;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.firestore.c;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.daaw.nb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6838nb1 {
    public static final Random a = new SecureRandom();
    public static final InterfaceC1519Ls b = new InterfaceC1519Ls() { // from class: com.daaw.gb1
        @Override // com.daaw.InterfaceC1519Ls
        public final Object a(AbstractC6963o11 abstractC6963o11) {
            return AbstractC6838nb1.d(abstractC6963o11);
        }
    };

    public static /* synthetic */ Void d(AbstractC6963o11 abstractC6963o11) throws Exception {
        if (abstractC6963o11.n()) {
            return (Void) abstractC6963o11.k();
        }
        Exception excO = o(abstractC6963o11.j());
        if (excO instanceof com.google.firebase.firestore.c) {
            throw excO;
        }
        throw new com.google.firebase.firestore.c(excO.getMessage(), c.a.UNKNOWN, excO);
    }

    public static Object e(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static List f(int i, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        Collections.addAll(arrayList, objArr);
        for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
            Object obj3 = arrayList.get(i2);
            if (!(obj3 instanceof String) && !(obj3 instanceof C6767nK)) {
                throw new IllegalArgumentException("Excepted field name at argument position " + (i2 + i + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
            }
        }
        return arrayList;
    }

    public static Comparator g() {
        return new Comparator() { // from class: com.daaw.ib1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        };
    }

    public static int h(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static int i(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return l(bArr.length, bArr2.length);
    }

    public static int j(AbstractC4340ei abstractC4340ei, AbstractC4340ei abstractC4340ei2) {
        int iMin = Math.min(abstractC4340ei.size(), abstractC4340ei2.size());
        for (int i = 0; i < iMin; i++) {
            int iW = abstractC4340ei.w(i) & 255;
            int iW2 = abstractC4340ei2.w(i) & 255;
            if (iW < iW2) {
                return -1;
            }
            if (iW > iW2) {
                return 1;
            }
        }
        return l(abstractC4340ei.size(), abstractC4340ei2.size());
    }

    public static int k(double d, double d2) {
        return AbstractC4665fp0.c(d, d2);
    }

    public static int l(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int m(long j, long j2) {
        return AbstractC4665fp0.a(j, j2);
    }

    public static int n(double d, long j) {
        return AbstractC4665fp0.b(d, j);
    }

    public static Exception o(Exception exc) {
        return exc instanceof C6541mX0 ? s(((C6541mX0) exc).a()) : exc instanceof C7657qX0 ? s(((C7657qX0) exc).a()) : exc;
    }

    public static void p(final RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.daaw.hb1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6838nb1.c(runtimeException);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0025 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void q(java.util.Iterator r5, java.util.Iterator r6, java.util.Comparator r7, com.daaw.InterfaceC8310sr r8, com.daaw.InterfaceC8310sr r9) {
        /*
            java.lang.Object r0 = e(r5)
            java.lang.Object r1 = e(r6)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1e
            if (r1 == 0) goto L1e
            int r4 = r7.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L23
        L1b:
            if (r4 <= 0) goto L22
            goto L21
        L1e:
            if (r0 == 0) goto L21
            goto L23
        L21:
            r2 = 1
        L22:
            r3 = 0
        L23:
            if (r2 == 0) goto L2d
            r8.accept(r1)
            java.lang.Object r1 = e(r6)
            goto L8
        L2d:
            if (r3 == 0) goto L37
            r9.accept(r0)
            java.lang.Object r0 = e(r5)
            goto L8
        L37:
            java.lang.Object r0 = e(r5)
            java.lang.Object r1 = e(r6)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6838nb1.q(java.util.Iterator, java.util.Iterator, java.util.Comparator, com.daaw.sr, com.daaw.sr):void");
    }

    public static void r(SortedSet sortedSet, SortedSet sortedSet2, InterfaceC8310sr interfaceC8310sr, InterfaceC8310sr interfaceC8310sr2) {
        q(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new Comparator() { // from class: com.daaw.jb1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        }, interfaceC8310sr, interfaceC8310sr2);
    }

    public static com.google.firebase.firestore.c s(C6262lX0 c6262lX0) {
        C6541mX0 c6541mX0C = c6262lX0.c();
        return new com.google.firebase.firestore.c(c6541mX0C.getMessage(), c.a.c(c6262lX0.m().g()), c6541mX0C);
    }

    public static Map t(Map map, int i, final Comparator comparator) {
        if (map.size() <= i) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: com.daaw.kb1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
            }
        });
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            map2.put(((Map.Entry) arrayList.get(i2)).getKey(), ((Map.Entry) arrayList.get(i2)).getValue());
        }
        return map2;
    }

    public static StringBuilder u(CharSequence charSequence, int i, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            sb.append(charSequence);
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String v(AbstractC4340ei abstractC4340ei) {
        int size = abstractC4340ei.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i = 0; i < size; i++) {
            byte bW = abstractC4340ei.w(i);
            sb.append(Character.forDigit((bW & 255) >>> 4, 16));
            sb.append(Character.forDigit(bW & 15, 16));
        }
        return sb.toString();
    }

    public static String w(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    public static InterfaceC1519Ls x() {
        return b;
    }

    public static /* synthetic */ void c(RuntimeException runtimeException) {
        throw runtimeException;
    }
}
