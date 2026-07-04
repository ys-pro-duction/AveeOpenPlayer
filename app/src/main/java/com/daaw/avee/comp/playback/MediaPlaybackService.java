package com.daaw.avee.comp.playback;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import com.daaw.AC0;
import com.daaw.AbstractC0441Bk1;
import com.daaw.AbstractC0857Fi0;
import com.daaw.AbstractC1765Ob1;
import com.daaw.AbstractC2022Qi0;
import com.daaw.AbstractC4796gI;
import com.daaw.AbstractC5075hI;
import com.daaw.AbstractC9536xD0;
import com.daaw.AbstractServiceC1185Im0;
import com.daaw.B61;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0642Dg1;
import com.daaw.C0705Dw0;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C2078Qw0;
import com.daaw.C8217sY;
import com.daaw.C8266si0;
import com.daaw.C8974vC0;
import com.daaw.C9938yg1;
import com.daaw.G3;
import com.daaw.InterfaceC1688Ni0;
import com.daaw.InterfaceC6540mX;
import com.daaw.InterfaceC7381pY;
import com.daaw.JD0;
import com.daaw.KQ;
import com.daaw.SharedPreferencesOnSharedPreferenceChangeListenerC5706ja;
import com.daaw.SurfaceHolderCallbackC4934gn0;
import com.daaw.TI;
import com.daaw.UI;
import com.daaw.avee.comp.playback.a;
import com.daaw.avee.comp.playback.b;
import com.daaw.avee.comp.playback.e;
import com.daaw.avee.comp.playback.view.MediaAppWidgetProvider;

/* JADX INFO: loaded from: classes.dex */
public class MediaPlaybackService extends AbstractServiceC1185Im0 implements InterfaceC1688Ni0, AudioManager.OnAudioFocusChangeListener {
    public final boolean[] F;
    public final boolean[] G;
    public boolean H;
    public int I;
    public C8266si0 J;
    public ComponentName K;
    public RemoteControlClient L;
    public InterfaceC7381pY M;
    public boolean N;
    public B61 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public k V;
    public int W;
    public boolean X;
    public boolean Y;
    public com.daaw.avee.comp.playback.d Z;
    public int a0;
    public int b0;
    public AudioManager c0;
    public b.C0153b d0;
    public com.daaw.avee.a e0;
    public Object f0;
    public String g0;
    public Runnable h0;
    public Runnable i0;
    public e.b j0;
    public final Runnable k0;
    public final Runnable l0;
    public C2078Qw0 m0;
    public static C10217zg1 n0 = new C10217zg1();
    public static C10217zg1 o0 = new C10217zg1();
    public static C10217zg1 p0 = new C10217zg1();
    public static C0746Eg1 q0 = new C0746Eg1();
    public static C0746Eg1 r0 = new C0746Eg1();
    public static C0642Dg1 s0 = new C0642Dg1();
    public static C0529Cg1 t0 = new C0529Cg1();
    public static C10217zg1 u0 = new C10217zg1();
    public static C10217zg1 v0 = new C10217zg1();
    public static C10217zg1 w0 = new C10217zg1();
    public static C0746Eg1 x0 = new C0746Eg1();
    public static C0746Eg1 y0 = new C0746Eg1();
    public static C0746Eg1 z0 = new C0746Eg1();
    public static C9938yg1 A0 = new C9938yg1();
    public static C0642Dg1 B0 = new C0642Dg1();
    public static C9938yg1 C0 = new C9938yg1();
    public static C9938yg1 D0 = new C9938yg1();
    public static C10217zg1 E0 = new C10217zg1();
    public static C0425Bg1 F0 = new C0425Bg1();
    public static C0746Eg1 G0 = new C0746Eg1();
    public static C0746Eg1 H0 = new C0746Eg1();
    public static C0850Fg1 I0 = new C0850Fg1();
    public static C0850Fg1 J0 = new C0850Fg1();
    public static C10217zg1 K0 = new C10217zg1();
    public static C0642Dg1 L0 = new C0642Dg1();
    public static C9938yg1 M0 = new C9938yg1();
    public static C10217zg1 N0 = new C10217zg1();
    public static MediaPlaybackService O0 = null;

