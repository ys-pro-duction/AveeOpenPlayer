package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class F31 {
    public List a;

    public F31(List list) {
        List list2 = (List) AbstractC6948ny0.d(list, "Values must not be empty");
        this.a = list2;
        Collections.sort(list2);
    }

    public C7455pn0 a(int i, int i2) {
        int iIndexOf;
        boolean z;
        List arrayList = new ArrayList(this.a);
        Collections.reverse(arrayList);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        if (arrayList.contains(Integer.valueOf(i))) {
            iIndexOf = arrayList.indexOf(Integer.valueOf(i));
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = 0;
                    z = false;
                    break;
                }
                Integer num = (Integer) it.next();
                if (num.intValue() < i) {
                    iIndexOf = arrayList.indexOf(num);
                    i2--;
                    z = true;
                    break;
                }
            }
            if (!z) {
                atomicInteger.incrementAndGet();
            }
        }
        int iIntValue = ((Integer) arrayList.get(iIndexOf)).intValue();
        for (int i3 = 0; i3 < i2; i3++) {
            iIntValue = c(arrayList, iIndexOf + 1, atomicInteger);
            iIndexOf = arrayList.indexOf(Integer.valueOf(iIntValue));
        }
        return new C7455pn0(iIntValue, atomicInteger.get());
    }

    public C7455pn0 b(int i, int i2) {
        return a(i, i2);
    }

    public int c(List list, int i, AtomicInteger atomicInteger) {
        AbstractC6948ny0.d(list, "List must not be empty");
        if (i < 0) {
            int size = i + list.size();
            atomicInteger.incrementAndGet();
            return c(list, size, atomicInteger);
        }
        if (i < list.size()) {
            return ((Integer) list.get(i)).intValue();
        }
        int size2 = i - list.size();
        atomicInteger.incrementAndGet();
        return c(list, size2, atomicInteger);
    }

    public List d() {
        return DesugarCollections.unmodifiableList(this.a);
    }
}
