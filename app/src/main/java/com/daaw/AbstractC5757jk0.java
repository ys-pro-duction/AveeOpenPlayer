package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;

/* JADX INFO: renamed from: com.daaw.jk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5757jk0 {
    public static final int a = AbstractC6280lb1.v("nam");
    public static final int b = AbstractC6280lb1.v("trk");
    public static final int c = AbstractC6280lb1.v("cmt");
    public static final int d = AbstractC6280lb1.v("day");
    public static final int e = AbstractC6280lb1.v("ART");
    public static final int f = AbstractC6280lb1.v("too");
    public static final int g = AbstractC6280lb1.v("alb");
    public static final int h = AbstractC6280lb1.v("com");
    public static final int i = AbstractC6280lb1.v("wrt");
    public static final int j = AbstractC6280lb1.v("lyr");
    public static final int k = AbstractC6280lb1.v("gen");
    public static final int l = AbstractC6280lb1.v("covr");
    public static final int m = AbstractC6280lb1.v("gnre");
    public static final int n = AbstractC6280lb1.v("grp");
    public static final int o = AbstractC6280lb1.v("disk");
    public static final int p = AbstractC6280lb1.v("trkn");
    public static final int q = AbstractC6280lb1.v("tmpo");
    public static final int r = AbstractC6280lb1.v("cpil");
    public static final int s = AbstractC6280lb1.v("aART");
    public static final int t = AbstractC6280lb1.v("sonm");
    public static final int u = AbstractC6280lb1.v("soal");
    public static final int v = AbstractC6280lb1.v("soar");
    public static final int w = AbstractC6280lb1.v("soaa");
    public static final int x = AbstractC6280lb1.v("soco");
    public static final int y = AbstractC6280lb1.v("rtng");
    public static final int z = AbstractC6280lb1.v("pgap");
    public static final int A = AbstractC6280lb1.v("sosn");
    public static final int B = AbstractC6280lb1.v("tvsh");
    public static final int C = AbstractC6280lb1.v("----");
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static CommentFrame a(int i2, C2584Vs0 c2584Vs0) {
        int i3 = c2584Vs0.i();
        if (c2584Vs0.i() != AbstractC1244Jb.G0) {
            AbstractC1244Jb.a(i2);
            return null;
        }
        c2584Vs0.K(8);
        String strS = c2584Vs0.s(i3 - 16);
        return new CommentFrame("und", strS, strS);
    }

    public static ApicFrame b(C2584Vs0 c2584Vs0) {
        int i2 = c2584Vs0.i();
        if (c2584Vs0.i() != AbstractC1244Jb.G0) {
            return null;
        }
        int iB = AbstractC1244Jb.b(c2584Vs0.i());
        String str = iB == 13 ? "image/jpeg" : iB == 14 ? "image/png" : null;
        if (str == null) {
            return null;
        }
        c2584Vs0.K(4);
        int i3 = i2 - 16;
        byte[] bArr = new byte[i3];
        c2584Vs0.g(bArr, 0, i3);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static Metadata.Entry c(C2584Vs0 c2584Vs0) {
        int iC = c2584Vs0.c() + c2584Vs0.i();
        int i2 = c2584Vs0.i();
        int i3 = (i2 >> 24) & 255;
        try {
            if (i3 == 169 || i3 == 65533) {
                int i4 = 16777215 & i2;
                if (i4 == c) {
                    return a(i2, c2584Vs0);
                }
                if (i4 != a && i4 != b) {
                    if (i4 != h && i4 != i) {
                        if (i4 == d) {
                            return g(i2, "TDRC", c2584Vs0);
                        }
                        if (i4 == e) {
                            return g(i2, "TPE1", c2584Vs0);
                        }
                        if (i4 == f) {
                            return g(i2, "TSSE", c2584Vs0);
                        }
                        if (i4 == g) {
                            return g(i2, "TALB", c2584Vs0);
                        }
                        if (i4 == j) {
                            return g(i2, "USLT", c2584Vs0);
                        }
                        if (i4 == k) {
                            return g(i2, "TCON", c2584Vs0);
                        }
                        if (i4 == n) {
                            return g(i2, "TIT1", c2584Vs0);
                        }
                    }
                    return g(i2, "TCOM", c2584Vs0);
                }
                return g(i2, "TIT2", c2584Vs0);
            }
            if (i2 == m) {
                return f(c2584Vs0);
            }
            if (i2 == o) {
                return d(i2, "TPOS", c2584Vs0);
            }
            if (i2 == p) {
                return d(i2, "TRCK", c2584Vs0);
            }
            if (i2 == q) {
                return h(i2, "TBPM", c2584Vs0, true, false);
            }
            if (i2 == r) {
                return h(i2, "TCMP", c2584Vs0, true, true);
            }
            if (i2 == l) {
                return b(c2584Vs0);
            }
            if (i2 == s) {
                return g(i2, "TPE2", c2584Vs0);
            }
            if (i2 == t) {
                return g(i2, "TSOT", c2584Vs0);
            }
            if (i2 == u) {
                return g(i2, "TSO2", c2584Vs0);
            }
            if (i2 == v) {
                return g(i2, "TSOA", c2584Vs0);
            }
            if (i2 == w) {
                return g(i2, "TSOP", c2584Vs0);
            }
            if (i2 == x) {
                return g(i2, "TSOC", c2584Vs0);
            }
            if (i2 == y) {
                return h(i2, "ITUNESADVISORY", c2584Vs0, false, false);
            }
            if (i2 == z) {
                return h(i2, "ITUNESGAPLESS", c2584Vs0, false, true);
            }
            if (i2 == A) {
                return g(i2, "TVSHOWSORT", c2584Vs0);
            }
            if (i2 == B) {
                return g(i2, "TVSHOW", c2584Vs0);
            }
            if (i2 == C) {
                return e(c2584Vs0, iC);
            }
            AbstractC1244Jb.a(i2);
            c2584Vs0.J(iC);
            return null;
        } finally {
            c2584Vs0.J(iC);
        }
    }

    public static TextInformationFrame d(int i2, String str, C2584Vs0 c2584Vs0) {
        int i3 = c2584Vs0.i();
        if (c2584Vs0.i() == AbstractC1244Jb.G0 && i3 >= 22) {
            c2584Vs0.K(10);
            int iD = c2584Vs0.D();
            if (iD > 0) {
                String str2 = "" + iD;
                int iD2 = c2584Vs0.D();
                if (iD2 > 0) {
                    str2 = str2 + "/" + iD2;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        AbstractC1244Jb.a(i2);
        return null;
    }

    public static Id3Frame e(C2584Vs0 c2584Vs0, int i2) {
        String strS = null;
        String strS2 = null;
        int i3 = -1;
        int i4 = -1;
        while (c2584Vs0.c() < i2) {
            int iC = c2584Vs0.c();
            int i5 = c2584Vs0.i();
            int i6 = c2584Vs0.i();
            c2584Vs0.K(4);
            if (i6 == AbstractC1244Jb.E0) {
                strS = c2584Vs0.s(i5 - 12);
            } else if (i6 == AbstractC1244Jb.F0) {
                strS2 = c2584Vs0.s(i5 - 12);
            } else {
                if (i6 == AbstractC1244Jb.G0) {
                    i3 = iC;
                    i4 = i5;
                }
                c2584Vs0.K(i5 - 12);
            }
        }
        if (!"com.apple.iTunes".equals(strS) || !"iTunSMPB".equals(strS2) || i3 == -1) {
            return null;
        }
        c2584Vs0.J(i3);
        c2584Vs0.K(16);
        return new CommentFrame("und", strS2, c2584Vs0.s(i4 - 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.id3.TextInformationFrame f(com.daaw.C2584Vs0 r3) {
        /*
            int r3 = i(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.daaw.AbstractC5757jk0.D
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC5757jk0.f(com.daaw.Vs0):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    public static TextInformationFrame g(int i2, String str, C2584Vs0 c2584Vs0) {
        int i3 = c2584Vs0.i();
        if (c2584Vs0.i() == AbstractC1244Jb.G0) {
            c2584Vs0.K(8);
            return new TextInformationFrame(str, null, c2584Vs0.s(i3 - 16));
        }
        AbstractC1244Jb.a(i2);
        return null;
    }

    public static Id3Frame h(int i2, String str, C2584Vs0 c2584Vs0, boolean z2, boolean z3) {
        int i3 = i(c2584Vs0);
        if (z3) {
            i3 = Math.min(1, i3);
        }
        if (i3 >= 0) {
            return z2 ? new TextInformationFrame(str, null, Integer.toString(i3)) : new CommentFrame("und", str, Integer.toString(i3));
        }
        AbstractC1244Jb.a(i2);
        return null;
    }

    public static int i(C2584Vs0 c2584Vs0) {
        c2584Vs0.K(4);
        if (c2584Vs0.i() != AbstractC1244Jb.G0) {
            return -1;
        }
        c2584Vs0.K(8);
        return c2584Vs0.x();
    }
}