    public class a implements Runnable {
        public final /* synthetic */ b.c B;

        public a(b.c cVar) {
            this.B = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.y0(this.B);
        }
    }

    public class b implements e.b {
        public b() {
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void a(boolean z, String str) {
            MediaPlaybackService.this.c0(z, str);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void b() {
            MediaPlaybackService.M0.a();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void c(b.C0153b c0153b) {
            MediaPlaybackService.this.d0 = c0153b;
            MediaPlaybackService.K0.a(c0153b);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public b.c d(String str) {
            return (b.c) MediaPlaybackService.I0.a(str, null);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public boolean e(String str) {
            return ((Boolean) MediaPlaybackService.J0.a(str, Boolean.FALSE)).booleanValue();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void f(boolean z) {
            MediaPlaybackService.w0.a(Boolean.valueOf(z));
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void g(boolean z) {
            MediaPlaybackService.this.Y(z);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public boolean h() {
            return MediaPlaybackService.this.l0();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void i(int i, int i2, float f) {
            MediaPlaybackService.F0.a(Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f));
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void j(boolean z, int i) {
            MediaPlaybackService.this.a0(z, i);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void k(UI ui) {
            MediaPlaybackService.N0.a(ui);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public int l() {
            return ((Integer) MediaPlaybackService.H0.a(0)).intValue();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void m(long j) {
            MediaPlaybackService.this.X(j);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public SurfaceHolder n() {
            return (SurfaceHolder) MediaPlaybackService.G0.a(null);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void o() {
            MediaPlaybackService.this.Z();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                MediaPlaybackService.this.O();
                notifyAll();
                MediaPlaybackService.this.F[0] = true;
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                MediaPlaybackService.this.y();
                notifyAll();
                MediaPlaybackService.this.G[0] = true;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.p0();
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ int B;

        public f(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.u0(this.B);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.r0();
        }
    }

    public class h implements InterfaceC7381pY {
        public Object a;

        public h() {
        }

        @Override // com.daaw.InterfaceC7381pY
        public void a(Object obj) {
            this.a = obj;
        }

        @Override // com.daaw.InterfaceC7381pY
        public void b(C8217sY c8217sY, String str, String str2) {
            MediaPlaybackService.this.B0(AbstractC1765Ob1.h(C8217sY.g(c8217sY)));
            C8217sY.c(c8217sY);
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ Bitmap B;

        public i(Bitmap bitmap) {
            this.B = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.A0(this.B);
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.daaw.avee.comp.playback.e eVarG = MediaPlaybackService.this.G();
            if (eVarG != null) {
                eVarG.p();
            }
        }
    }

    public class k implements Runnable {
        public final long B;
        public final boolean C;
        public C2078Qw0 D;

        public k(long j, boolean z, C2078Qw0 c2078Qw0) {
            this.B = j;
            this.C = z;
            this.D = c2078Qw0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MediaPlaybackService.this.H) {
                MediaPlaybackService.B0.a(Integer.valueOf(MediaPlaybackService.this.a0), Boolean.valueOf(MediaPlaybackService.this.U), Long.valueOf(this.B), Boolean.valueOf(this.C), this.D);
            }
        }
    }

    public MediaPlaybackService() {
        super("MediaPlaybackService");
        this.F = new boolean[1];
        this.G = new boolean[1];
        this.H = false;
        this.I = -1;
        this.N = false;
        this.O = null;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = -1;
        this.U = false;
        this.V = new k(0L, false, null);
        this.W = 4;
        this.X = false;
        this.Y = true;
        this.a0 = -1;
        this.b0 = 0;
        this.d0 = null;
        this.e0 = null;
        this.g0 = null;
        this.h0 = new Runnable() { // from class: com.daaw.Gi0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.R();
            }
        };
        this.i0 = new Runnable() { // from class: com.daaw.Hi0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.S();
            }
        };
        this.j0 = new b();
        this.k0 = new c();
        this.l0 = new d();
        this.m0 = null;
        b(false);
        this.Z = new com.daaw.avee.comp.playback.d(com.daaw.avee.comp.playback.e.r, this.j0, 0L);
    }

    public static int A(Context context) {
        Cursor cursorE = AbstractC2022Qi0.e(context.getContentResolver(), Uri.parse("content://media/external/fs_id"), null, null, null, null);
        if (cursorE == null) {
            return -1;
        }
        cursorE.moveToFirst();
        int i2 = cursorE.getInt(0);
        cursorE.close();
        return i2;
    }

    public static MediaPlaybackService D() {
        return O0;
    }

    public final void A0(Bitmap bitmap) {
        RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.L.editMetadata(false);
        metadataEditorEditMetadata.putBitmap(100, bitmap);
        metadataEditorEditMetadata.apply();
    }

    public C2078Qw0 B() {
        B61 b61 = this.O;
        if (b61 == null) {
            return null;
        }
        return (C2078Qw0) b61.a;
    }

    public final void B0(Bitmap bitmap) {
        this.C.post(new i(bitmap));
    }

    public b.C0153b C() {
        this.C.post(new j());
        return this.d0;
    }

    public void C0(int i2, boolean z) {
        if (this.a0 == i2) {
            return;
        }
        this.a0 = i2;
        if (z) {
            if (i2 == 0) {
                b0(JD0.q4);
            } else if (i2 == 1) {
                b0(JD0.p4);
            } else if (i2 == 2) {
                b0(JD0.o4);
            }
        }
        u0.a(Integer.valueOf(this.a0));
    }

    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final void V(boolean z) {
        this.Y = z;
        R0();
    }

    public C2078Qw0 E() {
        B61 b61F = F();
        return b61F != null ? (C2078Qw0) b61F.a : C2078Qw0.k;
    }

    public void E0(final boolean z) {
        this.C.post(new Runnable() { // from class: com.daaw.Ki0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.V(z);
            }
        });
    }

    public B61 F() {
        B61 b61 = this.O;
        if (b61 != null) {
            return b61;
        }
        return null;
    }

    public void F0(int i2) {
        this.Z.s().u(i2);
        if (H() == 1) {
            p0();
        }
    }

    public final com.daaw.avee.comp.playback.e G() {
        return this.Z.s();
    }

    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final void W(SurfaceHolder surfaceHolder) {
        this.Z.s().m(surfaceHolder);
    }

    public int H() {
        com.daaw.avee.comp.playback.e eVarS = this.Z.s();
        if (eVarS instanceof SurfaceHolderCallbackC4934gn0) {
            return 0;
        }
        return eVarS instanceof TI ? 1 : -1;
    }

    public void H0(final SurfaceHolder surfaceHolder) {
        this.C.post(new Runnable() { // from class: com.daaw.Li0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.W(surfaceHolder);
            }
        });
    }

    public com.daaw.avee.comp.playback.a I(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
        com.daaw.avee.comp.playback.e eVarG = G();
        if (eVarG != null) {
            return eVarG.i(aVar, gVar);
        }
        return null;
    }

    public void I0(int i2) {
        this.c0.setStreamVolume(3, i2, 0);
    }

    public int J() {
        return this.c0.getStreamVolume(3);
    }

    public void J0(boolean z) {
        if (G() != null) {
            G().e(z);
        }
    }

    public int K() {
        return this.c0.getStreamMaxVolume(3);
    }

    public void K0(float f2) {
        this.c0.setStreamVolume(3, (int) (this.c0.getStreamMaxVolume(3) * f2), 0);
    }

    public float L() {
        return this.c0.getStreamVolume(3) / this.c0.getStreamMaxVolume(3);
    }

    public void L0(float f2) {
        if (G() != null) {
            G().x(f2);
        }
    }

    public boolean M() {
        if (this.X) {
            return false;
        }
        AbstractC0441Bk1.a("active state");
        this.C.removeCallbacks(this.h0);
        C2078Qw0.b bVarJ = E().j(getApplicationContext());
        if (this.g0 == null) {
            this.g0 = AbstractC0857Fi0.d(this);
        }
        startForeground(1, AbstractC0857Fi0.f(this, 1, this.g0, bVarJ, P(), T0(), MediaPlaybackService.class, 0, new KQ() { // from class: com.daaw.Ji0
            @Override // com.daaw.KQ
            public final Object a() {
                return this.a.Q();
            }
        }));
        this.X = true;
        return true;
    }

    public final void M0(boolean z) {
        this.U = z;
        s0.a(Boolean.valueOf(P()), Boolean.valueOf(T0()), Integer.valueOf(this.T), null, null);
    }

    public void N(boolean z) {
        if (z) {
            AbstractC0441Bk1.a("idle state");
            this.X = false;
            this.C.removeCallbacks(this.h0);
            this.C.postDelayed(this.h0, getResources().getInteger(AbstractC9536xD0.c));
            stopForeground(z);
            if (z) {
                AbstractC0857Fi0.c(this, 1);
            }
        }
    }

    public void N0() {
        M0(false);
        this.Q = false;
        this.R = false;
        if (SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.Z.H();
        } else {
            this.Z.F();
        }
    }

    public void O() {
        this.X = false;
        n0.a(this);
        u0(((Integer) q0.a(-1)).intValue());
        this.c0 = (AudioManager) getSystemService("audio");
        this.J = new C8266si0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        registerReceiver(this.J, intentFilter);
        ComponentName componentName = new ComponentName(this, (Class<?>) MediaButtonEventReceiver.class);
        this.K = componentName;
        try {
            this.c0.registerMediaButtonEventReceiver(componentName);
        } catch (Exception e2) {
            AbstractC0441Bk1.c("registerMediaButtonEventReceiver failed: " + e2.getMessage());
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(this.K);
            RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 67108864));
            this.L = remoteControlClient;
            this.c0.registerRemoteControlClient(remoteControlClient);
            this.L.setTransportControlFlags(189);
        } catch (Exception e3) {
            AbstractC0441Bk1.c("remoteControlClient failed: " + e3.getMessage());
        }
        v0.a(Integer.valueOf(K()));
        this.b0 = A(this);
        C0(0, false);
        this.H = true;
        k0();
        R0();
        c0(true, null);
        w0.a(Boolean.valueOf(G().f()));
        V(((Boolean) r0.a(Boolean.TRUE)).booleanValue());
        this.f0 = C8974vC0.c();
    }

    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final void R() {
        if (G() != null) {
            G().stop();
        }
        stopSelf(this.I);
        this.X = false;
    }

    public boolean P() {
        return G().y();
    }

    public void P0() {
        if (T0()) {
            g0(false);
        } else {
            h0();
        }
    }

    public final /* synthetic */ Handler Q() {
        if (this.H) {
            return this.C;
        }
        return null;
    }

    public void Q0() {
        if (G() != null) {
            G().e(!G().f());
        }
    }

    public final boolean R0() {
        return S0(false);
    }

    public final /* synthetic */ void S() {
        E0.a(Long.valueOf(i0()));
        j0(100L);
    }

    public final boolean S0(boolean z) {
        boolean z2 = this.Q && SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_resumePlayingAfterAudioFocusGained", true);
        if ((!this.Y || ((G() != null && G().y()) || z2)) && !z) {
            if (G() == null || !G().y()) {
                m0();
            }
            return M();
        }
        if (!z) {
            m0();
        }
        N(z);
        return false;
    }

    public final /* synthetic */ Handler T() {
        if (this.H) {
            return this.C;
        }
        return null;
    }

    public boolean T0() {
        return this.U;
    }

    public void X(long j2) {
        this.C.removeCallbacksAndMessages(Integer.valueOf(this.W));
        this.C.postAtTime(new k(j2, false, null), Integer.valueOf(this.W), 0L);
    }

    public void Y(boolean z) {
        this.C.removeCallbacksAndMessages(Integer.valueOf(this.W));
        this.C.postAtTime(new k(0L, z, B()), Integer.valueOf(this.W), SystemClock.uptimeMillis() + 1000);
    }

    public void Z() {
        this.C.removeCallbacksAndMessages(Integer.valueOf(this.W));
        this.C.postAtTime(this.V, Integer.valueOf(this.W), 0L);
    }

    @Override // com.daaw.AbstractServiceC1185Im0
    public void a(Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            switch (action) {
                case "REPEAT_MODE_ACTION":
                    C0(intent.getIntExtra("EXTRA_ARG_1", 0), true);
                    break;
                case "EXIT_ACTION":
                    R();
                    break;
                case "SEEK_ACTION":
                    t0(intent.getLongExtra("EXTRA_ARG_1", 0L));
                    break;
                case "TOGGLE_PAUSE_ACTION":
                    P0();
                    break;
                case "TOGGLE_MUTE_ACTION":
                    Q0();
                    break;
                case "STOP_ACTION":
                    N0();
                    break;
                case "VIDEO_SCALING_MODE_ACTION":
                    F0(intent.getIntExtra("EXTRA_ARG_1", 0));
                    break;
                case "SET_MUTE_ACTION":
                    J0(intent.getBooleanExtra("EXTRA_ARG_1", false));
                    break;
                case "PLAY_DATA_SOURCE_ACTION":
                    String stringExtra = intent.getStringExtra("EXTRA_ARG_1");
                    C2078Qw0 c2078Qw0 = stringExtra != null ? new C2078Qw0(stringExtra) : null;
                    boolean booleanExtra = intent.getBooleanExtra("EXTRA_ARG_2", false);
                    long longExtra = intent.getLongExtra("EXTRA_ARG_3", 0L);
                    long longExtra2 = intent.getLongExtra("EXTRA_ARG_4", 0L);
                    B61 b61 = c2078Qw0 != null ? new B61(c2078Qw0, null) : null;
                    M0(booleanExtra);
                    f0(b61, longExtra, longExtra2);
                    break;
                case "HEADSET_ASSIST_ACTION":
                    A0.a();
                    break;
                case "PLAY_ACTION":
                    h0();
                    break;
                case "CROSS_FADE_VALUE_ACTION":
                    x0(intent.getFloatExtra("EXTRA_ARG_1", -1.0f));
                    break;
                case "TIMEOUT_DISABLE_ACTION":
                    V(false);
                    break;
                case "VOLUME_STEREO_BALANCE_ACTION":
                    L0(intent.getFloatExtra("EXTRA_ARG_1", 0.0f));
                    break;
                case "PREVIOUS_ACTION":
                    D0.a();
                    break;
                case "ACTIVITY_AND_SERVICE_EXIT_ACTION":
                    AbstractC4796gI.a.a();
                    R();
                    break;
                case "VOLUME_PERCENTAGE_ACTION":
                    K0(intent.getFloatExtra("EXTRA_ARG_1", 20.0f));
                    break;
                case "NEXT_ACTION":
                    C0.a();
                    break;
                case "AUDIO_BECOMING_NOISY_ACTION":
                    g0(true);
                    break;
                case "PAUSE_ACTION":
                    g0(false);
                    break;
                case "ACTION_HEADSET_PLUGGED_IN":
                    boolean zK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_resumeWhenHeadsetPluggedIn", true);
                    if (this.R && zK) {
                        h0();
                        break;
                    }
                    break;
                case "VOLUME_ACTION":
                    I0(intent.getIntExtra("EXTRA_ARG_1", 0));
                    break;
            }
        }
    }

    public final void a0(boolean z, int i2) {
        this.S = z;
        this.T = i2;
        if (!z) {
            this.T = 101;
        }
        s0.a(Boolean.valueOf(P()), Boolean.valueOf(T0()), Integer.valueOf(this.T), null, null);
    }

    public final void b0(int i2) {
        Context contextH = com.daaw.avee.a.h();
        AbstractC5075hI.a.a(contextH == null ? getString(i2) : contextH.getString(i2));
    }

    public final void c0(boolean z, String str) {
        C2078Qw0.b bVarJ;
        boolean zR0 = R0();
        C2078Qw0 c2078Qw0 = C2078Qw0.k;
        B61 b61F = F();
        if (b61F != null) {
            c2078Qw0 = (C2078Qw0) b61F.a;
        }
        C2078Qw0 c2078Qw02 = c2078Qw0;
        C2078Qw0 c2078Qw03 = this.m0;
        boolean z2 = c2078Qw03 == null || !c2078Qw03.equals(c2078Qw02);
        if (z) {
            this.m0 = c2078Qw02;
        }
        if (zR0) {
            bVarJ = null;
        } else {
            bVarJ = c2078Qw02.j(getApplicationContext());
            AbstractC0857Fi0.h(this, 1, this.g0, bVarJ, P(), T0(), MediaPlaybackService.class, 0, new KQ() { // from class: com.daaw.Ii0
                @Override // com.daaw.KQ
                public final Object a() {
                    return this.a.T();
                }
            });
        }
        if (bVarJ == null) {
            bVarJ = c2078Qw02.j(getApplicationContext());
        }
        C2078Qw0.b bVarJ2 = bVarJ;
        MediaAppWidgetProvider.c().e(this, bVarJ2, P(), T0(), MediaPlaybackService.class);
        if (bVarJ2 == null) {
            bVarJ2 = c2078Qw02.j(getApplicationContext());
        }
        if (bVarJ2 != C2078Qw0.h) {
            Intent intent = new Intent("com.android.music.metachanged");
            intent.putExtra("playing", P());
            intent.putExtra("track", bVarJ2.e);
            intent.putExtra("album", bVarJ2.f);
            intent.putExtra("artist", bVarJ2.h);
            intent.putExtra("songid", bVarJ2.d);
            intent.putExtra("albumid", bVarJ2.g);
            intent.putExtra("id", bVarJ2.g);
            sendBroadcast(intent);
        }
        RemoteControlClient remoteControlClient = this.L;
        if (remoteControlClient != null) {
            remoteControlClient.setPlaybackState(P() ? 3 : 2);
            if (z && z2) {
                if (bVarJ2 == null) {
                    bVarJ2 = c2078Qw02.j(getApplicationContext());
                }
                C2078Qw0.b bVar = bVarJ2;
                RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.L.editMetadata(false);
                metadataEditorEditMetadata.putString(7, bVar.e);
                metadataEditorEditMetadata.putString(1, bVar.f);
                metadataEditorEditMetadata.putString(2, bVar.h);
                metadataEditorEditMetadata.putLong(9, z());
                metadataEditorEditMetadata.apply();
                this.M = new h();
                L0.a(this, new G3(bVar.a, bVar.d(), bVar.b()), this.M, 700, 700);
                bVarJ2 = bVar;
            }
        }
        if (z) {
            if (bVarJ2 == null) {
                bVarJ2 = c2078Qw02.j(getApplicationContext());
            }
            InterfaceC6540mX interfaceC6540mX = b61F != null ? (InterfaceC6540mX) b61F.b : null;
            C0705Dw0 c0705Dw0H = G().h();
            if (c0705Dw0H == null) {
                c0705Dw0H = C0705Dw0.c;
            }
            t0.a(c2078Qw02, interfaceC6540mX, bVarJ2, c0705Dw0H);
        }
        s0.a(Boolean.valueOf(P()), Boolean.valueOf(T0()), Integer.valueOf(this.T), str, c2078Qw02);
    }

    public void d0(B61 b61) {
        f0(b61, 0L, 0L);
    }

    public void e0(B61 b61, long j2) {
        f0(b61, j2, 0L);
    }

    public void f0(B61 b61, long j2, long j3) {
        j0(100L);
        this.Q = false;
        this.R = false;
        this.C.removeCallbacksAndMessages(Integer.valueOf(this.W));
        this.N = false;
        this.O = b61;
        C2078Qw0 c2078Qw0B = B();
        if (c2078Qw0B == null) {
            this.Z.F();
            return;
        }
        if (j3 <= 0) {
            this.Z.x(c2078Qw0B.n(), this.U, j2);
        } else {
            this.Z.y(c2078Qw0B.n(), this.U, j2, j3);
        }
        c0(true, null);
    }

    public void g0(boolean z) {
        this.R = z && T0();
        M0(false);
        j0(100L);
        this.Q = false;
        if (SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.Z.w();
        } else {
            G().b();
        }
    }

    public void h0() {
        M0(true);
        j0(100L);
        this.Q = false;
        this.R = false;
        if (!G().s()) {
            d0(this.O);
        }
        if (SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.Z.D();
        } else {
            G().start();
        }
    }

    public long i0() {
        if (G() == null) {
            return 0L;
        }
        return G().k();
    }

    public final void j0(long j2) {
        this.C.removeCallbacks(this.i0);
        if (this.H) {
            this.C.postDelayed(this.i0, j2);
        }
    }

    public final void k0() {
        SharedPreferences sharedPreferencesP = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().p(getApplicationContext());
        int iM = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.M(sharedPreferencesP, "repeatmode", 0);
        if (iM != 2 && iM != 1) {
            iM = 0;
        }
        C0(iM, false);
        long jN = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.N(sharedPreferencesP, "seekpos", 0L);
        B61 b61 = new B61(new C2078Qw0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P(sharedPreferencesP, "openedPath", "")), new AC0());
        if (this.N) {
            return;
        }
        M0(false);
        e0(b61, jN);
    }

    public boolean l0() {
        if (this.c0.requestAudioFocus(this, 3, 1) == 1) {
            this.P = true;
            return true;
        }
        AbstractC0441Bk1.c("requestAudioFocus failed");
        this.P = false;
        return false;
    }

    public void m0() {
        if (!this.P || this.Q) {
            return;
        }
        AbstractC0441Bk1.a("requestAudioLowerFocus, haveAudioFocus: " + this.P + "; lostAudioFocusWhilePlaying: " + this.Q);
        if (this.c0.requestAudioFocus(this, 3, 3) == 1) {
            return;
        }
        AbstractC0441Bk1.c("requestAudioLowerFocus failed");
    }

    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final void U() {
        com.daaw.avee.comp.playback.e eVarG = G();
        if (eVarG != null) {
            eVarG.o();
        }
    }

    public void o0() {
        this.C.post(new Runnable() { // from class: com.daaw.Mi0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.U();
            }
        });
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i2) {
        if (i2 == -2 || i2 == -1) {
            if (G() != null) {
                boolean zK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_fadePlayPause", true);
                this.Q = G().y();
                if (zK) {
                    this.Z.w();
                } else {
                    G().b();
                }
            } else {
                this.Q = false;
            }
            R0();
            return;
        }
        if (i2 != 1) {
            return;
        }
        boolean zK2 = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_resumePlayingAfterAudioFocusGained", true);
        if (this.Q && zK2) {
            if (G() != null) {
                if (SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_fadePlayPause", true)) {
                    this.Z.D();
                } else {
                    G().start();
                }
            }
            this.Q = false;
        }
    }

    @Override // com.daaw.AbstractServiceC1185Im0, android.app.Service
    public void onCreate() {
        super.onCreate();
        O0 = this;
        this.e0 = com.daaw.avee.a.p();
        this.X = false;
        M();
        this.F[0] = false;
        this.C.post(this.k0);
        synchronized (this.k0) {
            if (!this.F[0]) {
                try {
                    this.k0.wait();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.daaw.AbstractServiceC1185Im0, android.app.Service
    public void onDestroy() {
        this.H = false;
        o0.a(this);
        this.G[0] = false;
        this.C.post(this.l0);
        synchronized (this.l0) {
            if (!this.G[0]) {
                try {
                    this.l0.wait();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
        super.onDestroy();
        this.e0 = null;
    }

    @Override // com.daaw.AbstractServiceC1185Im0, android.app.Service
    public void onStart(Intent intent, int i2) {
        this.I = i2;
        super.onStart(intent, i2);
    }

    @Override // com.daaw.AbstractServiceC1185Im0, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        M();
        return super.onStartCommand(intent, i2, i3);
    }

    public void p0() {
        v0(H(), true);
    }

    public void q0() {
        this.C.post(new e());
    }

    public final void r0() {
        Object obj;
        SharedPreferences.Editor editorEdit = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().p(getApplicationContext()).edit();
        editorEdit.putInt("cardid", this.b0);
        editorEdit.putLong("seekpos", G().k());
        editorEdit.putInt("repeatmode", this.a0);
        B61 b61 = this.O;
        editorEdit.putString("openedPath", (b61 == null || (obj = b61.a) == null) ? "" : ((C2078Qw0) obj).g());
        editorEdit.apply();
    }

    public void s0() {
        this.C.post(new g());
    }

    public void t0(long j2) {
        this.Q = false;
        this.R = false;
        if (G() == null) {
            return;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 > G().l()) {
            j2 = G().l();
        }
        G().g(j2);
    }

    public final void u0(int i2) {
        v0(i2, false);
    }

    public final void v0(int i2, boolean z) {
        int iH;
        if (z || (iH = H()) < 0 || iH != i2) {
            boolean zBooleanValue = ((Boolean) x0.a(Boolean.FALSE)).booleanValue();
            float fFloatValue = ((Float) y0.a(Float.valueOf(0.0f))).floatValue();
            float fFloatValue2 = ((Float) z0.a(Float.valueOf(-1.0f))).floatValue();
            long jK = this.Z.s().k();
            this.Z.z();
            if (i2 == 1) {
                this.Z = new com.daaw.avee.comp.playback.d(new TI(this, getResources().getString(JD0.Y3), this.j0), this.j0, (long) (fFloatValue2 * 1000.0f));
            } else {
                this.Z = new com.daaw.avee.comp.playback.d(new SurfaceHolderCallbackC4934gn0(this, getResources().getString(JD0.Z3), this.j0), this.j0, (long) (fFloatValue2 * 1000.0f));
            }
            this.Z.s().e(zBooleanValue);
            this.Z.s().x(fFloatValue);
            e0(this.O, jK);
        }
    }

    public void w0(int i2) {
        this.C.post(new f(i2));
    }

    public void x(boolean z) {
        RemoteControlClient remoteControlClient;
        AbstractC0441Bk1.a("abandonAudioFocus");
        if (!z && (remoteControlClient = this.L) != null) {
            remoteControlClient.setPlaybackState(2);
        }
        this.P = false;
        this.c0.abandonAudioFocus(this);
    }

    public void x0(float f2) {
        this.Z.A((long) (f2 * 1000.0f));
    }

    public void y() {
        S0(true);
        this.H = false;
        O0 = null;
        r0();
        p0.a(this);
        x(true);
        RemoteControlClient remoteControlClient = this.L;
        if (remoteControlClient != null) {
            try {
                this.c0.unregisterRemoteControlClient(remoteControlClient);
            } catch (Exception e2) {
                AbstractC0441Bk1.c("unregisterRemoteControlClient failed: " + e2.getMessage());
                e2.printStackTrace();
            }
            try {
                this.c0.unregisterMediaButtonEventReceiver(this.K);
            } catch (IllegalArgumentException e3) {
                AbstractC0441Bk1.c("unregisterMediaButtonEventReceiver failed: " + e3.getMessage());
            }
        }
        try {
            unregisterReceiver(this.J);
        } catch (IllegalArgumentException unused) {
        }
        this.Z.z();
        this.Z = new com.daaw.avee.comp.playback.d(com.daaw.avee.comp.playback.e.r, this.j0, 0L);
        MediaAppWidgetProvider.c().e(this, E().h(), false, false, MediaPlaybackService.class);
    }

    public final void y0(b.c cVar) {
        com.daaw.avee.comp.playback.e eVarG = G();
        if (eVarG != null) {
            eVarG.n(cVar);
        }
    }

    public long z() {
        com.daaw.avee.comp.playback.e eVarG = G();
        if (eVarG == null) {
            return 0L;
        }
        return eVarG.l();
    }

    public void z0(b.c cVar) {
        this.C.post(new a(cVar));
    }
}
