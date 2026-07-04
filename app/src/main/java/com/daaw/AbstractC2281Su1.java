package com.daaw;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Su1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2281Su1 implements InterfaceC2385Tu1 {
    public static final Logger b = Logger.getLogger(AbstractC2281Su1.class.getName());
    public final ThreadLocal a = new C2175Ru1(this);

    @Override // com.daaw.InterfaceC2385Tu1
    public final InterfaceC2697Wu1 a(N73 n73, InterfaceC2801Xu1 interfaceC2801Xu1) throws EOFException {
        int iT0;
        long jZzc;
        long jZzb = n73.zzb();
        ((ByteBuffer) this.a.get()).rewind().limit(8);
        do {
            iT0 = n73.T0((ByteBuffer) this.a.get());
            if (iT0 == 8) {
                ((ByteBuffer) this.a.get()).rewind();
                long jE = AbstractC2593Vu1.e((ByteBuffer) this.a.get());
                byte[] bArr = null;
                if (jE < 8 && jE > 1) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jE);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jE == 1) {
                        ((ByteBuffer) this.a.get()).limit(16);
                        n73.T0((ByteBuffer) this.a.get());
                        ((ByteBuffer) this.a.get()).position(8);
                        jZzc = AbstractC2593Vu1.f((ByteBuffer) this.a.get()) - 16;
                    } else {
                        jZzc = jE == 0 ? n73.zzc() - n73.zzb() : jE - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.a.get()).limit(((ByteBuffer) this.a.get()).limit() + 16);
                        n73.T0((ByteBuffer) this.a.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.a.get()).position() - 16; iPosition < ((ByteBuffer) this.a.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.a.get()).position() - 16)] = ((ByteBuffer) this.a.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j = jZzc;
                    InterfaceC2697Wu1 interfaceC2697Wu1B = b(str, bArr, interfaceC2801Xu1 instanceof InterfaceC2697Wu1 ? ((InterfaceC2697Wu1) interfaceC2801Xu1).zza() : "");
                    interfaceC2697Wu1B.a(interfaceC2801Xu1);
                    ((ByteBuffer) this.a.get()).rewind();
                    interfaceC2697Wu1B.d(n73, (ByteBuffer) this.a.get(), j, this);
                    return interfaceC2697Wu1B;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iT0 >= 0);
        n73.e(jZzb);
        throw new EOFException();
    }

    public abstract InterfaceC2697Wu1 b(String str, byte[] bArr, String str2);
}
