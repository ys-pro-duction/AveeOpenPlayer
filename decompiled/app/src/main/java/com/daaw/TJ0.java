package com.daaw;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class TJ0 implements MZ0, LZ0, AutoCloseable {
    public static final TreeMap J = new TreeMap();
    public volatile String B;
    public final long[] C;
    public final double[] D;
    public final String[] E;
    public final byte[][] F;
    public final int[] G;
    public final int H;
    public int I;

    public TJ0(int i) {
        this.H = i;
        int i2 = i + 1;
        this.G = new int[i2];
        this.C = new long[i2];
        this.D = new double[i2];
        this.E = new String[i2];
        this.F = new byte[i2][];
    }

    public static TJ0 d(String str, int i) {
        TreeMap treeMap = J;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    TJ0 tj0 = new TJ0(i);
                    tj0.j(str, i);
                    return tj0;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                TJ0 tj02 = (TJ0) entryCeilingEntry.getValue();
                tj02.j(str, i);
                return tj02;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void l() {
        TreeMap treeMap = J;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i;
        }
    }

    @Override // com.daaw.LZ0
    public void H(int i, double d) {
        this.G[i] = 3;
        this.D[i] = d;
    }

    @Override // com.daaw.LZ0
    public void S(int i, long j) {
        this.G[i] = 2;
        this.C[i] = j;
    }

    @Override // com.daaw.LZ0
    public void Z(int i, byte[] bArr) {
        this.G[i] = 5;
        this.F[i] = bArr;
    }

    @Override // com.daaw.MZ0
    public void a(LZ0 lz0) {
        for (int i = 1; i <= this.I; i++) {
            int i2 = this.G[i];
            if (i2 == 1) {
                lz0.z0(i);
            } else if (i2 == 2) {
                lz0.S(i, this.C[i]);
            } else if (i2 == 3) {
                lz0.H(i, this.D[i]);
            } else if (i2 == 4) {
                lz0.w(i, this.E[i]);
            } else if (i2 == 5) {
                lz0.Z(i, this.F[i]);
            }
        }
    }

    @Override // com.daaw.MZ0
    public String c() {
        return this.B;
    }

    public void j(String str, int i) {
        this.B = str;
        this.I = i;
    }

    public void o() {
        TreeMap treeMap = J;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.H), this);
            l();
        }
    }

    @Override // com.daaw.LZ0
    public void w(int i, String str) {
        this.G[i] = 4;
        this.E[i] = str;
    }

    @Override // com.daaw.LZ0
    public void z0(int i) {
        this.G[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
