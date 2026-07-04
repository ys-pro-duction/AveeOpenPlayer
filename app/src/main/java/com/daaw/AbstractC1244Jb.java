package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1244Jb {
    public final int a;
    public static final int b = AbstractC6280lb1.v("ftyp");
    public static final int c = AbstractC6280lb1.v("avc1");
    public static final int d = AbstractC6280lb1.v("avc3");
    public static final int e = AbstractC6280lb1.v("hvc1");
    public static final int f = AbstractC6280lb1.v("hev1");
    public static final int g = AbstractC6280lb1.v("s263");
    public static final int h = AbstractC6280lb1.v("d263");
    public static final int i = AbstractC6280lb1.v("mdat");
    public static final int j = AbstractC6280lb1.v("mp4a");
    public static final int k = AbstractC6280lb1.v(".mp3");
    public static final int l = AbstractC6280lb1.v("wave");
    public static final int m = AbstractC6280lb1.v("lpcm");
    public static final int n = AbstractC6280lb1.v("sowt");
    public static final int o = AbstractC6280lb1.v("ac-3");
    public static final int p = AbstractC6280lb1.v("dac3");
    public static final int q = AbstractC6280lb1.v("ec-3");
    public static final int r = AbstractC6280lb1.v("dec3");
    public static final int s = AbstractC6280lb1.v("dtsc");
    public static final int t = AbstractC6280lb1.v("dtsh");
    public static final int u = AbstractC6280lb1.v("dtsl");
    public static final int v = AbstractC6280lb1.v("dtse");
    public static final int w = AbstractC6280lb1.v("ddts");
    public static final int x = AbstractC6280lb1.v("tfdt");
    public static final int y = AbstractC6280lb1.v("tfhd");
    public static final int z = AbstractC6280lb1.v("trex");
    public static final int A = AbstractC6280lb1.v("trun");
    public static final int B = AbstractC6280lb1.v("sidx");
    public static final int C = AbstractC6280lb1.v("moov");
    public static final int D = AbstractC6280lb1.v("mvhd");
    public static final int E = AbstractC6280lb1.v("trak");
    public static final int F = AbstractC6280lb1.v("mdia");
    public static final int G = AbstractC6280lb1.v("minf");
    public static final int H = AbstractC6280lb1.v("stbl");
    public static final int I = AbstractC6280lb1.v("avcC");
    public static final int J = AbstractC6280lb1.v("hvcC");
    public static final int K = AbstractC6280lb1.v("esds");
    public static final int L = AbstractC6280lb1.v("moof");
    public static final int M = AbstractC6280lb1.v("traf");
    public static final int N = AbstractC6280lb1.v("mvex");
    public static final int O = AbstractC6280lb1.v("mehd");
    public static final int P = AbstractC6280lb1.v("tkhd");
    public static final int Q = AbstractC6280lb1.v("edts");
    public static final int R = AbstractC6280lb1.v("elst");
    public static final int S = AbstractC6280lb1.v("mdhd");
    public static final int T = AbstractC6280lb1.v("hdlr");
    public static final int U = AbstractC6280lb1.v("stsd");
    public static final int V = AbstractC6280lb1.v("pssh");
    public static final int W = AbstractC6280lb1.v("sinf");
    public static final int X = AbstractC6280lb1.v("schm");
    public static final int Y = AbstractC6280lb1.v("schi");
    public static final int Z = AbstractC6280lb1.v("tenc");
    public static final int a0 = AbstractC6280lb1.v("encv");
    public static final int b0 = AbstractC6280lb1.v("enca");
    public static final int c0 = AbstractC6280lb1.v("frma");
    public static final int d0 = AbstractC6280lb1.v("saiz");
    public static final int e0 = AbstractC6280lb1.v("saio");
    public static final int f0 = AbstractC6280lb1.v("sbgp");
    public static final int g0 = AbstractC6280lb1.v("sgpd");
    public static final int h0 = AbstractC6280lb1.v("uuid");
    public static final int i0 = AbstractC6280lb1.v("senc");
    public static final int j0 = AbstractC6280lb1.v("pasp");
    public static final int k0 = AbstractC6280lb1.v("TTML");
    public static final int l0 = AbstractC6280lb1.v("vmhd");
    public static final int m0 = AbstractC6280lb1.v("mp4v");
    public static final int n0 = AbstractC6280lb1.v("stts");
    public static final int o0 = AbstractC6280lb1.v("stss");
    public static final int p0 = AbstractC6280lb1.v("ctts");
    public static final int q0 = AbstractC6280lb1.v("stsc");
    public static final int r0 = AbstractC6280lb1.v("stsz");
    public static final int s0 = AbstractC6280lb1.v("stz2");
    public static final int t0 = AbstractC6280lb1.v("stco");
    public static final int u0 = AbstractC6280lb1.v("co64");
    public static final int v0 = AbstractC6280lb1.v("tx3g");
    public static final int w0 = AbstractC6280lb1.v("wvtt");
    public static final int x0 = AbstractC6280lb1.v("stpp");
    public static final int y0 = AbstractC6280lb1.v("c608");
    public static final int z0 = AbstractC6280lb1.v("samr");
    public static final int A0 = AbstractC6280lb1.v("sawb");
    public static final int B0 = AbstractC6280lb1.v("udta");
    public static final int C0 = AbstractC6280lb1.v("meta");
    public static final int D0 = AbstractC6280lb1.v("ilst");
    public static final int E0 = AbstractC6280lb1.v("mean");
    public static final int F0 = AbstractC6280lb1.v("name");
    public static final int G0 = AbstractC6280lb1.v("data");
    public static final int H0 = AbstractC6280lb1.v("emsg");
    public static final int I0 = AbstractC6280lb1.v("st3d");
    public static final int J0 = AbstractC6280lb1.v("sv3d");
    public static final int K0 = AbstractC6280lb1.v("proj");
    public static final int L0 = AbstractC6280lb1.v("vp08");
    public static final int M0 = AbstractC6280lb1.v("vp09");
    public static final int N0 = AbstractC6280lb1.v("vpcC");
    public static final int O0 = AbstractC6280lb1.v("camm");
    public static final int P0 = AbstractC6280lb1.v("alac");

    /* JADX INFO: renamed from: com.daaw.Jb$a */
    public static final class a extends AbstractC1244Jb {
        public final long Q0;
        public final List R0;
        public final List S0;

        public a(int i, long j) {
            super(i);
            this.Q0 = j;
            this.R0 = new ArrayList();
            this.S0 = new ArrayList();
        }

        public void d(a aVar) {
            this.S0.add(aVar);
        }

        public void e(b bVar) {
            this.R0.add(bVar);
        }

        public a f(int i) {
            int size = this.S0.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.S0.get(i2);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i) {
            int size = this.R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.R0.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.daaw.AbstractC1244Jb
        public String toString() {
            return AbstractC1244Jb.a(this.a) + " leaves: " + Arrays.toString(this.R0.toArray()) + " containers: " + Arrays.toString(this.S0.toArray());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jb$b */
    public static final class b extends AbstractC1244Jb {
        public final C2584Vs0 Q0;

        public b(int i, C2584Vs0 c2584Vs0) {
            super(i);
            this.Q0 = c2584Vs0;
        }
    }

    public AbstractC1244Jb(int i2) {
        this.a = i2;
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static int c(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.a);
    }
}
