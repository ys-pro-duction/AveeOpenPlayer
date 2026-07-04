package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10027yz0 {
    public final List a;

    public C10027yz0(List list) {
        G10.g(list, "list");
        this.a = list;
    }

    public final void a(int i) {
        if (!this.a.isEmpty()) {
            if (((Number) this.a.get(0)).intValue() == i) {
                return;
            }
            if (((Number) this.a.get(r0.size() - 1)).intValue() == i) {
                return;
            }
        }
        int size = this.a.size();
        this.a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((Number) this.a.get(i2)).intValue();
            if (i <= iIntValue) {
                break;
            }
            this.a.set(size, Integer.valueOf(iIntValue));
            size = i2;
        }
        this.a.set(size, Integer.valueOf(i));
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }

    public final int c() {
        return ((Number) AbstractC2455Um.e0(this.a)).intValue();
    }

    public final int d() {
        int iIntValue;
        if (!(this.a.size() > 0)) {
            AbstractC6348lp.x("Set is empty");
            throw new D80();
        }
        int iIntValue2 = ((Number) this.a.get(0)).intValue();
        while (!this.a.isEmpty() && ((Number) this.a.get(0)).intValue() == iIntValue2) {
            List list = this.a;
            list.set(0, AbstractC2455Um.p0(list));
            List list2 = this.a;
            list2.remove(list2.size() - 1);
            int size = this.a.size();
            int size2 = this.a.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int iIntValue3 = ((Number) this.a.get(i)).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int iIntValue4 = ((Number) this.a.get(i3)).intValue();
                if (i2 >= size || (iIntValue = ((Number) this.a.get(i2)).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.a.set(i, Integer.valueOf(iIntValue4));
                        this.a.set(i3, Integer.valueOf(iIntValue3));
                        i = i3;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.a.set(i, Integer.valueOf(iIntValue));
                    this.a.set(i2, Integer.valueOf(iIntValue3));
                    i = i2;
                }
            }
        }
        return iIntValue2;
    }

    public /* synthetic */ C10027yz0(List list, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
