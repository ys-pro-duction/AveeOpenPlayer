package com.daaw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0563Cp extends AbstractC4425f0 {
    public static final f F = new a();
    public static final f G = new b();
    public static final f H = new c();
    public static final f I = new d();
    public static final g J = new e();
    public final Deque B;
    public Deque C;
    public int D;
    public boolean E;

    /* JADX INFO: renamed from: com.daaw.Cp$a */
    public class a implements f {
        @Override // com.daaw.C0563Cp.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(IE0 ie0, int i, Void r3, int i2) {
            return ie0.G();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cp$b */
    public class b implements f {
        @Override // com.daaw.C0563Cp.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(IE0 ie0, int i, Void r3, int i2) {
            ie0.p(i);
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cp$c */
    public class c implements f {
        @Override // com.daaw.C0563Cp.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(IE0 ie0, int i, byte[] bArr, int i2) {
            ie0.i0(bArr, i2, i);
            return i2 + i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cp$d */
    public class d implements f {
        @Override // com.daaw.C0563Cp.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(IE0 ie0, int i, ByteBuffer byteBuffer, int i2) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            ie0.a1(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cp$e */
    public class e implements g {
        @Override // com.daaw.C0563Cp.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(IE0 ie0, int i, OutputStream outputStream, int i2) {
            ie0.L0(outputStream, i);
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cp$f */
    public interface f extends g {
    }

    /* JADX INFO: renamed from: com.daaw.Cp$g */
    public interface g {
        int a(IE0 ie0, int i, Object obj, int i2);
    }

    public C0563Cp(int i) {
        this.B = new ArrayDeque(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.daaw.IE0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.daaw.IE0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.daaw.Cp] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.daaw.Cp] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.daaw.IE0
    public IE0 E(int i) {
        IE0 ie0E;
        int i2;
        IE0 ie0E2;
        ?? r1;
        ?? r0;
        if (i <= 0) {
            return JE0.a();
        }
        a(i);
        this.D -= i;
        ?? r02 = 0;
        ?? c0563Cp = 0;
        while (true) {
            IE0 ie0 = (IE0) this.B.peek();
            int iB = ie0.b();
            if (iB > i) {
                ie0E2 = ie0.E(i);
                i2 = 0;
            } else {
                if (this.E) {
                    ie0E = ie0.E(iB);
                    d();
                } else {
                    ie0E = (IE0) this.B.poll();
                }
                IE0 ie02 = ie0E;
                i2 = i - iB;
                ie0E2 = ie02;
            }
            if (r02 == 0) {
                r0 = ie0E2;
                r1 = c0563Cp;
            } else {
                if (c0563Cp == 0) {
                    c0563Cp = new C0563Cp(i2 != 0 ? Math.min(this.B.size() + 2, 16) : 2);
                    c0563Cp.c(r02);
                    r02 = c0563Cp;
                }
                c0563Cp.c(ie0E2);
                r0 = r02;
                r1 = c0563Cp;
            }
            if (i2 <= 0) {
                return r0;
            }
            i = i2;
            r02 = r0;
            c0563Cp = r1;
        }
    }

    @Override // com.daaw.IE0
    public int G() {
        return s(F, 1, null, 0);
    }

    @Override // com.daaw.IE0
    public void L0(OutputStream outputStream, int i) {
        o(J, i, outputStream, 0);
    }

    @Override // com.daaw.IE0
    public void a1(ByteBuffer byteBuffer) {
        s(I, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // com.daaw.IE0
    public int b() {
        return this.D;
    }

    public void c(IE0 ie0) {
        boolean z = this.E && this.B.isEmpty();
        l(ie0);
        if (z) {
            ((IE0) this.B.peek()).r0();
        }
    }

    @Override // com.daaw.AbstractC4425f0, com.daaw.IE0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.B.isEmpty()) {
            ((IE0) this.B.remove()).close();
        }
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                ((IE0) this.C.remove()).close();
            }
        }
    }

    public final void d() {
        if (!this.E) {
            ((IE0) this.B.remove()).close();
            return;
        }
        this.C.add((IE0) this.B.remove());
        IE0 ie0 = (IE0) this.B.peek();
        if (ie0 != null) {
            ie0.r0();
        }
    }

    @Override // com.daaw.IE0
    public void i0(byte[] bArr, int i, int i2) {
        s(H, i2, bArr, i);
    }

    public final void j() {
        if (((IE0) this.B.peek()).b() == 0) {
            d();
        }
    }

    public final void l(IE0 ie0) {
        if (!(ie0 instanceof C0563Cp)) {
            this.B.add(ie0);
            this.D += ie0.b();
            return;
        }
        C0563Cp c0563Cp = (C0563Cp) ie0;
        while (!c0563Cp.B.isEmpty()) {
            this.B.add((IE0) c0563Cp.B.remove());
        }
        this.D += c0563Cp.D;
        c0563Cp.D = 0;
        c0563Cp.close();
    }

    @Override // com.daaw.AbstractC4425f0, com.daaw.IE0
    public boolean markSupported() {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            if (!((IE0) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    public final int o(g gVar, int i, Object obj, int i2) {
        a(i);
        if (!this.B.isEmpty()) {
            j();
        }
        while (i > 0 && !this.B.isEmpty()) {
            IE0 ie0 = (IE0) this.B.peek();
            int iMin = Math.min(i, ie0.b());
            i2 = gVar.a(ie0, iMin, obj, i2);
            i -= iMin;
            this.D -= iMin;
            j();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    @Override // com.daaw.IE0
    public void p(int i) {
        s(G, i, null, 0);
    }

    @Override // com.daaw.AbstractC4425f0, com.daaw.IE0
    public void r0() {
        if (this.C == null) {
            this.C = new ArrayDeque(Math.min(this.B.size(), 16));
        }
        while (!this.C.isEmpty()) {
            ((IE0) this.C.remove()).close();
        }
        this.E = true;
        IE0 ie0 = (IE0) this.B.peek();
        if (ie0 != null) {
            ie0.r0();
        }
    }

    @Override // com.daaw.AbstractC4425f0, com.daaw.IE0
    public void reset() {
        if (!this.E) {
            throw new InvalidMarkException();
        }
        IE0 ie0 = (IE0) this.B.peek();
        if (ie0 != null) {
            int iB = ie0.b();
            ie0.reset();
            this.D += ie0.b() - iB;
        }
        while (true) {
            IE0 ie02 = (IE0) this.C.pollLast();
            if (ie02 == null) {
                return;
            }
            ie02.reset();
            this.B.addFirst(ie02);
            this.D += ie02.b();
        }
    }

    public final int s(f fVar, int i, Object obj, int i2) {
        try {
            return o(fVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public C0563Cp() {
        this.B = new ArrayDeque();
    }
}
