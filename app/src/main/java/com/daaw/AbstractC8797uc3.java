package com.daaw;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.uc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8797uc3 implements Kg3 {
    protected int zzb = 0;

    public static void f(Iterable iterable, List list) {
        Charset charset = AbstractC10214zf3.a;
        iterable.getClass();
        if (iterable instanceof Rf3) {
            List listZzh = ((Rf3) iterable).zzh();
            Rf3 rf3 = (Rf3) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String str = "Element at index " + (rf3.size() - size) + " is null.";
                    int size2 = rf3.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        rf3.remove(size2);
                    }
                } else if (obj instanceof AbstractC9646xd3) {
                    rf3.k((AbstractC9646xd3) obj);
                } else {
                    rf3.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof Yg3) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public abstract int a(InterfaceC4907gh3 interfaceC4907gh3);

    public final byte[] g() {
        try {
            int iB = b();
            byte[] bArr = new byte[iB];
            Vd3 vd3A = Vd3.A(bArr, 0, iB);
            c(vd3A);
            vd3A.a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
