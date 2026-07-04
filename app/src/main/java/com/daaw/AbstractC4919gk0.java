package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.daaw.gk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4919gk0 {

    /* JADX INFO: renamed from: com.daaw.gk0$a */
    public static class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.daaw.AbstractC4919gk0.c
        public void a(int i) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // com.daaw.AbstractC4919gk0.c
        public int b() {
            return AbstractC4919gk0.d(this.a.getShort());
        }

        @Override // com.daaw.AbstractC4919gk0.c
        public int c() {
            return this.a.getInt();
        }

        @Override // com.daaw.AbstractC4919gk0.c
        public long d() {
            return AbstractC4919gk0.c(this.a.getInt());
        }

        @Override // com.daaw.AbstractC4919gk0.c
        public long getPosition() {
            return this.a.position();
        }
    }

    /* JADX INFO: renamed from: com.daaw.gk0$b */
    public static class b {
        public final long a;
        public final long b;

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.gk0$c */
    public interface c {
        void a(int i);

        int b();

        int c();

        long d();

        long getPosition();
    }

    public static b a(c cVar) throws IOException {
        long jD;
        cVar.a(4);
        int iB = cVar.b();
        if (iB > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i = 0;
        while (true) {
            if (i >= iB) {
                jD = -1;
                break;
            }
            int iC = cVar.c();
            cVar.a(4);
            jD = cVar.d();
            cVar.a(4);
            if (1835365473 == iC) {
                break;
            }
            i++;
        }
        if (jD != -1) {
            cVar.a((int) (jD - cVar.getPosition()));
            cVar.a(12);
            long jD2 = cVar.d();
            for (int i2 = 0; i2 < jD2; i2++) {
                int iC2 = cVar.c();
                long jD3 = cVar.d();
                long jD4 = cVar.d();
                if (1164798569 == iC2 || 1701669481 == iC2) {
                    return new b(jD3 + jD, jD4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static C4640fk0 b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return C4640fk0.h(byteBufferDuplicate);
    }

    public static long c(int i) {
        return ((long) i) & 4294967295L;
    }

    public static int d(short s) {
        return s & 65535;
    }
}
