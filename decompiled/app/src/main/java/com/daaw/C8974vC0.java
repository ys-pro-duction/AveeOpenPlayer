package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.daaw.C2138Rl0;
import com.daaw.InterfaceC9057vX;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.vC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8974vC0 implements InterfaceC1688Ni0, InterfaceC9057vX.a {
    public static C0746Eg1 F = new C0746Eg1();
    public static C0642Dg1 G = new C0642Dg1();
    public static C0321Ag1 H = new C0321Ag1();
    public static C10217zg1 I = new C10217zg1();
    public static final Object J = new Object();
    public static volatile C8974vC0 K = null;
    public InterfaceC8771uX B = null;
    public C2138Rl0 C = new C2138Rl0();
    public InterfaceC9057vX D = new C9811yC0();
    public int E = -1;

    public C8974vC0() {
        T(0, false);
        K();
    }

    public static C8974vC0 c() {
        C8974vC0 c8974vC0;
        C8974vC0 c8974vC02 = K;
        if (c8974vC02 != null) {
            return c8974vC02;
        }
        synchronized (J) {
            try {
                c8974vC0 = K;
                if (c8974vC0 == null) {
                    c8974vC0 = new C8974vC0();
                    K = c8974vC0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8974vC0;
    }

    public static int f(int i, List list, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num.intValue() + i2 == i) {
                    return num.intValue() + i3;
                }
                if (num.intValue() + i3 == i) {
                    return num.intValue() + i2;
                }
            }
            return i;
        }
        if (i3 >= 0) {
            Iterator it2 = list.iterator();
            i4 = i;
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                if (num2.intValue() + i3 < i) {
                    i4--;
                }
                if (num2.intValue() + i3 == i) {
                    if (i2 >= 0) {
                        return num2.intValue() + i2;
                    }
                    return -1;
                }
            }
        } else {
            i4 = i;
        }
        if (i2 >= 0) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((Integer) it3.next()).intValue() + i2 <= i) {
                    i4++;
                }
            }
        }
        return i4;
    }

    public static int g(int i, int i2, int i3) {
        if (i < i2) {
            return i;
        }
        int i4 = i + i3;
        if (i4 <= i2) {
            return -1;
        }
        return i4;
    }

    public static int h(int i, int i2, int i3, int i4, boolean z) {
        if (z) {
            if (i == i3) {
                return i2;
            }
            if (i == i2) {
                return i3;
            }
        } else if (i >= i2) {
            int i5 = i + (i4 * ((i3 - i2) + 1));
            if (i5 <= i2) {
                return -1;
            }
            return i5;
        }
        return i;
    }

    public static int i(int i, List list, int i2) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (size + i2 == i) {
                i--;
            }
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static int j(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        return i(i, arrayList, i2);
    }

    private Resources n() {
        Context contextH = com.daaw.avee.a.h();
        if (contextH == null) {
            return null;
        }
        return contextH.getResources();
    }

    public void A(List list, int i, int i2, boolean z, InterfaceC8771uX interfaceC8771uX) {
        this.B = interfaceC8771uX;
        this.D.c(list, i, i2, z, this.C.size());
    }

    public void B(int i, boolean z, boolean z2, Object obj) {
        G.a((i < 0 || i >= this.C.size()) ? null : this.C.get(i), Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), obj);
    }

    public void C(C2078Qw0 c2078Qw0, boolean z, boolean z2, Object obj) {
        G.a(new B61(c2078Qw0, new AC0(-1)), -1, Boolean.valueOf(z), Boolean.valueOf(z2), obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(java.util.Collection r10, int r11, int r12, com.daaw.InterfaceC8771uX r13, java.lang.Object r14, int r15, boolean r16) {
        /*
            r9 = this;
            r7 = 0
            r8 = 1
            r2 = -1
            if (r12 != r2) goto L6
            goto L23
        L6:
            if (r12 != 0) goto La
            r2 = 0
            goto L23
        La:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r12 != r8) goto L13
        Lf:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L23
        L13:
            r4 = 2
            if (r12 != r4) goto L1f
            com.daaw.vX r1 = r9.D
            int r1 = r1.i(r8)
            int r2 = r1 + 1
            goto L23
        L1f:
            r4 = 3
            if (r12 != r4) goto L23
            goto Lf
        L23:
            if (r2 >= 0) goto L2d
            r3 = 1
        L26:
            r0 = r9
            r1 = r10
            r4 = r13
            r5 = r15
            r6 = r16
            goto L2f
        L2d:
            r3 = 0
            goto L26
        L2f:
            int r1 = r0.b(r1, r2, r3, r4, r5, r6)
            if (r11 < 0) goto L44
            com.daaw.vX r2 = r9.D
            int r1 = r1 + r11
            r2.l(r1)
            com.daaw.vX r1 = r9.D
            int r1 = r1.i(r8)
            r9.B(r1, r7, r8, r14)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8974vC0.D(java.util.Collection, int, int, com.daaw.uX, java.lang.Object, int, boolean):void");
    }

    public void E(List list, int i, int i2, InterfaceC8771uX interfaceC8771uX) {
        D(list, i, i2, interfaceC8771uX, null, 0, true);
    }

    public void F(Object obj) {
        B(this.D.i(true), false, true, obj);
    }

    public void G(Object obj) {
        this.D.j();
        B(this.D.i(true), false, true, obj);
    }

    public void H() {
        I(null);
    }

    public void I(Object obj) {
        this.D.g();
        B(this.D.i(true), false, true, obj);
    }

    public void J(List list, int i, Object obj) {
        if (i < 0 || i >= list.size()) {
            return;
        }
        C((C2078Qw0) list.get(i), false, true, obj);
    }

    public void K() {
        AbstractC0441Bk1.a("reloadQueue");
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        SharedPreferences sharedPreferencesP = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().p(contextK);
        String strP = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P(sharedPreferencesP, "queue", "");
        String strP2 = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P(sharedPreferencesP, "queueSizes", "");
        int length = strP != null ? strP.length() : 0;
        int length2 = strP2 != null ? strP2.length() : 0;
        this.C.clear();
        if (length > 1 && length2 > 0) {
            String[] strArrSplit = strP2.split(",");
            int length3 = strArrSplit.length;
            int i = 0;
            int i2 = 0;
            while (i < length3) {
                int iW = AbstractC0405Bb1.w(strArrSplit[i]) + i2;
                this.C.p(new C2078Qw0(strP.substring(i2, iW)), new AC0());
                i++;
                i2 = iW;
            }
        }
        if (this.C.size() == 0 && ((Boolean) F.a(Boolean.FALSE)).booleanValue()) {
            List listB = AbstractC1454Lb1.b(contextK, 30);
            AbstractC0441Bk1.a("getMostRecentTrackListByCount: " + listB.size());
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                this.C.p((C2078Qw0) it.next(), new AC0());
            }
        }
        this.D.l(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.M(sharedPreferencesP, "curpos", 0));
        int iM = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.M(sharedPreferencesP, "shufflemode", 0);
        if (iM != 1) {
            iM = 0;
        }
        U(iM, false, true);
        y(0, this.C.size(), 0, false, null);
    }

    public void L(int i) {
        ArrayList arrayList = new ArrayList(4);
        C2138Rl0.c cVarG = this.C.G();
        while (cVarG.hasNext()) {
            int iNextIndex = cVarG.nextIndex();
            if (i == ((InterfaceC6540mX) cVarG.next().b).c()) {
                arrayList.add(Integer.valueOf(iNextIndex));
                cVarG.remove();
            }
        }
        A(arrayList, -1, 0, false, null);
    }

    public void M(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6540mX interfaceC6540mX = (InterfaceC6540mX) it.next();
            C2138Rl0.c cVarG = this.C.G();
            while (cVarG.hasNext()) {
                int iNextIndex = cVarG.nextIndex();
                if (interfaceC6540mX.equals(cVarG.next().b)) {
                    arrayList.add(Integer.valueOf(iNextIndex));
                    cVarG.remove();
                }
            }
        }
        A(arrayList, -1, 0, false, null);
    }

    public final void N(Context context) {
        SharedPreferences.Editor editorEdit = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().p(context).edit();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            String strG = ((C2078Qw0) this.C.D(i)).g();
            if (strG != null) {
                sb.append(strG);
                sb2.append(strG.length());
                sb2.append(',');
            }
        }
        editorEdit.putString("queue", sb.toString());
        editorEdit.putString("queueSizes", sb2.toString());
        editorEdit.putInt("curpos", this.D.a());
        editorEdit.putInt("shufflemode", this.E);
        editorEdit.apply();
    }

    public void O(InterfaceC6540mX interfaceC6540mX) {
        P(interfaceC6540mX, null);
    }

    public void P(InterfaceC6540mX interfaceC6540mX, Object obj) {
        if (interfaceC6540mX == null) {
            return;
        }
        S(e(interfaceC6540mX, interfaceC6540mX.a()), obj);
    }

    public void Q(InterfaceC6540mX interfaceC6540mX, int i) {
        if (interfaceC6540mX == null || interfaceC6540mX.c() == i) {
            return;
        }
        interfaceC6540mX.b(i);
        w();
    }

    public void R(int i) {
        S(i, null);
    }

    public void S(int i, Object obj) {
        this.D.b(i);
        B(i, false, true, obj);
    }

    public void T(int i, boolean z) {
        U(i, z, false);
    }

    public void U(int i, boolean z, boolean z2) {
        Context contextH;
        if (z2 || this.E != i) {
            this.E = i;
            InterfaceC9057vX interfaceC9057vX = this.D;
            int i2 = interfaceC9057vX == null ? 0 : interfaceC9057vX.i(true);
            int i3 = this.E;
            if (i3 == 0) {
                C9811yC0 c9811yC0 = new C9811yC0();
                this.D = c9811yC0;
                c9811yC0.n(i2, this);
                if (z && (contextH = com.daaw.avee.a.h()) != null) {
                    v(contextH.getString(JD0.s4));
                }
            } else if (i3 == 1) {
                ArrayList arrayList = new ArrayList(this.C.size());
                ArrayList arrayList2 = new ArrayList();
                int size = i2 < 0 ? 0 : i2;
                if (size > this.C.size()) {
                    size = this.C.size() - 1;
                }
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(Integer.valueOf(i4));
                }
                arrayList.add(Integer.valueOf(size));
                while (true) {
                    size++;
                    if (size >= this.C.size()) {
                        break;
                    } else {
                        arrayList2.add(Integer.valueOf(size));
                    }
                }
                Collections.shuffle(arrayList2);
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    arrayList.add((Integer) arrayList2.get(i5));
                }
                if (arrayList.size() > 0) {
                    C10090zC0 c10090zC0 = new C10090zC0();
                    this.D = c10090zC0;
                    c10090zC0.m(i2, arrayList, this);
                    if (z && n() != null) {
                        int size2 = arrayList2.size();
                        v(n().getQuantityString(FD0.t, size2, Integer.valueOf(size2)));
                    }
                }
            }
            w();
            I.a(Integer.valueOf(this.E));
        }
    }

    @Override // com.daaw.InterfaceC9057vX.a
    public void a(InterfaceC9057vX interfaceC9057vX, boolean z, boolean z2) {
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((AC0) this.C.E(i)).d(-1);
        }
        int iD = interfaceC9057vX.d(this.C.size());
        for (int i2 = 0; i2 < iD; i2++) {
            int iF = interfaceC9057vX.f(i2, this.C.size());
            if (iF < this.C.size()) {
                ((AC0) this.C.E(iF)).d(i2);
            }
        }
        w();
        if (z2) {
            B(this.D.i(true), false, false, null);
        }
    }

    public final int b(Collection collection, int i, boolean z, InterfaceC8771uX interfaceC8771uX, int i2, boolean z2) {
        if (z) {
            this.C.clear();
            i = 0;
        }
        if (i > this.C.size()) {
            i = this.C.size();
        }
        int i3 = i;
        ArrayList arrayList = new ArrayList(collection.size());
        for (int i4 = 0; i4 < collection.size(); i4++) {
            arrayList.add(i4, new AC0(i2));
        }
        this.C.q(i3, collection, arrayList);
        if (z) {
            z(i3, i3 + collection.size(), 0, false, interfaceC8771uX, true, z2);
            return i3;
        }
        z(i3, (collection.size() + i3) - 1, 1, false, null, false, z2);
        return i3;
    }

    public void d(Collection collection, int i, int i2) {
        D(collection, -1, i, null, null, i2, true);
    }

    public final int e(InterfaceC6540mX interfaceC6540mX, int i) {
        Object obj;
        if (interfaceC6540mX == null) {
            return -1;
        }
        if (i >= 0 && i < this.C.size() && (obj = this.C.get(i).b) != null && ((InterfaceC6540mX) obj).equals(interfaceC6540mX)) {
            return i;
        }
        C2138Rl0.c cVarG = this.C.G();
        while (cVarG.hasNext()) {
            int iNextIndex = cVarG.nextIndex();
            Object obj2 = cVarG.next().b;
            if (obj2 != null && ((InterfaceC6540mX) obj2).equals(interfaceC6540mX)) {
                return iNextIndex;
            }
        }
        return -1;
    }

    public B61 k() {
        InterfaceC9057vX interfaceC9057vX = this.D;
        int i = interfaceC9057vX == null ? 0 : interfaceC9057vX.i(true);
        if (i < 0 || i >= this.C.size()) {
            return null;
        }
        return this.C.get(i);
    }

    public C2138Rl0 l() {
        return this.C.K();
    }

    public int m() {
        return this.D.i(true);
    }

    public int o() {
        return this.E;
    }

    public InterfaceC8771uX p() {
        return this.B;
    }

    public boolean q() {
        int iH = this.D.h(false);
        return iH == -1 || iH >= this.C.size();
    }

    public void r(int i, int i2, List list, int i3) {
        B61[] b61Arr = new B61[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue = ((Integer) list.get(i4)).intValue() + i;
            B61 b61 = new B61((C2078Qw0) this.C.D(iIntValue), (InterfaceC6540mX) this.C.E(iIntValue));
            b61Arr[i4] = b61;
            ((InterfaceC6540mX) b61.b).b(i3);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            this.C.remove(((Integer) list.get(size)).intValue() + i);
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            this.C.add(Math.max(0, Math.min(this.C.size(), ((Integer) list.get(size2)).intValue() + i2)), b61Arr[size2]);
        }
        A(list, i2, i, false, null);
    }

    public void s(Object obj) {
        B(this.D.i(true), this.D.e(this.C.size()), true, obj);
    }

    public void t() {
        u(null);
    }

    public void u(Object obj) {
        if (q()) {
            G(obj);
        } else {
            s(obj);
        }
    }

    public final void v(String str) {
        AbstractC5075hI.a.a(str);
    }

    public final void w() {
        H.a(l(), this.B);
    }

    public void x(Context context) {
        N(context);
    }

    public void y(int i, int i2, int i3, boolean z, InterfaceC8771uX interfaceC8771uX) {
        z(i, i2, i3, z, interfaceC8771uX, false, true);
    }

    public void z(int i, int i2, int i3, boolean z, InterfaceC8771uX interfaceC8771uX, boolean z2, boolean z3) {
        this.B = interfaceC8771uX;
        if (i > i2) {
            return;
        }
        int i4 = i < 0 ? 0 : i;
        if (i2 >= this.C.size()) {
            i2 = this.C.size() - 1;
        }
        int i5 = i2;
        if (z2) {
            T(0, true);
        }
        this.D.k(i4, i5, i3, z, this.C.size());
        if (z || !z3) {
            return;
        }
        int i6 = (i5 - i4) + 1;
        if (n() != null) {
            if (i3 == 1) {
                AbstractC5075hI.a.a(n().getQuantityString(FD0.o, i6, Integer.valueOf(i6)));
                return;
            }
            if (i3 == -1) {
                AbstractC5075hI.a.a(n().getQuantityString(FD0.r, i6, Integer.valueOf(i6)));
            } else if (i3 == 0 && z2) {
                AbstractC5075hI.a.a(n().getQuantityString(FD0.q, i6, Integer.valueOf(i6)));
            }
        }
    }
}
