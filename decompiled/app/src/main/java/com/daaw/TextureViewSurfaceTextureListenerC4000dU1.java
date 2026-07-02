package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxh;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.dU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class TextureViewSurfaceTextureListenerC4000dU1 extends AbstractC4567fU1 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final Map T;
    public final FU1 D;
    public final GU1 E;
    public final boolean F;
    public int G;
    public int H;
    public MediaPlayer I;
    public Uri J;
    public int K;
    public int L;
    public int M;
    public DU1 N;
    public final boolean O;
    public int P;
    public InterfaceC4278eU1 Q;
    public boolean R;
    public Integer S;

    static {
        HashMap map = new HashMap();
        T = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC4000dU1(Context context, FU1 fu1, boolean z, boolean z2, EU1 eu1, GU1 gu1) {
        super(context);
        this.G = 0;
        this.H = 0;
        this.R = false;
        this.S = null;
        setSurfaceTextureListener(this);
        this.D = fu1;
        this.E = gu1;
        this.O = z;
        this.F = z2;
        gu1.a(this);
    }

    public static /* bridge */ /* synthetic */ void J(TextureViewSurfaceTextureListenerC4000dU1 textureViewSurfaceTextureListenerC4000dU1, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue() || textureViewSurfaceTextureListenerC4000dU1.D == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    textureViewSurfaceTextureListenerC4000dU1.S = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                textureViewSurfaceTextureListenerC4000dU1.D.U("onMetadataEvent", map);
            }
        } catch (RuntimeException e) {
            zzt.zzo().u(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    public final void C() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.J == null || surfaceTexture == null) {
            return;
        }
        D(false);
        try {
            zzt.zzk();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.I = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.I.setOnCompletionListener(this);
            this.I.setOnErrorListener(this);
            this.I.setOnInfoListener(this);
            this.I.setOnPreparedListener(this);
            this.I.setOnVideoSizeChangedListener(this);
            this.M = 0;
            if (this.O) {
                DU1 du1 = new DU1(getContext());
                this.N = du1;
                du1.c(surfaceTexture, getWidth(), getHeight());
                this.N.start();
                SurfaceTexture surfaceTextureA = this.N.a();
                if (surfaceTextureA != null) {
                    surfaceTexture = surfaceTextureA;
                } else {
                    this.N.d();
                    this.N = null;
                }
            }
            this.I.setDataSource(getContext(), this.J);
            zzt.zzl();
            this.I.setSurface(new Surface(surfaceTexture));
            this.I.setAudioStreamType(3);
            this.I.setScreenOnWhilePlaying(true);
            this.I.prepareAsync();
            E(1);
        } catch (IOException e) {
            e = e;
            AbstractC4274eT1.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.J)), e);
            onError(this.I, 1, 0);
        } catch (IllegalArgumentException e2) {
            e = e2;
            AbstractC4274eT1.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.J)), e);
            onError(this.I, 1, 0);
        } catch (IllegalStateException e3) {
            e = e3;
            AbstractC4274eT1.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.J)), e);
            onError(this.I, 1, 0);
        }
    }

    public final void D(boolean z) {
        zze.zza("AdMediaPlayerView release");
        DU1 du1 = this.N;
        if (du1 != null) {
            du1.d();
            this.N = null;
        }
        MediaPlayer mediaPlayer = this.I;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.I.release();
            this.I = null;
            E(0);
            if (z) {
                this.H = 0;
            }
        }
    }

    public final void E(int i) {
        if (i == 3) {
            this.E.c();
            this.C.b();
        } else if (this.G == 3) {
            this.E.e();
            this.C.c();
        }
        this.G = i;
    }

    public final void F(float f) {
        MediaPlayer mediaPlayer = this.I;
        if (mediaPlayer == null) {
            AbstractC4274eT1.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final boolean G() {
        int i;
        return (this.I == null || (i = this.G) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final /* synthetic */ void b(int i) {
        InterfaceC4278eU1 interfaceC4278eU1 = this.Q;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int i() {
        if (G()) {
            return this.I.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int j() {
        if (Build.VERSION.SDK_INT < 26 || !G()) {
            return -1;
        }
        return this.I.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int k() {
        if (G()) {
            return this.I.getDuration();
        }
        return -1;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int l() {
        MediaPlayer mediaPlayer = this.I;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int m() {
        MediaPlayer mediaPlayer = this.I;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final long n() {
        return 0L;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final long o() {
        if (this.S != null) {
            return (p() * ((long) this.M)) / 100;
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.M = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        E(5);
        this.H = 5;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new PT1(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = T;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        AbstractC4274eT1.zzj("AdMediaPlayerView MediaPlayer error: " + str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2);
        E(-1);
        this.H = -1;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new WT1(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = T;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.K
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.L
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.K
            if (r2 <= 0) goto L7e
            int r2 = r5.L
            if (r2 <= 0) goto L7e
            com.daaw.DU1 r2 = r5.N
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L44
            if (r1 != r2) goto L42
            int r0 = r5.K
            int r1 = r0 * r7
            int r2 = r5.L
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7e
        L42:
            r0 = 1073741824(0x40000000, float:2.0)
        L44:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.L
            int r0 = r0 * r6
            int r2 = r5.K
            int r0 = r0 / r2
            if (r1 != r3) goto L54
            if (r0 <= r7) goto L54
            goto L63
        L54:
            r1 = r0
            goto L40
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.K
            int r1 = r1 * r7
            int r2 = r5.L
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.K
            int r4 = r5.L
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.daaw.DU1 r6 = r5.N
            if (r6 == 0) goto L88
            r6.b(r0, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.TextureViewSurfaceTextureListenerC4000dU1.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView prepared");
        E(2);
        this.E.b();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new OT1(this, mediaPlayer));
        this.K = mediaPlayer.getVideoWidth();
        this.L = mediaPlayer.getVideoHeight();
        int i = this.P;
        if (i != 0) {
            t(i);
        }
        if (this.F && G() && this.I.getCurrentPosition() > 0 && this.H != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            F(0.0f);
            this.I.start();
            int currentPosition = this.I.getCurrentPosition();
            long jA = zzt.zzB().a();
            while (G() && this.I.getCurrentPosition() == currentPosition && zzt.zzB().a() - jA <= 250) {
            }
            this.I.pause();
            zzn();
        }
        AbstractC4274eT1.zzi("AdMediaPlayerView stream dimensions: " + this.K + " x " + this.L);
        if (this.H == 3) {
            s();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface created");
        C();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new XT1(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.I;
        if (mediaPlayer != null && this.P == 0) {
            this.P = mediaPlayer.getCurrentPosition();
        }
        DU1 du1 = this.N;
        if (du1 != null) {
            du1.d();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new ZT1(this));
        D(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.H;
        boolean z = false;
        if (this.K == i && this.L == i2) {
            z = true;
        }
        if (this.I != null && i3 == 3 && z) {
            int i4 = this.P;
            if (i4 != 0) {
                t(i4);
            }
            s();
        }
        DU1 du1 = this.N;
        if (du1 != null) {
            du1.b(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new YT1(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.E.f(this);
        this.B.a(surfaceTexture, this.Q);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.K = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.L = videoHeight;
        if (this.K == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.NT1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.b(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.daaw.AbstractC4567fU1
    public final long p() {
        if (this.S != null) {
            return ((long) k()) * ((long) this.S.intValue());
        }
        return -1L;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final String q() {
        return "MediaPlayer".concat(true != this.O ? "" : " spherical");
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void r() {
        zze.zza("AdMediaPlayerView pause");
        if (G() && this.I.isPlaying()) {
            this.I.pause();
            E(4);
            com.google.android.gms.ads.internal.util.zzt.zza.post(new RunnableC3443bU1(this));
        }
        this.H = 4;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void s() {
        zze.zza("AdMediaPlayerView play");
        if (G()) {
            this.I.start();
            E(3);
            this.B.b();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new RunnableC3164aU1(this));
        }
        this.H = 3;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void t(int i) {
        zze.zza("AdMediaPlayerView seek " + i);
        if (!G()) {
            this.P = i;
        } else {
            this.I.seekTo(i);
            this.P = 0;
        }
    }

    @Override // android.view.View
    public final String toString() {
        return TextureViewSurfaceTextureListenerC4000dU1.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void u(InterfaceC4278eU1 interfaceC4278eU1) {
        this.Q = interfaceC4278eU1;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void v(String str) {
        Uri uri = Uri.parse(str);
        zzaxh zzaxhVarE = zzaxh.e(uri);
        if (zzaxhVarE == null || zzaxhVarE.B != null) {
            if (zzaxhVarE != null) {
                uri = Uri.parse(zzaxhVarE.B);
            }
            this.J = uri;
            this.P = 0;
            C();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void w() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.I;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.I.release();
            this.I = null;
            E(0);
            this.H = 0;
        }
        this.E.d();
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void x(float f, float f2) {
        DU1 du1 = this.N;
        if (du1 != null) {
            du1.e(f, f2);
        }
    }

    @Override // com.daaw.AbstractC4567fU1, com.daaw.IU1
    public final void zzn() {
        F(this.C.a());
    }
}
