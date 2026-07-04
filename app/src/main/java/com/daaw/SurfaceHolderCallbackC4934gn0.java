package com.daaw;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.daaw.C9938yg1;
import com.daaw.avee.comp.playback.a;
import com.daaw.avee.comp.playback.b;
import com.daaw.avee.comp.playback.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.gn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class SurfaceHolderCallbackC4934gn0 implements com.daaw.avee.comp.playback.e, b.d, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {
    public Context C;
    public e.b D;
    public final Object B = new Object();
    public int E = 0;
    public int F = 1;
    public Uri G = null;
    public float H = 1.0f;
    public boolean I = false;
    public long J = 0;
    public C6051kn0 K = null;
    public C4655fn0 L = new C4655fn0(this);
    public WeakReference M = new WeakReference(null);
    public List N = new LinkedList();
    public b[] O = new b[2];

    /* JADX INFO: renamed from: com.daaw.gn0$a */
    public class a implements C9938yg1.a {
        public a() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            SurfaceHolderCallbackC4934gn0.this.B();
        }
    }

    /* JADX INFO: renamed from: com.daaw.gn0$b */
    public class b implements MediaPlayer.OnPreparedListener {
        public MediaPlayer B = null;
        public boolean C = false;
        public float D = 1.0f;
        public long E = 0;
        public float F = 1.0f;
        public float G = 1.0f;
        public float H = 0.0f;
        public volatile a I = new a();
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;

        /* JADX INFO: renamed from: com.daaw.gn0$b$a */
        public class a {
            public int a = -1;
            public boolean b = false;
            public int c = 0;

            public a() {
            }
        }

        public b() {
        }

        public boolean a() {
            if (this.B == null || b() < 2) {
                return false;
            }
            try {
                for (MediaPlayer.TrackInfo trackInfo : this.B.getTrackInfo()) {
                    if (trackInfo.getTrackType() == 1) {
                        return true;
                    }
                }
            } catch (Exception e) {
                AbstractC0441Bk1.c(e.getMessage());
            }
            return false;
        }

        public int b() {
            return this.J;
        }

        public boolean c() {
            return this.J > 0;
        }

        public boolean d() {
            int i = this.J;
            return ((i == 1 || i == 3) && this.C) || i == 5;
        }

        public void e(long j) {
            this.E = j;
            this.B.prepareAsync();
        }

        public void f() {
            SurfaceHolderCallbackC4934gn0.this.m(null);
            if (this.B != null) {
                if (b() > 2) {
                    this.B.stop();
                }
                this.B.release();
            }
            this.B = null;
        }

        public void g(float f) {
            this.G = f;
            o();
        }

        public boolean h(float f) {
            boolean z;
            boolean z2 = true;
            if (this.J < 0) {
                return true;
            }
            float f2 = this.G + f;
            this.G = f2;
            if (f2 <= 0.0f) {
                this.G = 0.0f;
                z = true;
            } else {
                z = false;
            }
            if (this.G >= 1.0f) {
                this.G = 1.0f;
            } else {
                z2 = z;
            }
            o();
            return z2;
        }

        public void i(float f) {
            this.D = f;
        }

        public void j(int i) {
            this.J = i;
            a aVar = new a();
            aVar.a = i;
            aVar.b = d();
            MediaPlayer mediaPlayer = this.B;
            aVar.c = mediaPlayer != null ? mediaPlayer.getAudioSessionId() : 0;
            this.I = aVar;
        }

        public void k(int i) {
            if (this.B != null && b() >= 2) {
                try {
                    this.B.setVideoScalingMode(SurfaceHolderCallbackC4934gn0.A(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void l(Surface surface) {
            if (this.B == null) {
                return;
            }
            if (surface == null || !surface.isValid()) {
                this.B.setSurface(null);
            } else {
                this.B.setSurface(surface);
            }
        }

        public void m(float f) {
            this.F = f;
            o();
        }

        public void n(float f) {
            this.H = f;
            o();
        }

        public void o() {
            if (this.J < 0) {
                return;
            }
            float fMin = Math.min(1.0f - this.H, 1.0f);
            float fMin2 = Math.min(this.H + 1.0f, 1.0f);
            MediaPlayer mediaPlayer = this.B;
            float f = this.G;
            float f2 = this.F;
            mediaPlayer.setVolume(fMin * f * f2, fMin2 * f * f2);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            j(3);
            mediaPlayer.seekTo((int) this.E);
            g(this.D);
            if (this.C) {
                SurfaceHolderCallbackC4934gn0.this.K(false);
            }
            SurfaceHolderCallbackC4934gn0.this.D.a(true, null);
        }
    }

    public SurfaceHolderCallbackC4934gn0(Context context, String str, e.b bVar) {
        int i = 0;
        this.C = context;
        this.D = bVar;
        while (true) {
            b[] bVarArr = this.O;
            if (i >= bVarArr.length) {
                AbstractC4507fI.b.b(new a(), this.N);
                return;
            } else {
                bVarArr[i] = new b();
                i++;
            }
        }
    }

    public static int A(int i) {
        return (i != 1 && i == 2) ? 2 : 1;
    }

    public void B() {
        synchronized (this.B) {
            try {
                C6051kn0 c6051kn0 = this.K;
                if (c6051kn0 != null && SystemClock.elapsedRealtime() - this.J > 8000) {
                    c6051kn0.c();
                    this.K = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void C(int i) {
        b[] bVarArr = this.O;
        if (bVarArr[i] == null) {
            bVarArr[i] = new b();
        }
        if (this.O[i].B == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnPreparedListener(this.O[i]);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setWakeMode(this.C, 1);
            this.O[i].B = mediaPlayer;
        }
        this.O[i].B.reset();
        I(i, 0);
        this.O[i].C = false;
    }

    public void D() {
        int i = this.E;
        this.E = this.F;
        this.F = i;
    }

    public void E(int i) {
        if (i == 0) {
            AbstractC0441Bk1.c("trying to destroy currentPlayer");
            return;
        }
        int i2 = this.E;
        int i3 = this.F;
        if (i2 == i3) {
            return;
        }
        G(i3);
    }

    public void F(int i, Uri uri, float f, long j) {
        C(i);
        try {
            this.O[i].B.setDataSource(this.C, uri);
            I(i, 1);
            this.O[i].B.setAudioStreamType(3);
            this.O[i].k(this.D.l());
            m(this.D.n());
            this.O[this.E].g(f);
            this.O[this.E].i(f);
            this.O[i].e(j);
        } catch (IOException e) {
            this.D.a(true, "Failed open media source");
            AbstractC0441Bk1.c(e.getMessage());
            I(i, -1);
            onCompletion(this.O[i].B);
        } catch (IllegalArgumentException e2) {
            this.D.a(true, "Invalid media source");
            AbstractC0441Bk1.c(e2.getMessage());
            I(i, -1);
            onCompletion(this.O[i].B);
        }
    }

    public void G(int i) {
        H(i, false);
    }

    public void H(int i, boolean z) {
        b[] bVarArr = this.O;
        if (i >= bVarArr.length) {
            return;
        }
        bVarArr[i].f();
        I(i, -2);
        this.O[i].C = false;
    }

    public void I(int i, int i2) {
        this.O[i].j(i2);
        C4655fn0 c4655fn0 = this.L;
        if (c4655fn0 == null || i != this.E) {
            return;
        }
        c4655fn0.h(this.O[i].I.c);
        this.L.i();
    }

    public void J(boolean z, float f) {
        this.I = z;
        this.H = f;
        int i = 0;
        if (z) {
            b[] bVarArr = this.O;
            int length = bVarArr.length;
            while (i < length) {
                b bVar = bVarArr[i];
                if (bVar != null) {
                    bVar.m(0.0f);
                }
                i++;
            }
            return;
        }
        b[] bVarArr2 = this.O;
        int length2 = bVarArr2.length;
        while (i < length2) {
            b bVar2 = bVarArr2[i];
            if (bVar2 != null) {
                bVar2.m(this.H);
            }
            i++;
        }
    }

    public final void K(boolean z) {
        if (this.O[this.E].b() < 2) {
            this.O[this.E].C = true;
            return;
        }
        if (this.O[this.E].b() >= 3) {
            if (this.D.h()) {
                this.O[this.E].B.start();
                I(this.E, 5);
            }
            if (z) {
                this.D.a(false, null);
                return;
            }
            return;
        }
        b bVar = this.O[this.E];
        bVar.C = true;
        try {
            bVar.B.prepareAsync();
        } catch (IllegalStateException unused) {
            I(this.E, -1);
        } catch (Exception unused2) {
            I(this.E, -1);
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void a() {
        C4655fn0 c4655fn0 = this.L;
        if (c4655fn0 != null) {
            c4655fn0.j();
            this.L = null;
        }
        SurfaceHolder surfaceHolder = (SurfaceHolder) this.M.get();
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            this.M = new WeakReference(null);
        }
        G(this.E);
        G(this.F);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void b() {
        if (this.O[this.E].b() < 4) {
            return;
        }
        this.O[this.E].B.pause();
        I(this.E, 4);
        this.D.a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public void c(b.C0153b c0153b) {
        this.D.c(c0153b);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public b.c d(String str) {
        return this.D.d(str);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void e(boolean z) {
        J(z, this.H);
        this.D.f(z);
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean f() {
        return this.I;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void g(long j) {
        if (this.O[this.E].b() < 3) {
            return;
        }
        this.O[this.E].g(1.0f);
        this.O[this.E].B.seekTo((int) j);
    }

    @Override // com.daaw.avee.comp.playback.e
    public C0705Dw0 h() {
        if (this.O[this.E].b() < 2) {
            return null;
        }
        return new C0705Dw0(this.O[this.E].B.getDuration(), this.O[this.E].a());
    }

    @Override // com.daaw.avee.comp.playback.e
    public com.daaw.avee.comp.playback.a i(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
        com.daaw.avee.comp.playback.a aVarA;
        if (aVar == null) {
            return null;
        }
        b.a aVar2 = this.O[this.E].I;
        if (!gVar.f) {
            if (aVar2.a < 3) {
                return null;
            }
            if (!aVar2.b) {
                return aVar;
            }
        }
        int i = aVar2.c;
        synchronized (this.B) {
            try {
                C6051kn0 c6051kn0 = this.K;
                if (c6051kn0 == null) {
                    c6051kn0 = new C6051kn0();
                }
                C6051kn0 c6051kn02 = c6051kn0;
                this.J = SystemClock.elapsedRealtime();
                if (gVar.g < 0) {
                    aVarA = c6051kn02.a(0L, gVar, aVar, i, gVar.e || gVar.f);
                } else {
                    AbstractC0441Bk1.c("overridePositionUs not supported on Native");
                    aVarA = c6051kn02.a(0L, gVar, aVar, i, gVar.e || gVar.f);
                }
                this.K = c6051kn02;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarA;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void j(boolean z, boolean z2, float f, long j) {
        if (z) {
            int i = this.E;
            int i2 = this.F;
            if (i != i2) {
                G(i2);
            }
        } else if (this.O[this.E].c()) {
            D();
        }
        Uri uri = this.G;
        if (uri == null || uri.equals(Uri.EMPTY)) {
            AbstractC0441Bk1.c("nextDataSource is null");
            if (z2) {
                K(true);
                return;
            } else {
                b();
                return;
            }
        }
        F(this.E, this.G, f, j);
        if (z2) {
            K(true);
        } else {
            b();
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public long k() {
        if (this.O[this.E].b() < 2) {
            return 0L;
        }
        return this.O[this.E].B.getCurrentPosition();
    }

    @Override // com.daaw.avee.comp.playback.e
    public long l() {
        if (this.O[this.E].b() < 2) {
            return 0L;
        }
        return this.O[this.E].B.getDuration();
    }

    @Override // com.daaw.avee.comp.playback.e
    public void m(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.M = new WeakReference(surfaceHolder);
            surfaceHolder.addCallback(this);
            surfaceCreated(surfaceHolder);
        } else {
            SurfaceHolder surfaceHolder2 = (SurfaceHolder) this.M.get();
            if (surfaceHolder2 != null) {
                surfaceHolder2.removeCallback(this);
                this.M = new WeakReference(null);
            }
            surfaceDestroyed(null);
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void n(b.c cVar) {
        C4655fn0 c4655fn0 = this.L;
        if (c4655fn0 != null) {
            c4655fn0.m(cVar);
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void o() {
        synchronized (this.B) {
            try {
                C6051kn0 c6051kn0 = this.K;
                if (c6051kn0 == null) {
                    return;
                }
                c6051kn0.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (this.O[this.E].B == mediaPlayer) {
            this.D.j(true, i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        b bVar = this.O[this.E];
        if (bVar.B == mediaPlayer) {
            if (bVar.b() < 0) {
                this.D.g(true);
            } else {
                this.D.o();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        b[] bVarArr = this.O;
        int i3 = this.E;
        if (bVarArr[i3].B == mediaPlayer) {
            I(i3, -1);
        } else {
            int i4 = this.F;
            if (bVarArr[i4].B == mediaPlayer) {
                I(i4, -1);
            } else {
                AbstractC6278lb.j();
            }
        }
        this.D.a(false, "Error: " + i + "," + i2);
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.D.i(i, i2, (i * 1.0f) / i2);
    }

    @Override // com.daaw.avee.comp.playback.e
    public b.C0153b p() {
        C4655fn0 c4655fn0 = this.L;
        if (c4655fn0 != null) {
            return c4655fn0.d();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void q(e.b bVar) {
        this.D = bVar;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void r(InterfaceC7377pX interfaceC7377pX) {
        this.G = interfaceC7377pX.a();
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean s() {
        return this.O[this.E].c();
    }

    @Override // com.daaw.avee.comp.playback.e
    public void start() {
        K(true);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void stop() {
        if (this.O[this.E].b() < 2) {
            return;
        }
        this.O[this.E].B.stop();
        I(this.E, 2);
        this.D.a(false, null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.O[this.F].l(null);
            this.O[this.E].l(surfaceHolder.getSurface());
        } else {
            this.O[this.F].l(null);
            this.O[this.E].l(null);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i = this.E;
        int i2 = this.F;
        if (i != i2) {
            this.O[i2].l(null);
        }
        this.O[this.E].l(null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean t(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.E;
        } else {
            i2 = this.F;
            if (this.E == i2) {
                return true;
            }
        }
        b bVar = this.O[i2];
        return bVar == null || bVar.h(f);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void u(int i) {
        this.O[this.E].k(i);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void v() {
        if (this.E == this.F) {
            return;
        }
        E(1);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public boolean w(String str) {
        return this.D.e(str);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void x(float f) {
        for (b bVar : this.O) {
            if (bVar != null) {
                bVar.n(f);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean y() {
        return this.O[this.E].d();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
