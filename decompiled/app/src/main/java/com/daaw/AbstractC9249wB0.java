package com.daaw;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.wB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9249wB0 {

    /* JADX INFO: renamed from: com.daaw.wB0$a */
    public static class a {
        public final UUID a;
        public final int b;
        public final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        boolean z = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int length2 = length + 32;
        if (z) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(AbstractC1244Jb.V);
        byteBufferAllocate.putInt(z ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (z) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static a c(byte[] bArr) {
        int iC;
        C2584Vs0 c2584Vs0 = new C2584Vs0(bArr);
        if (c2584Vs0.d() < 32) {
            return null;
        }
        c2584Vs0.J(0);
        if (c2584Vs0.i() != c2584Vs0.a() + 4 || c2584Vs0.i() != AbstractC1244Jb.V || (iC = AbstractC1244Jb.c(c2584Vs0.i())) > 1) {
            return null;
        }
        UUID uuid = new UUID(c2584Vs0.q(), c2584Vs0.q());
        if (iC == 1) {
            c2584Vs0.K(c2584Vs0.B() * 16);
        }
        int iB = c2584Vs0.B();
        if (iB != c2584Vs0.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iB];
        c2584Vs0.g(bArr2, 0, iB);
        return new a(uuid, iC, bArr2);
    }

    public static UUID d(byte[] bArr) {
        a aVarC = c(bArr);
        if (aVarC == null) {
            return null;
        }
        return aVarC.a;
    }
}
