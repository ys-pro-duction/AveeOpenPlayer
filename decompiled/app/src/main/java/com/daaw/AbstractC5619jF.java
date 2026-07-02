package com.daaw;

import com.daaw.AbstractC5342iF;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.daaw.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5619jF {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final AbstractC5342iF.a[][] d;
    public static final AbstractC5342iF.a[] e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;
    public static final BigInteger i;

    /* JADX INFO: renamed from: com.daaw.jF$b */
    public static class b {
        public BigInteger a;
        public BigInteger b;

        public b() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        i = bigIntegerModPow;
        b bVar = new b();
        bVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        bVar.a = c(bVar.b);
        a = TJ.c(d(bigIntegerMod));
        b = TJ.c(d(bigIntegerMod2));
        c = TJ.c(d(bigIntegerModPow));
        d = (AbstractC5342iF.a[][]) Array.newInstance((Class<?>) AbstractC5342iF.a.class, 32, 8);
        b bVarA = bVar;
        for (int i2 = 0; i2 < 32; i2++) {
            b bVarA2 = bVarA;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = b(bVarA2);
                bVarA2 = a(bVarA2, bVarA);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bVarA = a(bVarA, bVarA);
            }
        }
        b bVarA3 = a(bVar, bVar);
        e = new AbstractC5342iF.a[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = b(bVar);
            bVar = a(bVar, bVarA3);
        }
    }

    public static b a(b bVar, b bVar2) {
        b bVar3 = new b();
        BigInteger bigIntegerMultiply = g.multiply(bVar.a.multiply(bVar2.a).multiply(bVar.b).multiply(bVar2.b));
        BigInteger bigInteger = f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = bVar.a.multiply(bVar2.b).add(bVar2.a.multiply(bVar.b));
        BigInteger bigInteger2 = BigInteger.ONE;
        bVar3.a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        bVar3.b = bVar.b.multiply(bVar2.b).add(bVar.a.multiply(bVar2.a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return bVar3;
    }

    public static AbstractC5342iF.a b(b bVar) {
        BigInteger bigIntegerAdd = bVar.b.add(bVar.a);
        BigInteger bigInteger = f;
        return new AbstractC5342iF.a(TJ.c(d(bigIntegerAdd.mod(bigInteger))), TJ.c(d(bVar.b.subtract(bVar.a).mod(bigInteger))), TJ.c(d(h.multiply(bVar.a).multiply(bVar.b).mod(bigInteger))));
    }

    public static BigInteger c(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(i).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    public static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}
