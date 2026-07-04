package com.daaw;

import com.daaw.D7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ul0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2452Ul0 {
    public static final List b(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            D7.b bVar = (D7.b) obj;
            if (E7.f(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            D7.b bVar2 = (D7.b) arrayList.get(i4);
            if (i > bVar2.f() || bVar2.d() > i2) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new D7.b(bVar2.e(), bVar2.f() - i, bVar2.d() - i));
        }
        return arrayList2;
    }
}
