package com.daaw;

import com.daaw.InterfaceC1900Pj0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Q implements InterfaceC1900Pj0 {
    protected int memoizedHashCode = 0;

    public static abstract class a implements InterfaceC1900Pj0.a {
        public static void k(Iterable iterable, List list) {
            AbstractC3317b10.a(iterable);
            if (!(iterable instanceof InterfaceC6837nb0)) {
                if (iterable instanceof InterfaceC7231oz0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    l(iterable, list);
                    return;
                }
            }
            List listH = ((InterfaceC6837nb0) iterable).h();
            InterfaceC6837nb0 interfaceC6837nb0 = (InterfaceC6837nb0) list;
            int size = list.size();
            for (Object obj : listH) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC6837nb0.size() - size) + " is null.";
                    for (int size2 = interfaceC6837nb0.size() - 1; size2 >= size; size2--) {
                        interfaceC6837nb0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC4340ei) {
                    interfaceC6837nb0.o((AbstractC4340ei) obj);
                } else {
                    interfaceC6837nb0.add((String) obj);
                }
            }
        }

        public static void l(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static D91 m(InterfaceC1900Pj0 interfaceC1900Pj0) {
            return new D91(interfaceC1900Pj0);
        }
    }

    public static void a(Iterable iterable, List list) {
        a.k(iterable, list);
    }

    @Override // com.daaw.InterfaceC1900Pj0
    public void f(OutputStream outputStream) {
        AbstractC10245zm abstractC10245zmA0 = AbstractC10245zm.a0(outputStream, AbstractC10245zm.E(c()));
        i(abstractC10245zmA0);
        abstractC10245zmA0.X();
    }

    @Override // com.daaw.InterfaceC1900Pj0
    public byte[] h() {
        try {
            byte[] bArr = new byte[c()];
            AbstractC10245zm abstractC10245zmB0 = AbstractC10245zm.b0(bArr);
            i(abstractC10245zmB0);
            abstractC10245zmB0.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(l("byte array"), e);
        }
    }

    public abstract int k(DN0 dn0);

    public final String l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public D91 m() {
        return new D91(this);
    }
}
