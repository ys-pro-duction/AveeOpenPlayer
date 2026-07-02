package com.daaw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.f33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4444f33 implements U43 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Iterable iterable, List list) {
        Charset charset = AbstractC8374t43.a;
        iterable.getClass();
        if (iterable instanceof InterfaceC10055z43) {
            List listZzh = ((InterfaceC10055z43) iterable).zzh();
            InterfaceC10055z43 interfaceC10055z43 = (InterfaceC10055z43) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC10055z43.size() - size) + " is null.";
                    int size2 = interfaceC10055z43.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        interfaceC10055z43.remove(size2);
                    }
                } else if (obj instanceof AbstractC9213w33) {
                    interfaceC10055z43.B((AbstractC9213w33) obj);
                } else {
                    interfaceC10055z43.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC3340b53) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
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

    public abstract int a(InterfaceC7821r53 interfaceC7821r53);

    @Override // com.daaw.U43
    public final AbstractC9213w33 d() {
        try {
            int iQ = q();
            AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
            byte[] bArr = new byte[iQ];
            P33 p33D = P33.d(bArr, 0, iQ);
            c(p33D);
            p33D.e();
            return new C8090s33(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final void g(OutputStream outputStream) {
        int iQ = q();
        Logger logger = P33.b;
        if (iQ > 4096) {
            iQ = 4096;
        }
        N33 n33 = new N33(outputStream, iQ);
        c(n33);
        n33.h();
    }

    public final byte[] h() {
        try {
            int iQ = q();
            byte[] bArr = new byte[iQ];
            P33 p33D = P33.d(bArr, 0, iQ);
            c(p33D);
            p33D.e();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
