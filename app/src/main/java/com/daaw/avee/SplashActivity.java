package com.daaw.avee;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.daaw.AbstractC0441Bk1;
import com.daaw.AbstractC3192ab0;
import com.daaw.AbstractC5056hD0;
import com.daaw.AbstractC5624jG0;
import com.daaw.AbstractC9815yD0;
import com.daaw.C3585bz0;
import com.daaw.EnumC7395pb0;
import com.daaw.G10;
import com.daaw.GD0;
import com.daaw.IL;
import com.daaw.InterfaceC4484fC0;
import com.daaw.LQ;
import com.daaw.MR0;
import com.daaw.O90;
import com.daaw.P8;
import com.daaw.T5;
import com.daaw.avee.SplashActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/daaw/avee/SplashActivity;", "Lcom/daaw/P8;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/daaw/G91;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "C0", "Lcom/daaw/MR0;", "e0", "Lcom/daaw/O90;", "D0", "()Lcom/daaw/MR0;", "sharedPrefs", "Landroid/view/SurfaceView;", "f0", "Landroid/view/SurfaceView;", "surfaceView", "Landroid/view/SurfaceHolder;", "g0", "Landroid/view/SurfaceHolder;", "surfaceHolder", "Landroid/media/MediaPlayer;", "h0", "Landroid/media/MediaPlayer;", "mediaPlayer", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SplashActivity extends P8 {

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final O90 sharedPrefs = AbstractC3192ab0.b(EnumC7395pb0.B, new b(this, null, null));

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public SurfaceView surfaceView;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public SurfaceHolder surfaceHolder;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public MediaPlayer mediaPlayer;

    public static final class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            G10.g(surfaceHolder, "holder");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            G10.g(surfaceHolder, "holder");
            MediaPlayer mediaPlayer = SplashActivity.this.mediaPlayer;
            G10.d(mediaPlayer);
            mediaPlayer.setDisplay(surfaceHolder);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            G10.g(surfaceHolder, "holder");
        }
    }

    public static final class b implements LQ {
        public final /* synthetic */ ComponentCallbacks B;
        public final /* synthetic */ InterfaceC4484fC0 C;
        public final /* synthetic */ LQ D;

        public b(ComponentCallbacks componentCallbacks, InterfaceC4484fC0 interfaceC4484fC0, LQ lq) {
            this.B = componentCallbacks;
            this.C = interfaceC4484fC0;
            this.D = lq;
        }

        @Override // com.daaw.LQ
        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.B;
            return T5.a(componentCallbacks).c(AbstractC5624jG0.b(MR0.class), this.C, this.D);
        }
    }

    private final MR0 D0() {
        return (MR0) this.sharedPrefs.getValue();
    }

    public static final void E0(SplashActivity splashActivity) {
        G10.g(splashActivity, "this$0");
        splashActivity.C0();
    }

    public final void C0() {
        C3585bz0 c3585bz0A = D0().a();
        c3585bz0A.b(Integer.valueOf(((Number) c3585bz0A.a()).intValue() + 1));
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    @Override // com.daaw.MP, com.daaw.AbstractActivityC5776jo, com.daaw.AbstractActivityC7459po, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IL.a().c("SplashActivity onCreate");
        setContentView(AbstractC9815yD0.a);
        this.surfaceView = (SurfaceView) findViewById(AbstractC5056hD0.l3);
        this.mediaPlayer = new MediaPlayer();
        try {
            SurfaceView surfaceView = this.surfaceView;
            SurfaceHolder holder = surfaceView != null ? surfaceView.getHolder() : null;
            this.surfaceHolder = holder;
            if (holder != null) {
                holder.setFormat(-3);
            }
            SurfaceHolder surfaceHolder = this.surfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(new a());
            }
            MediaPlayer mediaPlayer = this.mediaPlayer;
            G10.d(mediaPlayer);
            Uri.Builder builderAuthority = new Uri.Builder().scheme("android.resource").authority(getPackageName());
            int i = GD0.G;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            mediaPlayer.setDataSource(this, builderAuthority.appendPath(sb.toString()).build());
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            G10.d(mediaPlayer2);
            mediaPlayer2.setLooping(true);
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            G10.d(mediaPlayer3);
            mediaPlayer3.prepare();
            MediaPlayer mediaPlayer4 = this.mediaPlayer;
            G10.d(mediaPlayer4);
            mediaPlayer4.start();
        } catch (Exception e) {
            AbstractC0441Bk1.b(e, "splash webm fail");
            SurfaceView surfaceView2 = this.surfaceView;
            if (surfaceView2 != null) {
                surfaceView2.setVisibility(8);
            }
            findViewById(AbstractC5056hD0.v1).setVisibility(0);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.daaw.sV0
            @Override // java.lang.Runnable
            public final void run() {
                SplashActivity.E0(this.B);
            }
        }, 1333L);
    }

    @Override // com.daaw.P8, com.daaw.MP, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            G10.d(mediaPlayer);
            mediaPlayer.stop();
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            G10.d(mediaPlayer2);
            mediaPlayer2.release();
            this.mediaPlayer = null;
        }
        this.surfaceView = null;
        this.surfaceHolder = null;
    }
}
