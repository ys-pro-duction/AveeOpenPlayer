package com.daaw;

import android.os.SystemClock;
import android.view.Surface;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC4166e4;
import com.daaw.L31;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.b;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class MH implements InterfaceC4166e4 {
    public static final NumberFormat e;
    public final com.google.android.exoplayer2.trackselection.b a;
    public final L31.c b = new L31.c();
    public final L31.b c = new L31.b();
    public final long d = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public MH(com.google.android.exoplayer2.trackselection.b bVar) {
        this.a = bVar;
    }

    public static String D(int i, int i2) {
        return i < 2 ? "N/A" : i2 != 0 ? i2 != 8 ? i2 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
    }

    public static String E(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    public static String I(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    public static String J(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    public static String K(long j) {
        return j == -9223372036854775807L ? "?" : e.format(j / 1000.0f);
    }

    public static String L(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED";
    }

    public static String M(com.google.android.exoplayer2.trackselection.c cVar, TrackGroup trackGroup, int i) {
        return N((cVar == null || cVar.a() != trackGroup || cVar.p(i) == -1) ? false : true);
    }

    public static String N(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    public static String O(int i) {
        if (i == 0) {
            return "default";
        }
        if (i == 1) {
            return "audio";
        }
        if (i == 2) {
            return "video";
        }
        if (i == 3) {
            return "text";
        }
        if (i == 4) {
            return "metadata";
        }
        if (i == 5) {
            return "none";
        }
        if (i < 10000) {
            return "?";
        }
        return "custom (" + i + ")";
    }

    @Override // com.daaw.InterfaceC4166e4
    public void B(InterfaceC4166e4.a aVar) {
        P(aVar, "mediaPeriodReleased");
    }

    @Override // com.daaw.InterfaceC4166e4
    public void C(InterfaceC4166e4.a aVar, int i) {
        int iH = aVar.b.h();
        int iN = aVar.b.n();
        R("timelineChanged [" + H(aVar) + ", periodCount=" + iH + ", windowCount=" + iN + ", reason=" + L(i));
        for (int i2 = 0; i2 < Math.min(iH, 3); i2++) {
            aVar.b.f(i2, this.c);
            R("  period [" + K(this.c.h()) + "]");
        }
        if (iH > 3) {
            R("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iN, 3); i3++) {
            aVar.b.k(i3, this.b);
            R("  window [" + K(this.b.c()) + ", " + this.b.d + ", " + this.b.e + "]");
        }
        if (iN > 3) {
            R("  ...");
        }
        R("]");
    }

    public final String F(InterfaceC4166e4.a aVar, String str) {
        return str + " [" + H(aVar) + "]";
    }

    public final String G(InterfaceC4166e4.a aVar, String str, String str2) {
        return str + " [" + H(aVar) + ", " + str2 + "]";
    }

    public final String H(InterfaceC4166e4.a aVar) {
        String str = "window=" + aVar.c;
        if (aVar.d != null) {
            str = str + ", period=" + aVar.d.a;
            if (aVar.d.b()) {
                str = (str + ", adGroup=" + aVar.d.b) + ", ad=" + aVar.d.c;
            }
        }
        return K(aVar.a - this.d) + ", " + K(aVar.f) + ", " + str;
    }

    public final void P(InterfaceC4166e4.a aVar, String str) {
        R(F(aVar, str));
    }

    public final void Q(InterfaceC4166e4.a aVar, String str, String str2) {
        R(G(aVar, str, str2));
    }

    public final void S(InterfaceC4166e4.a aVar, String str, String str2, Throwable th) {
        U(G(aVar, str, str2), th);
    }

    public final void T(InterfaceC4166e4.a aVar, String str, Throwable th) {
        U(F(aVar, str), th);
    }

    public final void V(InterfaceC4166e4.a aVar, String str, Exception exc) {
        S(aVar, "internalError", str, exc);
    }

    public final void W(Metadata metadata, String str) {
        for (int i = 0; i < metadata.b(); i++) {
            R(str + metadata.a(i));
        }
    }

    @Override // com.daaw.InterfaceC4166e4
    public void a(InterfaceC4166e4.a aVar, InterfaceC1896Pi0.c cVar) {
        Q(aVar, "upstreamDiscarded", Format.F(cVar.c));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void b(InterfaceC4166e4.a aVar, InterfaceC1896Pi0.c cVar) {
        Q(aVar, "downstreamFormatChanged", Format.F(cVar.c));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void c(InterfaceC4166e4.a aVar, int i, long j) {
        Q(aVar, "droppedFrames", Integer.toString(i));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void e(InterfaceC4166e4.a aVar, int i) {
        Q(aVar, "audioSessionId", Integer.toString(i));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void f(InterfaceC4166e4.a aVar) {
        P(aVar, "seekStarted");
    }

    @Override // com.daaw.InterfaceC4166e4
    public void g(InterfaceC4166e4.a aVar, boolean z, int i) {
        Q(aVar, "state", z + ", " + J(i));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void h(InterfaceC4166e4.a aVar, int i) {
        Q(aVar, "positionDiscontinuity", E(i));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void i(InterfaceC4166e4.a aVar, int i, C0912Fw c0912Fw) {
        Q(aVar, "decoderDisabled", O(i));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void j(InterfaceC4166e4.a aVar, boolean z) {
        Q(aVar, "loading", Boolean.toString(z));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void k(InterfaceC4166e4.a aVar, int i, Format format) {
        Q(aVar, "decoderInputFormatChanged", O(i) + ", " + Format.F(format));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void l(InterfaceC4166e4.a aVar, Metadata metadata) {
        R("metadata [" + H(aVar) + ", ");
        W(metadata, "  ");
        R("]");
    }

    @Override // com.daaw.InterfaceC4166e4
    public void m(InterfaceC4166e4.a aVar, Surface surface) {
        Q(aVar, "renderedFirstFrame", surface.toString());
    }

    @Override // com.daaw.InterfaceC4166e4
    public void n(InterfaceC4166e4.a aVar, TrackGroupArray trackGroupArray, C3338b51 c3338b51) {
        b.a aVar2;
        int i;
        com.google.android.exoplayer2.trackselection.b bVar = this.a;
        b.a aVarE = bVar != null ? bVar.e() : null;
        if (aVarE == null) {
            Q(aVar, "tracksChanged", "[]");
            return;
        }
        R("tracksChanged [" + H(aVar) + ", ");
        int iC = aVarE.c();
        int i2 = 0;
        while (true) {
            String str = "  ]";
            if (i2 >= iC) {
                break;
            }
            TrackGroupArray trackGroupArrayE = aVarE.e(i2);
            com.google.android.exoplayer2.trackselection.c cVarA = c3338b51.a(i2);
            if (trackGroupArrayE.B > 0) {
                StringBuilder sb = new StringBuilder();
                i = iC;
                sb.append("  Renderer:");
                sb.append(i2);
                sb.append(" [");
                R(sb.toString());
                int i3 = 0;
                while (i3 < trackGroupArrayE.B) {
                    TrackGroup trackGroupA = trackGroupArrayE.a(i3);
                    TrackGroupArray trackGroupArray2 = trackGroupArrayE;
                    String str2 = str;
                    R("    Group:" + i3 + ", adaptive_supported=" + D(trackGroupA.B, aVarE.a(i2, i3, false)) + " [");
                    int i4 = 0;
                    while (i4 < trackGroupA.B) {
                        R("      " + M(cVarA, trackGroupA, i4) + " Track:" + i4 + ", " + Format.F(trackGroupA.a(i4)) + ", supported=" + I(aVarE.f(i2, i3, i4)));
                        i4++;
                        aVarE = aVarE;
                    }
                    R("    ]");
                    i3++;
                    trackGroupArrayE = trackGroupArray2;
                    str = str2;
                }
                aVar2 = aVarE;
                String str3 = str;
                if (cVarA != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= cVarA.length()) {
                            break;
                        }
                        Metadata metadata = cVarA.d(i5).E;
                        if (metadata != null) {
                            R("    Metadata [");
                            W(metadata, "      ");
                            R("    ]");
                            break;
                        }
                        i5++;
                    }
                }
                R(str3);
            } else {
                aVar2 = aVarE;
                i = iC;
            }
            i2++;
            iC = i;
            aVarE = aVar2;
        }
        TrackGroupArray trackGroupArrayG = aVarE.g();
        if (trackGroupArrayG.B > 0) {
            R("  Renderer:None [");
            for (int i6 = 0; i6 < trackGroupArrayG.B; i6++) {
                R("    Group:" + i6 + " [");
                TrackGroup trackGroupA2 = trackGroupArrayG.a(i6);
                for (int i7 = 0; i7 < trackGroupA2.B; i7++) {
                    R("      " + N(false) + " Track:" + i7 + ", " + Format.F(trackGroupA2.a(i7)) + ", supported=" + I(0));
                }
                R("    ]");
            }
            R("  ]");
        }
        R("]");
    }

    @Override // com.daaw.InterfaceC4166e4
    public void p(InterfaceC4166e4.a aVar) {
        P(aVar, "mediaPeriodCreated");
    }

    @Override // com.daaw.InterfaceC4166e4
    public void q(InterfaceC4166e4.a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar, IOException iOException, boolean z) {
        V(aVar, "loadError", iOException);
    }

    @Override // com.daaw.InterfaceC4166e4
    public void r(InterfaceC4166e4.a aVar, int i, long j, long j2) {
        S(aVar, "audioTrackUnderrun", i + ", " + j + ", " + j2 + "]", null);
    }

    @Override // com.daaw.InterfaceC4166e4
    public void s(InterfaceC4166e4.a aVar, int i, C0912Fw c0912Fw) {
        Q(aVar, "decoderEnabled", O(i));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void t(InterfaceC4166e4.a aVar, C9457ww0 c9457ww0) {
        Q(aVar, "playbackParameters", AbstractC6280lb1.o("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(c9457ww0.a), Float.valueOf(c9457ww0.b), Boolean.valueOf(c9457ww0.c)));
    }

    @Override // com.daaw.InterfaceC4166e4
    public void u(InterfaceC4166e4.a aVar) {
        P(aVar, "mediaPeriodReadingStarted");
    }

    @Override // com.daaw.InterfaceC4166e4
    public void v(InterfaceC4166e4.a aVar, int i, String str, long j) {
        Q(aVar, "decoderInitialized", O(i) + ", " + str);
    }

    @Override // com.daaw.InterfaceC4166e4
    public void x(InterfaceC4166e4.a aVar, int i, int i2, int i3, float f) {
        Q(aVar, "videoSizeChanged", i + ", " + i2);
    }

    @Override // com.daaw.InterfaceC4166e4
    public void y(InterfaceC4166e4.a aVar, VI vi) {
        T(aVar, "playerFailed", vi);
    }

    @Override // com.daaw.InterfaceC4166e4
    public void z(InterfaceC4166e4.a aVar) {
        P(aVar, "seekProcessed");
    }

    public void R(String str) {
    }

    public void U(String str, Throwable th) {
    }

    @Override // com.daaw.InterfaceC4166e4
    public void A(InterfaceC4166e4.a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar) {
    }

    @Override // com.daaw.InterfaceC4166e4
    public void d(InterfaceC4166e4.a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar) {
    }

    @Override // com.daaw.InterfaceC4166e4
    public void o(InterfaceC4166e4.a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar) {
    }

    @Override // com.daaw.InterfaceC4166e4
    public void w(InterfaceC4166e4.a aVar, int i, long j, long j2) {
    }
}
