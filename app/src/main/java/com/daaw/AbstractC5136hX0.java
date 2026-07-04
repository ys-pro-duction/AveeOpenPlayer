package com.daaw;

import com.daaw.NU0;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.hX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5136hX0 {
    public static Comparator d(NU0.h hVar, int i) {
        Comparator comparator = null;
        if (hVar == null) {
            return null;
        }
        int i2 = hVar.a;
        if (i2 != 8) {
            i = i2;
        }
        if (i == 0) {
            comparator = new Comparator() { // from class: com.daaw.eX0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((C4011dX0) ((B61) obj).b).a.compareTo(((C4011dX0) ((B61) obj2).b).a);
                }
            };
        } else if (i != 3) {
            switch (i) {
                case 9:
                    comparator = new Comparator() { // from class: com.daaw.gX0
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            B61 b61 = (B61) obj;
                            B61 b612 = (B61) obj2;
                            return Long.compare(((C4011dX0) b61.b).c, ((C4011dX0) b612.b).c);
                        }
                    };
                    break;
            }
        } else {
            comparator = new Comparator() { // from class: com.daaw.fX0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((C4011dX0) ((B61) obj).b).b.compareTo(((C4011dX0) ((B61) obj2).b).b);
                }
            };
        }
        return (comparator == null || !hVar.b) ? comparator : Collections.reverseOrder(comparator);
    }
}
