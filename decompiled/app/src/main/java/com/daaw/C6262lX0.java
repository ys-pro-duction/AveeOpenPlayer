package com.daaw;

import com.daaw.AbstractC6329ll0;
import com.daaw.C2756Xj0;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.lX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6262lX0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
    public static final List e = f();
    public static final C6262lX0 f = b.OK.c();
    public static final C6262lX0 g = b.CANCELLED.c();
    public static final C6262lX0 h = b.UNKNOWN.c();
    public static final C6262lX0 i = b.INVALID_ARGUMENT.c();
    public static final C6262lX0 j = b.DEADLINE_EXCEEDED.c();
    public static final C6262lX0 k = b.NOT_FOUND.c();
    public static final C6262lX0 l = b.ALREADY_EXISTS.c();
    public static final C6262lX0 m = b.PERMISSION_DENIED.c();
    public static final C6262lX0 n = b.UNAUTHENTICATED.c();
    public static final C6262lX0 o = b.RESOURCE_EXHAUSTED.c();
    public static final C6262lX0 p = b.FAILED_PRECONDITION.c();
    public static final C6262lX0 q = b.ABORTED.c();
    public static final C6262lX0 r = b.OUT_OF_RANGE.c();
    public static final C6262lX0 s = b.UNIMPLEMENTED.c();
    public static final C6262lX0 t = b.INTERNAL.c();
    public static final C6262lX0 u = b.UNAVAILABLE.c();
    public static final C6262lX0 v = b.DATA_LOSS.c();
    public static final C2756Xj0.g w;
    public static final C2756Xj0.j x;
    public static final C2756Xj0.g y;
    public final b a;
    public final String b;
    public final Throwable c;

    /* JADX INFO: renamed from: com.daaw.lX0$b */
    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public final int B;
        public final byte[] C;

        b(int i) {
            this.B = i;
            this.C = Integer.toString(i).getBytes(AbstractC0439Bk.a);
        }

        public C6262lX0 c() {
            return (C6262lX0) C6262lX0.e.get(this.B);
        }

        public int g() {
            return this.B;
        }

        public final byte[] h() {
            return this.C;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lX0$c */
    public static final class c implements C2756Xj0.j {
        public c() {
        }

        @Override // com.daaw.C2756Xj0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6262lX0 b(byte[] bArr) {
            return C6262lX0.i(bArr);
        }

        @Override // com.daaw.C2756Xj0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(C6262lX0 c6262lX0) {
            return c6262lX0.m().h();
        }
    }

    /* JADX INFO: renamed from: com.daaw.lX0$d */
    public static final class d implements C2756Xj0.j {
        public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        public d() {
        }

        public static boolean c(byte b) {
            return b < 32 || b >= 126 || b == 37;
        }

        public static String e(byte[] bArr) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i] == 37 && i + 2 < bArr.length) {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, AbstractC0439Bk.a), 16));
                        i += 3;
                    } catch (NumberFormatException unused) {
                        byteBufferAllocate.put(bArr[i]);
                        i++;
                    }
                }
                byteBufferAllocate.put(bArr[i]);
                i++;
            }
            return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC0439Bk.c);
        }

        public static byte[] g(byte[] bArr, int i) {
            byte[] bArr2 = new byte[((bArr.length - i) * 3) + i];
            if (i != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
            }
            int i2 = i;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (c(b)) {
                    bArr2[i2] = 37;
                    byte[] bArr3 = a;
                    bArr2[i2 + 1] = bArr3[(b >> 4) & 15];
                    bArr2[i2 + 2] = bArr3[b & 15];
                    i2 += 3;
                } else {
                    bArr2[i2] = b;
                    i2++;
                }
                i++;
            }
            return Arrays.copyOf(bArr2, i2);
        }

        @Override // com.daaw.C2756Xj0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String b(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // com.daaw.C2756Xj0.j
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(AbstractC0439Bk.c);
            for (int i = 0; i < bytes.length; i++) {
                if (c(bytes[i])) {
                    return g(bytes, i);
                }
            }
            return bytes;
        }
    }

    static {
        w = C2756Xj0.g.g("grpc-status", false, new c());
        d dVar = new d();
        x = dVar;
        y = C2756Xj0.g.g("grpc-message", false, dVar);
    }

    public C6262lX0(b bVar) {
        this(bVar, null, null);
    }

    public static List f() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            C6262lX0 c6262lX0 = (C6262lX0) treeMap.put(Integer.valueOf(bVar.g()), new C6262lX0(bVar));
            if (c6262lX0 != null) {
                throw new IllegalStateException("Code value duplication between " + c6262lX0.m().name() + " & " + bVar.name());
            }
        }
        return DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    public static String g(C6262lX0 c6262lX0) {
        if (c6262lX0.b == null) {
            return c6262lX0.a.toString();
        }
        return c6262lX0.a + ": " + c6262lX0.b;
    }

    public static C6262lX0 h(int i2) {
        if (i2 >= 0) {
            List list = e;
            if (i2 <= list.size()) {
                return (C6262lX0) list.get(i2);
            }
        }
        return h.q("Unknown code " + i2);
    }

    public static C6262lX0 i(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f : j(bArr);
    }

    public static C6262lX0 j(byte[] bArr) {
        int i2;
        byte b2;
        int length = bArr.length;
        char c2 = 1;
        if (length != 1) {
            i2 = (length == 2 && (b2 = bArr[0]) >= 48 && b2 <= 57) ? (b2 - 48) * 10 : 0;
            return h.q("Unknown code " + new String(bArr, AbstractC0439Bk.a));
        }
        c2 = 0;
        byte b3 = bArr[c2];
        if (b3 >= 48 && b3 <= 57) {
            int i3 = i2 + (b3 - 48);
            List list = e;
            if (i3 < list.size()) {
                return (C6262lX0) list.get(i3);
            }
        }
        return h.q("Unknown code " + new String(bArr, AbstractC0439Bk.a));
    }

    public static C6262lX0 k(Throwable th) {
        for (Throwable cause = (Throwable) AbstractC7785qy0.o(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof C6541mX0) {
                return ((C6541mX0) cause).a();
            }
            if (cause instanceof C7657qX0) {
                return ((C7657qX0) cause).a();
            }
        }
        return h.p(th);
    }

    public C6541mX0 c() {
        return new C6541mX0(this);
    }

    public C7657qX0 d() {
        return new C7657qX0(this);
    }

    public C6262lX0 e(String str) {
        if (str == null) {
            return this;
        }
        if (this.b == null) {
            return new C6262lX0(this.a, str, this.c);
        }
        return new C6262lX0(this.a, this.b + "\n" + str, this.c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Throwable l() {
        return this.c;
    }

    public b m() {
        return this.a;
    }

    public String n() {
        return this.b;
    }

    public boolean o() {
        return b.OK == this.a;
    }

    public C6262lX0 p(Throwable th) {
        return AbstractC8301sp0.a(this.c, th) ? this : new C6262lX0(this.a, this.b, th);
    }

    public C6262lX0 q(String str) {
        return AbstractC8301sp0.a(this.b, str) ? this : new C6262lX0(this.a, str, this.c);
    }

    public String toString() {
        AbstractC6329ll0.b bVarD = AbstractC6329ll0.b(this).d("code", this.a.name()).d("description", this.b);
        Throwable th = this.c;
        Object objE = th;
        if (th != null) {
            objE = AbstractC9490x31.e(th);
        }
        return bVarD.d("cause", objE).toString();
    }

    public C6262lX0(b bVar, String str, Throwable th) {
        this.a = (b) AbstractC7785qy0.o(bVar, "code");
        this.b = str;
        this.c = th;
    }
}
