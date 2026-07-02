package com.daaw;

import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafh;
import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzafp;
import com.google.android.gms.internal.ads.zzbx;

/* JADX INFO: renamed from: com.daaw.fr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4676fr1 {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static zzbx a(C5900kE2 c5900kE2) {
        String str;
        int iL = c5900kE2.l() + c5900kE2.o();
        int iO = c5900kE2.o();
        int i = (iO >> 24) & 255;
        zzbx zzafaVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iO & 16777215;
                if (i2 == 6516084) {
                    int iO2 = c5900kE2.o();
                    if (c5900kE2.o() == 1684108385) {
                        c5900kE2.h(8);
                        String strG = c5900kE2.G(iO2 - 16);
                        zzafaVar = new zzafa("und", strG, strG);
                    } else {
                        AbstractC3305ay2.f("MetadataUtil", "Failed to parse comment attribute: ".concat(AbstractC1202Iq1.b(iO)));
                    }
                    c5900kE2.g(iL);
                    return zzafaVar;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    zzafp zzafpVarE = e(iO, "TIT2", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    zzafp zzafpVarE2 = e(iO, "TCOM", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE2;
                }
                if (i2 == 6578553) {
                    zzafp zzafpVarE3 = e(iO, "TDRC", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE3;
                }
                if (i2 == 4280916) {
                    zzafp zzafpVarE4 = e(iO, "TPE1", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE4;
                }
                if (i2 == 7630703) {
                    zzafp zzafpVarE5 = e(iO, "TSSE", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE5;
                }
                if (i2 == 6384738) {
                    zzafp zzafpVarE6 = e(iO, "TALB", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE6;
                }
                if (i2 == 7108978) {
                    zzafp zzafpVarE7 = e(iO, "USLT", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE7;
                }
                if (i2 == 6776174) {
                    zzafp zzafpVarE8 = e(iO, "TCON", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE8;
                }
                if (i2 == 6779504) {
                    zzafp zzafpVarE9 = e(iO, "TIT1", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE9;
                }
            } else {
                if (iO == 1735291493) {
                    int iB = b(c5900kE2);
                    String str2 = (iB <= 0 || iB > 192) ? null : a[iB - 1];
                    if (str2 != null) {
                        zzafaVar = new zzafp("TCON", null, OP2.K(str2));
                    } else {
                        AbstractC3305ay2.f("MetadataUtil", "Failed to parse standard genre code");
                    }
                    c5900kE2.g(iL);
                    return zzafaVar;
                }
                if (iO == 1684632427) {
                    zzafp zzafpVarD = d(1684632427, "TPOS", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarD;
                }
                if (iO == 1953655662) {
                    zzafp zzafpVarD2 = d(1953655662, "TRCK", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarD2;
                }
                if (iO == 1953329263) {
                    zzafh zzafhVarC = c(1953329263, "TBPM", c5900kE2, true, false);
                    c5900kE2.g(iL);
                    return zzafhVarC;
                }
                if (iO == 1668311404) {
                    zzafh zzafhVarC2 = c(1668311404, "TCMP", c5900kE2, true, true);
                    c5900kE2.g(iL);
                    return zzafhVarC2;
                }
                if (iO == 1668249202) {
                    int iO3 = c5900kE2.o();
                    if (c5900kE2.o() == 1684108385) {
                        int iO4 = c5900kE2.o() & 16777215;
                        if (iO4 == 13) {
                            str = "image/jpeg";
                        } else if (iO4 == 14) {
                            str = "image/png";
                            iO4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            AbstractC3305ay2.f("MetadataUtil", "Unrecognized cover art flags: " + iO4);
                        } else {
                            c5900kE2.h(4);
                            int i3 = iO3 - 16;
                            byte[] bArr = new byte[i3];
                            c5900kE2.c(bArr, 0, i3);
                            zzafaVar = new zzaes(str, null, 3, bArr);
                        }
                    } else {
                        AbstractC3305ay2.f("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    c5900kE2.g(iL);
                    return zzafaVar;
                }
                if (iO == 1631670868) {
                    zzafp zzafpVarE10 = e(1631670868, "TPE2", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE10;
                }
                if (iO == 1936682605) {
                    zzafp zzafpVarE11 = e(1936682605, "TSOT", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE11;
                }
                if (iO == 1936679276) {
                    zzafp zzafpVarE12 = e(1936679276, "TSO2", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE12;
                }
                if (iO == 1936679282) {
                    zzafp zzafpVarE13 = e(1936679282, "TSOA", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE13;
                }
                if (iO == 1936679265) {
                    zzafp zzafpVarE14 = e(1936679265, "TSOP", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE14;
                }
                if (iO == 1936679791) {
                    zzafp zzafpVarE15 = e(1936679791, "TSOC", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE15;
                }
                if (iO == 1920233063) {
                    zzafh zzafhVarC3 = c(1920233063, "ITUNESADVISORY", c5900kE2, false, false);
                    c5900kE2.g(iL);
                    return zzafhVarC3;
                }
                if (iO == 1885823344) {
                    zzafh zzafhVarC4 = c(1885823344, "ITUNESGAPLESS", c5900kE2, false, true);
                    c5900kE2.g(iL);
                    return zzafhVarC4;
                }
                if (iO == 1936683886) {
                    zzafp zzafpVarE16 = e(1936683886, "TVSHOWSORT", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE16;
                }
                if (iO == 1953919848) {
                    zzafp zzafpVarE17 = e(1953919848, "TVSHOW", c5900kE2);
                    c5900kE2.g(iL);
                    return zzafpVarE17;
                }
                if (iO == 757935405) {
                    String strG2 = null;
                    String strG3 = null;
                    int i4 = -1;
                    int i5 = -1;
                    while (c5900kE2.l() < iL) {
                        int iL2 = c5900kE2.l();
                        int iO5 = c5900kE2.o();
                        int iO6 = c5900kE2.o();
                        c5900kE2.h(4);
                        if (iO6 == 1835360622) {
                            strG2 = c5900kE2.G(iO5 - 12);
                        } else {
                            int i6 = iO5 - 12;
                            if (iO6 == 1851878757) {
                                strG3 = c5900kE2.G(i6);
                            } else {
                                if (iO6 == 1684108385) {
                                    i5 = iO5;
                                }
                                if (iO6 == 1684108385) {
                                    i4 = iL2;
                                }
                                c5900kE2.h(i6);
                            }
                        }
                    }
                    if (strG2 != null && strG3 != null && i4 != -1) {
                        c5900kE2.g(i4);
                        c5900kE2.h(16);
                        zzafaVar = new zzafj(strG2, strG3, c5900kE2.G(i5 - 16));
                    }
                    return zzafaVar;
                }
            }
            AbstractC3305ay2.b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC1202Iq1.b(iO));
            c5900kE2.g(iL);
            return null;
        } finally {
            c5900kE2.g(iL);
        }
    }

    public static int b(C5900kE2 c5900kE2) {
        c5900kE2.h(4);
        if (c5900kE2.o() == 1684108385) {
            c5900kE2.h(8);
            return c5900kE2.u();
        }
        AbstractC3305ay2.f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static zzafh c(int i, String str, C5900kE2 c5900kE2, boolean z, boolean z2) {
        int iB = b(c5900kE2);
        if (z2) {
            iB = Math.min(1, iB);
        }
        if (iB >= 0) {
            return z ? new zzafp(str, null, OP2.K(Integer.toString(iB))) : new zzafa("und", str, Integer.toString(iB));
        }
        AbstractC3305ay2.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC1202Iq1.b(i)));
        return null;
    }

    public static zzafp d(int i, String str, C5900kE2 c5900kE2) {
        int iO = c5900kE2.o();
        if (c5900kE2.o() == 1684108385 && iO >= 22) {
            c5900kE2.h(10);
            int iY = c5900kE2.y();
            if (iY > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iY);
                String string = sb.toString();
                int iY2 = c5900kE2.y();
                if (iY2 > 0) {
                    string = string + "/" + iY2;
                }
                return new zzafp(str, null, OP2.K(string));
            }
        }
        AbstractC3305ay2.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC1202Iq1.b(i)));
        return null;
    }

    public static zzafp e(int i, String str, C5900kE2 c5900kE2) {
        int iO = c5900kE2.o();
        if (c5900kE2.o() == 1684108385) {
            c5900kE2.h(8);
            return new zzafp(str, null, OP2.K(c5900kE2.G(iO - 16)));
        }
        AbstractC3305ay2.f("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC1202Iq1.b(i)));
        return null;
    }
}
