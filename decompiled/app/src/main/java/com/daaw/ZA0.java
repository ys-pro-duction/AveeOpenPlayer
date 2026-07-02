package com.daaw;

import com.daaw.C6882nk0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZA0 {
    public static volatile C6484mJ a = C6484mJ.b();

    public static final class a implements C6882nk0.c {
        public static final ThreadLocal c = new ThreadLocal();
        public final InterfaceC2896Ys0 a;
        public final InterfaceC1900Pj0 b;

        public a(InterfaceC1900Pj0 interfaceC1900Pj0) {
            this.b = interfaceC1900Pj0;
            this.a = interfaceC1900Pj0.j();
        }

        @Override // com.daaw.C6882nk0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC1900Pj0 a(InputStream inputStream) {
            AbstractC9408wm abstractC9408wmF;
            byte[] bArr;
            if ((inputStream instanceof YA0) && ((YA0) inputStream).d() == this.a) {
                try {
                    return ((YA0) inputStream).c();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof InterfaceC4466f80) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.b;
                        }
                        abstractC9408wmF = null;
                    } else {
                        ThreadLocal threadLocal = c;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i = iAvailable;
                        while (i > 0) {
                            int i2 = inputStream.read(bArr, iAvailable - i, i);
                            if (i2 == -1) {
                                break;
                            }
                            i -= i2;
                        }
                        if (i != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                        }
                        abstractC9408wmF = AbstractC9408wm.k(bArr, 0, iAvailable);
                    }
                } else {
                    abstractC9408wmF = null;
                }
                if (abstractC9408wmF == null) {
                    abstractC9408wmF = AbstractC9408wm.f(inputStream);
                }
                abstractC9408wmF.G(Integer.MAX_VALUE);
                try {
                    return d(abstractC9408wmF);
                } catch (P10 e) {
                    throw C6262lX0.t.q("Invalid protobuf byte sequence").p(e).d();
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public final InterfaceC1900Pj0 d(AbstractC9408wm abstractC9408wm) throws P10 {
            InterfaceC1900Pj0 interfaceC1900Pj0 = (InterfaceC1900Pj0) this.a.a(abstractC9408wm, ZA0.a);
            try {
                abstractC9408wm.a(0);
                return interfaceC1900Pj0;
            } catch (P10 e) {
                e.k(interfaceC1900Pj0);
                throw e;
            }
        }

        @Override // com.daaw.C6882nk0.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream b(InterfaceC1900Pj0 interfaceC1900Pj0) {
            return new YA0(interfaceC1900Pj0, this.a);
        }
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        AbstractC7785qy0.o(inputStream, "inputStream cannot be null!");
        AbstractC7785qy0.o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static C6882nk0.c b(InterfaceC1900Pj0 interfaceC1900Pj0) {
        return new a(interfaceC1900Pj0);
    }
}
