package com.daaw;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Tj3 implements Dg3, Vj3 {
    public final Context B;
    public final Xj3 C;
    public final PlaybackSession D;
    public String J;
    public PlaybackMetrics.Builder K;
    public int L;
    public AbstractC4004dV1 O;
    public Qi3 P;
    public Qi3 Q;
    public Qi3 R;
    public C2485Ut1 S;
    public C2485Ut1 T;
    public C2485Ut1 U;
    public boolean V;
    public boolean W;
    public int X;
    public int Y;
    public int Z;
    public boolean a0;
    public final Q42 F = new Q42();
    public final H32 G = new H32();
    public final HashMap I = new HashMap();
    public final HashMap H = new HashMap();
    public final long E = SystemClock.elapsedRealtime();
    public int M = 0;
    public int N = 0;

    public Tj3(Context context, PlaybackSession playbackSession) {
        this.B = context.getApplicationContext();
        this.D = playbackSession;
        Oi3 oi3 = new Oi3(Oi3.i);
        this.C = oi3;
        oi3.a(this);
    }

    public static Tj3 l(Context context) {
        MediaMetricsManager mediaMetricsManagerA = Nj3.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new Tj3(context, mediaMetricsManagerA.createPlaybackSession());
    }

    public static int r(int i) {
        switch (AbstractC9004vJ2.u(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Override // com.daaw.Vj3
    public final void a(C10219zg3 c10219zg3, String str) {
        Vp3 vp3 = c10219zg3.d;
        if (vp3 == null || !vp3.b()) {
            s();
            this.J = str;
            this.K = AbstractC3792cj3.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.2.0-alpha01");
            v(c10219zg3.b, c10219zg3.d);
        }
    }

    @Override // com.daaw.Dg3
    public final void b(C10219zg3 c10219zg3, AbstractC4004dV1 abstractC4004dV1) {
        this.O = abstractC4004dV1;
    }

    @Override // com.daaw.Dg3
    public final void d(C10219zg3 c10219zg3, C2326Tf2 c2326Tf2) {
        Qi3 qi3 = this.P;
        if (qi3 != null) {
            C2485Ut1 c2485Ut1 = qi3.a;
            if (c2485Ut1.r == -1) {
                C1106Hs1 c1106Hs1B = c2485Ut1.b();
                c1106Hs1B.C(c2326Tf2.a);
                c1106Hs1B.h(c2326Tf2.b);
                this.P = new Qi3(c1106Hs1B.D(), 0, qi3.c);
            }
        }
    }

    @Override // com.daaw.Vj3
    public final void f(C10219zg3 c10219zg3, String str, boolean z) {
        Vp3 vp3 = c10219zg3.d;
        if ((vp3 == null || !vp3.b()) && str.equals(this.J)) {
            s();
        }
        this.H.remove(str);
        this.I.remove(str);
    }

    public final LogSessionId g() {
        return this.D.getSessionId();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0299  */
    @Override // com.daaw.Dg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.daaw.InterfaceC6406m12 r19, com.daaw.Bg3 r20) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Tj3.h(com.daaw.m12, com.daaw.Bg3):void");
    }

    @Override // com.daaw.Dg3
    public final void i(C10219zg3 c10219zg3, Rp3 rp3) {
        Vp3 vp3 = c10219zg3.d;
        if (vp3 == null) {
            return;
        }
        C2485Ut1 c2485Ut1 = rp3.b;
        c2485Ut1.getClass();
        Qi3 qi3 = new Qi3(c2485Ut1, 0, this.C.e(c10219zg3.b, vp3));
        int i = rp3.a;
        if (i != 0) {
            if (i == 1) {
                this.Q = qi3;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.R = qi3;
                return;
            }
        }
        this.P = qi3;
    }

    @Override // com.daaw.Dg3
    public final void j(C10219zg3 c10219zg3, int i, long j, long j2) {
        Vp3 vp3 = c10219zg3.d;
        if (vp3 != null) {
            Xj3 xj3 = this.C;
            AbstractC8657u52 abstractC8657u52 = c10219zg3.b;
            HashMap map = this.I;
            String strE = xj3.e(abstractC8657u52, vp3);
            Long l = (Long) map.get(strE);
            Long l2 = (Long) this.H.get(strE);
            this.I.put(strE, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.H.put(strE, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.daaw.Dg3
    public final void n(C10219zg3 c10219zg3, C8787ua3 c8787ua3) {
        this.X += c8787ua3.g;
        this.Y += c8787ua3.e;
    }

    @Override // com.daaw.Dg3
    public final void q(C10219zg3 c10219zg3, G02 g02, G02 g022, int i) {
        if (i == 1) {
            this.V = true;
            i = 1;
        }
        this.L = i;
    }

    public final void s() {
        PlaybackMetrics.Builder builder = this.K;
        if (builder != null && this.a0) {
            builder.setAudioUnderrunCount(this.Z);
            this.K.setVideoFramesDropped(this.X);
            this.K.setVideoFramesPlayed(this.Y);
            Long l = (Long) this.H.get(this.J);
            this.K.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.I.get(this.J);
            this.K.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.K.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.D.reportPlaybackMetrics(this.K.build());
        }
        this.K = null;
        this.J = null;
        this.Z = 0;
        this.X = 0;
        this.Y = 0;
        this.S = null;
        this.T = null;
        this.U = null;
        this.a0 = false;
    }

    public final void t(long j, C2485Ut1 c2485Ut1, int i) {
        if (AbstractC9004vJ2.e(this.T, c2485Ut1)) {
            return;
        }
        int i2 = this.T == null ? 1 : 0;
        this.T = c2485Ut1;
        x(0, j, c2485Ut1, i2);
    }

    public final void u(long j, C2485Ut1 c2485Ut1, int i) {
        if (AbstractC9004vJ2.e(this.U, c2485Ut1)) {
            return;
        }
        int i2 = this.U == null ? 1 : 0;
        this.U = c2485Ut1;
        x(2, j, c2485Ut1, i2);
    }

    public final void v(AbstractC8657u52 abstractC8657u52, Vp3 vp3) {
        int iA;
        PlaybackMetrics.Builder builder = this.K;
        if (vp3 == null || (iA = abstractC8657u52.a(vp3.a)) == -1) {
            return;
        }
        int i = 0;
        abstractC8657u52.d(iA, this.G, false);
        abstractC8657u52.e(this.G.c, this.F, 0L);
        MH1 mh1 = this.F.c.b;
        if (mh1 != null) {
            int iY = AbstractC9004vJ2.y(mh1.a);
            i = iY != 0 ? iY != 1 ? iY != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        Q42 q42 = this.F;
        if (q42.m != -9223372036854775807L && !q42.k && !q42.h && !q42.b()) {
            builder.setMediaDurationMillis(AbstractC9004vJ2.E(this.F.m));
        }
        builder.setPlaybackType(true != this.F.b() ? 1 : 2);
        this.a0 = true;
    }

    public final void w(long j, C2485Ut1 c2485Ut1, int i) {
        if (AbstractC9004vJ2.e(this.S, c2485Ut1)) {
            return;
        }
        int i2 = this.S == null ? 1 : 0;
        this.S = c2485Ut1;
        x(1, j, c2485Ut1, i2);
    }

    public final void x(int i, long j, C2485Ut1 c2485Ut1, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = Ri3.a(i).setTimeSinceCreatedMillis(j - this.E);
        if (c2485Ut1 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = c2485Ut1.k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c2485Ut1.l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c2485Ut1.i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = c2485Ut1.h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = c2485Ut1.q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = c2485Ut1.r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = c2485Ut1.y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = c2485Ut1.z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = c2485Ut1.c;
            if (str4 != null) {
                int i8 = AbstractC9004vJ2.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c2485Ut1.s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.a0 = true;
        this.D.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    public final boolean y(Qi3 qi3) {
        if (qi3 != null) {
            return qi3.c.equals(this.C.zze());
        }
        return false;
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void e(C10219zg3 c10219zg3, int i) {
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void k(C10219zg3 c10219zg3, int i, long j) {
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void m(C10219zg3 c10219zg3, C2485Ut1 c2485Ut1, C9631xa3 c9631xa3) {
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void o(C10219zg3 c10219zg3, Object obj, long j) {
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void p(C10219zg3 c10219zg3, C2485Ut1 c2485Ut1, C9631xa3 c9631xa3) {
    }

    @Override // com.daaw.Dg3
    public final void c(C10219zg3 c10219zg3, Mp3 mp3, Rp3 rp3, IOException iOException, boolean z) {
    }
}
