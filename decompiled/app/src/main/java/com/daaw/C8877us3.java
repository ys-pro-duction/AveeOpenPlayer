package com.daaw;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.us3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8877us3 extends AbstractC10279zs3 implements Wf3 {
    public static final DQ2 k = DQ2.b(new Comparator() { // from class: com.daaw.Gr3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            DQ2 dq2 = C8877us3.k;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public static final DQ2 l = DQ2.b(new Comparator() { // from class: com.daaw.Hr3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            DQ2 dq2 = C8877us3.k;
            return 0;
        }
    });
    public final Object d;
    public final Context e;
    public final boolean f;
    public Vr3 g;
    public C6925ns3 h;
    public C7965rd3 i;
    public final Cr3 j;

    public C8877us3(Context context) {
        Cr3 cr3 = new Cr3();
        Vr3 vr3D = Vr3.d(context);
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.j = cr3;
        this.g = vr3D;
        this.i = C7965rd3.c;
        boolean z = false;
        if (context != null && AbstractC9004vJ2.h(context)) {
            z = true;
        }
        this.f = z;
        if (!z && context != null && AbstractC9004vJ2.a >= 32) {
            this.h = C6925ns3.a(context);
        }
        if (this.g.q0 && context == null) {
            AbstractC3305ay2.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int k(C2485Ut1 c2485Ut1, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c2485Ut1.c)) {
            return 4;
        }
        String strO = o(str);
        String strO2 = o(c2485Ut1.c);
        if (strO2 == null || strO == null) {
            return (z && strO2 == null) ? 1 : 0;
        }
        if (strO2.startsWith(strO) || strO.startsWith(strO2)) {
            return 3;
        }
        int i = AbstractC9004vJ2.a;
        return strO2.split("-", 2)[0].equals(strO.split("-", 2)[0]) ? 2 : 0;
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean r(com.daaw.C8877us3 r8, com.daaw.C2485Ut1 r9) {
        /*
            java.lang.Object r0 = r8.d
            monitor-enter(r0)
            com.daaw.Vr3 r1 = r8.g     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.q0     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            if (r1 == 0) goto L90
            boolean r1 = r8.f     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L90
            int r1 = r9.y     // Catch: java.lang.Throwable -> L8e
            r3 = 2
            if (r1 <= r3) goto L90
            java.lang.String r1 = r9.l     // Catch: java.lang.Throwable -> L8e
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.daaw.AbstractC9004vJ2.a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L90
            com.daaw.ns3 r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L90
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L90
        L65:
            int r1 = com.daaw.AbstractC9004vJ2.a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L8c
            com.daaw.ns3 r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r3 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L8c
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.daaw.ns3 r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.daaw.ns3 r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            com.daaw.rd3 r8 = r8.i     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.d(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
            goto L90
        L8c:
            r2 = 0
            goto L90
        L8e:
            r8 = move-exception
            goto L92
        L90:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L92:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8877us3.r(com.daaw.us3, com.daaw.Ut1):boolean");
    }

    public static boolean s(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static void t(C6362lr3 c6362lr3, R92 r92, Map map) {
        for (int i = 0; i < c6362lr3.a; i++) {
            AbstractC6314li0.a(r92.z.get(c6362lr3.b(i)));
        }
    }

    public static final Pair v(int i, C10000ys3 c10000ys3, int[][][] iArr, InterfaceC7483ps3 interfaceC7483ps3, Comparator comparator) {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == c10000ys3.c(i2)) {
                C6362lr3 c6362lr3D = c10000ys3.d(i2);
                for (int i3 = 0; i3 < c6362lr3D.a; i3++) {
                    A62 a62B = c6362lr3D.b(i3);
                    List listA = interfaceC7483ps3.a(i2, a62B, iArr[i2][i3]);
                    int i4 = a62B.a;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (i6 <= 0) {
                        int i7 = i6 + 1;
                        AbstractC7762qs3 abstractC7762qs3 = (AbstractC7762qs3) listA.get(i6);
                        int iA = abstractC7762qs3.a();
                        if (!zArr[i6] && iA != 0) {
                            if (iA == i5) {
                                arrayList = OP2.K(abstractC7762qs3);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(abstractC7762qs3);
                                for (int i8 = i7; i8 <= 0; i8++) {
                                    AbstractC7762qs3 abstractC7762qs32 = (AbstractC7762qs3) listA.get(i8);
                                    if (abstractC7762qs32.a() == 2 && abstractC7762qs3.c(abstractC7762qs32)) {
                                        arrayList.add(abstractC7762qs32);
                                        zArr[i8] = true;
                                    }
                                }
                            }
                            arrayList2.add(arrayList);
                        }
                        i6 = i7;
                        i5 = 1;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((AbstractC7762qs3) list.get(i9)).D;
        }
        AbstractC7762qs3 abstractC7762qs33 = (AbstractC7762qs3) list.get(0);
        return Pair.create(new C9163vs3(abstractC7762qs33.C, iArr2, 0), Integer.valueOf(abstractC7762qs33.B));
    }

    @Override // com.daaw.Cs3
    public final void b() {
        C6925ns3 c6925ns3;
        synchronized (this.d) {
            try {
                if (AbstractC9004vJ2.a >= 32 && (c6925ns3 = this.h) != null) {
                    c6925ns3.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.b();
    }

    @Override // com.daaw.Cs3
    public final void c(C7965rd3 c7965rd3) {
        boolean zEquals;
        synchronized (this.d) {
            zEquals = this.i.equals(c7965rd3);
            this.i = c7965rd3;
        }
        if (zEquals) {
            return;
        }
        u();
    }

    @Override // com.daaw.Cs3
    public final boolean d() {
        return true;
    }

    @Override // com.daaw.AbstractC10279zs3
    public final Pair j(C10000ys3 c10000ys3, int[][][] iArr, final int[] iArr2, Vp3 vp3, AbstractC8657u52 abstractC8657u52) {
        final Vr3 vr3;
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        C6925ns3 c6925ns3;
        synchronized (this.d) {
            try {
                vr3 = this.g;
                if (vr3.q0 && AbstractC9004vJ2.a >= 32 && (c6925ns3 = this.h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    AbstractC6048km2.b(looperMyLooper);
                    c6925ns3.b(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = 2;
        C9163vs3[] c9163vs3Arr = new C9163vs3[2];
        Pair pairV = v(2, c10000ys3, iArr, new InterfaceC7483ps3() { // from class: com.daaw.Lr3
            /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
            @Override // com.daaw.InterfaceC7483ps3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List a(int r18, com.daaw.A62 r19, int[] r20) {
                /*
                    Method dump skipped, instruction units count: 205
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.Lr3.a(int, com.daaw.A62, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.daaw.Mr3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                DP2 dp2I = DP2.i();
                C8040rs3 c8040rs3 = new Comparator() { // from class: com.daaw.rs3
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return C8598ts3.h((C8598ts3) obj3, (C8598ts3) obj4);
                    }
                };
                DP2 dp2B = dp2I.c((C8598ts3) Collections.max(list, c8040rs3), (C8598ts3) Collections.max(list2, c8040rs3), c8040rs3).b(list.size(), list2.size());
                C8319ss3 c8319ss3 = new Comparator() { // from class: com.daaw.ss3
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return C8598ts3.g((C8598ts3) obj3, (C8598ts3) obj4);
                    }
                };
                return dp2B.c((C8598ts3) Collections.max(list, c8319ss3), (C8598ts3) Collections.max(list2, c8319ss3), c8319ss3).a();
            }
        });
        if (pairV != null) {
            c9163vs3Arr[((Integer) pairV.second).intValue()] = (C9163vs3) pairV.first;
        }
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                z = false;
                break;
            }
            if (c10000ys3.c(i3) == 2 && c10000ys3.d(i3).a > 0) {
                z = true;
                break;
            }
            i3++;
        }
        Pair pairV2 = v(1, c10000ys3, iArr, new InterfaceC7483ps3() { // from class: com.daaw.Jr3
            @Override // com.daaw.InterfaceC7483ps3
            public final List a(int i4, A62 a62, int[] iArr4) {
                final C8877us3 c8877us3 = this.a;
                InterfaceC5661jO2 interfaceC5661jO2 = new InterfaceC5661jO2() { // from class: com.daaw.Ir3
                    @Override // com.daaw.InterfaceC5661jO2
                    public final boolean zza(Object obj) {
                        return C8877us3.r(c8877us3, (C2485Ut1) obj);
                    }
                };
                LP2 lp2 = new LP2();
                int i5 = 0;
                while (true) {
                    int i6 = a62.a;
                    if (i5 > 0) {
                        return lp2.j();
                    }
                    lp2.g(new Pr3(i4, a62, i5, vr3, iArr4[i5], z, interfaceC5661jO2));
                    i5++;
                }
            }
        }, new Comparator() { // from class: com.daaw.Kr3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Pr3) Collections.max((List) obj)).g((Pr3) Collections.max((List) obj2));
            }
        });
        if (pairV2 != null) {
            c9163vs3Arr[((Integer) pairV2.second).intValue()] = (C9163vs3) pairV2.first;
        }
        if (pairV2 == null) {
            str = null;
        } else {
            Object obj = pairV2.first;
            str = ((C9163vs3) obj).a.b(((C9163vs3) obj).b[0]).c;
        }
        int i4 = 3;
        Pair pairV3 = v(3, c10000ys3, iArr, new InterfaceC7483ps3() { // from class: com.daaw.Nr3
            @Override // com.daaw.InterfaceC7483ps3
            public final List a(int i5, A62 a62, int[] iArr4) {
                DQ2 dq2 = C8877us3.k;
                LP2 lp2 = new LP2();
                int i6 = 0;
                while (true) {
                    int i7 = a62.a;
                    if (i6 > 0) {
                        return lp2.j();
                    }
                    lp2.g(new C7204os3(i5, a62, i6, vr3, iArr4[i6], str));
                    i6++;
                }
            }
        }, new Comparator() { // from class: com.daaw.Or3
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((C7204os3) ((List) obj2).get(0)).g((C7204os3) ((List) obj3).get(0));
            }
        });
        if (pairV3 != null) {
            c9163vs3Arr[((Integer) pairV3.second).intValue()] = (C9163vs3) pairV3.first;
        }
        int i5 = 0;
        while (i5 < i2) {
            int iC = c10000ys3.c(i5);
            if (iC != i2 && iC != i && iC != i4) {
                C6362lr3 c6362lr3D = c10000ys3.d(i5);
                int[][] iArr4 = iArr[i5];
                A62 a62 = null;
                Qr3 qr3 = null;
                for (int i6 = 0; i6 < c6362lr3D.a; i6++) {
                    A62 a62B = c6362lr3D.b(i6);
                    int[] iArr5 = iArr4[i6];
                    char c = 0;
                    while (true) {
                        int i7 = a62B.a;
                        if (c <= 0) {
                            if (s(iArr5[0], vr3.r0)) {
                                Qr3 qr32 = new Qr3(a62B.b(0), iArr5[0]);
                                if (qr3 == null || qr32.compareTo(qr3) > 0) {
                                    a62 = a62B;
                                    qr3 = qr32;
                                }
                            }
                            c = 1;
                        }
                    }
                }
                c9163vs3Arr[i5] = a62 == null ? null : new C9163vs3(a62, new int[]{0}, 0);
            }
            i5++;
            i2 = 2;
            i = 1;
            i4 = 3;
        }
        HashMap map = new HashMap();
        int i8 = 2;
        for (int i9 = 0; i9 < 2; i9++) {
            t(c10000ys3.d(i9), vr3, map);
        }
        t(c10000ys3.e(), vr3, map);
        for (int i10 = 0; i10 < 2; i10++) {
            AbstractC6314li0.a(map.get(Integer.valueOf(c10000ys3.c(i10))));
        }
        int i11 = 0;
        while (i11 < i8) {
            C6362lr3 c6362lr3D2 = c10000ys3.d(i11);
            if (vr3.g(i11, c6362lr3D2)) {
                vr3.e(i11, c6362lr3D2);
                c9163vs3Arr[i11] = null;
            }
            i11++;
            i8 = 2;
        }
        int i12 = 0;
        while (i12 < i8) {
            int iC2 = c10000ys3.c(i12);
            if (vr3.f(i12) || vr3.A.contains(Integer.valueOf(iC2))) {
                c9163vs3Arr[i12] = null;
            }
            i12++;
            i8 = 2;
        }
        Cr3 cr3 = this.j;
        Ks3 ks3G = g();
        OP2 op2A = Dr3.a(c9163vs3Arr);
        int i13 = 2;
        InterfaceC9442ws3[] interfaceC9442ws3Arr = new InterfaceC9442ws3[2];
        int i14 = 0;
        while (i14 < i13) {
            C9163vs3 c9163vs3 = c9163vs3Arr[i14];
            if (c9163vs3 != null && (length = (iArr3 = c9163vs3.b).length) != 0) {
                interfaceC9442ws3Arr[i14] = length == 1 ? new C9721xs3(c9163vs3.a, iArr3[0], 0, 0, null) : cr3.a(c9163vs3.a, iArr3, 0, ks3G, (OP2) op2A.get(i14));
            }
            i14++;
            i13 = 2;
        }
        C3220ag3[] c3220ag3Arr = new C3220ag3[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            c3220ag3Arr[i15] = (vr3.f(i15) || vr3.A.contains(Integer.valueOf(c10000ys3.c(i15))) || (c10000ys3.c(i15) != -2 && interfaceC9442ws3Arr[i15] == null)) ? null : C3220ag3.a;
        }
        return Pair.create(c3220ag3Arr, interfaceC9442ws3Arr);
    }

    public final Vr3 l() {
        Vr3 vr3;
        synchronized (this.d) {
            vr3 = this.g;
        }
        return vr3;
    }

    public final void q(Tr3 tr3) {
        boolean zEquals;
        Vr3 vr3 = new Vr3(tr3);
        synchronized (this.d) {
            zEquals = this.g.equals(vr3);
            this.g = vr3;
        }
        if (zEquals) {
            return;
        }
        if (vr3.q0 && this.e == null) {
            AbstractC3305ay2.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        i();
    }

    public final void u() {
        boolean z;
        C6925ns3 c6925ns3;
        synchronized (this.d) {
            try {
                z = false;
                if (this.g.q0 && !this.f && AbstractC9004vJ2.a >= 32 && (c6925ns3 = this.h) != null && c6925ns3.g()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            i();
        }
    }

    @Override // com.daaw.Cs3
    public final Wf3 a() {
        return this;
    }
}
