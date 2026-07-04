package com.daaw;

import com.daaw.SO;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DO {
    public final List a(List list, SO so, int i) {
        G10.g(list, "fontList");
        G10.g(so, "fontWeight");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            InterfaceC6225lO interfaceC6225lO = (InterfaceC6225lO) obj;
            if (G10.c(interfaceC6225lO.b(), so) && PO.f(interfaceC6225lO.c(), i)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        G91 g91 = G91.a;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = list.get(i4);
            if (PO.f(((InterfaceC6225lO) obj2).c(), i)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List list2 = list;
        SO.a aVar = SO.C;
        SO so2 = null;
        if (so.compareTo(aVar.e()) < 0) {
            int size3 = list2.size();
            SO so3 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                SO soB = ((InterfaceC6225lO) list2.get(i5)).b();
                if (soB.compareTo(so) >= 0) {
                    if (soB.compareTo(so) <= 0) {
                        so3 = soB;
                        so2 = so3;
                        break;
                    }
                    if (so3 == null || soB.compareTo(so3) < 0) {
                        so3 = soB;
                    }
                } else if (so2 == null || soB.compareTo(so2) > 0) {
                    so2 = soB;
                }
                i5++;
            }
            if (so2 != null) {
                so3 = so2;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i2 < size4) {
                Object obj3 = list2.get(i2);
                if (G10.c(((InterfaceC6225lO) obj3).b(), so3)) {
                    arrayList3.add(obj3);
                }
                i2++;
            }
            return arrayList3;
        }
        if (so.compareTo(aVar.f()) > 0) {
            int size5 = list2.size();
            SO so4 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                SO soB2 = ((InterfaceC6225lO) list2.get(i6)).b();
                if (soB2.compareTo(so) >= 0) {
                    if (soB2.compareTo(so) <= 0) {
                        so4 = soB2;
                        so2 = so4;
                        break;
                    }
                    if (so4 == null || soB2.compareTo(so4) < 0) {
                        so4 = soB2;
                    }
                } else if (so2 == null || soB2.compareTo(so2) > 0) {
                    so2 = soB2;
                }
                i6++;
            }
            if (so4 == null) {
                so4 = so2;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i2 < size6) {
                Object obj4 = list2.get(i2);
                if (G10.c(((InterfaceC6225lO) obj4).b(), so4)) {
                    arrayList4.add(obj4);
                }
                i2++;
            }
            return arrayList4;
        }
        SO soF = aVar.f();
        int size7 = list2.size();
        SO so5 = null;
        SO so6 = null;
        int i7 = 0;
        while (true) {
            if (i7 >= size7) {
                break;
            }
            SO soB3 = ((InterfaceC6225lO) list2.get(i7)).b();
            if (soF == null || soB3.compareTo(soF) <= 0) {
                if (soB3.compareTo(so) >= 0) {
                    if (soB3.compareTo(so) <= 0) {
                        so5 = soB3;
                        so6 = so5;
                        break;
                    }
                    if (so6 == null || soB3.compareTo(so6) < 0) {
                        so6 = soB3;
                    }
                } else if (so5 == null || soB3.compareTo(so5) > 0) {
                    so5 = soB3;
                }
            }
            i7++;
        }
        if (so6 != null) {
            so5 = so6;
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        int size8 = list2.size();
        for (int i8 = 0; i8 < size8; i8++) {
            Object obj5 = list2.get(i8);
            if (G10.c(((InterfaceC6225lO) obj5).b(), so5)) {
                arrayList5.add(obj5);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        SO soF2 = SO.C.f();
        int size9 = list2.size();
        SO so7 = null;
        int i9 = 0;
        while (true) {
            if (i9 >= size9) {
                break;
            }
            SO soB4 = ((InterfaceC6225lO) list2.get(i9)).b();
            if (soF2 == null || soB4.compareTo(soF2) >= 0) {
                if (soB4.compareTo(so) >= 0) {
                    if (soB4.compareTo(so) <= 0) {
                        so2 = soB4;
                        so7 = so2;
                        break;
                    }
                    if (so7 == null || soB4.compareTo(so7) < 0) {
                        so7 = soB4;
                    }
                } else if (so2 == null || soB4.compareTo(so2) > 0) {
                    so2 = soB4;
                }
            }
            i9++;
        }
        if (so7 != null) {
            so2 = so7;
        }
        ArrayList arrayList6 = new ArrayList(list2.size());
        int size10 = list2.size();
        while (i2 < size10) {
            Object obj6 = list2.get(i2);
            if (G10.c(((InterfaceC6225lO) obj6).b(), so2)) {
                arrayList6.add(obj6);
            }
            i2++;
        }
        return arrayList6;
    }
}
