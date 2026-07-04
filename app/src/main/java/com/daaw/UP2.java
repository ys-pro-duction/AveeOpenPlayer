package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UP2 {
    public static boolean a(Iterable iterable, InterfaceC5661jO2 interfaceC5661jO2) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            interfaceC5661jO2.getClass();
            return c((List) iterable, interfaceC5661jO2);
        }
        Iterator it = iterable.iterator();
        interfaceC5661jO2.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC5661jO2.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static void b(List list, InterfaceC5661jO2 interfaceC5661jO2, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (interfaceC5661jO2.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    public static boolean c(List list, InterfaceC5661jO2 interfaceC5661jO2) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!interfaceC5661jO2.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        b(list, interfaceC5661jO2, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        b(list, interfaceC5661jO2, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
