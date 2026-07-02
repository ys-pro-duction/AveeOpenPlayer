package com.daaw;

import com.daaw.IA0;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Xm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2768Xm0 implements InterfaceC2664Wm0 {
    public final JA0 a;
    public final IA0 b;

    /* JADX INFO: renamed from: com.daaw.Xm0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IA0.c.EnumC0068c.values().length];
            try {
                iArr[IA0.c.EnumC0068c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IA0.c.EnumC0068c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IA0.c.EnumC0068c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C2768Xm0(JA0 ja0, IA0 ia0) {
        G10.g(ja0, "strings");
        G10.g(ia0, "qualifiedNames");
        this.a = ja0;
        this.b = ia0;
    }

    @Override // com.daaw.InterfaceC2664Wm0
    public String a(int i) {
        C5025h61 c5025h61C = c(i);
        List list = (List) c5025h61C.a();
        String strN0 = AbstractC2455Um.n0((List) c5025h61C.b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strN0;
        }
        return AbstractC2455Um.n0(list, "/", null, null, 0, null, null, 62, null) + '/' + strN0;
    }

    @Override // com.daaw.InterfaceC2664Wm0
    public boolean b(int i) {
        return ((Boolean) c(i).d()).booleanValue();
    }

    public final C5025h61 c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            IA0.c cVarY = this.b.y(i);
            String strY = this.a.y(cVarY.C());
            IA0.c.EnumC0068c enumC0068cA = cVarY.A();
            G10.d(enumC0068cA);
            int i2 = a.a[enumC0068cA.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(strY);
            } else if (i2 == 2) {
                linkedList.addFirst(strY);
            } else {
                if (i2 != 3) {
                    throw new C6902no0();
                }
                linkedList2.addFirst(strY);
                z = true;
            }
            i = cVarY.B();
        }
        return new C5025h61(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // com.daaw.InterfaceC2664Wm0
    public String getString(int i) {
        String strY = this.a.y(i);
        G10.f(strY, "getString(...)");
        return strY;
    }
}
